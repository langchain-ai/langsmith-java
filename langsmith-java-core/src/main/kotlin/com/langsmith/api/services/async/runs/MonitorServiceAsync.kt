// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.runs

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.MonitorResponse
import com.langsmith.api.models.RunMonitorCreateParams
import java.util.concurrent.CompletableFuture

interface MonitorServiceAsync {

    /** Get monitoring data for a specific session. */
    @JvmOverloads
    fun create(
        params: RunMonitorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<MonitorResponse>
}
