package com.langchain.smith.errors

class LangChainInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : LangChainException(message, cause)
