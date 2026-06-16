package com.langchain.smith.evaluation

import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.sessions.TracerSessionWithoutVirtualFields
import java.time.OffsetDateTime
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

fun interface ExperimentTarget {
    fun run(example: ExperimentExample): Map<String, Any?>
}

fun interface RunEvaluator {
    fun evaluate(run: ExperimentRun, example: ExperimentExample): EvaluationResult
}

class ExperimentExample internal constructor(private val example: Example) {

    fun example(): Example = example

    fun id(): String = example.id()

    fun datasetId(): String = example.datasetId()

    fun inputs(): Map<String, Any?> = example.inputs().toPlainMap()

    fun outputs(): Map<String, Any?> = example.outputs().getOrNull()?.toPlainMap() ?: emptyMap()

    fun metadata(): Map<String, Any?> = example.metadata().getOrNull()?.toPlainMap() ?: emptyMap()

    fun modifiedAt(): Optional<OffsetDateTime> = example.modifiedAt()
}

class ExperimentRun internal constructor(private val run: Run) {

    fun run(): Run = run

    fun id(): Optional<String> = run.id()

    fun inputs(): Map<String, Any?> =
        run.inputs().getOrNull()?._additionalProperties()?.mapValues { it.value.toPlainValue() }
            ?: emptyMap()

    fun outputs(): Map<String, Any?> =
        run.outputs().getOrNull()?._additionalProperties()?.mapValues { it.value.toPlainValue() }
            ?: emptyMap()
}

class ExperimentResults
internal constructor(
    private val session: TracerSessionWithoutVirtualFields,
    private val rows: List<ExperimentResultRow>,
    private val feedback: List<FeedbackSchema>,
) {

    fun session(): TracerSessionWithoutVirtualFields = session

    fun experimentId(): String = session.id()

    fun experimentName(): Optional<String> = session.name()

    fun rows(): List<ExperimentResultRow> = rows

    fun runs(): List<Run> = rows.map { it.run() }

    fun feedback(): List<FeedbackSchema> = feedback

    override fun toString(): String =
        buildList {
                add("experimentId=${session.id()}")
                add("experimentName=${session.name()}")
                add("rows=${rows.size}")
                add("feedback=${feedback.size}")
            }
            .joinToString(", ", "ExperimentResults{", "}")
}

class ExperimentResultRow
internal constructor(
    private val example: ExperimentExample,
    private var run: Run,
    private var evaluationResults: List<EvaluationResult>,
    private val targetError: Throwable?,
    private var evaluatorErrors: List<EvaluatorError>,
) {

    fun example(): ExperimentExample = example

    fun run(): Run = run

    fun evaluationResults(): List<EvaluationResult> = evaluationResults

    fun targetError(): Optional<Throwable> = Optional.ofNullable(targetError)

    fun evaluatorErrors(): List<EvaluatorError> = evaluatorErrors

    internal fun copy(
        run: Run = this.run,
        evaluationResults: List<EvaluationResult> = this.evaluationResults,
        evaluatorErrors: List<EvaluatorError> = this.evaluatorErrors,
    ): ExperimentResultRow =
        ExperimentResultRow(
            example = example,
            run = run,
            evaluationResults = evaluationResults,
            targetError = targetError,
            evaluatorErrors = evaluatorErrors,
        )

    internal fun replaceWith(row: ExperimentResultRow) {
        run = row.run
        evaluationResults = row.evaluationResults
        evaluatorErrors = row.evaluatorErrors
    }
}

class EvaluatorError
internal constructor(private val evaluator: RunEvaluator, private val error: Throwable) {

    fun evaluator(): RunEvaluator = evaluator

    fun error(): Throwable = error
}
