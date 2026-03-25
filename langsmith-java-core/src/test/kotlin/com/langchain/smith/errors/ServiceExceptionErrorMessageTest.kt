package com.langchain.smith.errors

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunIngestBatchParams
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Assumptions.assumeTrue
import org.junit.jupiter.api.Test

/**
 * Verifies that service exception error messages contain the actual API error body rather than
 * opaque strings like `[object Object]`.
 *
 * Run with:
 * ```bash
 * ./gradlew :langsmith-java-core:test --tests "com.langchain.smith.errors.ServiceExceptionErrorMessageTest"
 * ```
 */
internal class ServiceExceptionErrorMessageTest {

    @Test
    fun forbiddenErrorContainsDetail() {
        val client = LangsmithOkHttpClient.builder().apiKey("ls-invalid-key").build()

        assertThatThrownBy { client.runs().ingestBatch() }
            .isInstanceOf(PermissionDeniedException::class.java)
            .satisfies({ e ->
                val message = e.message ?: ""
                assertThat(message).startsWith("403:")
                assertThat(message).doesNotContain("[object Object]")
                assertThat(message).contains("Forbidden")
            })
    }

    @Test
    fun badRequestErrorContainsDetail() {
        assumeTrue(
            !System.getenv("LANGSMITH_API_KEY").isNullOrBlank(),
            "Skipping: LANGSMITH_API_KEY must be set",
        )
        val client = LangsmithOkHttpClient.fromEnv()

        val params =
            RunIngestBatchParams.builder()
                .addPost(
                    Run.builder().id("not-a-uuid").name("test").runType(Run.RunType.CHAIN).build()
                )
                .build()

        assertThatThrownBy { client.runs().ingestBatch(params) }
            .isInstanceOf(UnprocessableEntityException::class.java)
            .satisfies({ e ->
                val message = e.message ?: ""
                assertThat(message).startsWith("422:")
                assertThat(message).doesNotContain("[object Object]")
                assertThat(message).contains("error")
            })
    }
}
