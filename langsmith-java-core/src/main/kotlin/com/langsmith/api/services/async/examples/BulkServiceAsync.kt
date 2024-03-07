// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.examples

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.Example
import com.langsmith.api.models.ExampleBulkCreateParams
import java.util.concurrent.CompletableFuture

interface BulkServiceAsync {

    /** Create a new example. */
    @JvmOverloads
    fun create(
        params: ExampleBulkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<Example>>
}
