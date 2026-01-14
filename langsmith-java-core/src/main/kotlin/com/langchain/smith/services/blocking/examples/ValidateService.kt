// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.examples

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.examples.validate.ExampleValidationResult
import com.langchain.smith.models.examples.validate.ValidateBulkParams
import com.langchain.smith.models.examples.validate.ValidateCreateParams
import java.util.function.Consumer

interface ValidateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidateService

    /** Validate an example. */
    fun create(): ExampleValidationResult = create(ValidateCreateParams.none())

    /** @see create */
    fun create(
        params: ValidateCreateParams = ValidateCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleValidationResult

    /** @see create */
    fun create(
        params: ValidateCreateParams = ValidateCreateParams.none()
    ): ExampleValidationResult = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): ExampleValidationResult =
        create(ValidateCreateParams.none(), requestOptions)

    /** Validate examples in bulk. */
    fun bulk(): List<ExampleValidationResult> = bulk(ValidateBulkParams.none())

    /** @see bulk */
    fun bulk(
        params: ValidateBulkParams = ValidateBulkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ExampleValidationResult>

    /** @see bulk */
    fun bulk(
        params: ValidateBulkParams = ValidateBulkParams.none()
    ): List<ExampleValidationResult> = bulk(params, RequestOptions.none())

    /** @see bulk */
    fun bulk(requestOptions: RequestOptions): List<ExampleValidationResult> =
        bulk(ValidateBulkParams.none(), requestOptions)

    /** A view of [ValidateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/examples/validate`, but is otherwise the
         * same as [ValidateService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<ExampleValidationResult> = create(ValidateCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ValidateCreateParams = ValidateCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleValidationResult>

        /** @see create */
        @MustBeClosed
        fun create(
            params: ValidateCreateParams = ValidateCreateParams.none()
        ): HttpResponseFor<ExampleValidationResult> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ExampleValidationResult> =
            create(ValidateCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/examples/validate/bulk`, but is otherwise
         * the same as [ValidateService.bulk].
         */
        @MustBeClosed
        fun bulk(): HttpResponseFor<List<ExampleValidationResult>> = bulk(ValidateBulkParams.none())

        /** @see bulk */
        @MustBeClosed
        fun bulk(
            params: ValidateBulkParams = ValidateBulkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ExampleValidationResult>>

        /** @see bulk */
        @MustBeClosed
        fun bulk(
            params: ValidateBulkParams = ValidateBulkParams.none()
        ): HttpResponseFor<List<ExampleValidationResult>> = bulk(params, RequestOptions.none())

        /** @see bulk */
        @MustBeClosed
        fun bulk(requestOptions: RequestOptions): HttpResponseFor<List<ExampleValidationResult>> =
            bulk(ValidateBulkParams.none(), requestOptions)
    }
}
