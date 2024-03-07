package com.langsmith.api.errors

class LangSmithIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : LangSmithException(message, cause)
