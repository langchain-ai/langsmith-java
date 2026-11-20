// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

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
import com.langchain.smith.core.prepare
import com.langchain.smith.models.sandboxes.SandboxListUsageCostsPage
import com.langchain.smith.models.sandboxes.SandboxListUsageCostsPageResponse
import com.langchain.smith.models.sandboxes.SandboxListUsageCostsParams
import com.langchain.smith.models.sandboxes.SandboxRetrieveUsageParams
import com.langchain.smith.models.sandboxes.SandboxRetrieveUsageResponse
import com.langchain.smith.services.blocking.sandboxes.BoxService
import com.langchain.smith.services.blocking.sandboxes.BoxServiceImpl
import com.langchain.smith.services.blocking.sandboxes.RegistryService
import com.langchain.smith.services.blocking.sandboxes.RegistryServiceImpl
import com.langchain.smith.services.blocking.sandboxes.SnapshotService
import com.langchain.smith.services.blocking.sandboxes.SnapshotServiceImpl
import com.langchain.smith.services.blocking.sandboxes.VolumeService
import com.langchain.smith.services.blocking.sandboxes.VolumeServiceImpl
import java.util.function.Consumer

class SandboxServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SandboxService {

    private val withRawResponse: SandboxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val boxes: BoxService by lazy { BoxServiceImpl(clientOptions) }

    private val volumes: VolumeService by lazy { VolumeServiceImpl(clientOptions) }

    private val registries: RegistryService by lazy { RegistryServiceImpl(clientOptions) }

    private val snapshots: SnapshotService by lazy { SnapshotServiceImpl(clientOptions) }

    override fun withRawResponse(): SandboxService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxService =
        SandboxServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun boxes(): BoxService = boxes

    override fun volumes(): VolumeService = volumes

    override fun registries(): RegistryService = registries

    override fun snapshots(): SnapshotService = snapshots

    override fun listUsageCosts(
        params: SandboxListUsageCostsParams,
        requestOptions: RequestOptions,
    ): SandboxListUsageCostsPage =
        // get /api/v2/sandboxes/usage/costs
        withRawResponse().listUsageCosts(params, requestOptions).parse()

    override fun retrieveUsage(
        params: SandboxRetrieveUsageParams,
        requestOptions: RequestOptions,
    ): SandboxRetrieveUsageResponse =
        // get /api/v2/sandboxes/usage
        withRawResponse().retrieveUsage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SandboxService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val boxes: BoxService.WithRawResponse by lazy {
            BoxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val volumes: VolumeService.WithRawResponse by lazy {
            VolumeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val registries: RegistryService.WithRawResponse by lazy {
            RegistryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val snapshots: SnapshotService.WithRawResponse by lazy {
            SnapshotServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SandboxService.WithRawResponse =
            SandboxServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun boxes(): BoxService.WithRawResponse = boxes

        override fun volumes(): VolumeService.WithRawResponse = volumes

        override fun registries(): RegistryService.WithRawResponse = registries

        override fun snapshots(): SnapshotService.WithRawResponse = snapshots

        private val listUsageCostsHandler: Handler<SandboxListUsageCostsPageResponse> =
            jsonHandler<SandboxListUsageCostsPageResponse>(clientOptions.jsonMapper)

        override fun listUsageCosts(
            params: SandboxListUsageCostsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SandboxListUsageCostsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sandboxes", "usage", "costs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listUsageCostsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SandboxListUsageCostsPage.builder()
                            .service(SandboxServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveUsageHandler: Handler<SandboxRetrieveUsageResponse> =
            jsonHandler<SandboxRetrieveUsageResponse>(clientOptions.jsonMapper)

        override fun retrieveUsage(
            params: SandboxRetrieveUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SandboxRetrieveUsageResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sandboxes", "usage")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
