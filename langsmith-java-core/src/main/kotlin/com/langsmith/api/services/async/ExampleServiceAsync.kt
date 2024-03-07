// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.Example
import com.langsmith.api.models.ExampleCreateParams
import com.langsmith.api.models.ExampleDeleteParams
import com.langsmith.api.models.ExampleDeleteResponse
import com.langsmith.api.models.ExampleListParams
import com.langsmith.api.models.ExampleRetrieveParams
import com.langsmith.api.models.ExampleUpdateParams
import com.langsmith.api.models.ExampleUpdateResponse
import com.langsmith.api.services.async.examples.BulkServiceAsync
import com.langsmith.api.services.async.examples.UploadServiceAsync
import java.util.concurrent.CompletableFuture

interface ExampleServiceAsync {

    fun bulk(): BulkServiceAsync

    fun upload(): UploadServiceAsync

    /** Create a new example. */
    @JvmOverloads
    fun create(
        params: ExampleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Example>

    /** Get a specific example. */
    @JvmOverloads
    fun retrieve(
        params: ExampleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Example>

    /** Update a specific example. */
    @JvmOverloads
    fun update(
        params: ExampleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ExampleUpdateResponse>

    /** Get all examples by query params */
    @JvmOverloads
    fun list(
        params: ExampleListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<Example>>

    /** Delete a specific set of examples. */
    @JvmOverloads
    fun delete(
        params: ExampleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ExampleDeleteResponse>
}
