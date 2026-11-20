// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.handlers.errorBodyHandler
import com.langchain.smith.core.handlers.errorHandler
import com.langchain.smith.core.handlers.jsonHandler
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponse.Handler
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.sandboxes.SandboxListUsageCostsPageAsync
import com.langchain.smith.models.sandboxes.SandboxListUsageCostsPageResponse
import com.langchain.smith.models.sandboxes.SandboxListUsageCostsParams
import com.langchain.smith.models.sandboxes.SandboxRetrieveUsageParams
import com.langchain.smith.models.sandboxes.SandboxRetrieveUsageResponse
import com.langchain.smith.services.async.sandboxes.BoxServiceAsync
import com.langchain.smith.services.async.sandboxes.BoxServiceAsyncImpl
import com.langchain.smith.services.async.sandboxes.RegistryServiceAsync
import com.langchain.smith.services.async.sandboxes.RegistryServiceAsyncImpl
import com.langchain.smith.services.async.sandboxes.SnapshotServiceAsync
import com.langchain.smith.services.async.sandboxes.SnapshotServiceAsyncImpl
import com.langchain.smith.services.async.sandboxes.VolumeServiceAsync
import com.langchain.smith.services.async.sandboxes.VolumeServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SandboxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SandboxServiceAsync {

    private val withRawResponse: SandboxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val boxes: BoxServiceAsync by lazy { BoxServiceAsyncImpl(clientOptions) }

    private val volumes: VolumeServiceAsync by lazy { VolumeServiceAsyncImpl(clientOptions) }

    private val registries: RegistryServiceAsync by lazy { RegistryServiceAsyncImpl(clientOptions) }

    private val snapshots: SnapshotServiceAsync by lazy { SnapshotServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SandboxServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxServiceAsync =
        SandboxServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun boxes(): BoxServiceAsync = boxes

    override fun volumes(): VolumeServiceAsync = volumes

    override fun registries(): RegistryServiceAsync = registries

    override fun snapshots(): SnapshotServiceAsync = snapshots

    override fun listUsageCosts(
        params: SandboxListUsageCostsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SandboxListUsageCostsPageAsync> =
        // get /api/v2/sandboxes/usage/costs
        withRawResponse().listUsageCosts(params, requestOptions).thenApply { it.parse() }

    override fun retrieveUsage(
        params: SandboxRetrieveUsageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SandboxRetrieveUsageResponse> =
        // get /api/v2/sandboxes/usage
        withRawResponse().retrieveUsage(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SandboxServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val boxes: BoxServiceAsync.WithRawResponse by lazy {
            BoxServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val volumes: VolumeServiceAsync.WithRawResponse by lazy {
            VolumeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val registries: RegistryServiceAsync.WithRawResponse by lazy {
            RegistryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val snapshots: SnapshotServiceAsync.WithRawResponse by lazy {
            SnapshotServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SandboxServiceAsync.WithRawResponse =
            SandboxServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun boxes(): BoxServiceAsync.WithRawResponse = boxes

        override fun volumes(): VolumeServiceAsync.WithRawResponse = volumes

        override fun registries(): RegistryServiceAsync.WithRawResponse = registries

        override fun snapshots(): SnapshotServiceAsync.WithRawResponse = snapshots

        private val listUsageCostsHandler: Handler<SandboxListUsageCostsPageResponse> =
            jsonHandler<SandboxListUsageCostsPageResponse>(clientOptions.jsonMapper)

        override fun listUsageCosts(
            params: SandboxListUsageCostsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SandboxListUsageCostsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sandboxes", "usage", "costs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listUsageCostsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                SandboxListUsageCostsPageAsync.builder()
                                    .service(SandboxServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val retrieveUsageHandler: Handler<SandboxRetrieveUsageResponse> =
            jsonHandler<SandboxRetrieveUsageResponse>(clientOptions.jsonMapper)

        override fun retrieveUsage(
            params: SandboxRetrieveUsageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SandboxRetrieveUsageResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sandboxes", "usage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveUsageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
