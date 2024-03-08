// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.ApiKeyCreateParams
import com.langsmith.api.models.ApiKeyCreateResponse
import com.langsmith.api.models.ApiKeyDeleteParams
import com.langsmith.api.models.ApiKeyGetResponse
import com.langsmith.api.models.ApiKeyRetrieveParams
import java.util.concurrent.CompletableFuture

interface ApiKeyServiceAsync {

    /** Generate an api key for the user */
    @JvmOverloads
    fun create(
        params: ApiKeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ApiKeyCreateResponse>

    /** Get the current tenant's API keys */
    @JvmOverloads
    fun retrieve(
        params: ApiKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<ApiKeyGetResponse>>

    /** Delete an api key for the user */
    @JvmOverloads
    fun delete(
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ApiKeyGetResponse>
}
