// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.volumes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VolumeRetrieveParamsTest {

    @Test
    fun create() {
        VolumeRetrieveParams.builder().volume("volume").build()
    }

    @Test
    fun pathParams() {
        val params = VolumeRetrieveParams.builder().volume("volume").build()

        assertThat(params._pathParam(0)).isEqualTo("volume")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
