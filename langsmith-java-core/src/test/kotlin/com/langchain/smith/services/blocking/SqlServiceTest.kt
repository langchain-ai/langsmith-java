// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.sql.SqlQueryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SqlServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun query() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val sqlService = client.sql()

        val response =
            sqlService.query(
                SqlQueryParams.builder()
                    .addProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .query("query")
                    .build()
            )

        response.validate()
    }
}
