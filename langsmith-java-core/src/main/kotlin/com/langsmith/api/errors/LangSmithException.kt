package com.langsmith.api.errors

open class LangSmithException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
