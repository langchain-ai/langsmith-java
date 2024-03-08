// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo // templates/JavaSDK/components/file.ts:28:17 // templates/JavaSDK/components/file.ts:28:17
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.langsmith.api.client.LangSmithClient
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.core.JsonString
import com.langsmith.api.core.jsonMapper
import com.langsmith.api.errors.BadRequestException
import com.langsmith.api.errors.InternalServerException
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.errors.LangSmithException
import com.langsmith.api.errors.NotFoundException
import com.langsmith.api.errors.PermissionDeniedException
import com.langsmith.api.errors.RateLimitException
import com.langsmith.api.errors.UnauthorizedException
import com.langsmith.api.errors.UnexpectedStatusCodeException
import com.langsmith.api.errors.UnprocessableEntityException
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.assertj.guava.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest // templates/JavaSDK/errors.ts:269:13 // templates/JavaSDK/errors.ts:269:13 //
// templates/JavaSDK/errors.ts:269:13 // templates/JavaSDK/errors.ts:269:13
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper() // templates/JavaSDK/errors.ts:269:13

    private val LANG_SMITH_ERROR: LangSmithError =
        LangSmithError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: LangSmithClient

    @BeforeEach // templates/JavaSDK/errors.ts:292:10
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) { // templates/JavaSDK/errors.ts:292:10
        client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/errors.ts:302:36 //
                // templates/JavaSDK/errors.ts:302:20
                .baseUrl(
                    wmRuntimeInfo.getHttpBaseUrl()
                ) // templates/JavaSDK/errors.ts:304:26 // templates/JavaSDK/errors.ts:304:26
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun apiKeysRetrieve200() { // templates/JavaSDK/entities/testing.ts:18:13
        val params = ApiKeyRetrieveParams.builder().build() // templates/JavaSDK/errors.ts:317:22

        val expected =
            listOf(
                ApiKeyGetResponse.builder() // templates/JavaSDK/errors.ts:329:16 //
                    // templates/JavaSDK/errors.ts:329:16
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .readOnly(true)
                    .shortKey("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        stubFor(
            get(
                    anyUrl()
                ) // templates/JavaSDK/errors.ts:338:16 // templates/JavaSDK/errors.ts:338:16
                .willReturn(ok().withBody(toJson(expected)))
        )

        assertThat(client.apiKeys().retrieve(params)).isEqualTo(expected)
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun apiKeysRetrieve400() { // templates/JavaSDK/entities/testing.ts:18:13
        val params = ApiKeyRetrieveParams.builder().build() // templates/JavaSDK/errors.ts:385:24

        stubFor(
            get(
                    anyUrl()
                ) // templates/JavaSDK/errors.ts:392:20 // templates/JavaSDK/errors.ts:392:20 //
                // templates/JavaSDK/errors.ts:391:16
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(LANG_SMITH_ERROR)))
        )

        assertThatThrownBy({
                client.apiKeys().retrieve(params)
            }) // templates/JavaSDK/errors.ts:402:20 // templates/JavaSDK/errors.ts:402:20 //
            // templates/JavaSDK/errors.ts:401:16
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of("Foo", "Bar"), LANG_SMITH_ERROR)
            })
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun apiKeysRetrieve401() { // templates/JavaSDK/entities/testing.ts:18:13
        val params = ApiKeyRetrieveParams.builder().build() // templates/JavaSDK/errors.ts:385:24

        stubFor(
            get(
                    anyUrl()
                ) // templates/JavaSDK/errors.ts:392:20 // templates/JavaSDK/errors.ts:392:20 //
                // templates/JavaSDK/errors.ts:391:16
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(LANG_SMITH_ERROR)))
        )

        assertThatThrownBy({
                client.apiKeys().retrieve(params)
            }) // templates/JavaSDK/errors.ts:402:20 // templates/JavaSDK/errors.ts:402:20 //
            // templates/JavaSDK/errors.ts:401:16
            .satisfies({ e ->
                assertUnauthorized(e, ImmutableListMultimap.of("Foo", "Bar"), LANG_SMITH_ERROR)
            })
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun apiKeysRetrieve403() { // templates/JavaSDK/entities/testing.ts:18:13
        val params = ApiKeyRetrieveParams.builder().build() // templates/JavaSDK/errors.ts:385:24

        stubFor(
            get(
                    anyUrl()
                ) // templates/JavaSDK/errors.ts:392:20 // templates/JavaSDK/errors.ts:392:20 //
                // templates/JavaSDK/errors.ts:391:16
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(LANG_SMITH_ERROR)))
        )

        assertThatThrownBy({
                client.apiKeys().retrieve(params)
            }) // templates/JavaSDK/errors.ts:402:20 // templates/JavaSDK/errors.ts:402:20 //
            // templates/JavaSDK/errors.ts:401:16
            .satisfies({ e ->
                assertPermissionDenied(e, ImmutableListMultimap.of("Foo", "Bar"), LANG_SMITH_ERROR)
            })
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun apiKeysRetrieve404() { // templates/JavaSDK/entities/testing.ts:18:13
        val params = ApiKeyRetrieveParams.builder().build() // templates/JavaSDK/errors.ts:385:24

        stubFor(
            get(
                    anyUrl()
                ) // templates/JavaSDK/errors.ts:392:20 // templates/JavaSDK/errors.ts:392:20 //
                // templates/JavaSDK/errors.ts:391:16
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(LANG_SMITH_ERROR)))
        )

        assertThatThrownBy({
                client.apiKeys().retrieve(params)
            }) // templates/JavaSDK/errors.ts:402:20 // templates/JavaSDK/errors.ts:402:20 //
            // templates/JavaSDK/errors.ts:401:16
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), LANG_SMITH_ERROR)
            })
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun apiKeysRetrieve422() { // templates/JavaSDK/entities/testing.ts:18:13
        val params = ApiKeyRetrieveParams.builder().build() // templates/JavaSDK/errors.ts:385:24

        stubFor(
            get(
                    anyUrl()
                ) // templates/JavaSDK/errors.ts:392:20 // templates/JavaSDK/errors.ts:392:20 //
                // templates/JavaSDK/errors.ts:391:16
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(LANG_SMITH_ERROR)))
        )

        assertThatThrownBy({
                client.apiKeys().retrieve(params)
            }) // templates/JavaSDK/errors.ts:402:20 // templates/JavaSDK/errors.ts:402:20 //
            // templates/JavaSDK/errors.ts:401:16
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    LANG_SMITH_ERROR
                )
            })
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun apiKeysRetrieve429() { // templates/JavaSDK/entities/testing.ts:18:13
        val params = ApiKeyRetrieveParams.builder().build() // templates/JavaSDK/errors.ts:385:24

        stubFor(
            get(
                    anyUrl()
                ) // templates/JavaSDK/errors.ts:392:20 // templates/JavaSDK/errors.ts:392:20 //
                // templates/JavaSDK/errors.ts:391:16
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(LANG_SMITH_ERROR)))
        )

        assertThatThrownBy({
                client.apiKeys().retrieve(params)
            }) // templates/JavaSDK/errors.ts:402:20 // templates/JavaSDK/errors.ts:402:20 //
            // templates/JavaSDK/errors.ts:401:16
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), LANG_SMITH_ERROR)
            })
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun apiKeysRetrieve500() { // templates/JavaSDK/entities/testing.ts:18:13
        val params = ApiKeyRetrieveParams.builder().build() // templates/JavaSDK/errors.ts:385:24

        stubFor(
            get(
                    anyUrl()
                ) // templates/JavaSDK/errors.ts:392:20 // templates/JavaSDK/errors.ts:392:20 //
                // templates/JavaSDK/errors.ts:391:16
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(LANG_SMITH_ERROR)))
        )

        assertThatThrownBy({
                client.apiKeys().retrieve(params)
            }) // templates/JavaSDK/errors.ts:402:20 // templates/JavaSDK/errors.ts:402:20 //
            // templates/JavaSDK/errors.ts:401:16
            .satisfies({ e ->
                assertInternalServer(e, ImmutableListMultimap.of("Foo", "Bar"), LANG_SMITH_ERROR)
            })
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun unexpectedStatusCode() { // templates/JavaSDK/entities/testing.ts:18:13
        val params = ApiKeyRetrieveParams.builder().build() // templates/JavaSDK/errors.ts:424:22

        stubFor(
            get(
                    anyUrl()
                ) // templates/JavaSDK/errors.ts:431:18 // templates/JavaSDK/errors.ts:431:18 //
                // templates/JavaSDK/errors.ts:430:14
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(LANG_SMITH_ERROR)))
        )

        assertThatThrownBy({ client.apiKeys().retrieve(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    toJson(LANG_SMITH_ERROR)
                )
            })
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun invalidBody() { // templates/JavaSDK/entities/testing.ts:18:13
        val params = ApiKeyRetrieveParams.builder().build() // templates/JavaSDK/errors.ts:470:24

        stubFor(
            get(
                    anyUrl()
                ) // templates/JavaSDK/errors.ts:477:20 // templates/JavaSDK/errors.ts:477:20 //
                // templates/JavaSDK/errors.ts:476:16
                .willReturn(status(200).withBody("Not JSON"))
        )

        assertThatThrownBy({ client.apiKeys().retrieve(params) })
            .satisfies({ e ->
                assertThat(
                        e
                    ) // templates/JavaSDK/errors.ts:489:31 // templates/JavaSDK/errors.ts:483:20 //
                    // templates/JavaSDK/errors.ts:483:20 // templates/JavaSDK/errors.ts:482:16
                    .isInstanceOf(
                        LangSmithException::class.java
                    ) // templates/JavaSDK/errors.ts:491:28 // templates/JavaSDK/errors.ts:491:28
                    .hasMessage("Error reading response")
            })
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun invalidErrorBody() { // templates/JavaSDK/entities/testing.ts:18:13
        val params = ApiKeyRetrieveParams.builder().build() // templates/JavaSDK/errors.ts:505:22

        stubFor(
            get(
                    anyUrl()
                ) // templates/JavaSDK/errors.ts:512:18 // templates/JavaSDK/errors.ts:512:18 //
                // templates/JavaSDK/errors.ts:511:14
                .willReturn(status(400).withBody("Not JSON"))
        )

        assertThatThrownBy({ client.apiKeys().retrieve(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of(), LangSmithError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray { // templates/JavaSDK/errors.ts:530:10
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: ListMultimap<String, String>,
        responseBody: ByteArray
    ) { // templates/JavaSDK/errors.ts:538:10
        assertThat(
                throwable
            ) // templates/JavaSDK/errors.ts:552:18 // templates/JavaSDK/errors.ts:552:18 //
            // templates/JavaSDK/errors.ts:551:20
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            ) // templates/JavaSDK/errors.ts:555:22 // templates/JavaSDK/errors.ts:555:22
            .satisfies({ e ->
                assertThat(e.statusCode())
                    .isEqualTo(
                        statusCode
                    ) // templates/JavaSDK/errors.ts:560:32 // templates/JavaSDK/errors.ts:560:32
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LangSmithError
    ) { // templates/JavaSDK/errors.ts:575:12
        assertThat(
                throwable
            ) // templates/JavaSDK/errors.ts:585:20 // templates/JavaSDK/errors.ts:585:20 //
            // templates/JavaSDK/errors.ts:584:22
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(BadRequestException::class.java)
            ) // templates/JavaSDK/errors.ts:588:24 // templates/JavaSDK/errors.ts:588:24
            .satisfies({ e ->
                assertThat(e.statusCode())
                    .isEqualTo(
                        400
                    ) // templates/JavaSDK/errors.ts:593:34 // templates/JavaSDK/errors.ts:593:34
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LangSmithError
    ) { // templates/JavaSDK/errors.ts:575:12
        assertThat(
                throwable
            ) // templates/JavaSDK/errors.ts:585:20 // templates/JavaSDK/errors.ts:585:20 //
            // templates/JavaSDK/errors.ts:584:22
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnauthorizedException::class.java)
            ) // templates/JavaSDK/errors.ts:588:24 // templates/JavaSDK/errors.ts:588:24
            .satisfies({ e ->
                assertThat(e.statusCode())
                    .isEqualTo(
                        401
                    ) // templates/JavaSDK/errors.ts:593:34 // templates/JavaSDK/errors.ts:593:34
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LangSmithError
    ) { // templates/JavaSDK/errors.ts:575:12
        assertThat(
                throwable
            ) // templates/JavaSDK/errors.ts:585:20 // templates/JavaSDK/errors.ts:585:20 //
            // templates/JavaSDK/errors.ts:584:22
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            ) // templates/JavaSDK/errors.ts:588:24 // templates/JavaSDK/errors.ts:588:24
            .satisfies({ e ->
                assertThat(e.statusCode())
                    .isEqualTo(
                        403
                    ) // templates/JavaSDK/errors.ts:593:34 // templates/JavaSDK/errors.ts:593:34
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertNotFound(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LangSmithError
    ) { // templates/JavaSDK/errors.ts:575:12
        assertThat(
                throwable
            ) // templates/JavaSDK/errors.ts:585:20 // templates/JavaSDK/errors.ts:585:20 //
            // templates/JavaSDK/errors.ts:584:22
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(NotFoundException::class.java)
            ) // templates/JavaSDK/errors.ts:588:24 // templates/JavaSDK/errors.ts:588:24
            .satisfies({ e ->
                assertThat(e.statusCode())
                    .isEqualTo(
                        404
                    ) // templates/JavaSDK/errors.ts:593:34 // templates/JavaSDK/errors.ts:593:34
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LangSmithError
    ) { // templates/JavaSDK/errors.ts:575:12
        assertThat(
                throwable
            ) // templates/JavaSDK/errors.ts:585:20 // templates/JavaSDK/errors.ts:585:20 //
            // templates/JavaSDK/errors.ts:584:22
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            ) // templates/JavaSDK/errors.ts:588:24 // templates/JavaSDK/errors.ts:588:24
            .satisfies({ e ->
                assertThat(e.statusCode())
                    .isEqualTo(
                        422
                    ) // templates/JavaSDK/errors.ts:593:34 // templates/JavaSDK/errors.ts:593:34
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LangSmithError
    ) { // templates/JavaSDK/errors.ts:575:12
        assertThat(
                throwable
            ) // templates/JavaSDK/errors.ts:585:20 // templates/JavaSDK/errors.ts:585:20 //
            // templates/JavaSDK/errors.ts:584:22
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(RateLimitException::class.java)
            ) // templates/JavaSDK/errors.ts:588:24 // templates/JavaSDK/errors.ts:588:24
            .satisfies({ e ->
                assertThat(e.statusCode())
                    .isEqualTo(
                        429
                    ) // templates/JavaSDK/errors.ts:593:34 // templates/JavaSDK/errors.ts:593:34
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LangSmithError
    ) { // templates/JavaSDK/errors.ts:575:12
        assertThat(
                throwable
            ) // templates/JavaSDK/errors.ts:585:20 // templates/JavaSDK/errors.ts:585:20 //
            // templates/JavaSDK/errors.ts:584:22
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(InternalServerException::class.java)
            ) // templates/JavaSDK/errors.ts:588:24 // templates/JavaSDK/errors.ts:588:24
            .satisfies({ e ->
                assertThat(e.statusCode())
                    .isEqualTo(
                        500
                    ) // templates/JavaSDK/errors.ts:593:34 // templates/JavaSDK/errors.ts:593:34
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }
}
