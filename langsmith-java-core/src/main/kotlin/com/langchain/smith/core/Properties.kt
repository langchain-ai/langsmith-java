@file:JvmName("Properties")

package com.langchain.smith.core

import com.langchain.smith.client.LangsmithClient
import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger("com.langchain.smith.core.Properties")

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

fun getOsVersion(): String = System.getProperty("os.version", "unknown") ?: "unknown"

fun getPackageVersion(): String {
    try {
        val props = java.util.Properties()
        LangsmithClient::class
            .java
            .classLoader
            .getResourceAsStream("com/langchain/smith/version.properties")
            ?.use { props.load(it) }
        props.getProperty("version")?.let {
            return it
        }
    } catch (e: Exception) {
        logger.warn("Failed to read version from version.properties", e)
    }
    return LangsmithClient::class.java.`package`.implementationVersion ?: "unknown"
}

fun getJavaVersion(): String = System.getProperty("java.version", "unknown") ?: "unknown"
