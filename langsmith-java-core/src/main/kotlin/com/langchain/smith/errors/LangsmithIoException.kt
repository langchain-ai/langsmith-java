package com.langchain.smith.errors

class LangsmithIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : LangsmithException(message, cause)
