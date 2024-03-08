// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.runs

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.RunShareDeleteParams
import com.langsmith.api.models.RunShareDeleteResponse
import com.langsmith.api.models.RunShareRetrieveParams
import com.langsmith.api.models.RunShareSchema
import com.langsmith.api.models.RunShareUpdateParams

interface ShareService { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Get the state of sharing of a run. */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun retrieve(
        params: RunShareRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RunShareSchema

    /** Share a run. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun update(
        params: RunShareUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RunShareSchema

    /** Unshare a run. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun delete(
        params: RunShareDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RunShareDeleteResponse
}
