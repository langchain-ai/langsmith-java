package com.langsmith.api.errors

class LangSmithInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : LangSmithException(message, cause)
