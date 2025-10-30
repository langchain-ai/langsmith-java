@file:JvmName("Properties")

package com.langsmith_api.api.core

import com.langsmith_api.api.client.LangsmithApiClient

fun getOsArch(): String {
    val osArch = System.getProperty("os.arch")

    return when (osArch) {
        null -> "unknown"
        "i386",
        "x32",
        "x86" -> "x32"
        "amd64",
        "x86_64" -> "x64"
        "arm" -> "arm"
        "aarch64" -> "arm64"
        else -> "other:$osArch"
    }
}

fun getOsName(): String {
    val osName = System.getProperty("os.name")
    val vendorUrl = System.getProperty("java.vendor.url")

    return when {
        osName == null -> "Unknown"
        osName.startsWith("Linux") && vendorUrl == "http://www.android.com/" -> "Android"
        osName.startsWith("Linux") -> "Linux"
        osName.startsWith("Mac OS") -> "MacOS"
        osName.startsWith("Windows") -> "Windows"
        else -> "Other:$osName"
    }
}

fun getOsVersion(): String = System.getProperty("os.version", "unknown")

fun getPackageVersion(): String =
    LangsmithApiClient::class.java.`package`.implementationVersion ?: "unknown"

fun getJavaVersion(): String = System.getProperty("java.version", "unknown")
