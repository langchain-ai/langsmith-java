// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionResolveParamsTest {

    @Test
    fun create() {
        SessionResolveParams.builder()
            .kind(SessionResolveParams.Kind.AGENT)
            .id("id")
            .environment(SessionResolveParams.Environment.LOCAL)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SessionResolveParams.builder()
                .kind(SessionResolveParams.Kind.AGENT)
                .id("id")
                .environment(SessionResolveParams.Environment.LOCAL)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("kind", "AGENT")
                    .put("id", "id")
                    .put("environment", "LOCAL")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SessionResolveParams.builder().kind(SessionResolveParams.Kind.AGENT).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("kind", "AGENT").build())
    }
}
