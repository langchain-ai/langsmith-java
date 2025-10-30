package com.langsmith_api.api.errors

class LangsmithApiInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    LangsmithApiException(message, cause)
