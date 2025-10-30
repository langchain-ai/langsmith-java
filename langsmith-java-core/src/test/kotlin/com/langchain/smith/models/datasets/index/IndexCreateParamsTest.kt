// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.index

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexCreateParamsTest {

    @Test
    fun create() {
        IndexCreateParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .tag("tag")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IndexCreateParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IndexCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tag("tag")
                .build()

        val body = params._body()

        assertThat(body.tag()).contains("tag")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IndexCreateParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
