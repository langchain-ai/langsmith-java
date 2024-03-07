package com.langsmith.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException
constructor(
    headers: ListMultimap<String, String>,
    private val error: LangSmithError,
) : LangSmithServiceException(headers, "${error}") {
    override fun statusCode(): Int = 429

    fun error(): LangSmithError = error
}
