// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.Example
import com.langsmith.api.models.ExampleCreateParams
import com.langsmith.api.models.ExampleDeleteParams
import com.langsmith.api.models.ExampleDeleteResponse
import com.langsmith.api.models.ExampleListParams
import com.langsmith.api.models.ExampleRetrieveParams
import com.langsmith.api.models.ExampleUpdateParams
import com.langsmith.api.models.ExampleUpdateResponse
import com.langsmith.api.services.blocking.examples.BulkService
import com.langsmith.api.services.blocking.examples.UploadService

interface ExampleService {

    fun bulk(): BulkService

    fun upload(): UploadService

    /** Create a new example. */
    @JvmOverloads
    fun create(
        params: ExampleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Example

    /** Get a specific example. */
    @JvmOverloads
    fun retrieve(
        params: ExampleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Example

    /** Update a specific example. */
    @JvmOverloads
    fun update(
        params: ExampleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExampleUpdateResponse

    /** Get all examples by query params */
    @JvmOverloads
    fun list(
        params: ExampleListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<Example>

    /** Delete a specific set of examples. */
    @JvmOverloads
    fun delete(
        params: ExampleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExampleDeleteResponse
}
