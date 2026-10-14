// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.feedback

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.models.feedback.configs.ConfigDeleteParams
import java.util.function.Consumer

interface ConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigService

    /**
     * Soft delete one feedback config by id, or every config of a feedback key.
     *
     * The config can be recreated later with the same key (simple reuse pattern). Existing feedback
     * records with this key will remain unchanged. Deleting an enforced config turns off its
     * enforcement instead of removing it, and needs the feedback-configs:manage-enforced
     * permission. Deleting an unenforced config that an annotation queue uses is refused.
     */
    fun delete() = delete(ConfigDeleteParams.none())

    /** @see delete */
    fun delete(
        params: ConfigDeleteParams = ConfigDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: ConfigDeleteParams = ConfigDeleteParams.none()) =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(requestOptions: RequestOptions) = delete(ConfigDeleteParams.none(), requestOptions)

    /** A view of [ConfigService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /api/v1/feedback-configs`, but is otherwise the
         * same as [ConfigService.delete].
         */
        @MustBeClosed fun delete(): HttpResponse = delete(ConfigDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ConfigDeleteParams = ConfigDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ConfigDeleteParams = ConfigDeleteParams.none()): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(requestOptions: RequestOptions): HttpResponse =
            delete(ConfigDeleteParams.none(), requestOptions)
    }
}
