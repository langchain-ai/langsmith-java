package com.langsmith_api.api.errors

class LangsmithApiIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    LangsmithApiException(message, cause)
