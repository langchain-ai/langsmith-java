// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.FeedbackCreateParams
import com.langsmith.api.models.FeedbackDeleteParams
import com.langsmith.api.models.FeedbackDeleteResponse
import com.langsmith.api.models.FeedbackEagerParams
import com.langsmith.api.models.FeedbackListParams
import com.langsmith.api.models.FeedbackRetrieveParams
import com.langsmith.api.models.FeedbackSchema
import com.langsmith.api.models.FeedbackUpdateParams

interface FeedbackService {

    /** Create a new feedback. */
    @JvmOverloads
    fun create(
        params: FeedbackCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FeedbackSchema

    /** Get a specific feedback. */
    @JvmOverloads
    fun retrieve(
        params: FeedbackRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FeedbackSchema

    /** Replace an existing feedback entry with a new, modified entry. */
    @JvmOverloads
    fun update(
        params: FeedbackUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FeedbackSchema

    /** List all Feedback by query params. */
    @JvmOverloads
    fun list(
        params: FeedbackListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<FeedbackSchema>

    /** Delete a feedback. */
    @JvmOverloads
    fun delete(
        params: FeedbackDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FeedbackDeleteResponse

    /**
     * Create a new feedback.
     *
     * This method is invoked under the assumption that the run is already visible in the app, thus
     * already present in DB
     */
    @JvmOverloads
    fun eager(
        params: FeedbackEagerParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FeedbackSchema
}
