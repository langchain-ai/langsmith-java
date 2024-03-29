// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.Dataset
import com.langsmith.api.models.DatasetCreateParams
import com.langsmith.api.models.DatasetDeleteParams
import com.langsmith.api.models.DatasetDeleteResponse
import com.langsmith.api.models.DatasetListParams
import com.langsmith.api.models.DatasetRetrieveParams
import com.langsmith.api.models.DatasetSchemaForUpdate
import com.langsmith.api.models.DatasetShareParams
import com.langsmith.api.models.DatasetShareResponse
import com.langsmith.api.models.DatasetUpdateParams
import com.langsmith.api.models.DatasetUploadParams
import com.langsmith.api.services.async.datasets.CsvServiceAsync
import com.langsmith.api.services.async.datasets.OpenAIFtServiceAsync
import com.langsmith.api.services.async.datasets.OpenAIServiceAsync
import com.langsmith.api.services.async.datasets.RunServiceAsync
import com.langsmith.api.services.async.datasets.ShareServiceAsync
import java.util.concurrent.CompletableFuture

interface DatasetServiceAsync {

    fun openai(): OpenAIServiceAsync

    fun openaiFt(): OpenAIFtServiceAsync

    fun csv(): CsvServiceAsync

    fun runs(): RunServiceAsync

    fun shares(): ShareServiceAsync

    /** Create a new dataset. */
    @JvmOverloads
    fun create(
        params: DatasetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Dataset>

    /** Get a specific dataset. */
    @JvmOverloads
    fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Dataset>

    /** Update a specific dataset. */
    @JvmOverloads
    fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetSchemaForUpdate>

    /** Get all datasets by query params and owner. */
    @JvmOverloads
    fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<Dataset>>

    /** Delete a specific dataset. */
    @JvmOverloads
    fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetDeleteResponse>

    /** Unshare a dataset. */
    @JvmOverloads
    fun share(
        params: DatasetShareParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetShareResponse>

    /** Create a new dataset from a CSV file. */
    @JvmOverloads
    fun upload(
        params: DatasetUploadParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Dataset>
}
