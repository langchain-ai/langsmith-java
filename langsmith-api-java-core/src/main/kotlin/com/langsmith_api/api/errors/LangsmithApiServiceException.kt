// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.errors

import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.http.Headers

abstract class LangsmithApiServiceException
protected constructor(message: String, cause: Throwable? = null) :
    LangsmithApiException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
