// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.RunBatchParams
import com.langsmith.api.models.RunBatchResponse
import com.langsmith.api.models.RunCreateParams
import com.langsmith.api.models.RunCreateResponse
import com.langsmith.api.models.RunRetrieveParams
import com.langsmith.api.models.RunSchema
import com.langsmith.api.models.RunUpdateParams
import com.langsmith.api.models.RunUpdateResponse
import com.langsmith.api.services.async.runs.GenerateQueryServiceAsync
import com.langsmith.api.services.async.runs.MonitorServiceAsync
import com.langsmith.api.services.async.runs.QueryServiceAsync
import com.langsmith.api.services.async.runs.ShareServiceAsync
import com.langsmith.api.services.async.runs.StatServiceAsync
import java.util.concurrent.CompletableFuture

interface RunServiceAsync {

    fun share(): ShareServiceAsync

    fun query(): QueryServiceAsync

    fun generateQuery(): GenerateQueryServiceAsync

    fun stats(): StatServiceAsync

    fun monitor(): MonitorServiceAsync

    /** Create a new run. */
    @JvmOverloads
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RunCreateResponse>

    /** Get a specific run. */
    @JvmOverloads
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RunSchema>

    /** Update a run. */
    @JvmOverloads
    fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RunUpdateResponse>

    /** Batch ingest runs. */
    @JvmOverloads
    fun batch(
        params: RunBatchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RunBatchResponse>
}
