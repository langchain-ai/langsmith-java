// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.secrets

import com.langsmith_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretRetrieveEncryptedParamsTest {

    @Test
    fun create() {
        SecretRetrieveEncryptedParams.builder()
            .service(SecretRetrieveEncryptedParams.Service.AGENT_BUILDER)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SecretRetrieveEncryptedParams.builder()
                .service(SecretRetrieveEncryptedParams.Service.AGENT_BUILDER)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("service", "agent_builder").build())
    }
}
