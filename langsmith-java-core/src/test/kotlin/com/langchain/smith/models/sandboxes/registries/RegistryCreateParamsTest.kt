// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.registries

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegistryCreateParamsTest {

    @Test
    fun create() {
        RegistryCreateParams.builder()
            .name("name")
            .url("url")
            .authType(RegistryCreateParams.AuthType.DOCKER_CONFIG)
            .awsRoleArn("aws_role_arn")
            .password("password")
            .username("username")
            .build()
    }

    @Test
    fun body() {
        val params =
            RegistryCreateParams.builder()
                .name("name")
                .url("url")
                .authType(RegistryCreateParams.AuthType.DOCKER_CONFIG)
                .awsRoleArn("aws_role_arn")
                .password("password")
                .username("username")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.url()).isEqualTo("url")
        assertThat(body.authType()).contains(RegistryCreateParams.AuthType.DOCKER_CONFIG)
        assertThat(body.awsRoleArn()).contains("aws_role_arn")
        assertThat(body.password()).contains("password")
        assertThat(body.username()).contains("username")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RegistryCreateParams.builder().name("name").url("url").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.url()).isEqualTo("url")
    }
}
