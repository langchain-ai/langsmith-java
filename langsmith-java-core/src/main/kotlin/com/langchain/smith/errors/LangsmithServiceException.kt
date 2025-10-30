// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.errors

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.http.Headers

abstract class LangsmithServiceException
protected constructor(message: String, cause: Throwable? = null) :
    LangsmithException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
