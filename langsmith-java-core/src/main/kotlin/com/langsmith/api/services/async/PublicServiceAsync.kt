// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async

import com.langsmith.api.services.async.public_.DatasetServiceAsync
import com.langsmith.api.services.async.public_.ExampleServiceAsync
import com.langsmith.api.services.async.public_.FeedbackServiceAsync
import com.langsmith.api.services.async.public_.RunServiceAsync

interface PublicServiceAsync {

    fun run(): RunServiceAsync

    fun runs(): RunServiceAsync

    fun feedbacks(): FeedbackServiceAsync

    fun datasets(): DatasetServiceAsync

    fun examples(): ExampleServiceAsync
}
