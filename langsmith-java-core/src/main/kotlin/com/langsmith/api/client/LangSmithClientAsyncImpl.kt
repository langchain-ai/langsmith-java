// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.client

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.*
import com.langsmith.api.services.async.*
import com.langsmith.api.services.errorHandler

class LangSmithClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : LangSmithClientAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val sync: LangSmithClient by lazy { LangSmithClientImpl(clientOptions) }

    private val sessions: SessionServiceAsync by lazy { SessionServiceAsyncImpl(clientOptions) }

    private val apiKeys: ApiKeyServiceAsync by lazy { ApiKeyServiceAsyncImpl(clientOptions) }

    private val examples: ExampleServiceAsync by lazy { ExampleServiceAsyncImpl(clientOptions) }

    private val datasets: DatasetServiceAsync by lazy { DatasetServiceAsyncImpl(clientOptions) }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    private val runManifests: RunManifestServiceAsync by lazy {
        RunManifestServiceAsyncImpl(clientOptions)
    }

    private val feedback: FeedbackServiceAsync by lazy { FeedbackServiceAsyncImpl(clientOptions) }

    private val public_: PublicServiceAsync by lazy { PublicServiceAsyncImpl(clientOptions) }

    private val annotationQueues: AnnotationQueueServiceAsync by lazy {
        AnnotationQueueServiceAsyncImpl(clientOptions)
    }

    private val tenants: TenantServiceAsync by lazy { TenantServiceAsyncImpl(clientOptions) }

    private val info: InfoServiceAsync by lazy { InfoServiceAsyncImpl(clientOptions) }

    private val feedbackConfigs: FeedbackConfigServiceAsync by lazy {
        FeedbackConfigServiceAsyncImpl(clientOptions)
    }

    private val ok: OkServiceAsync by lazy { OkServiceAsyncImpl(clientOptions) }

    override fun sync(): LangSmithClient = sync

    override fun sessions(): SessionServiceAsync = sessions

    override fun apiKeys(): ApiKeyServiceAsync = apiKeys

    override fun examples(): ExampleServiceAsync = examples

    override fun datasets(): DatasetServiceAsync = datasets

    override fun runs(): RunServiceAsync = runs

    override fun runManifests(): RunManifestServiceAsync = runManifests

    override fun feedback(): FeedbackServiceAsync = feedback

    override fun public_(): PublicServiceAsync = public_

    override fun annotationQueues(): AnnotationQueueServiceAsync = annotationQueues

    override fun tenants(): TenantServiceAsync = tenants

    override fun info(): InfoServiceAsync = info

    override fun feedbackConfigs(): FeedbackConfigServiceAsync = feedbackConfigs

    override fun ok(): OkServiceAsync = ok
}
