// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WalletTest {

    @Test
    fun create() {
        val wallet = Wallet.builder().creditBalanceMicros(0L).inflightBalanceMicros(0L).build()

        assertThat(wallet.creditBalanceMicros()).isEqualTo(0L)
        assertThat(wallet.inflightBalanceMicros()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wallet = Wallet.builder().creditBalanceMicros(0L).inflightBalanceMicros(0L).build()

        val roundtrippedWallet =
            jsonMapper.readValue(jsonMapper.writeValueAsString(wallet), jacksonTypeRef<Wallet>())

        assertThat(roundtrippedWallet).isEqualTo(wallet)
    }
}
