// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking

import com.langsmith.api.services.blocking.public_.DatasetService
import com.langsmith.api.services.blocking.public_.ExampleService
import com.langsmith.api.services.blocking.public_.FeedbackService
import com.langsmith.api.services.blocking.public_.RunService

interface PublicService {

    fun run(): RunService

    fun runs(): RunService

    fun feedbacks(): FeedbackService

    fun datasets(): DatasetService

    fun examples(): ExampleService
}
