package com.langchain.smith.errors

open class LangsmithException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
