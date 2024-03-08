// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.services.errorHandler

class ApiKeyServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ApiKeyService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)
}
