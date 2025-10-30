package com.langchain.smith.errors

class LangsmithInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : LangsmithException(message, cause)
