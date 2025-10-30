package com.langsmith_api.api.errors

open class LangsmithApiException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
