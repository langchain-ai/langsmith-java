package com.langchain.smith.client

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import com.langchain.smith.core.MultipartField
import com.langchain.smith.core.http.HttpRequestBody
import com.langchain.smith.core.http.multipartFormData
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunAttachment
import com.langchain.smith.models.runs.RunIngestBatchParams
import kotlin.jvm.optionals.getOrNull
import org.slf4j.LoggerFactory

internal fun RunIngestBatchParams.toRunMultipartFormData(jsonMapper: JsonMapper): HttpRequestBody? {
    // Multipart requires run id, trace_id, and dotted_order to address each part correctly.
    // If a queued run is missing those fields, callers fall back to legacy JSON batch ingest
    // instead of failing the entire auto-batch.
    val fields =
        listOf(
                multipartFieldsForRuns(
                    jsonMapper,
                    operation = "post",
                    runs = post().orElse(emptyList()),
                ) ?: return null,
                multipartFieldsForRuns(
                    jsonMapper,
                    operation = "patch",
                    runs = patch().orElse(emptyList()),
                ) ?: return null,
            )
            .flatten()
            .toMap()

    return fields.takeIf { it.isNotEmpty() }?.let { multipartFormData(jsonMapper, it) }
}

private fun multipartFieldsForRuns(
    jsonMapper: JsonMapper,
    operation: String,
    runs: List<Run>,
): List<Pair<String, MultipartField<*>>>? =
    runs.flatMap { run -> multipartFieldsForRun(jsonMapper, operation, run) ?: return null }

private fun multipartFieldsForRun(
    jsonMapper: JsonMapper,
    operation: String,
    run: Run,
): List<Pair<String, MultipartField<*>>>? {
    val runId = run.id().getOrNull() ?: return null
    run.traceId().getOrNull() ?: return null
    run.dottedOrder().getOrNull() ?: return null

    val runFields =
        jsonMapper
            .valueToTree<ObjectNode>(run)
            .fields()
            .asSequence()
            .map { it.key to it.value }
            .toList()
    val main =
        jsonMapper
            .createObjectNode()
            .setAll<ObjectNode>(
                runFields
                    .filterNot { (fieldName, _) -> fieldName in MULTIPART_EXCLUDED_FIELDS }
                    .toMap()
            )
    val separateFields =
        MULTIPART_SEPARATE_FIELDS.mapNotNull { fieldName ->
            runFields
                .firstOrNull { (name, _) -> name == fieldName }
                ?.second
                ?.takeUnless { it.isNull || it.isMissingNode }
                ?.let { fieldName to it }
        }

    return listOf("$operation.$runId" to jsonField(jsonMapper, main)) +
        separateFields.map { (fieldName, value) ->
            "$operation.$runId.$fieldName" to jsonField(jsonMapper, value)
        } +
        attachmentFields(runId, run.attachments())
}

private fun jsonField(jsonMapper: JsonMapper, value: JsonNode): MultipartField<ByteArray> {
    val bytes = jsonMapper.writeValueAsBytes(value)
    return MultipartField.builder<ByteArray>()
        .value(bytes)
        .contentType("application/json; length=${bytes.size}")
        .build()
}

private fun attachmentFields(
    runId: String,
    attachments: Map<String, RunAttachment>,
): List<Pair<String, MultipartField<*>>> =
    attachments.mapNotNull { (name, attachment) ->
        if (name.contains('.')) {
            logger.warn(
                "Skipping attachment '{}' for run {}: attachment names must not contain periods ('.')",
                name,
                runId,
            )
            return@mapNotNull null
        }

        val contentType =
            attachment.length().getOrNull()?.let { "${attachment.contentType()}; length=$it" }
                ?: attachment.contentType()
        "attachment.$runId.$name" to
            MultipartField.builder<Any>()
                .value(attachment.multipartValue())
                .contentType(contentType)
                .filename(attachment.filename())
                .build()
    }

private val MULTIPART_SEPARATE_FIELDS =
    listOf("inputs", "outputs", "events", "extra", "error", "serialized")

private val MULTIPART_EXCLUDED_FIELDS = MULTIPART_SEPARATE_FIELDS + "attachments"

private val logger = LoggerFactory.getLogger("com.langchain.smith.client.RunMultipartBatch")
