// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.examples

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.examples.validate.ExampleValidationResult
import com.langchain.smith.models.examples.validate.ValidateBulkParams
import com.langchain.smith.models.examples.validate.ValidateCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ValidateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidateServiceAsync

    /** Validate an example. */
    fun create(): CompletableFuture<ExampleValidationResult> = create(ValidateCreateParams.none())

    /** @see create */
    fun create(
        params: ValidateCreateParams = ValidateCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExampleValidationResult>

    /** @see create */
    fun create(
        params: ValidateCreateParams = ValidateCreateParams.none()
    ): CompletableFuture<ExampleValidationResult> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<ExampleValidationResult> =
        create(ValidateCreateParams.none(), requestOptions)

    /** Validate an example. */
    fun bulk(): CompletableFuture<List<ExampleValidationResult>> = bulk(ValidateBulkParams.none())

    /** @see bulk */
    fun bulk(
        params: ValidateBulkParams = ValidateBulkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ExampleValidationResult>>

    /** @see bulk */
    fun bulk(
        params: ValidateBulkParams = ValidateBulkParams.none()
    ): CompletableFuture<List<ExampleValidationResult>> = bulk(params, RequestOptions.none())

    /** @see bulk */
    fun bulk(requestOptions: RequestOptions): CompletableFuture<List<ExampleValidationResult>> =
        bulk(ValidateBulkParams.none(), requestOptions)

    /**
     * A view of [ValidateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ValidateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/examples/validate`, but is otherwise the
         * same as [ValidateServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<ExampleValidationResult>> =
            create(ValidateCreateParams.none())

        /** @see create */
        fun create(
            params: ValidateCreateParams = ValidateCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExampleValidationResult>>

        /** @see create */
        fun create(
            params: ValidateCreateParams = ValidateCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ExampleValidationResult>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExampleValidationResult>> =
            create(ValidateCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/examples/validate/bulk`, but is otherwise
         * the same as [ValidateServiceAsync.bulk].
         */
        fun bulk(): CompletableFuture<HttpResponseFor<List<ExampleValidationResult>>> =
            bulk(ValidateBulkParams.none())

        /** @see bulk */
        fun bulk(
            params: ValidateBulkParams = ValidateBulkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ExampleValidationResult>>>

        /** @see bulk */
        fun bulk(
            params: ValidateBulkParams = ValidateBulkParams.none()
        ): CompletableFuture<HttpResponseFor<List<ExampleValidationResult>>> =
            bulk(params, RequestOptions.none())

        /** @see bulk */
        fun bulk(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<ExampleValidationResult>>> =
            bulk(ValidateBulkParams.none(), requestOptions)
    }
}
