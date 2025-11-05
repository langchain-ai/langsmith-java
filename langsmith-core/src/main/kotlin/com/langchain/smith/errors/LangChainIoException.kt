package com.langchain.smith.errors

class LangChainIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : LangChainException(message, cause)
