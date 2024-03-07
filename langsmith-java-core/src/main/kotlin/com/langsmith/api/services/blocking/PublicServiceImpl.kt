// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.services.blocking.public_.DatasetService
import com.langsmith.api.services.blocking.public_.DatasetServiceImpl
import com.langsmith.api.services.blocking.public_.ExampleService
import com.langsmith.api.services.blocking.public_.ExampleServiceImpl
import com.langsmith.api.services.blocking.public_.FeedbackService
import com.langsmith.api.services.blocking.public_.FeedbackServiceImpl
import com.langsmith.api.services.blocking.public_.RunService
import com.langsmith.api.services.blocking.public_.RunServiceImpl
import com.langsmith.api.services.errorHandler

class PublicServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PublicService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val run: RunService by lazy { RunServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val feedbacks: FeedbackService by lazy { FeedbackServiceImpl(clientOptions) }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptions) }

    private val examples: ExampleService by lazy { ExampleServiceImpl(clientOptions) }

    override fun run(): RunService = run

    override fun runs(): RunService = runs

    override fun feedbacks(): FeedbackService = feedbacks

    override fun datasets(): DatasetService = datasets

    override fun examples(): ExampleService = examples
}
