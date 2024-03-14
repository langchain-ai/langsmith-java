// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking

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
import com.langsmith.api.services.blocking.datasets.CsvService
import com.langsmith.api.services.blocking.datasets.OpenAIFtService
import com.langsmith.api.services.blocking.datasets.OpenAIService
import com.langsmith.api.services.blocking.datasets.RunService
import com.langsmith.api.services.blocking.datasets.ShareService

interface DatasetService {

    fun openai(): OpenAIService

    fun openaiFt(): OpenAIFtService

    fun csv(): CsvService

    fun runs(): RunService

    fun shares(): ShareService

    /** Create a new dataset. */
    @JvmOverloads
    fun create(
        params: DatasetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dataset

    /** Get a specific dataset. */
    @JvmOverloads
    fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dataset

    /** Update a specific dataset. */
    @JvmOverloads
    fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetSchemaForUpdate

    /** Get all datasets by query params and owner. */
    @JvmOverloads
    fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<Dataset>

    /** Delete a specific dataset. */
    @JvmOverloads
    fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetDeleteResponse

    /** Unshare a dataset. */
    @JvmOverloads
    fun share(
        params: DatasetShareParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetShareResponse

    /** Create a new dataset from a CSV file. */
    @JvmOverloads
    fun upload(
        params: DatasetUploadParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dataset
}
