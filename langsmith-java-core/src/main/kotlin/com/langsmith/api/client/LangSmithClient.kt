// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.client

import com.langsmith.api.models.*
import com.langsmith.api.services.blocking.*

interface LangSmithClient {

    fun async(): LangSmithClientAsync

    fun sessions(): SessionService

    fun apiKeys(): ApiKeyService

    fun examples(): ExampleService

    fun datasets(): DatasetService

    fun runs(): RunService

    fun runManifests(): RunManifestService

    fun feedback(): FeedbackService

    fun public_(): PublicService

    fun annotationQueues(): AnnotationQueueService

    fun tenants(): TenantService

    fun info(): InfoService

    fun feedbackConfigs(): FeedbackConfigService

    fun ok(): OkService
}
