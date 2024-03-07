package com.langsmith.api.core.http

import java.io.Closeable
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream

interface BinaryResponseContent : Closeable {

    fun contentType(): String?

    fun body(): InputStream

    @Throws(IOException::class) fun writeTo(outputStream: OutputStream)
}
