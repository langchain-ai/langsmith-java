// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking

import com.langsmith.api.services.blocking.public_.DatasetService
import com.langsmith.api.services.blocking.public_.ExampleService
import com.langsmith.api.services.blocking.public_.FeedbackService
import com.langsmith.api.services.blocking.public_.LatestRunService
import com.langsmith.api.services.blocking.public_.RunService

interface PublicService { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    fun runs(): RunService // templates/JavaSDK/services.ts:55:15

    fun latestRun(): LatestRunService

    fun feedbacks(): FeedbackService

    fun datasets(): DatasetService

    fun examples(): ExampleService
}
