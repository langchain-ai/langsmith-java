package com.langchain.smith.core

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertiesTest {

    @Test
    fun getPackageVersion_returnsNonBlankValue() {
        val version = getPackageVersion()

        assertThat(version).isNotBlank()
    }

    @Test
    fun getOsArch_returnsNonBlankValue() {
        val osArch = getOsArch()

        assertThat(osArch).isNotBlank()
    }

    @Test
    fun getOsName_returnsNonBlankValue() {
        val osName = getOsName()

        assertThat(osName).isNotBlank()
    }

    @Test
    fun getOsVersion_returnsNonBlankValue() {
        val osVersion = getOsVersion()

        assertThat(osVersion).isNotBlank()
    }

    @Test
    fun getJavaVersion_returnsNonBlankValue() {
        val javaVersion = getJavaVersion()

        assertThat(javaVersion).isNotBlank()
    }
}
