// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.client

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.*
import com.langsmith.api.services.blocking.*
import com.langsmith.api.services.errorHandler

class LangSmithClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : LangSmithClient {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val async: LangSmithClientAsync by lazy { LangSmithClientAsyncImpl(clientOptions) }

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptions) }

    private val examples: ExampleService by lazy { ExampleServiceImpl(clientOptions) }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val runManifests: RunManifestService by lazy { RunManifestServiceImpl(clientOptions) }

    private val feedback: FeedbackService by lazy { FeedbackServiceImpl(clientOptions) }

    private val public_: PublicService by lazy { PublicServiceImpl(clientOptions) }

    private val annotationQueues: AnnotationQueueService by lazy {
        AnnotationQueueServiceImpl(clientOptions)
    }

    private val tenants: TenantService by lazy { TenantServiceImpl(clientOptions) }

    private val info: InfoService by lazy { InfoServiceImpl(clientOptions) }

    private val feedbackConfigs: FeedbackConfigService by lazy {
        FeedbackConfigServiceImpl(clientOptions)
    }

    private val ok: OkService by lazy { OkServiceImpl(clientOptions) }

    override fun async(): LangSmithClientAsync = async

    override fun sessions(): SessionService = sessions

    override fun examples(): ExampleService = examples

    override fun datasets(): DatasetService = datasets

    override fun runs(): RunService = runs

    override fun runManifests(): RunManifestService = runManifests

    override fun feedback(): FeedbackService = feedback

    override fun public_(): PublicService = public_

    override fun annotationQueues(): AnnotationQueueService = annotationQueues

    override fun tenants(): TenantService = tenants

    override fun info(): InfoService = info

    override fun feedbackConfigs(): FeedbackConfigService = feedbackConfigs

    override fun ok(): OkService = ok
}
