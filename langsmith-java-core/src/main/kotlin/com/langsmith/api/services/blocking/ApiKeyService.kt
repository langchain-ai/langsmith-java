// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.ApiKeyCreateParams
import com.langsmith.api.models.ApiKeyCreateResponse
import com.langsmith.api.models.ApiKeyDeleteParams
import com.langsmith.api.models.ApiKeyGetResponse
import com.langsmith.api.models.ApiKeyRetrieveParams

interface ApiKeyService { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Generate an api key for the user */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: ApiKeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ApiKeyCreateResponse

    /** Get the current tenant's API keys */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun retrieve(
        params: ApiKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<ApiKeyGetResponse>

    /** Delete an api key for the user */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun delete(
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ApiKeyGetResponse
}
