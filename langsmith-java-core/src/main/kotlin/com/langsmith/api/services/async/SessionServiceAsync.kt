// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.SessionCreateParams
import com.langsmith.api.models.SessionDeleteParams
import com.langsmith.api.models.SessionDeleteResponse
import com.langsmith.api.models.SessionListParams
import com.langsmith.api.models.SessionRetrieveParams
import com.langsmith.api.models.SessionUpdateParams
import com.langsmith.api.models.TracerSession
import com.langsmith.api.models.TracerSessionWithoutVirtualFields
import com.langsmith.api.services.async.sessions.MetadataServiceAsync
import java.util.concurrent.CompletableFuture

interface SessionServiceAsync { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    fun metadata(): MetadataServiceAsync // templates/JavaSDK/services.ts:55:15

    /** Create a new session. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: SessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TracerSessionWithoutVirtualFields>

    /** Get a specific session. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun retrieve(
        params: SessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TracerSession>

    /** Create a new session. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun update(
        params: SessionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TracerSessionWithoutVirtualFields>

    /** Get all sessions. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun list(
        params: SessionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<TracerSession>>

    /** Delete a specific session. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun delete(
        params: SessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SessionDeleteResponse>
}
