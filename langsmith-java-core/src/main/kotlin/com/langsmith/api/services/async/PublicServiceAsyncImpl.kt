// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services.async

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.services.async.public_.DatasetServiceAsync
import com.langsmith.api.services.async.public_.DatasetServiceAsyncImpl
import com.langsmith.api.services.async.public_.ExampleServiceAsync
import com.langsmith.api.services.async.public_.ExampleServiceAsyncImpl
import com.langsmith.api.services.async.public_.FeedbackServiceAsync
import com.langsmith.api.services.async.public_.FeedbackServiceAsyncImpl
import com.langsmith.api.services.async.public_.LatestRunServiceAsync
import com.langsmith.api.services.async.public_.LatestRunServiceAsyncImpl
import com.langsmith.api.services.async.public_.RunServiceAsync
import com.langsmith.api.services.async.public_.RunServiceAsyncImpl
import com.langsmith.api.services.errorHandler

class PublicServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PublicServiceAsync { // templates/JavaSDK/services.ts:76:15 //
    // templates/JavaSDK/services.ts:76:15 //
    // templates/JavaSDK/services.ts:76:15

    private val errorHandler: Handler<LangSmithError> =
        errorHandler(clientOptions.jsonMapper) // templates/JavaSDK/services.ts:76:15

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    private val latestRun: LatestRunServiceAsync by lazy {
        LatestRunServiceAsyncImpl(clientOptions)
    }

    private val feedbacks: FeedbackServiceAsync by lazy { FeedbackServiceAsyncImpl(clientOptions) }

    private val datasets: DatasetServiceAsync by lazy { DatasetServiceAsyncImpl(clientOptions) }

    private val examples: ExampleServiceAsync by lazy { ExampleServiceAsyncImpl(clientOptions) }

    override fun runs(): RunServiceAsync = runs

    override fun latestRun(): LatestRunServiceAsync = latestRun

    override fun feedbacks(): FeedbackServiceAsync = feedbacks

    override fun datasets(): DatasetServiceAsync = datasets

    override fun examples(): ExampleServiceAsync = examples
}
