// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.public_.runs

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.ListPublicRunsResponse
import com.langsmith.api.models.PublicRunQueryCreateParams

interface QueryService { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Get run by ids or the shared run if not specifed. */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: PublicRunQueryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ListPublicRunsResponse
}
