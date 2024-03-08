// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async

import com.langsmith.api.services.async.public_.DatasetServiceAsync
import com.langsmith.api.services.async.public_.ExampleServiceAsync
import com.langsmith.api.services.async.public_.FeedbackServiceAsync
import com.langsmith.api.services.async.public_.LatestRunServiceAsync
import com.langsmith.api.services.async.public_.RunServiceAsync

interface PublicServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    fun runs(): RunServiceAsync // templates/JavaSDK/services.ts:55:15

    fun latestRun(): LatestRunServiceAsync

    fun feedbacks(): FeedbackServiceAsync

    fun datasets(): DatasetServiceAsync

    fun examples(): ExampleServiceAsync
}
