// File generated from our OpenAPI spec by Stainless.

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

interface SessionServiceAsync {

    fun metadata(): MetadataServiceAsync

    /** Create a new session. */
    @JvmOverloads
    fun create(
        params: SessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TracerSessionWithoutVirtualFields>

    /** Get a specific session. */
    @JvmOverloads
    fun retrieve(
        params: SessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TracerSession>

    /** Create a new session. */
    @JvmOverloads
    fun update(
        params: SessionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TracerSessionWithoutVirtualFields>

    /** Get all sessions. */
    @JvmOverloads
    fun list(
        params: SessionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<TracerSession>>

    /** Delete a specific session. */
    @JvmOverloads
    fun delete(
        params: SessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SessionDeleteResponse>
}
