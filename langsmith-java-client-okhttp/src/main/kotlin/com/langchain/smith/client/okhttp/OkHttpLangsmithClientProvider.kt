package com.langchain.smith.client.okhttp

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.tracing.LangsmithClientProvider

/** [LangsmithClientProvider] backed by [LangsmithOkHttpClient]. */
class OkHttpLangsmithClientProvider : LangsmithClientProvider {
    override fun createClient(): LangsmithClient = LangsmithOkHttpClient.fromEnv()
}
