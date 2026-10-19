// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.BaseDeserializer
import com.langchain.smith.core.BaseSerializer
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SandboxMountConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val auth: JsonField<Auth>,
    private val mounts: JsonField<List<Mount>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auth") @ExcludeMissing auth: JsonField<Auth> = JsonMissing.of(),
        @JsonProperty("mounts") @ExcludeMissing mounts: JsonField<List<Mount>> = JsonMissing.of(),
    ) : this(auth, mounts, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun auth(): Optional<Auth> = auth.getOptional("auth")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mounts(): Optional<List<Mount>> = mounts.getOptional("mounts")

    /**
     * Returns the raw JSON value of [auth].
     *
     * Unlike [auth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth") @ExcludeMissing fun _auth(): JsonField<Auth> = auth

    /**
     * Returns the raw JSON value of [mounts].
     *
     * Unlike [mounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mounts") @ExcludeMissing fun _mounts(): JsonField<List<Mount>> = mounts

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [SandboxMountConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SandboxMountConfig]. */
    class Builder internal constructor() {

        private var auth: JsonField<Auth> = JsonMissing.of()
        private var mounts: JsonField<MutableList<Mount>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sandboxMountConfig: SandboxMountConfig) = apply {
            auth = sandboxMountConfig.auth
            mounts = sandboxMountConfig.mounts.map { it.toMutableList() }
            additionalProperties = sandboxMountConfig.additionalProperties.toMutableMap()
        }

        fun auth(auth: Auth) = auth(JsonField.of(auth))

        /**
         * Sets [Builder.auth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.auth] with a well-typed [Auth] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun auth(auth: JsonField<Auth>) = apply { this.auth = auth }

        fun mounts(mounts: List<Mount>) = mounts(JsonField.of(mounts))

        /**
         * Sets [Builder.mounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mounts] with a well-typed `List<Mount>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mounts(mounts: JsonField<List<Mount>>) = apply {
            this.mounts = mounts.map { it.toMutableList() }
        }

        /**
         * Adds a single [Mount] to [mounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMount(mount: Mount) = apply {
            mounts =
                (mounts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("mounts", it).add(mount)
                }
        }

        /**
         * Alias for calling [addMount] with
         * `Mount.ofSandboxapiS3BucketMountSpec(sandboxapiS3BucketMountSpec)`.
         */
        fun addMount(sandboxapiS3BucketMountSpec: Mount.SandboxapiS3BucketMountSpec) =
            addMount(Mount.ofSandboxapiS3BucketMountSpec(sandboxapiS3BucketMountSpec))

        /**
         * Alias for calling [addMount] with
         * `Mount.ofSandboxapiGcsBucketMountSpec(sandboxapiGcsBucketMountSpec)`.
         */
        fun addMount(sandboxapiGcsBucketMountSpec: Mount.SandboxapiGcsBucketMountSpec) =
            addMount(Mount.ofSandboxapiGcsBucketMountSpec(sandboxapiGcsBucketMountSpec))

        /**
         * Alias for calling [addMount] with
         * `Mount.ofSandboxapiGitRepoMountSpec(sandboxapiGitRepoMountSpec)`.
         */
        fun addMount(sandboxapiGitRepoMountSpec: Mount.SandboxapiGitRepoMountSpec) =
            addMount(Mount.ofSandboxapiGitRepoMountSpec(sandboxapiGitRepoMountSpec))

        /**
         * Alias for calling [addMount] with
         * `Mount.ofSandboxapiContextHubRepoMountSpec(sandboxapiContextHubRepoMountSpec)`.
         */
        fun addMount(sandboxapiContextHubRepoMountSpec: Mount.SandboxapiContextHubRepoMountSpec) =
            addMount(Mount.ofSandboxapiContextHubRepoMountSpec(sandboxapiContextHubRepoMountSpec))

        /**
         * Alias for calling [addMount] with
         * `Mount.ofSandboxapiAzureBlobContainerMountSpec(sandboxapiAzureBlobContainerMountSpec)`.
         */
        fun addMount(
            sandboxapiAzureBlobContainerMountSpec: Mount.SandboxapiAzureBlobContainerMountSpec
        ) =
            addMount(
                Mount.ofSandboxapiAzureBlobContainerMountSpec(sandboxapiAzureBlobContainerMountSpec)
            )

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [SandboxMountConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SandboxMountConfig =
            SandboxMountConfig(
                auth,
                (mounts ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LangChainInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): SandboxMountConfig = apply {
        if (validated) {
            return@apply
        }

        auth().ifPresent { it.validate() }
        mounts().ifPresent { it.forEach { it.validate() } }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangChainInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (auth.asKnown().getOrNull()?.validity() ?: 0) +
            (mounts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Auth
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val aws: JsonField<Aws>,
        private val azure: JsonField<Azure>,
        private val gcp: JsonField<Gcp>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aws") @ExcludeMissing aws: JsonField<Aws> = JsonMissing.of(),
            @JsonProperty("azure") @ExcludeMissing azure: JsonField<Azure> = JsonMissing.of(),
            @JsonProperty("gcp") @ExcludeMissing gcp: JsonField<Gcp> = JsonMissing.of(),
        ) : this(aws, azure, gcp, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun aws(): Optional<Aws> = aws.getOptional("aws")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun azure(): Optional<Azure> = azure.getOptional("azure")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gcp(): Optional<Gcp> = gcp.getOptional("gcp")

        /**
         * Returns the raw JSON value of [aws].
         *
         * Unlike [aws], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aws") @ExcludeMissing fun _aws(): JsonField<Aws> = aws

        /**
         * Returns the raw JSON value of [azure].
         *
         * Unlike [azure], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("azure") @ExcludeMissing fun _azure(): JsonField<Azure> = azure

        /**
         * Returns the raw JSON value of [gcp].
         *
         * Unlike [gcp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gcp") @ExcludeMissing fun _gcp(): JsonField<Gcp> = gcp

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Auth]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Auth]. */
        class Builder internal constructor() {

            private var aws: JsonField<Aws> = JsonMissing.of()
            private var azure: JsonField<Azure> = JsonMissing.of()
            private var gcp: JsonField<Gcp> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(auth: Auth) = apply {
                aws = auth.aws
                azure = auth.azure
                gcp = auth.gcp
                additionalProperties = auth.additionalProperties.toMutableMap()
            }

            fun aws(aws: Aws) = aws(JsonField.of(aws))

            /**
             * Sets [Builder.aws] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aws] with a well-typed [Aws] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun aws(aws: JsonField<Aws>) = apply { this.aws = aws }

            /**
             * Alias for calling [aws] with
             * `Aws.ofSandboxesSandboxAwsMountRoleAuthConfig(sandboxesSandboxAwsMountRoleAuthConfig)`.
             */
            fun aws(
                sandboxesSandboxAwsMountRoleAuthConfig: Aws.SandboxesSandboxAwsMountRoleAuthConfig
            ) =
                aws(
                    Aws.ofSandboxesSandboxAwsMountRoleAuthConfig(
                        sandboxesSandboxAwsMountRoleAuthConfig
                    )
                )

            /**
             * Alias for calling [aws] with
             * `Aws.ofSandboxesSandboxAwsMountStaticAuthConfig(sandboxesSandboxAwsMountStaticAuthConfig)`.
             */
            fun aws(
                sandboxesSandboxAwsMountStaticAuthConfig:
                    Aws.SandboxesSandboxAwsMountStaticAuthConfig
            ) =
                aws(
                    Aws.ofSandboxesSandboxAwsMountStaticAuthConfig(
                        sandboxesSandboxAwsMountStaticAuthConfig
                    )
                )

            fun azure(azure: Azure) = azure(JsonField.of(azure))

            /**
             * Sets [Builder.azure] to an arbitrary JSON value.
             *
             * You should usually call [Builder.azure] with a well-typed [Azure] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun azure(azure: JsonField<Azure>) = apply { this.azure = azure }

            /**
             * Alias for calling [azure] with
             * `Azure.ofSandboxesSandboxAzureMountWorkloadIdentityAuthConfig(sandboxesSandboxAzureMountWorkloadIdentityAuthConfig)`.
             */
            fun azure(
                sandboxesSandboxAzureMountWorkloadIdentityAuthConfig:
                    Azure.SandboxesSandboxAzureMountWorkloadIdentityAuthConfig
            ) =
                azure(
                    Azure.ofSandboxesSandboxAzureMountWorkloadIdentityAuthConfig(
                        sandboxesSandboxAzureMountWorkloadIdentityAuthConfig
                    )
                )

            /**
             * Alias for calling [azure] with
             * `Azure.ofSandboxesSandboxAzureMountAccountKeyAuthConfig(sandboxesSandboxAzureMountAccountKeyAuthConfig)`.
             */
            fun azure(
                sandboxesSandboxAzureMountAccountKeyAuthConfig:
                    Azure.SandboxesSandboxAzureMountAccountKeyAuthConfig
            ) =
                azure(
                    Azure.ofSandboxesSandboxAzureMountAccountKeyAuthConfig(
                        sandboxesSandboxAzureMountAccountKeyAuthConfig
                    )
                )

            /**
             * Alias for calling [azure] with
             * `Azure.ofSandboxesSandboxAzureMountSasAuthConfig(sandboxesSandboxAzureMountSasAuthConfig)`.
             */
            fun azure(
                sandboxesSandboxAzureMountSasAuthConfig:
                    Azure.SandboxesSandboxAzureMountSasAuthConfig
            ) =
                azure(
                    Azure.ofSandboxesSandboxAzureMountSasAuthConfig(
                        sandboxesSandboxAzureMountSasAuthConfig
                    )
                )

            fun gcp(gcp: Gcp) = gcp(JsonField.of(gcp))

            /**
             * Sets [Builder.gcp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gcp] with a well-typed [Gcp] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun gcp(gcp: JsonField<Gcp>) = apply { this.gcp = gcp }

            /**
             * Alias for calling [gcp] with
             * `Gcp.ofSandboxesSandboxGcpMountWorkloadIdentityAuthConfig(sandboxesSandboxGcpMountWorkloadIdentityAuthConfig)`.
             */
            fun gcp(
                sandboxesSandboxGcpMountWorkloadIdentityAuthConfig:
                    Gcp.SandboxesSandboxGcpMountWorkloadIdentityAuthConfig
            ) =
                gcp(
                    Gcp.ofSandboxesSandboxGcpMountWorkloadIdentityAuthConfig(
                        sandboxesSandboxGcpMountWorkloadIdentityAuthConfig
                    )
                )

            /**
             * Alias for calling [gcp] with
             * `Gcp.ofSandboxesSandboxGcpMountServiceAccountAuthConfig(sandboxesSandboxGcpMountServiceAccountAuthConfig)`.
             */
            fun gcp(
                sandboxesSandboxGcpMountServiceAccountAuthConfig:
                    Gcp.SandboxesSandboxGcpMountServiceAccountAuthConfig
            ) =
                gcp(
                    Gcp.ofSandboxesSandboxGcpMountServiceAccountAuthConfig(
                        sandboxesSandboxGcpMountServiceAccountAuthConfig
                    )
                )

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Auth].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Auth = Auth(aws, azure, gcp, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Auth = apply {
            if (validated) {
                return@apply
            }

            aws().ifPresent { it.validate() }
            azure().ifPresent { it.validate() }
            gcp().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (aws.asKnown().getOrNull()?.validity() ?: 0) +
                (azure.asKnown().getOrNull()?.validity() ?: 0) +
                (gcp.asKnown().getOrNull()?.validity() ?: 0)

        @JsonDeserialize(using = Aws.Deserializer::class)
        @JsonSerialize(using = Aws.Serializer::class)
        class Aws
        private constructor(
            private val sandboxesSandboxAwsMountRoleAuthConfig:
                SandboxesSandboxAwsMountRoleAuthConfig? =
                null,
            private val sandboxesSandboxAwsMountStaticAuthConfig:
                SandboxesSandboxAwsMountStaticAuthConfig? =
                null,
            private val _json: JsonValue? = null,
        ) {

            fun sandboxesSandboxAwsMountRoleAuthConfig():
                Optional<SandboxesSandboxAwsMountRoleAuthConfig> =
                Optional.ofNullable(sandboxesSandboxAwsMountRoleAuthConfig)

            fun sandboxesSandboxAwsMountStaticAuthConfig():
                Optional<SandboxesSandboxAwsMountStaticAuthConfig> =
                Optional.ofNullable(sandboxesSandboxAwsMountStaticAuthConfig)

            fun isSandboxesSandboxAwsMountRoleAuthConfig(): Boolean =
                sandboxesSandboxAwsMountRoleAuthConfig != null

            fun isSandboxesSandboxAwsMountStaticAuthConfig(): Boolean =
                sandboxesSandboxAwsMountStaticAuthConfig != null

            fun asSandboxesSandboxAwsMountRoleAuthConfig(): SandboxesSandboxAwsMountRoleAuthConfig =
                sandboxesSandboxAwsMountRoleAuthConfig.getOrThrow(
                    "sandboxesSandboxAwsMountRoleAuthConfig"
                )

            fun asSandboxesSandboxAwsMountStaticAuthConfig():
                SandboxesSandboxAwsMountStaticAuthConfig =
                sandboxesSandboxAwsMountStaticAuthConfig.getOrThrow(
                    "sandboxesSandboxAwsMountStaticAuthConfig"
                )

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.langchain.smith.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = aws.accept(new Aws.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitSandboxesSandboxAwsMountRoleAuthConfig(SandboxesSandboxAwsMountRoleAuthConfig sandboxesSandboxAwsMountRoleAuthConfig) {
             *         return Optional.of(sandboxesSandboxAwsMountRoleAuthConfig.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws LangChainInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    sandboxesSandboxAwsMountRoleAuthConfig != null ->
                        visitor.visitSandboxesSandboxAwsMountRoleAuthConfig(
                            sandboxesSandboxAwsMountRoleAuthConfig
                        )
                    sandboxesSandboxAwsMountStaticAuthConfig != null ->
                        visitor.visitSandboxesSandboxAwsMountStaticAuthConfig(
                            sandboxesSandboxAwsMountStaticAuthConfig
                        )
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Aws = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitSandboxesSandboxAwsMountRoleAuthConfig(
                            sandboxesSandboxAwsMountRoleAuthConfig:
                                SandboxesSandboxAwsMountRoleAuthConfig
                        ) {
                            sandboxesSandboxAwsMountRoleAuthConfig.validate()
                        }

                        override fun visitSandboxesSandboxAwsMountStaticAuthConfig(
                            sandboxesSandboxAwsMountStaticAuthConfig:
                                SandboxesSandboxAwsMountStaticAuthConfig
                        ) {
                            sandboxesSandboxAwsMountStaticAuthConfig.validate()
                        }
                    }
                )
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitSandboxesSandboxAwsMountRoleAuthConfig(
                            sandboxesSandboxAwsMountRoleAuthConfig:
                                SandboxesSandboxAwsMountRoleAuthConfig
                        ) = sandboxesSandboxAwsMountRoleAuthConfig.validity()

                        override fun visitSandboxesSandboxAwsMountStaticAuthConfig(
                            sandboxesSandboxAwsMountStaticAuthConfig:
                                SandboxesSandboxAwsMountStaticAuthConfig
                        ) = sandboxesSandboxAwsMountStaticAuthConfig.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Aws &&
                    sandboxesSandboxAwsMountRoleAuthConfig ==
                        other.sandboxesSandboxAwsMountRoleAuthConfig &&
                    sandboxesSandboxAwsMountStaticAuthConfig ==
                        other.sandboxesSandboxAwsMountStaticAuthConfig
            }

            override fun hashCode(): Int =
                Objects.hash(
                    sandboxesSandboxAwsMountRoleAuthConfig,
                    sandboxesSandboxAwsMountStaticAuthConfig,
                )

            override fun toString(): String =
                when {
                    sandboxesSandboxAwsMountRoleAuthConfig != null ->
                        "Aws{sandboxesSandboxAwsMountRoleAuthConfig=$sandboxesSandboxAwsMountRoleAuthConfig}"
                    sandboxesSandboxAwsMountStaticAuthConfig != null ->
                        "Aws{sandboxesSandboxAwsMountStaticAuthConfig=$sandboxesSandboxAwsMountStaticAuthConfig}"
                    _json != null -> "Aws{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Aws")
                }

            companion object {

                @JvmStatic
                fun ofSandboxesSandboxAwsMountRoleAuthConfig(
                    sandboxesSandboxAwsMountRoleAuthConfig: SandboxesSandboxAwsMountRoleAuthConfig
                ) =
                    Aws(
                        sandboxesSandboxAwsMountRoleAuthConfig =
                            sandboxesSandboxAwsMountRoleAuthConfig
                    )

                @JvmStatic
                fun ofSandboxesSandboxAwsMountStaticAuthConfig(
                    sandboxesSandboxAwsMountStaticAuthConfig:
                        SandboxesSandboxAwsMountStaticAuthConfig
                ) =
                    Aws(
                        sandboxesSandboxAwsMountStaticAuthConfig =
                            sandboxesSandboxAwsMountStaticAuthConfig
                    )
            }

            /**
             * An interface that defines how to map each variant of [Aws] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitSandboxesSandboxAwsMountRoleAuthConfig(
                    sandboxesSandboxAwsMountRoleAuthConfig: SandboxesSandboxAwsMountRoleAuthConfig
                ): T

                fun visitSandboxesSandboxAwsMountStaticAuthConfig(
                    sandboxesSandboxAwsMountStaticAuthConfig:
                        SandboxesSandboxAwsMountStaticAuthConfig
                ): T

                /**
                 * Maps an unknown variant of [Aws] to a value of type [T].
                 *
                 * An instance of [Aws] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LangChainInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LangChainInvalidDataException("Unknown Aws: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Aws>(Aws::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Aws {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<SandboxesSandboxAwsMountRoleAuthConfig>(),
                                    )
                                    ?.let {
                                        Aws(
                                            sandboxesSandboxAwsMountRoleAuthConfig = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<SandboxesSandboxAwsMountStaticAuthConfig>(),
                                    )
                                    ?.let {
                                        Aws(
                                            sandboxesSandboxAwsMountStaticAuthConfig = it,
                                            _json = json,
                                        )
                                    },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Aws(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Aws>(Aws::class) {

                override fun serialize(
                    value: Aws,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.sandboxesSandboxAwsMountRoleAuthConfig != null ->
                            generator.writeObject(value.sandboxesSandboxAwsMountRoleAuthConfig)
                        value.sandboxesSandboxAwsMountStaticAuthConfig != null ->
                            generator.writeObject(value.sandboxesSandboxAwsMountStaticAuthConfig)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Aws")
                    }
                }
            }

            class SandboxesSandboxAwsMountRoleAuthConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val roleArn: JsonField<String>,
                private val subjectScope: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("role_arn")
                    @ExcludeMissing
                    roleArn: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("subject_scope")
                    @ExcludeMissing
                    subjectScope: JsonField<String> = JsonMissing.of(),
                ) : this(roleArn, subjectScope, mutableMapOf())

                /**
                 * IAM role to assume with AssumeRoleWithWebIdentity, using a short-lived OIDC token
                 * LangSmith signs for this workspace; the role's trust policy must trust
                 * LangSmith's issuer for the token subject. LangSmith scopes the credentials to the
                 * configured S3 mounts. Mutually exclusive with static credentials, and cannot be
                 * changed after creation.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun roleArn(): String = roleArn.getRequired("role_arn")

                /**
                 * SubjectScope picks the token subject the role trusts: "workspace" (the default)
                 * or "tag:<tag value id>", which must be one of the sandbox's tag_value_ids. Only
                 * valid with role_arn.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun subjectScope(): Optional<String> = subjectScope.getOptional("subject_scope")

                /**
                 * Returns the raw JSON value of [roleArn].
                 *
                 * Unlike [roleArn], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role_arn")
                @ExcludeMissing
                fun _roleArn(): JsonField<String> = roleArn

                /**
                 * Returns the raw JSON value of [subjectScope].
                 *
                 * Unlike [subjectScope], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("subject_scope")
                @ExcludeMissing
                fun _subjectScope(): JsonField<String> = subjectScope

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [SandboxesSandboxAwsMountRoleAuthConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .roleArn()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesSandboxAwsMountRoleAuthConfig]. */
                class Builder internal constructor() {

                    private var roleArn: JsonField<String>? = null
                    private var subjectScope: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        sandboxesSandboxAwsMountRoleAuthConfig:
                            SandboxesSandboxAwsMountRoleAuthConfig
                    ) = apply {
                        roleArn = sandboxesSandboxAwsMountRoleAuthConfig.roleArn
                        subjectScope = sandboxesSandboxAwsMountRoleAuthConfig.subjectScope
                        additionalProperties =
                            sandboxesSandboxAwsMountRoleAuthConfig.additionalProperties
                                .toMutableMap()
                    }

                    /**
                     * IAM role to assume with AssumeRoleWithWebIdentity, using a short-lived OIDC
                     * token LangSmith signs for this workspace; the role's trust policy must trust
                     * LangSmith's issuer for the token subject. LangSmith scopes the credentials to
                     * the configured S3 mounts. Mutually exclusive with static credentials, and
                     * cannot be changed after creation.
                     */
                    fun roleArn(roleArn: String) = roleArn(JsonField.of(roleArn))

                    /**
                     * Sets [Builder.roleArn] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.roleArn] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun roleArn(roleArn: JsonField<String>) = apply { this.roleArn = roleArn }

                    /**
                     * SubjectScope picks the token subject the role trusts: "workspace" (the
                     * default) or "tag:<tag value id>", which must be one of the sandbox's
                     * tag_value_ids. Only valid with role_arn.
                     */
                    fun subjectScope(subjectScope: String) =
                        subjectScope(JsonField.of(subjectScope))

                    /**
                     * Sets [Builder.subjectScope] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subjectScope] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun subjectScope(subjectScope: JsonField<String>) = apply {
                        this.subjectScope = subjectScope
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [SandboxesSandboxAwsMountRoleAuthConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .roleArn()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesSandboxAwsMountRoleAuthConfig =
                        SandboxesSandboxAwsMountRoleAuthConfig(
                            checkRequired("roleArn", roleArn),
                            subjectScope,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesSandboxAwsMountRoleAuthConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    roleArn()
                    subjectScope()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (roleArn.asKnown().isPresent) 1 else 0) +
                        (if (subjectScope.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesSandboxAwsMountRoleAuthConfig &&
                        roleArn == other.roleArn &&
                        subjectScope == other.subjectScope &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(roleArn, subjectScope, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesSandboxAwsMountRoleAuthConfig{roleArn=$roleArn, subjectScope=$subjectScope, additionalProperties=$additionalProperties}"
            }

            class SandboxesSandboxAwsMountStaticAuthConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val accessKeyId: JsonField<AccessKeyId>,
                private val secretAccessKey: JsonField<SecretAccessKey>,
                private val roleArn: JsonField<RoleArn>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("access_key_id")
                    @ExcludeMissing
                    accessKeyId: JsonField<AccessKeyId> = JsonMissing.of(),
                    @JsonProperty("secret_access_key")
                    @ExcludeMissing
                    secretAccessKey: JsonField<SecretAccessKey> = JsonMissing.of(),
                    @JsonProperty("role_arn")
                    @ExcludeMissing
                    roleArn: JsonField<RoleArn> = JsonMissing.of(),
                ) : this(accessKeyId, secretAccessKey, roleArn, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun accessKeyId(): AccessKeyId = accessKeyId.getRequired("access_key_id")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun secretAccessKey(): SecretAccessKey =
                    secretAccessKey.getRequired("secret_access_key")

                /**
                 * IAM role to assume with AssumeRoleWithWebIdentity, using a short-lived OIDC token
                 * LangSmith signs for this workspace; the role's trust policy must trust
                 * LangSmith's issuer for the token subject. LangSmith scopes the credentials to the
                 * configured S3 mounts. Mutually exclusive with static credentials, and cannot be
                 * changed after creation.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun roleArn(): Optional<RoleArn> = roleArn.getOptional("role_arn")

                /**
                 * Returns the raw JSON value of [accessKeyId].
                 *
                 * Unlike [accessKeyId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("access_key_id")
                @ExcludeMissing
                fun _accessKeyId(): JsonField<AccessKeyId> = accessKeyId

                /**
                 * Returns the raw JSON value of [secretAccessKey].
                 *
                 * Unlike [secretAccessKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("secret_access_key")
                @ExcludeMissing
                fun _secretAccessKey(): JsonField<SecretAccessKey> = secretAccessKey

                /**
                 * Returns the raw JSON value of [roleArn].
                 *
                 * Unlike [roleArn], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role_arn")
                @ExcludeMissing
                fun _roleArn(): JsonField<RoleArn> = roleArn

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [SandboxesSandboxAwsMountStaticAuthConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .accessKeyId()
                     * .secretAccessKey()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesSandboxAwsMountStaticAuthConfig]. */
                class Builder internal constructor() {

                    private var accessKeyId: JsonField<AccessKeyId>? = null
                    private var secretAccessKey: JsonField<SecretAccessKey>? = null
                    private var roleArn: JsonField<RoleArn> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        sandboxesSandboxAwsMountStaticAuthConfig:
                            SandboxesSandboxAwsMountStaticAuthConfig
                    ) = apply {
                        accessKeyId = sandboxesSandboxAwsMountStaticAuthConfig.accessKeyId
                        secretAccessKey = sandboxesSandboxAwsMountStaticAuthConfig.secretAccessKey
                        roleArn = sandboxesSandboxAwsMountStaticAuthConfig.roleArn
                        additionalProperties =
                            sandboxesSandboxAwsMountStaticAuthConfig.additionalProperties
                                .toMutableMap()
                    }

                    fun accessKeyId(accessKeyId: AccessKeyId) =
                        accessKeyId(JsonField.of(accessKeyId))

                    /**
                     * Sets [Builder.accessKeyId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accessKeyId] with a well-typed [AccessKeyId]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accessKeyId(accessKeyId: JsonField<AccessKeyId>) = apply {
                        this.accessKeyId = accessKeyId
                    }

                    fun secretAccessKey(secretAccessKey: SecretAccessKey) =
                        secretAccessKey(JsonField.of(secretAccessKey))

                    /**
                     * Sets [Builder.secretAccessKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.secretAccessKey] with a well-typed
                     * [SecretAccessKey] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun secretAccessKey(secretAccessKey: JsonField<SecretAccessKey>) = apply {
                        this.secretAccessKey = secretAccessKey
                    }

                    /**
                     * IAM role to assume with AssumeRoleWithWebIdentity, using a short-lived OIDC
                     * token LangSmith signs for this workspace; the role's trust policy must trust
                     * LangSmith's issuer for the token subject. LangSmith scopes the credentials to
                     * the configured S3 mounts. Mutually exclusive with static credentials, and
                     * cannot be changed after creation.
                     */
                    fun roleArn(roleArn: RoleArn) = roleArn(JsonField.of(roleArn))

                    /**
                     * Sets [Builder.roleArn] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.roleArn] with a well-typed [RoleArn] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun roleArn(roleArn: JsonField<RoleArn>) = apply { this.roleArn = roleArn }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [SandboxesSandboxAwsMountStaticAuthConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .accessKeyId()
                     * .secretAccessKey()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesSandboxAwsMountStaticAuthConfig =
                        SandboxesSandboxAwsMountStaticAuthConfig(
                            checkRequired("accessKeyId", accessKeyId),
                            checkRequired("secretAccessKey", secretAccessKey),
                            roleArn,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesSandboxAwsMountStaticAuthConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    accessKeyId().validate()
                    secretAccessKey().validate()
                    roleArn().ifPresent { it.validate() }
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (accessKeyId.asKnown().getOrNull()?.validity() ?: 0) +
                        (secretAccessKey.asKnown().getOrNull()?.validity() ?: 0) +
                        (roleArn.asKnown().getOrNull()?.validity() ?: 0)

                class AccessKeyId
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [AccessKeyId].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [AccessKeyId]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(accessKeyId: AccessKeyId) = apply {
                            type = accessKeyId.type
                            isSet = accessKeyId.isSet
                            value = accessKeyId.value
                            additionalProperties = accessKeyId.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [AccessKeyId].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): AccessKeyId =
                            AccessKeyId(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): AccessKeyId = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LangChainInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AccessKeyId &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AccessKeyId{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                class SecretAccessKey
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [SecretAccessKey].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SecretAccessKey]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(secretAccessKey: SecretAccessKey) = apply {
                            type = secretAccessKey.type
                            isSet = secretAccessKey.isSet
                            value = secretAccessKey.value
                            additionalProperties =
                                secretAccessKey.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SecretAccessKey].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): SecretAccessKey =
                            SecretAccessKey(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): SecretAccessKey = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LangChainInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SecretAccessKey &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SecretAccessKey{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                /**
                 * IAM role to assume with AssumeRoleWithWebIdentity, using a short-lived OIDC token
                 * LangSmith signs for this workspace; the role's trust policy must trust
                 * LangSmith's issuer for the token subject. LangSmith scopes the credentials to the
                 * configured S3 mounts. Mutually exclusive with static credentials, and cannot be
                 * changed after creation.
                 */
                class RoleArn
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val EMPTY = of("")

                        @JvmStatic fun of(value: String) = RoleArn(JsonField.of(value))
                    }

                    /** An enum containing [RoleArn]'s known values. */
                    enum class Known {
                        EMPTY
                    }

                    /**
                     * An enum containing [RoleArn]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [RoleArn] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        EMPTY,
                        /**
                         * An enum member indicating that [RoleArn] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            EMPTY -> Value.EMPTY
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            EMPTY -> Known.EMPTY
                            else -> throw LangChainInvalidDataException("Unknown RoleArn: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LangChainInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): RoleArn = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is RoleArn && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesSandboxAwsMountStaticAuthConfig &&
                        accessKeyId == other.accessKeyId &&
                        secretAccessKey == other.secretAccessKey &&
                        roleArn == other.roleArn &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accessKeyId, secretAccessKey, roleArn, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesSandboxAwsMountStaticAuthConfig{accessKeyId=$accessKeyId, secretAccessKey=$secretAccessKey, roleArn=$roleArn, additionalProperties=$additionalProperties}"
            }
        }

        @JsonDeserialize(using = Azure.Deserializer::class)
        @JsonSerialize(using = Azure.Serializer::class)
        class Azure
        private constructor(
            private val sandboxesSandboxAzureMountWorkloadIdentityAuthConfig:
                SandboxesSandboxAzureMountWorkloadIdentityAuthConfig? =
                null,
            private val sandboxesSandboxAzureMountAccountKeyAuthConfig:
                SandboxesSandboxAzureMountAccountKeyAuthConfig? =
                null,
            private val sandboxesSandboxAzureMountSasAuthConfig:
                SandboxesSandboxAzureMountSasAuthConfig? =
                null,
            private val _json: JsonValue? = null,
        ) {

            fun sandboxesSandboxAzureMountWorkloadIdentityAuthConfig():
                Optional<SandboxesSandboxAzureMountWorkloadIdentityAuthConfig> =
                Optional.ofNullable(sandboxesSandboxAzureMountWorkloadIdentityAuthConfig)

            fun sandboxesSandboxAzureMountAccountKeyAuthConfig():
                Optional<SandboxesSandboxAzureMountAccountKeyAuthConfig> =
                Optional.ofNullable(sandboxesSandboxAzureMountAccountKeyAuthConfig)

            fun sandboxesSandboxAzureMountSasAuthConfig():
                Optional<SandboxesSandboxAzureMountSasAuthConfig> =
                Optional.ofNullable(sandboxesSandboxAzureMountSasAuthConfig)

            fun isSandboxesSandboxAzureMountWorkloadIdentityAuthConfig(): Boolean =
                sandboxesSandboxAzureMountWorkloadIdentityAuthConfig != null

            fun isSandboxesSandboxAzureMountAccountKeyAuthConfig(): Boolean =
                sandboxesSandboxAzureMountAccountKeyAuthConfig != null

            fun isSandboxesSandboxAzureMountSasAuthConfig(): Boolean =
                sandboxesSandboxAzureMountSasAuthConfig != null

            fun asSandboxesSandboxAzureMountWorkloadIdentityAuthConfig():
                SandboxesSandboxAzureMountWorkloadIdentityAuthConfig =
                sandboxesSandboxAzureMountWorkloadIdentityAuthConfig.getOrThrow(
                    "sandboxesSandboxAzureMountWorkloadIdentityAuthConfig"
                )

            fun asSandboxesSandboxAzureMountAccountKeyAuthConfig():
                SandboxesSandboxAzureMountAccountKeyAuthConfig =
                sandboxesSandboxAzureMountAccountKeyAuthConfig.getOrThrow(
                    "sandboxesSandboxAzureMountAccountKeyAuthConfig"
                )

            fun asSandboxesSandboxAzureMountSasAuthConfig():
                SandboxesSandboxAzureMountSasAuthConfig =
                sandboxesSandboxAzureMountSasAuthConfig.getOrThrow(
                    "sandboxesSandboxAzureMountSasAuthConfig"
                )

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.langchain.smith.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = azure.accept(new Azure.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitSandboxesSandboxAzureMountWorkloadIdentityAuthConfig(SandboxesSandboxAzureMountWorkloadIdentityAuthConfig sandboxesSandboxAzureMountWorkloadIdentityAuthConfig) {
             *         return Optional.of(sandboxesSandboxAzureMountWorkloadIdentityAuthConfig.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws LangChainInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    sandboxesSandboxAzureMountWorkloadIdentityAuthConfig != null ->
                        visitor.visitSandboxesSandboxAzureMountWorkloadIdentityAuthConfig(
                            sandboxesSandboxAzureMountWorkloadIdentityAuthConfig
                        )
                    sandboxesSandboxAzureMountAccountKeyAuthConfig != null ->
                        visitor.visitSandboxesSandboxAzureMountAccountKeyAuthConfig(
                            sandboxesSandboxAzureMountAccountKeyAuthConfig
                        )
                    sandboxesSandboxAzureMountSasAuthConfig != null ->
                        visitor.visitSandboxesSandboxAzureMountSasAuthConfig(
                            sandboxesSandboxAzureMountSasAuthConfig
                        )
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Azure = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitSandboxesSandboxAzureMountWorkloadIdentityAuthConfig(
                            sandboxesSandboxAzureMountWorkloadIdentityAuthConfig:
                                SandboxesSandboxAzureMountWorkloadIdentityAuthConfig
                        ) {
                            sandboxesSandboxAzureMountWorkloadIdentityAuthConfig.validate()
                        }

                        override fun visitSandboxesSandboxAzureMountAccountKeyAuthConfig(
                            sandboxesSandboxAzureMountAccountKeyAuthConfig:
                                SandboxesSandboxAzureMountAccountKeyAuthConfig
                        ) {
                            sandboxesSandboxAzureMountAccountKeyAuthConfig.validate()
                        }

                        override fun visitSandboxesSandboxAzureMountSasAuthConfig(
                            sandboxesSandboxAzureMountSasAuthConfig:
                                SandboxesSandboxAzureMountSasAuthConfig
                        ) {
                            sandboxesSandboxAzureMountSasAuthConfig.validate()
                        }
                    }
                )
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitSandboxesSandboxAzureMountWorkloadIdentityAuthConfig(
                            sandboxesSandboxAzureMountWorkloadIdentityAuthConfig:
                                SandboxesSandboxAzureMountWorkloadIdentityAuthConfig
                        ) = sandboxesSandboxAzureMountWorkloadIdentityAuthConfig.validity()

                        override fun visitSandboxesSandboxAzureMountAccountKeyAuthConfig(
                            sandboxesSandboxAzureMountAccountKeyAuthConfig:
                                SandboxesSandboxAzureMountAccountKeyAuthConfig
                        ) = sandboxesSandboxAzureMountAccountKeyAuthConfig.validity()

                        override fun visitSandboxesSandboxAzureMountSasAuthConfig(
                            sandboxesSandboxAzureMountSasAuthConfig:
                                SandboxesSandboxAzureMountSasAuthConfig
                        ) = sandboxesSandboxAzureMountSasAuthConfig.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Azure &&
                    sandboxesSandboxAzureMountWorkloadIdentityAuthConfig ==
                        other.sandboxesSandboxAzureMountWorkloadIdentityAuthConfig &&
                    sandboxesSandboxAzureMountAccountKeyAuthConfig ==
                        other.sandboxesSandboxAzureMountAccountKeyAuthConfig &&
                    sandboxesSandboxAzureMountSasAuthConfig ==
                        other.sandboxesSandboxAzureMountSasAuthConfig
            }

            override fun hashCode(): Int =
                Objects.hash(
                    sandboxesSandboxAzureMountWorkloadIdentityAuthConfig,
                    sandboxesSandboxAzureMountAccountKeyAuthConfig,
                    sandboxesSandboxAzureMountSasAuthConfig,
                )

            override fun toString(): String =
                when {
                    sandboxesSandboxAzureMountWorkloadIdentityAuthConfig != null ->
                        "Azure{sandboxesSandboxAzureMountWorkloadIdentityAuthConfig=$sandboxesSandboxAzureMountWorkloadIdentityAuthConfig}"
                    sandboxesSandboxAzureMountAccountKeyAuthConfig != null ->
                        "Azure{sandboxesSandboxAzureMountAccountKeyAuthConfig=$sandboxesSandboxAzureMountAccountKeyAuthConfig}"
                    sandboxesSandboxAzureMountSasAuthConfig != null ->
                        "Azure{sandboxesSandboxAzureMountSasAuthConfig=$sandboxesSandboxAzureMountSasAuthConfig}"
                    _json != null -> "Azure{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Azure")
                }

            companion object {

                @JvmStatic
                fun ofSandboxesSandboxAzureMountWorkloadIdentityAuthConfig(
                    sandboxesSandboxAzureMountWorkloadIdentityAuthConfig:
                        SandboxesSandboxAzureMountWorkloadIdentityAuthConfig
                ) =
                    Azure(
                        sandboxesSandboxAzureMountWorkloadIdentityAuthConfig =
                            sandboxesSandboxAzureMountWorkloadIdentityAuthConfig
                    )

                @JvmStatic
                fun ofSandboxesSandboxAzureMountAccountKeyAuthConfig(
                    sandboxesSandboxAzureMountAccountKeyAuthConfig:
                        SandboxesSandboxAzureMountAccountKeyAuthConfig
                ) =
                    Azure(
                        sandboxesSandboxAzureMountAccountKeyAuthConfig =
                            sandboxesSandboxAzureMountAccountKeyAuthConfig
                    )

                @JvmStatic
                fun ofSandboxesSandboxAzureMountSasAuthConfig(
                    sandboxesSandboxAzureMountSasAuthConfig: SandboxesSandboxAzureMountSasAuthConfig
                ) =
                    Azure(
                        sandboxesSandboxAzureMountSasAuthConfig =
                            sandboxesSandboxAzureMountSasAuthConfig
                    )
            }

            /**
             * An interface that defines how to map each variant of [Azure] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitSandboxesSandboxAzureMountWorkloadIdentityAuthConfig(
                    sandboxesSandboxAzureMountWorkloadIdentityAuthConfig:
                        SandboxesSandboxAzureMountWorkloadIdentityAuthConfig
                ): T

                fun visitSandboxesSandboxAzureMountAccountKeyAuthConfig(
                    sandboxesSandboxAzureMountAccountKeyAuthConfig:
                        SandboxesSandboxAzureMountAccountKeyAuthConfig
                ): T

                fun visitSandboxesSandboxAzureMountSasAuthConfig(
                    sandboxesSandboxAzureMountSasAuthConfig: SandboxesSandboxAzureMountSasAuthConfig
                ): T

                /**
                 * Maps an unknown variant of [Azure] to a value of type [T].
                 *
                 * An instance of [Azure] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LangChainInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LangChainInvalidDataException("Unknown Azure: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Azure>(Azure::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Azure {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<
                                            SandboxesSandboxAzureMountWorkloadIdentityAuthConfig
                                        >(),
                                    )
                                    ?.let {
                                        Azure(
                                            sandboxesSandboxAzureMountWorkloadIdentityAuthConfig =
                                                it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<
                                            SandboxesSandboxAzureMountAccountKeyAuthConfig
                                        >(),
                                    )
                                    ?.let {
                                        Azure(
                                            sandboxesSandboxAzureMountAccountKeyAuthConfig = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<SandboxesSandboxAzureMountSasAuthConfig>(),
                                    )
                                    ?.let {
                                        Azure(
                                            sandboxesSandboxAzureMountSasAuthConfig = it,
                                            _json = json,
                                        )
                                    },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Azure(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Azure>(Azure::class) {

                override fun serialize(
                    value: Azure,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.sandboxesSandboxAzureMountWorkloadIdentityAuthConfig != null ->
                            generator.writeObject(
                                value.sandboxesSandboxAzureMountWorkloadIdentityAuthConfig
                            )
                        value.sandboxesSandboxAzureMountAccountKeyAuthConfig != null ->
                            generator.writeObject(
                                value.sandboxesSandboxAzureMountAccountKeyAuthConfig
                            )
                        value.sandboxesSandboxAzureMountSasAuthConfig != null ->
                            generator.writeObject(value.sandboxesSandboxAzureMountSasAuthConfig)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Azure")
                    }
                }
            }

            class SandboxesSandboxAzureMountWorkloadIdentityAuthConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val clientId: JsonField<String>,
                private val tenantId: JsonField<String>,
                private val subjectScope: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("client_id")
                    @ExcludeMissing
                    clientId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tenant_id")
                    @ExcludeMissing
                    tenantId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("subject_scope")
                    @ExcludeMissing
                    subjectScope: JsonField<String> = JsonMissing.of(),
                ) : this(clientId, tenantId, subjectScope, mutableMapOf())

                /**
                 * ClientID is the application (client) ID, a GUID, of the app registration or
                 * user-assigned managed identity whose federated identity credential trusts
                 * LangSmith's issuer. Required with tenant_id.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun clientId(): String = clientId.getRequired("client_id")

                /**
                 * TenantID is the Entra tenant (directory) ID, a GUID. Setting it selects workload
                 * identity: LangSmith signs an OIDC token for this workspace and exchanges it at
                 * Entra ID for storage access tokens of client_id. Cannot be changed after
                 * creation.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun tenantId(): String = tenantId.getRequired("tenant_id")

                /**
                 * SubjectScope picks the token subject the federated credential trusts: "workspace"
                 * (the default) or "tag:<tag value id>", which must be one of the sandbox's
                 * tag_value_ids. Only valid with tenant_id.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun subjectScope(): Optional<String> = subjectScope.getOptional("subject_scope")

                /**
                 * Returns the raw JSON value of [clientId].
                 *
                 * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("client_id")
                @ExcludeMissing
                fun _clientId(): JsonField<String> = clientId

                /**
                 * Returns the raw JSON value of [tenantId].
                 *
                 * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tenant_id")
                @ExcludeMissing
                fun _tenantId(): JsonField<String> = tenantId

                /**
                 * Returns the raw JSON value of [subjectScope].
                 *
                 * Unlike [subjectScope], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("subject_scope")
                @ExcludeMissing
                fun _subjectScope(): JsonField<String> = subjectScope

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [SandboxesSandboxAzureMountWorkloadIdentityAuthConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .clientId()
                     * .tenantId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesSandboxAzureMountWorkloadIdentityAuthConfig]. */
                class Builder internal constructor() {

                    private var clientId: JsonField<String>? = null
                    private var tenantId: JsonField<String>? = null
                    private var subjectScope: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        sandboxesSandboxAzureMountWorkloadIdentityAuthConfig:
                            SandboxesSandboxAzureMountWorkloadIdentityAuthConfig
                    ) = apply {
                        clientId = sandboxesSandboxAzureMountWorkloadIdentityAuthConfig.clientId
                        tenantId = sandboxesSandboxAzureMountWorkloadIdentityAuthConfig.tenantId
                        subjectScope =
                            sandboxesSandboxAzureMountWorkloadIdentityAuthConfig.subjectScope
                        additionalProperties =
                            sandboxesSandboxAzureMountWorkloadIdentityAuthConfig
                                .additionalProperties
                                .toMutableMap()
                    }

                    /**
                     * ClientID is the application (client) ID, a GUID, of the app registration or
                     * user-assigned managed identity whose federated identity credential trusts
                     * LangSmith's issuer. Required with tenant_id.
                     */
                    fun clientId(clientId: String) = clientId(JsonField.of(clientId))

                    /**
                     * Sets [Builder.clientId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.clientId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

                    /**
                     * TenantID is the Entra tenant (directory) ID, a GUID. Setting it selects
                     * workload identity: LangSmith signs an OIDC token for this workspace and
                     * exchanges it at Entra ID for storage access tokens of client_id. Cannot be
                     * changed after creation.
                     */
                    fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

                    /**
                     * Sets [Builder.tenantId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tenantId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

                    /**
                     * SubjectScope picks the token subject the federated credential trusts:
                     * "workspace" (the default) or "tag:<tag value id>", which must be one of the
                     * sandbox's tag_value_ids. Only valid with tenant_id.
                     */
                    fun subjectScope(subjectScope: String) =
                        subjectScope(JsonField.of(subjectScope))

                    /**
                     * Sets [Builder.subjectScope] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subjectScope] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun subjectScope(subjectScope: JsonField<String>) = apply {
                        this.subjectScope = subjectScope
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of
                     * [SandboxesSandboxAzureMountWorkloadIdentityAuthConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .clientId()
                     * .tenantId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesSandboxAzureMountWorkloadIdentityAuthConfig =
                        SandboxesSandboxAzureMountWorkloadIdentityAuthConfig(
                            checkRequired("clientId", clientId),
                            checkRequired("tenantId", tenantId),
                            subjectScope,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesSandboxAzureMountWorkloadIdentityAuthConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    clientId()
                    tenantId()
                    subjectScope()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (clientId.asKnown().isPresent) 1 else 0) +
                        (if (tenantId.asKnown().isPresent) 1 else 0) +
                        (if (subjectScope.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesSandboxAzureMountWorkloadIdentityAuthConfig &&
                        clientId == other.clientId &&
                        tenantId == other.tenantId &&
                        subjectScope == other.subjectScope &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(clientId, tenantId, subjectScope, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesSandboxAzureMountWorkloadIdentityAuthConfig{clientId=$clientId, tenantId=$tenantId, subjectScope=$subjectScope, additionalProperties=$additionalProperties}"
            }

            class SandboxesSandboxAzureMountAccountKeyAuthConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val accountKey: JsonField<AccountKey>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("account_key")
                    @ExcludeMissing
                    accountKey: JsonField<AccountKey> = JsonMissing.of()
                ) : this(accountKey, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun accountKey(): AccountKey = accountKey.getRequired("account_key")

                /**
                 * Returns the raw JSON value of [accountKey].
                 *
                 * Unlike [accountKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("account_key")
                @ExcludeMissing
                fun _accountKey(): JsonField<AccountKey> = accountKey

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [SandboxesSandboxAzureMountAccountKeyAuthConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .accountKey()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesSandboxAzureMountAccountKeyAuthConfig]. */
                class Builder internal constructor() {

                    private var accountKey: JsonField<AccountKey>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        sandboxesSandboxAzureMountAccountKeyAuthConfig:
                            SandboxesSandboxAzureMountAccountKeyAuthConfig
                    ) = apply {
                        accountKey = sandboxesSandboxAzureMountAccountKeyAuthConfig.accountKey
                        additionalProperties =
                            sandboxesSandboxAzureMountAccountKeyAuthConfig.additionalProperties
                                .toMutableMap()
                    }

                    fun accountKey(accountKey: AccountKey) = accountKey(JsonField.of(accountKey))

                    /**
                     * Sets [Builder.accountKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accountKey] with a well-typed [AccountKey]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accountKey(accountKey: JsonField<AccountKey>) = apply {
                        this.accountKey = accountKey
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of
                     * [SandboxesSandboxAzureMountAccountKeyAuthConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .accountKey()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesSandboxAzureMountAccountKeyAuthConfig =
                        SandboxesSandboxAzureMountAccountKeyAuthConfig(
                            checkRequired("accountKey", accountKey),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesSandboxAzureMountAccountKeyAuthConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    accountKey().validate()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int = (accountKey.asKnown().getOrNull()?.validity() ?: 0)

                class AccountKey
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [AccountKey].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [AccountKey]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(accountKey: AccountKey) = apply {
                            type = accountKey.type
                            isSet = accountKey.isSet
                            value = accountKey.value
                            additionalProperties = accountKey.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [AccountKey].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): AccountKey =
                            AccountKey(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): AccountKey = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LangChainInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AccountKey &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AccountKey{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesSandboxAzureMountAccountKeyAuthConfig &&
                        accountKey == other.accountKey &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(accountKey, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesSandboxAzureMountAccountKeyAuthConfig{accountKey=$accountKey, additionalProperties=$additionalProperties}"
            }

            class SandboxesSandboxAzureMountSasAuthConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val sasToken: JsonField<SasToken>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("sas_token")
                    @ExcludeMissing
                    sasToken: JsonField<SasToken> = JsonMissing.of()
                ) : this(sasToken, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun sasToken(): SasToken = sasToken.getRequired("sas_token")

                /**
                 * Returns the raw JSON value of [sasToken].
                 *
                 * Unlike [sasToken], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("sas_token")
                @ExcludeMissing
                fun _sasToken(): JsonField<SasToken> = sasToken

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [SandboxesSandboxAzureMountSasAuthConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .sasToken()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesSandboxAzureMountSasAuthConfig]. */
                class Builder internal constructor() {

                    private var sasToken: JsonField<SasToken>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        sandboxesSandboxAzureMountSasAuthConfig:
                            SandboxesSandboxAzureMountSasAuthConfig
                    ) = apply {
                        sasToken = sandboxesSandboxAzureMountSasAuthConfig.sasToken
                        additionalProperties =
                            sandboxesSandboxAzureMountSasAuthConfig.additionalProperties
                                .toMutableMap()
                    }

                    fun sasToken(sasToken: SasToken) = sasToken(JsonField.of(sasToken))

                    /**
                     * Sets [Builder.sasToken] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sasToken] with a well-typed [SasToken] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun sasToken(sasToken: JsonField<SasToken>) = apply { this.sasToken = sasToken }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [SandboxesSandboxAzureMountSasAuthConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .sasToken()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesSandboxAzureMountSasAuthConfig =
                        SandboxesSandboxAzureMountSasAuthConfig(
                            checkRequired("sasToken", sasToken),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesSandboxAzureMountSasAuthConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    sasToken().validate()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int = (sasToken.asKnown().getOrNull()?.validity() ?: 0)

                class SasToken
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [SasToken].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SasToken]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(sasToken: SasToken) = apply {
                            type = sasToken.type
                            isSet = sasToken.isSet
                            value = sasToken.value
                            additionalProperties = sasToken.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SasToken].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): SasToken =
                            SasToken(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): SasToken = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LangChainInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SasToken &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SasToken{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesSandboxAzureMountSasAuthConfig &&
                        sasToken == other.sasToken &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(sasToken, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesSandboxAzureMountSasAuthConfig{sasToken=$sasToken, additionalProperties=$additionalProperties}"
            }
        }

        @JsonDeserialize(using = Gcp.Deserializer::class)
        @JsonSerialize(using = Gcp.Serializer::class)
        class Gcp
        private constructor(
            private val sandboxesSandboxGcpMountWorkloadIdentityAuthConfig:
                SandboxesSandboxGcpMountWorkloadIdentityAuthConfig? =
                null,
            private val sandboxesSandboxGcpMountServiceAccountAuthConfig:
                SandboxesSandboxGcpMountServiceAccountAuthConfig? =
                null,
            private val _json: JsonValue? = null,
        ) {

            fun sandboxesSandboxGcpMountWorkloadIdentityAuthConfig():
                Optional<SandboxesSandboxGcpMountWorkloadIdentityAuthConfig> =
                Optional.ofNullable(sandboxesSandboxGcpMountWorkloadIdentityAuthConfig)

            fun sandboxesSandboxGcpMountServiceAccountAuthConfig():
                Optional<SandboxesSandboxGcpMountServiceAccountAuthConfig> =
                Optional.ofNullable(sandboxesSandboxGcpMountServiceAccountAuthConfig)

            fun isSandboxesSandboxGcpMountWorkloadIdentityAuthConfig(): Boolean =
                sandboxesSandboxGcpMountWorkloadIdentityAuthConfig != null

            fun isSandboxesSandboxGcpMountServiceAccountAuthConfig(): Boolean =
                sandboxesSandboxGcpMountServiceAccountAuthConfig != null

            fun asSandboxesSandboxGcpMountWorkloadIdentityAuthConfig():
                SandboxesSandboxGcpMountWorkloadIdentityAuthConfig =
                sandboxesSandboxGcpMountWorkloadIdentityAuthConfig.getOrThrow(
                    "sandboxesSandboxGcpMountWorkloadIdentityAuthConfig"
                )

            fun asSandboxesSandboxGcpMountServiceAccountAuthConfig():
                SandboxesSandboxGcpMountServiceAccountAuthConfig =
                sandboxesSandboxGcpMountServiceAccountAuthConfig.getOrThrow(
                    "sandboxesSandboxGcpMountServiceAccountAuthConfig"
                )

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.langchain.smith.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = gcp.accept(new Gcp.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitSandboxesSandboxGcpMountWorkloadIdentityAuthConfig(SandboxesSandboxGcpMountWorkloadIdentityAuthConfig sandboxesSandboxGcpMountWorkloadIdentityAuthConfig) {
             *         return Optional.of(sandboxesSandboxGcpMountWorkloadIdentityAuthConfig.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws LangChainInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    sandboxesSandboxGcpMountWorkloadIdentityAuthConfig != null ->
                        visitor.visitSandboxesSandboxGcpMountWorkloadIdentityAuthConfig(
                            sandboxesSandboxGcpMountWorkloadIdentityAuthConfig
                        )
                    sandboxesSandboxGcpMountServiceAccountAuthConfig != null ->
                        visitor.visitSandboxesSandboxGcpMountServiceAccountAuthConfig(
                            sandboxesSandboxGcpMountServiceAccountAuthConfig
                        )
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Gcp = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitSandboxesSandboxGcpMountWorkloadIdentityAuthConfig(
                            sandboxesSandboxGcpMountWorkloadIdentityAuthConfig:
                                SandboxesSandboxGcpMountWorkloadIdentityAuthConfig
                        ) {
                            sandboxesSandboxGcpMountWorkloadIdentityAuthConfig.validate()
                        }

                        override fun visitSandboxesSandboxGcpMountServiceAccountAuthConfig(
                            sandboxesSandboxGcpMountServiceAccountAuthConfig:
                                SandboxesSandboxGcpMountServiceAccountAuthConfig
                        ) {
                            sandboxesSandboxGcpMountServiceAccountAuthConfig.validate()
                        }
                    }
                )
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitSandboxesSandboxGcpMountWorkloadIdentityAuthConfig(
                            sandboxesSandboxGcpMountWorkloadIdentityAuthConfig:
                                SandboxesSandboxGcpMountWorkloadIdentityAuthConfig
                        ) = sandboxesSandboxGcpMountWorkloadIdentityAuthConfig.validity()

                        override fun visitSandboxesSandboxGcpMountServiceAccountAuthConfig(
                            sandboxesSandboxGcpMountServiceAccountAuthConfig:
                                SandboxesSandboxGcpMountServiceAccountAuthConfig
                        ) = sandboxesSandboxGcpMountServiceAccountAuthConfig.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Gcp &&
                    sandboxesSandboxGcpMountWorkloadIdentityAuthConfig ==
                        other.sandboxesSandboxGcpMountWorkloadIdentityAuthConfig &&
                    sandboxesSandboxGcpMountServiceAccountAuthConfig ==
                        other.sandboxesSandboxGcpMountServiceAccountAuthConfig
            }

            override fun hashCode(): Int =
                Objects.hash(
                    sandboxesSandboxGcpMountWorkloadIdentityAuthConfig,
                    sandboxesSandboxGcpMountServiceAccountAuthConfig,
                )

            override fun toString(): String =
                when {
                    sandboxesSandboxGcpMountWorkloadIdentityAuthConfig != null ->
                        "Gcp{sandboxesSandboxGcpMountWorkloadIdentityAuthConfig=$sandboxesSandboxGcpMountWorkloadIdentityAuthConfig}"
                    sandboxesSandboxGcpMountServiceAccountAuthConfig != null ->
                        "Gcp{sandboxesSandboxGcpMountServiceAccountAuthConfig=$sandboxesSandboxGcpMountServiceAccountAuthConfig}"
                    _json != null -> "Gcp{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Gcp")
                }

            companion object {

                @JvmStatic
                fun ofSandboxesSandboxGcpMountWorkloadIdentityAuthConfig(
                    sandboxesSandboxGcpMountWorkloadIdentityAuthConfig:
                        SandboxesSandboxGcpMountWorkloadIdentityAuthConfig
                ) =
                    Gcp(
                        sandboxesSandboxGcpMountWorkloadIdentityAuthConfig =
                            sandboxesSandboxGcpMountWorkloadIdentityAuthConfig
                    )

                @JvmStatic
                fun ofSandboxesSandboxGcpMountServiceAccountAuthConfig(
                    sandboxesSandboxGcpMountServiceAccountAuthConfig:
                        SandboxesSandboxGcpMountServiceAccountAuthConfig
                ) =
                    Gcp(
                        sandboxesSandboxGcpMountServiceAccountAuthConfig =
                            sandboxesSandboxGcpMountServiceAccountAuthConfig
                    )
            }

            /**
             * An interface that defines how to map each variant of [Gcp] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitSandboxesSandboxGcpMountWorkloadIdentityAuthConfig(
                    sandboxesSandboxGcpMountWorkloadIdentityAuthConfig:
                        SandboxesSandboxGcpMountWorkloadIdentityAuthConfig
                ): T

                fun visitSandboxesSandboxGcpMountServiceAccountAuthConfig(
                    sandboxesSandboxGcpMountServiceAccountAuthConfig:
                        SandboxesSandboxGcpMountServiceAccountAuthConfig
                ): T

                /**
                 * Maps an unknown variant of [Gcp] to a value of type [T].
                 *
                 * An instance of [Gcp] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LangChainInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LangChainInvalidDataException("Unknown Gcp: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Gcp>(Gcp::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Gcp {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<
                                            SandboxesSandboxGcpMountWorkloadIdentityAuthConfig
                                        >(),
                                    )
                                    ?.let {
                                        Gcp(
                                            sandboxesSandboxGcpMountWorkloadIdentityAuthConfig = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<
                                            SandboxesSandboxGcpMountServiceAccountAuthConfig
                                        >(),
                                    )
                                    ?.let {
                                        Gcp(
                                            sandboxesSandboxGcpMountServiceAccountAuthConfig = it,
                                            _json = json,
                                        )
                                    },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Gcp(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Gcp>(Gcp::class) {

                override fun serialize(
                    value: Gcp,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.sandboxesSandboxGcpMountWorkloadIdentityAuthConfig != null ->
                            generator.writeObject(
                                value.sandboxesSandboxGcpMountWorkloadIdentityAuthConfig
                            )
                        value.sandboxesSandboxGcpMountServiceAccountAuthConfig != null ->
                            generator.writeObject(
                                value.sandboxesSandboxGcpMountServiceAccountAuthConfig
                            )
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Gcp")
                    }
                }
            }

            class SandboxesSandboxGcpMountWorkloadIdentityAuthConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val workloadIdentityProvider: JsonField<String>,
                private val serviceAccountEmail: JsonField<String>,
                private val subjectScope: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("workload_identity_provider")
                    @ExcludeMissing
                    workloadIdentityProvider: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("service_account_email")
                    @ExcludeMissing
                    serviceAccountEmail: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("subject_scope")
                    @ExcludeMissing
                    subjectScope: JsonField<String> = JsonMissing.of(),
                ) : this(
                    workloadIdentityProvider,
                    serviceAccountEmail,
                    subjectScope,
                    mutableMapOf(),
                )

                /**
                 * WorkloadIdentityProvider federates an OIDC token LangSmith signs for this
                 * workspace through Workload Identity Federation instead of a service account key:
                 * //iam.googleapis.com/projects/<number>/locations/global/workloadIdentityPools/<pool>/providers/<provider>.
                 * Mutually exclusive with service_account_json. Cannot be changed after creation.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun workloadIdentityProvider(): String =
                    workloadIdentityProvider.getRequired("workload_identity_provider")

                /**
                 * ServiceAccountEmail is the service account to impersonate with the federated
                 * token. Omit it to use the federated principal directly. Only valid with
                 * workload_identity_provider.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun serviceAccountEmail(): Optional<String> =
                    serviceAccountEmail.getOptional("service_account_email")

                /**
                 * SubjectScope picks the token subject the provider trusts: "workspace" (the
                 * default) or "tag:<tag value id>", which must be one of the sandbox's
                 * tag_value_ids. Only valid with workload_identity_provider.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun subjectScope(): Optional<String> = subjectScope.getOptional("subject_scope")

                /**
                 * Returns the raw JSON value of [workloadIdentityProvider].
                 *
                 * Unlike [workloadIdentityProvider], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("workload_identity_provider")
                @ExcludeMissing
                fun _workloadIdentityProvider(): JsonField<String> = workloadIdentityProvider

                /**
                 * Returns the raw JSON value of [serviceAccountEmail].
                 *
                 * Unlike [serviceAccountEmail], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("service_account_email")
                @ExcludeMissing
                fun _serviceAccountEmail(): JsonField<String> = serviceAccountEmail

                /**
                 * Returns the raw JSON value of [subjectScope].
                 *
                 * Unlike [subjectScope], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("subject_scope")
                @ExcludeMissing
                fun _subjectScope(): JsonField<String> = subjectScope

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [SandboxesSandboxGcpMountWorkloadIdentityAuthConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .workloadIdentityProvider()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesSandboxGcpMountWorkloadIdentityAuthConfig]. */
                class Builder internal constructor() {

                    private var workloadIdentityProvider: JsonField<String>? = null
                    private var serviceAccountEmail: JsonField<String> = JsonMissing.of()
                    private var subjectScope: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        sandboxesSandboxGcpMountWorkloadIdentityAuthConfig:
                            SandboxesSandboxGcpMountWorkloadIdentityAuthConfig
                    ) = apply {
                        workloadIdentityProvider =
                            sandboxesSandboxGcpMountWorkloadIdentityAuthConfig
                                .workloadIdentityProvider
                        serviceAccountEmail =
                            sandboxesSandboxGcpMountWorkloadIdentityAuthConfig.serviceAccountEmail
                        subjectScope =
                            sandboxesSandboxGcpMountWorkloadIdentityAuthConfig.subjectScope
                        additionalProperties =
                            sandboxesSandboxGcpMountWorkloadIdentityAuthConfig.additionalProperties
                                .toMutableMap()
                    }

                    /**
                     * WorkloadIdentityProvider federates an OIDC token LangSmith signs for this
                     * workspace through Workload Identity Federation instead of a service account
                     * key:
                     * //iam.googleapis.com/projects/<number>/locations/global/workloadIdentityPools/<pool>/providers/<provider>.
                     * Mutually exclusive with service_account_json. Cannot be changed after
                     * creation.
                     */
                    fun workloadIdentityProvider(workloadIdentityProvider: String) =
                        workloadIdentityProvider(JsonField.of(workloadIdentityProvider))

                    /**
                     * Sets [Builder.workloadIdentityProvider] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.workloadIdentityProvider] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun workloadIdentityProvider(workloadIdentityProvider: JsonField<String>) =
                        apply {
                            this.workloadIdentityProvider = workloadIdentityProvider
                        }

                    /**
                     * ServiceAccountEmail is the service account to impersonate with the federated
                     * token. Omit it to use the federated principal directly. Only valid with
                     * workload_identity_provider.
                     */
                    fun serviceAccountEmail(serviceAccountEmail: String) =
                        serviceAccountEmail(JsonField.of(serviceAccountEmail))

                    /**
                     * Sets [Builder.serviceAccountEmail] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serviceAccountEmail] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun serviceAccountEmail(serviceAccountEmail: JsonField<String>) = apply {
                        this.serviceAccountEmail = serviceAccountEmail
                    }

                    /**
                     * SubjectScope picks the token subject the provider trusts: "workspace" (the
                     * default) or "tag:<tag value id>", which must be one of the sandbox's
                     * tag_value_ids. Only valid with workload_identity_provider.
                     */
                    fun subjectScope(subjectScope: String) =
                        subjectScope(JsonField.of(subjectScope))

                    /**
                     * Sets [Builder.subjectScope] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subjectScope] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun subjectScope(subjectScope: JsonField<String>) = apply {
                        this.subjectScope = subjectScope
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of
                     * [SandboxesSandboxGcpMountWorkloadIdentityAuthConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .workloadIdentityProvider()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesSandboxGcpMountWorkloadIdentityAuthConfig =
                        SandboxesSandboxGcpMountWorkloadIdentityAuthConfig(
                            checkRequired("workloadIdentityProvider", workloadIdentityProvider),
                            serviceAccountEmail,
                            subjectScope,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesSandboxGcpMountWorkloadIdentityAuthConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    workloadIdentityProvider()
                    serviceAccountEmail()
                    subjectScope()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (workloadIdentityProvider.asKnown().isPresent) 1 else 0) +
                        (if (serviceAccountEmail.asKnown().isPresent) 1 else 0) +
                        (if (subjectScope.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesSandboxGcpMountWorkloadIdentityAuthConfig &&
                        workloadIdentityProvider == other.workloadIdentityProvider &&
                        serviceAccountEmail == other.serviceAccountEmail &&
                        subjectScope == other.subjectScope &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        workloadIdentityProvider,
                        serviceAccountEmail,
                        subjectScope,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesSandboxGcpMountWorkloadIdentityAuthConfig{workloadIdentityProvider=$workloadIdentityProvider, serviceAccountEmail=$serviceAccountEmail, subjectScope=$subjectScope, additionalProperties=$additionalProperties}"
            }

            class SandboxesSandboxGcpMountServiceAccountAuthConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val serviceAccountJson: JsonField<ServiceAccountJson>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("service_account_json")
                    @ExcludeMissing
                    serviceAccountJson: JsonField<ServiceAccountJson> = JsonMissing.of()
                ) : this(serviceAccountJson, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serviceAccountJson(): ServiceAccountJson =
                    serviceAccountJson.getRequired("service_account_json")

                /**
                 * Returns the raw JSON value of [serviceAccountJson].
                 *
                 * Unlike [serviceAccountJson], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("service_account_json")
                @ExcludeMissing
                fun _serviceAccountJson(): JsonField<ServiceAccountJson> = serviceAccountJson

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [SandboxesSandboxGcpMountServiceAccountAuthConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceAccountJson()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesSandboxGcpMountServiceAccountAuthConfig]. */
                class Builder internal constructor() {

                    private var serviceAccountJson: JsonField<ServiceAccountJson>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        sandboxesSandboxGcpMountServiceAccountAuthConfig:
                            SandboxesSandboxGcpMountServiceAccountAuthConfig
                    ) = apply {
                        serviceAccountJson =
                            sandboxesSandboxGcpMountServiceAccountAuthConfig.serviceAccountJson
                        additionalProperties =
                            sandboxesSandboxGcpMountServiceAccountAuthConfig.additionalProperties
                                .toMutableMap()
                    }

                    fun serviceAccountJson(serviceAccountJson: ServiceAccountJson) =
                        serviceAccountJson(JsonField.of(serviceAccountJson))

                    /**
                     * Sets [Builder.serviceAccountJson] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serviceAccountJson] with a well-typed
                     * [ServiceAccountJson] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun serviceAccountJson(serviceAccountJson: JsonField<ServiceAccountJson>) =
                        apply {
                            this.serviceAccountJson = serviceAccountJson
                        }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of
                     * [SandboxesSandboxGcpMountServiceAccountAuthConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceAccountJson()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesSandboxGcpMountServiceAccountAuthConfig =
                        SandboxesSandboxGcpMountServiceAccountAuthConfig(
                            checkRequired("serviceAccountJson", serviceAccountJson),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesSandboxGcpMountServiceAccountAuthConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    serviceAccountJson().validate()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (serviceAccountJson.asKnown().getOrNull()?.validity() ?: 0)

                class ServiceAccountJson
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [ServiceAccountJson].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ServiceAccountJson]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(serviceAccountJson: ServiceAccountJson) = apply {
                            type = serviceAccountJson.type
                            isSet = serviceAccountJson.isSet
                            value = serviceAccountJson.value
                            additionalProperties =
                                serviceAccountJson.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ServiceAccountJson].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): ServiceAccountJson =
                            ServiceAccountJson(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): ServiceAccountJson = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LangChainInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ServiceAccountJson &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ServiceAccountJson{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesSandboxGcpMountServiceAccountAuthConfig &&
                        serviceAccountJson == other.serviceAccountJson &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(serviceAccountJson, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesSandboxGcpMountServiceAccountAuthConfig{serviceAccountJson=$serviceAccountJson, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Auth &&
                aws == other.aws &&
                azure == other.azure &&
                gcp == other.gcp &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(aws, azure, gcp, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Auth{aws=$aws, azure=$azure, gcp=$gcp, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Mount.Deserializer::class)
    @JsonSerialize(using = Mount.Serializer::class)
    class Mount
    private constructor(
        private val sandboxapiS3BucketMountSpec: SandboxapiS3BucketMountSpec? = null,
        private val sandboxapiGcsBucketMountSpec: SandboxapiGcsBucketMountSpec? = null,
        private val sandboxapiGitRepoMountSpec: SandboxapiGitRepoMountSpec? = null,
        private val sandboxapiContextHubRepoMountSpec: SandboxapiContextHubRepoMountSpec? = null,
        private val sandboxapiAzureBlobContainerMountSpec: SandboxapiAzureBlobContainerMountSpec? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun sandboxapiS3BucketMountSpec(): Optional<SandboxapiS3BucketMountSpec> =
            Optional.ofNullable(sandboxapiS3BucketMountSpec)

        fun sandboxapiGcsBucketMountSpec(): Optional<SandboxapiGcsBucketMountSpec> =
            Optional.ofNullable(sandboxapiGcsBucketMountSpec)

        fun sandboxapiGitRepoMountSpec(): Optional<SandboxapiGitRepoMountSpec> =
            Optional.ofNullable(sandboxapiGitRepoMountSpec)

        fun sandboxapiContextHubRepoMountSpec(): Optional<SandboxapiContextHubRepoMountSpec> =
            Optional.ofNullable(sandboxapiContextHubRepoMountSpec)

        fun sandboxapiAzureBlobContainerMountSpec():
            Optional<SandboxapiAzureBlobContainerMountSpec> =
            Optional.ofNullable(sandboxapiAzureBlobContainerMountSpec)

        fun isSandboxapiS3BucketMountSpec(): Boolean = sandboxapiS3BucketMountSpec != null

        fun isSandboxapiGcsBucketMountSpec(): Boolean = sandboxapiGcsBucketMountSpec != null

        fun isSandboxapiGitRepoMountSpec(): Boolean = sandboxapiGitRepoMountSpec != null

        fun isSandboxapiContextHubRepoMountSpec(): Boolean =
            sandboxapiContextHubRepoMountSpec != null

        fun isSandboxapiAzureBlobContainerMountSpec(): Boolean =
            sandboxapiAzureBlobContainerMountSpec != null

        fun asSandboxapiS3BucketMountSpec(): SandboxapiS3BucketMountSpec =
            sandboxapiS3BucketMountSpec.getOrThrow("sandboxapiS3BucketMountSpec")

        fun asSandboxapiGcsBucketMountSpec(): SandboxapiGcsBucketMountSpec =
            sandboxapiGcsBucketMountSpec.getOrThrow("sandboxapiGcsBucketMountSpec")

        fun asSandboxapiGitRepoMountSpec(): SandboxapiGitRepoMountSpec =
            sandboxapiGitRepoMountSpec.getOrThrow("sandboxapiGitRepoMountSpec")

        fun asSandboxapiContextHubRepoMountSpec(): SandboxapiContextHubRepoMountSpec =
            sandboxapiContextHubRepoMountSpec.getOrThrow("sandboxapiContextHubRepoMountSpec")

        fun asSandboxapiAzureBlobContainerMountSpec(): SandboxapiAzureBlobContainerMountSpec =
            sandboxapiAzureBlobContainerMountSpec.getOrThrow(
                "sandboxapiAzureBlobContainerMountSpec"
            )

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.langchain.smith.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = mount.accept(new Mount.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitSandboxapiS3BucketMountSpec(SandboxapiS3BucketMountSpec sandboxapiS3BucketMountSpec) {
         *         return Optional.of(sandboxapiS3BucketMountSpec.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws LangChainInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                sandboxapiS3BucketMountSpec != null ->
                    visitor.visitSandboxapiS3BucketMountSpec(sandboxapiS3BucketMountSpec)
                sandboxapiGcsBucketMountSpec != null ->
                    visitor.visitSandboxapiGcsBucketMountSpec(sandboxapiGcsBucketMountSpec)
                sandboxapiGitRepoMountSpec != null ->
                    visitor.visitSandboxapiGitRepoMountSpec(sandboxapiGitRepoMountSpec)
                sandboxapiContextHubRepoMountSpec != null ->
                    visitor.visitSandboxapiContextHubRepoMountSpec(
                        sandboxapiContextHubRepoMountSpec
                    )
                sandboxapiAzureBlobContainerMountSpec != null ->
                    visitor.visitSandboxapiAzureBlobContainerMountSpec(
                        sandboxapiAzureBlobContainerMountSpec
                    )
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Mount = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitSandboxapiS3BucketMountSpec(
                        sandboxapiS3BucketMountSpec: SandboxapiS3BucketMountSpec
                    ) {
                        sandboxapiS3BucketMountSpec.validate()
                    }

                    override fun visitSandboxapiGcsBucketMountSpec(
                        sandboxapiGcsBucketMountSpec: SandboxapiGcsBucketMountSpec
                    ) {
                        sandboxapiGcsBucketMountSpec.validate()
                    }

                    override fun visitSandboxapiGitRepoMountSpec(
                        sandboxapiGitRepoMountSpec: SandboxapiGitRepoMountSpec
                    ) {
                        sandboxapiGitRepoMountSpec.validate()
                    }

                    override fun visitSandboxapiContextHubRepoMountSpec(
                        sandboxapiContextHubRepoMountSpec: SandboxapiContextHubRepoMountSpec
                    ) {
                        sandboxapiContextHubRepoMountSpec.validate()
                    }

                    override fun visitSandboxapiAzureBlobContainerMountSpec(
                        sandboxapiAzureBlobContainerMountSpec: SandboxapiAzureBlobContainerMountSpec
                    ) {
                        sandboxapiAzureBlobContainerMountSpec.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitSandboxapiS3BucketMountSpec(
                        sandboxapiS3BucketMountSpec: SandboxapiS3BucketMountSpec
                    ) = sandboxapiS3BucketMountSpec.validity()

                    override fun visitSandboxapiGcsBucketMountSpec(
                        sandboxapiGcsBucketMountSpec: SandboxapiGcsBucketMountSpec
                    ) = sandboxapiGcsBucketMountSpec.validity()

                    override fun visitSandboxapiGitRepoMountSpec(
                        sandboxapiGitRepoMountSpec: SandboxapiGitRepoMountSpec
                    ) = sandboxapiGitRepoMountSpec.validity()

                    override fun visitSandboxapiContextHubRepoMountSpec(
                        sandboxapiContextHubRepoMountSpec: SandboxapiContextHubRepoMountSpec
                    ) = sandboxapiContextHubRepoMountSpec.validity()

                    override fun visitSandboxapiAzureBlobContainerMountSpec(
                        sandboxapiAzureBlobContainerMountSpec: SandboxapiAzureBlobContainerMountSpec
                    ) = sandboxapiAzureBlobContainerMountSpec.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Mount &&
                sandboxapiS3BucketMountSpec == other.sandboxapiS3BucketMountSpec &&
                sandboxapiGcsBucketMountSpec == other.sandboxapiGcsBucketMountSpec &&
                sandboxapiGitRepoMountSpec == other.sandboxapiGitRepoMountSpec &&
                sandboxapiContextHubRepoMountSpec == other.sandboxapiContextHubRepoMountSpec &&
                sandboxapiAzureBlobContainerMountSpec == other.sandboxapiAzureBlobContainerMountSpec
        }

        override fun hashCode(): Int =
            Objects.hash(
                sandboxapiS3BucketMountSpec,
                sandboxapiGcsBucketMountSpec,
                sandboxapiGitRepoMountSpec,
                sandboxapiContextHubRepoMountSpec,
                sandboxapiAzureBlobContainerMountSpec,
            )

        override fun toString(): String =
            when {
                sandboxapiS3BucketMountSpec != null ->
                    "Mount{sandboxapiS3BucketMountSpec=$sandboxapiS3BucketMountSpec}"
                sandboxapiGcsBucketMountSpec != null ->
                    "Mount{sandboxapiGcsBucketMountSpec=$sandboxapiGcsBucketMountSpec}"
                sandboxapiGitRepoMountSpec != null ->
                    "Mount{sandboxapiGitRepoMountSpec=$sandboxapiGitRepoMountSpec}"
                sandboxapiContextHubRepoMountSpec != null ->
                    "Mount{sandboxapiContextHubRepoMountSpec=$sandboxapiContextHubRepoMountSpec}"
                sandboxapiAzureBlobContainerMountSpec != null ->
                    "Mount{sandboxapiAzureBlobContainerMountSpec=$sandboxapiAzureBlobContainerMountSpec}"
                _json != null -> "Mount{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Mount")
            }

        companion object {

            @JvmStatic
            fun ofSandboxapiS3BucketMountSpec(
                sandboxapiS3BucketMountSpec: SandboxapiS3BucketMountSpec
            ) = Mount(sandboxapiS3BucketMountSpec = sandboxapiS3BucketMountSpec)

            @JvmStatic
            fun ofSandboxapiGcsBucketMountSpec(
                sandboxapiGcsBucketMountSpec: SandboxapiGcsBucketMountSpec
            ) = Mount(sandboxapiGcsBucketMountSpec = sandboxapiGcsBucketMountSpec)

            @JvmStatic
            fun ofSandboxapiGitRepoMountSpec(
                sandboxapiGitRepoMountSpec: SandboxapiGitRepoMountSpec
            ) = Mount(sandboxapiGitRepoMountSpec = sandboxapiGitRepoMountSpec)

            @JvmStatic
            fun ofSandboxapiContextHubRepoMountSpec(
                sandboxapiContextHubRepoMountSpec: SandboxapiContextHubRepoMountSpec
            ) = Mount(sandboxapiContextHubRepoMountSpec = sandboxapiContextHubRepoMountSpec)

            @JvmStatic
            fun ofSandboxapiAzureBlobContainerMountSpec(
                sandboxapiAzureBlobContainerMountSpec: SandboxapiAzureBlobContainerMountSpec
            ) = Mount(sandboxapiAzureBlobContainerMountSpec = sandboxapiAzureBlobContainerMountSpec)
        }

        /** An interface that defines how to map each variant of [Mount] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitSandboxapiS3BucketMountSpec(
                sandboxapiS3BucketMountSpec: SandboxapiS3BucketMountSpec
            ): T

            fun visitSandboxapiGcsBucketMountSpec(
                sandboxapiGcsBucketMountSpec: SandboxapiGcsBucketMountSpec
            ): T

            fun visitSandboxapiGitRepoMountSpec(
                sandboxapiGitRepoMountSpec: SandboxapiGitRepoMountSpec
            ): T

            fun visitSandboxapiContextHubRepoMountSpec(
                sandboxapiContextHubRepoMountSpec: SandboxapiContextHubRepoMountSpec
            ): T

            fun visitSandboxapiAzureBlobContainerMountSpec(
                sandboxapiAzureBlobContainerMountSpec: SandboxapiAzureBlobContainerMountSpec
            ): T

            /**
             * Maps an unknown variant of [Mount] to a value of type [T].
             *
             * An instance of [Mount] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Mount: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Mount>(Mount::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Mount {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {}

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<SandboxapiS3BucketMountSpec>())
                                ?.let { Mount(sandboxapiS3BucketMountSpec = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<SandboxapiGcsBucketMountSpec>())
                                ?.let { Mount(sandboxapiGcsBucketMountSpec = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<SandboxapiGitRepoMountSpec>())
                                ?.let { Mount(sandboxapiGitRepoMountSpec = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<SandboxapiContextHubRepoMountSpec>(),
                                )
                                ?.let {
                                    Mount(sandboxapiContextHubRepoMountSpec = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<SandboxapiAzureBlobContainerMountSpec>(),
                                )
                                ?.let {
                                    Mount(sandboxapiAzureBlobContainerMountSpec = it, _json = json)
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Mount(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Mount>(Mount::class) {

            override fun serialize(
                value: Mount,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.sandboxapiS3BucketMountSpec != null ->
                        generator.writeObject(value.sandboxapiS3BucketMountSpec)
                    value.sandboxapiGcsBucketMountSpec != null ->
                        generator.writeObject(value.sandboxapiGcsBucketMountSpec)
                    value.sandboxapiGitRepoMountSpec != null ->
                        generator.writeObject(value.sandboxapiGitRepoMountSpec)
                    value.sandboxapiContextHubRepoMountSpec != null ->
                        generator.writeObject(value.sandboxapiContextHubRepoMountSpec)
                    value.sandboxapiAzureBlobContainerMountSpec != null ->
                        generator.writeObject(value.sandboxapiAzureBlobContainerMountSpec)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Mount")
                }
            }
        }

        class SandboxapiS3BucketMountSpec
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val mountPath: JsonField<String>,
            private val s3: JsonField<S3>,
            private val type: JsonField<Type>,
            private val azureBlob: JsonField<AzureBlob>,
            private val cache: JsonField<Cache>,
            private val contexthub: JsonField<Contexthub>,
            private val encryption: JsonField<Encryption>,
            private val gcs: JsonField<Gcs>,
            private val git: JsonField<Git>,
            private val readOnly: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("mount_path")
                @ExcludeMissing
                mountPath: JsonField<String> = JsonMissing.of(),
                @JsonProperty("s3") @ExcludeMissing s3: JsonField<S3> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("azure_blob")
                @ExcludeMissing
                azureBlob: JsonField<AzureBlob> = JsonMissing.of(),
                @JsonProperty("cache") @ExcludeMissing cache: JsonField<Cache> = JsonMissing.of(),
                @JsonProperty("contexthub")
                @ExcludeMissing
                contexthub: JsonField<Contexthub> = JsonMissing.of(),
                @JsonProperty("encryption")
                @ExcludeMissing
                encryption: JsonField<Encryption> = JsonMissing.of(),
                @JsonProperty("gcs") @ExcludeMissing gcs: JsonField<Gcs> = JsonMissing.of(),
                @JsonProperty("git") @ExcludeMissing git: JsonField<Git> = JsonMissing.of(),
                @JsonProperty("read_only")
                @ExcludeMissing
                readOnly: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                id,
                mountPath,
                s3,
                type,
                azureBlob,
                cache,
                contexthub,
                encryption,
                gcs,
                git,
                readOnly,
                mutableMapOf(),
            )

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mountPath(): String = mountPath.getRequired("mount_path")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun s3(): S3 = s3.getRequired("s3")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun azureBlob(): Optional<AzureBlob> = azureBlob.getOptional("azure_blob")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun cache(): Optional<Cache> = cache.getOptional("cache")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun contexthub(): Optional<Contexthub> = contexthub.getOptional("contexthub")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun encryption(): Optional<Encryption> = encryption.getOptional("encryption")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun gcs(): Optional<Gcs> = gcs.getOptional("gcs")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun git(): Optional<Git> = git.getOptional("git")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [mountPath].
             *
             * Unlike [mountPath], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("mount_path")
            @ExcludeMissing
            fun _mountPath(): JsonField<String> = mountPath

            /**
             * Returns the raw JSON value of [s3].
             *
             * Unlike [s3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("s3") @ExcludeMissing fun _s3(): JsonField<S3> = s3

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [azureBlob].
             *
             * Unlike [azureBlob], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("azure_blob")
            @ExcludeMissing
            fun _azureBlob(): JsonField<AzureBlob> = azureBlob

            /**
             * Returns the raw JSON value of [cache].
             *
             * Unlike [cache], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cache") @ExcludeMissing fun _cache(): JsonField<Cache> = cache

            /**
             * Returns the raw JSON value of [contexthub].
             *
             * Unlike [contexthub], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contexthub")
            @ExcludeMissing
            fun _contexthub(): JsonField<Contexthub> = contexthub

            /**
             * Returns the raw JSON value of [encryption].
             *
             * Unlike [encryption], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("encryption")
            @ExcludeMissing
            fun _encryption(): JsonField<Encryption> = encryption

            /**
             * Returns the raw JSON value of [gcs].
             *
             * Unlike [gcs], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gcs") @ExcludeMissing fun _gcs(): JsonField<Gcs> = gcs

            /**
             * Returns the raw JSON value of [git].
             *
             * Unlike [git], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("git") @ExcludeMissing fun _git(): JsonField<Git> = git

            /**
             * Returns the raw JSON value of [readOnly].
             *
             * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("read_only")
            @ExcludeMissing
            fun _readOnly(): JsonField<Boolean> = readOnly

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [SandboxapiS3BucketMountSpec].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .mountPath()
                 * .s3()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SandboxapiS3BucketMountSpec]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var mountPath: JsonField<String>? = null
                private var s3: JsonField<S3>? = null
                private var type: JsonField<Type>? = null
                private var azureBlob: JsonField<AzureBlob> = JsonMissing.of()
                private var cache: JsonField<Cache> = JsonMissing.of()
                private var contexthub: JsonField<Contexthub> = JsonMissing.of()
                private var encryption: JsonField<Encryption> = JsonMissing.of()
                private var gcs: JsonField<Gcs> = JsonMissing.of()
                private var git: JsonField<Git> = JsonMissing.of()
                private var readOnly: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(sandboxapiS3BucketMountSpec: SandboxapiS3BucketMountSpec) =
                    apply {
                        id = sandboxapiS3BucketMountSpec.id
                        mountPath = sandboxapiS3BucketMountSpec.mountPath
                        s3 = sandboxapiS3BucketMountSpec.s3
                        type = sandboxapiS3BucketMountSpec.type
                        azureBlob = sandboxapiS3BucketMountSpec.azureBlob
                        cache = sandboxapiS3BucketMountSpec.cache
                        contexthub = sandboxapiS3BucketMountSpec.contexthub
                        encryption = sandboxapiS3BucketMountSpec.encryption
                        gcs = sandboxapiS3BucketMountSpec.gcs
                        git = sandboxapiS3BucketMountSpec.git
                        readOnly = sandboxapiS3BucketMountSpec.readOnly
                        additionalProperties =
                            sandboxapiS3BucketMountSpec.additionalProperties.toMutableMap()
                    }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun mountPath(mountPath: String) = mountPath(JsonField.of(mountPath))

                /**
                 * Sets [Builder.mountPath] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mountPath] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun mountPath(mountPath: JsonField<String>) = apply { this.mountPath = mountPath }

                fun s3(s3: S3) = s3(JsonField.of(s3))

                /**
                 * Sets [Builder.s3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.s3] with a well-typed [S3] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun s3(s3: JsonField<S3>) = apply { this.s3 = s3 }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun azureBlob(azureBlob: AzureBlob) = azureBlob(JsonField.of(azureBlob))

                /**
                 * Sets [Builder.azureBlob] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.azureBlob] with a well-typed [AzureBlob] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun azureBlob(azureBlob: JsonField<AzureBlob>) = apply {
                    this.azureBlob = azureBlob
                }

                fun cache(cache: Cache) = cache(JsonField.of(cache))

                /**
                 * Sets [Builder.cache] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cache] with a well-typed [Cache] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cache(cache: JsonField<Cache>) = apply { this.cache = cache }

                fun contexthub(contexthub: Contexthub) = contexthub(JsonField.of(contexthub))

                /**
                 * Sets [Builder.contexthub] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contexthub] with a well-typed [Contexthub] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contexthub(contexthub: JsonField<Contexthub>) = apply {
                    this.contexthub = contexthub
                }

                fun encryption(encryption: Encryption) = encryption(JsonField.of(encryption))

                /**
                 * Sets [Builder.encryption] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.encryption] with a well-typed [Encryption] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun encryption(encryption: JsonField<Encryption>) = apply {
                    this.encryption = encryption
                }

                fun gcs(gcs: Gcs) = gcs(JsonField.of(gcs))

                /**
                 * Sets [Builder.gcs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gcs] with a well-typed [Gcs] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun gcs(gcs: JsonField<Gcs>) = apply { this.gcs = gcs }

                fun git(git: Git) = git(JsonField.of(git))

                /**
                 * Sets [Builder.git] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.git] with a well-typed [Git] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun git(git: JsonField<Git>) = apply { this.git = git }

                fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

                /**
                 * Sets [Builder.readOnly] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.readOnly] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SandboxapiS3BucketMountSpec].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .mountPath()
                 * .s3()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SandboxapiS3BucketMountSpec =
                    SandboxapiS3BucketMountSpec(
                        checkRequired("id", id),
                        checkRequired("mountPath", mountPath),
                        checkRequired("s3", s3),
                        checkRequired("type", type),
                        azureBlob,
                        cache,
                        contexthub,
                        encryption,
                        gcs,
                        git,
                        readOnly,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SandboxapiS3BucketMountSpec = apply {
                if (validated) {
                    return@apply
                }

                id()
                mountPath()
                s3().validate()
                type().validate()
                azureBlob().ifPresent { it.validate() }
                cache().ifPresent { it.validate() }
                contexthub().ifPresent { it.validate() }
                encryption().ifPresent { it.validate() }
                gcs().ifPresent { it.validate() }
                git().ifPresent { it.validate() }
                readOnly()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (mountPath.asKnown().isPresent) 1 else 0) +
                    (s3.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (azureBlob.asKnown().getOrNull()?.validity() ?: 0) +
                    (cache.asKnown().getOrNull()?.validity() ?: 0) +
                    (contexthub.asKnown().getOrNull()?.validity() ?: 0) +
                    (encryption.asKnown().getOrNull()?.validity() ?: 0) +
                    (gcs.asKnown().getOrNull()?.validity() ?: 0) +
                    (git.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (readOnly.asKnown().isPresent) 1 else 0)

            class S3
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bucket: JsonField<String>,
                private val region: JsonField<String>,
                private val endpointUrl: JsonField<String>,
                private val pathStyle: JsonField<Boolean>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    bucket: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("region")
                    @ExcludeMissing
                    region: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("endpoint_url")
                    @ExcludeMissing
                    endpointUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("path_style")
                    @ExcludeMissing
                    pathStyle: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(bucket, region, endpointUrl, pathStyle, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bucket(): String = bucket.getRequired("bucket")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun region(): String = region.getRequired("region")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endpointUrl(): Optional<String> = endpointUrl.getOptional("endpoint_url")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pathStyle(): Optional<Boolean> = pathStyle.getOptional("path_style")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [bucket].
                 *
                 * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

                /**
                 * Returns the raw JSON value of [region].
                 *
                 * Unlike [region], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

                /**
                 * Returns the raw JSON value of [endpointUrl].
                 *
                 * Unlike [endpointUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("endpoint_url")
                @ExcludeMissing
                fun _endpointUrl(): JsonField<String> = endpointUrl

                /**
                 * Returns the raw JSON value of [pathStyle].
                 *
                 * Unlike [pathStyle], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("path_style")
                @ExcludeMissing
                fun _pathStyle(): JsonField<Boolean> = pathStyle

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [S3].
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * .region()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [S3]. */
                class Builder internal constructor() {

                    private var bucket: JsonField<String>? = null
                    private var region: JsonField<String>? = null
                    private var endpointUrl: JsonField<String> = JsonMissing.of()
                    private var pathStyle: JsonField<Boolean> = JsonMissing.of()
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(s3: S3) = apply {
                        bucket = s3.bucket
                        region = s3.region
                        endpointUrl = s3.endpointUrl
                        pathStyle = s3.pathStyle
                        prefix = s3.prefix
                        additionalProperties = s3.additionalProperties.toMutableMap()
                    }

                    fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                    /**
                     * Sets [Builder.bucket] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bucket] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                    fun region(region: String) = region(JsonField.of(region))

                    /**
                     * Sets [Builder.region] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.region] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun region(region: JsonField<String>) = apply { this.region = region }

                    fun endpointUrl(endpointUrl: String) = endpointUrl(JsonField.of(endpointUrl))

                    /**
                     * Sets [Builder.endpointUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endpointUrl] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun endpointUrl(endpointUrl: JsonField<String>) = apply {
                        this.endpointUrl = endpointUrl
                    }

                    fun pathStyle(pathStyle: Boolean) = pathStyle(JsonField.of(pathStyle))

                    /**
                     * Sets [Builder.pathStyle] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pathStyle] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pathStyle(pathStyle: JsonField<Boolean>) = apply {
                        this.pathStyle = pathStyle
                    }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [S3].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * .region()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): S3 =
                        S3(
                            checkRequired("bucket", bucket),
                            checkRequired("region", region),
                            endpointUrl,
                            pathStyle,
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): S3 = apply {
                    if (validated) {
                        return@apply
                    }

                    bucket()
                    region()
                    endpointUrl()
                    pathStyle()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (bucket.asKnown().isPresent) 1 else 0) +
                        (if (region.asKnown().isPresent) 1 else 0) +
                        (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                        (if (pathStyle.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is S3 &&
                        bucket == other.bucket &&
                        region == other.region &&
                        endpointUrl == other.endpointUrl &&
                        pathStyle == other.pathStyle &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        bucket,
                        region,
                        endpointUrl,
                        pathStyle,
                        prefix,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "S3{bucket=$bucket, region=$region, endpointUrl=$endpointUrl, pathStyle=$pathStyle, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val S3 = of("s3")

                    @JvmField val GCS = of("gcs")

                    @JvmField val AZURE_BLOB = of("azure_blob")

                    @JvmField val GIT = of("git")

                    @JvmField val CONTEXTHUB = of("contexthub")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    S3,
                    GCS,
                    AZURE_BLOB,
                    GIT,
                    CONTEXTHUB,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    S3,
                    GCS,
                    AZURE_BLOB,
                    GIT,
                    CONTEXTHUB,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        S3 -> Value.S3
                        GCS -> Value.GCS
                        AZURE_BLOB -> Value.AZURE_BLOB
                        GIT -> Value.GIT
                        CONTEXTHUB -> Value.CONTEXTHUB
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        S3 -> Known.S3
                        GCS -> Known.GCS
                        AZURE_BLOB -> Known.AZURE_BLOB
                        GIT -> Known.GIT
                        CONTEXTHUB -> Known.CONTEXTHUB
                        else -> throw LangChainInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangChainInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class AzureBlob
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val container: JsonField<String>,
                private val storageAccount: JsonField<String>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("container")
                    @ExcludeMissing
                    container: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("storage_account")
                    @ExcludeMissing
                    storageAccount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(container, storageAccount, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun container(): String = container.getRequired("container")

                /**
                 * StorageAccount is the storage account name: 3 to 24 lowercase letters and digits.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun storageAccount(): String = storageAccount.getRequired("storage_account")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [container].
                 *
                 * Unlike [container], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("container")
                @ExcludeMissing
                fun _container(): JsonField<String> = container

                /**
                 * Returns the raw JSON value of [storageAccount].
                 *
                 * Unlike [storageAccount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("storage_account")
                @ExcludeMissing
                fun _storageAccount(): JsonField<String> = storageAccount

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [AzureBlob].
                     *
                     * The following fields are required:
                     * ```java
                     * .container()
                     * .storageAccount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AzureBlob]. */
                class Builder internal constructor() {

                    private var container: JsonField<String>? = null
                    private var storageAccount: JsonField<String>? = null
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(azureBlob: AzureBlob) = apply {
                        container = azureBlob.container
                        storageAccount = azureBlob.storageAccount
                        prefix = azureBlob.prefix
                        additionalProperties = azureBlob.additionalProperties.toMutableMap()
                    }

                    fun container(container: String) = container(JsonField.of(container))

                    /**
                     * Sets [Builder.container] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.container] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun container(container: JsonField<String>) = apply {
                        this.container = container
                    }

                    /**
                     * StorageAccount is the storage account name: 3 to 24 lowercase letters and
                     * digits.
                     */
                    fun storageAccount(storageAccount: String) =
                        storageAccount(JsonField.of(storageAccount))

                    /**
                     * Sets [Builder.storageAccount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.storageAccount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun storageAccount(storageAccount: JsonField<String>) = apply {
                        this.storageAccount = storageAccount
                    }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AzureBlob].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .container()
                     * .storageAccount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AzureBlob =
                        AzureBlob(
                            checkRequired("container", container),
                            checkRequired("storageAccount", storageAccount),
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): AzureBlob = apply {
                    if (validated) {
                        return@apply
                    }

                    container()
                    storageAccount()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (container.asKnown().isPresent) 1 else 0) +
                        (if (storageAccount.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AzureBlob &&
                        container == other.container &&
                        storageAccount == other.storageAccount &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(container, storageAccount, prefix, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AzureBlob{container=$container, storageAccount=$storageAccount, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            class Cache
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val maxSizeBytes: JsonField<Long>,
                private val writebackSeconds: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("max_size_bytes")
                    @ExcludeMissing
                    maxSizeBytes: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("writeback_seconds")
                    @ExcludeMissing
                    writebackSeconds: JsonField<Long> = JsonMissing.of(),
                ) : this(maxSizeBytes, writebackSeconds, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun maxSizeBytes(): Optional<Long> = maxSizeBytes.getOptional("max_size_bytes")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun writebackSeconds(): Optional<Long> =
                    writebackSeconds.getOptional("writeback_seconds")

                /**
                 * Returns the raw JSON value of [maxSizeBytes].
                 *
                 * Unlike [maxSizeBytes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("max_size_bytes")
                @ExcludeMissing
                fun _maxSizeBytes(): JsonField<Long> = maxSizeBytes

                /**
                 * Returns the raw JSON value of [writebackSeconds].
                 *
                 * Unlike [writebackSeconds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("writeback_seconds")
                @ExcludeMissing
                fun _writebackSeconds(): JsonField<Long> = writebackSeconds

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Cache]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Cache]. */
                class Builder internal constructor() {

                    private var maxSizeBytes: JsonField<Long> = JsonMissing.of()
                    private var writebackSeconds: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cache: Cache) = apply {
                        maxSizeBytes = cache.maxSizeBytes
                        writebackSeconds = cache.writebackSeconds
                        additionalProperties = cache.additionalProperties.toMutableMap()
                    }

                    fun maxSizeBytes(maxSizeBytes: Long) = maxSizeBytes(JsonField.of(maxSizeBytes))

                    /**
                     * Sets [Builder.maxSizeBytes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxSizeBytes] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maxSizeBytes(maxSizeBytes: JsonField<Long>) = apply {
                        this.maxSizeBytes = maxSizeBytes
                    }

                    fun writebackSeconds(writebackSeconds: Long) =
                        writebackSeconds(JsonField.of(writebackSeconds))

                    /**
                     * Sets [Builder.writebackSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.writebackSeconds] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun writebackSeconds(writebackSeconds: JsonField<Long>) = apply {
                        this.writebackSeconds = writebackSeconds
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Cache].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Cache =
                        Cache(maxSizeBytes, writebackSeconds, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Cache = apply {
                    if (validated) {
                        return@apply
                    }

                    maxSizeBytes()
                    writebackSeconds()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (maxSizeBytes.asKnown().isPresent) 1 else 0) +
                        (if (writebackSeconds.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cache &&
                        maxSizeBytes == other.maxSizeBytes &&
                        writebackSeconds == other.writebackSeconds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(maxSizeBytes, writebackSeconds, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Cache{maxSizeBytes=$maxSizeBytes, writebackSeconds=$writebackSeconds, additionalProperties=$additionalProperties}"
            }

            class Contexthub
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val repo: JsonField<String>,
                private val initialPullOnly: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("repo")
                    @ExcludeMissing
                    repo: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("initial_pull_only")
                    @ExcludeMissing
                    initialPullOnly: JsonField<Boolean> = JsonMissing.of(),
                ) : this(repo, initialPullOnly, mutableMapOf())

                /**
                 * Repo is the Context Hub repository to sync, as "owner/repo" (e.g. "-/my-agent",
                 * where "-" is the current workspace). The repo's latest commit tree is mirrored
                 * into the mount path.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun repo(): String = repo.getRequired("repo")

                /**
                 * InitialPullOnly syncs the repo once at startup instead of polling for updates for
                 * the sandbox's lifetime.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun initialPullOnly(): Optional<Boolean> =
                    initialPullOnly.getOptional("initial_pull_only")

                /**
                 * Returns the raw JSON value of [repo].
                 *
                 * Unlike [repo], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("repo") @ExcludeMissing fun _repo(): JsonField<String> = repo

                /**
                 * Returns the raw JSON value of [initialPullOnly].
                 *
                 * Unlike [initialPullOnly], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("initial_pull_only")
                @ExcludeMissing
                fun _initialPullOnly(): JsonField<Boolean> = initialPullOnly

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Contexthub].
                     *
                     * The following fields are required:
                     * ```java
                     * .repo()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Contexthub]. */
                class Builder internal constructor() {

                    private var repo: JsonField<String>? = null
                    private var initialPullOnly: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(contexthub: Contexthub) = apply {
                        repo = contexthub.repo
                        initialPullOnly = contexthub.initialPullOnly
                        additionalProperties = contexthub.additionalProperties.toMutableMap()
                    }

                    /**
                     * Repo is the Context Hub repository to sync, as "owner/repo" (e.g.
                     * "-/my-agent", where "-" is the current workspace). The repo's latest commit
                     * tree is mirrored into the mount path.
                     */
                    fun repo(repo: String) = repo(JsonField.of(repo))

                    /**
                     * Sets [Builder.repo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.repo] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun repo(repo: JsonField<String>) = apply { this.repo = repo }

                    /**
                     * InitialPullOnly syncs the repo once at startup instead of polling for updates
                     * for the sandbox's lifetime.
                     */
                    fun initialPullOnly(initialPullOnly: Boolean) =
                        initialPullOnly(JsonField.of(initialPullOnly))

                    /**
                     * Sets [Builder.initialPullOnly] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.initialPullOnly] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun initialPullOnly(initialPullOnly: JsonField<Boolean>) = apply {
                        this.initialPullOnly = initialPullOnly
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Contexthub].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .repo()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Contexthub =
                        Contexthub(
                            checkRequired("repo", repo),
                            initialPullOnly,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Contexthub = apply {
                    if (validated) {
                        return@apply
                    }

                    repo()
                    initialPullOnly()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (repo.asKnown().isPresent) 1 else 0) +
                        (if (initialPullOnly.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Contexthub &&
                        repo == other.repo &&
                        initialPullOnly == other.initialPullOnly &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(repo, initialPullOnly, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Contexthub{repo=$repo, initialPullOnly=$initialPullOnly, additionalProperties=$additionalProperties}"
            }

            class Encryption
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val kmsKey: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("kms_key")
                    @ExcludeMissing
                    kmsKey: JsonField<String> = JsonMissing.of()
                ) : this(kmsKey, mutableMapOf())

                /**
                 * KMSKey is the key to encrypt uploads with. S3 mounts take a KMS key ARN in the
                 * mount's region.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun kmsKey(): String = kmsKey.getRequired("kms_key")

                /**
                 * Returns the raw JSON value of [kmsKey].
                 *
                 * Unlike [kmsKey], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("kms_key") @ExcludeMissing fun _kmsKey(): JsonField<String> = kmsKey

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Encryption].
                     *
                     * The following fields are required:
                     * ```java
                     * .kmsKey()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Encryption]. */
                class Builder internal constructor() {

                    private var kmsKey: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(encryption: Encryption) = apply {
                        kmsKey = encryption.kmsKey
                        additionalProperties = encryption.additionalProperties.toMutableMap()
                    }

                    /**
                     * KMSKey is the key to encrypt uploads with. S3 mounts take a KMS key ARN in
                     * the mount's region.
                     */
                    fun kmsKey(kmsKey: String) = kmsKey(JsonField.of(kmsKey))

                    /**
                     * Sets [Builder.kmsKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.kmsKey] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun kmsKey(kmsKey: JsonField<String>) = apply { this.kmsKey = kmsKey }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Encryption].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .kmsKey()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Encryption =
                        Encryption(
                            checkRequired("kmsKey", kmsKey),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Encryption = apply {
                    if (validated) {
                        return@apply
                    }

                    kmsKey()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int = (if (kmsKey.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Encryption &&
                        kmsKey == other.kmsKey &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(kmsKey, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Encryption{kmsKey=$kmsKey, additionalProperties=$additionalProperties}"
            }

            class Gcs
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bucket: JsonField<String>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    bucket: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(bucket, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bucket(): String = bucket.getRequired("bucket")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [bucket].
                 *
                 * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Gcs].
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Gcs]. */
                class Builder internal constructor() {

                    private var bucket: JsonField<String>? = null
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(gcs: Gcs) = apply {
                        bucket = gcs.bucket
                        prefix = gcs.prefix
                        additionalProperties = gcs.additionalProperties.toMutableMap()
                    }

                    fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                    /**
                     * Sets [Builder.bucket] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bucket] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Gcs].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Gcs =
                        Gcs(
                            checkRequired("bucket", bucket),
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Gcs = apply {
                    if (validated) {
                        return@apply
                    }

                    bucket()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (bucket.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Gcs &&
                        bucket == other.bucket &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(bucket, prefix, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Gcs{bucket=$bucket, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            class Git
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val remoteUrl: JsonField<String>,
                private val ref: JsonField<Ref>,
                private val refreshIntervalSeconds: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("remote_url")
                    @ExcludeMissing
                    remoteUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<Ref> = JsonMissing.of(),
                    @JsonProperty("refresh_interval_seconds")
                    @ExcludeMissing
                    refreshIntervalSeconds: JsonField<Long> = JsonMissing.of(),
                ) : this(remoteUrl, ref, refreshIntervalSeconds, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun remoteUrl(): String = remoteUrl.getRequired("remote_url")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<Ref> = ref.getOptional("ref")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun refreshIntervalSeconds(): Optional<Long> =
                    refreshIntervalSeconds.getOptional("refresh_interval_seconds")

                /**
                 * Returns the raw JSON value of [remoteUrl].
                 *
                 * Unlike [remoteUrl], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("remote_url")
                @ExcludeMissing
                fun _remoteUrl(): JsonField<String> = remoteUrl

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<Ref> = ref

                /**
                 * Returns the raw JSON value of [refreshIntervalSeconds].
                 *
                 * Unlike [refreshIntervalSeconds], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("refresh_interval_seconds")
                @ExcludeMissing
                fun _refreshIntervalSeconds(): JsonField<Long> = refreshIntervalSeconds

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Git].
                     *
                     * The following fields are required:
                     * ```java
                     * .remoteUrl()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Git]. */
                class Builder internal constructor() {

                    private var remoteUrl: JsonField<String>? = null
                    private var ref: JsonField<Ref> = JsonMissing.of()
                    private var refreshIntervalSeconds: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(git: Git) = apply {
                        remoteUrl = git.remoteUrl
                        ref = git.ref
                        refreshIntervalSeconds = git.refreshIntervalSeconds
                        additionalProperties = git.additionalProperties.toMutableMap()
                    }

                    fun remoteUrl(remoteUrl: String) = remoteUrl(JsonField.of(remoteUrl))

                    /**
                     * Sets [Builder.remoteUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.remoteUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun remoteUrl(remoteUrl: JsonField<String>) = apply {
                        this.remoteUrl = remoteUrl
                    }

                    fun ref(ref: Ref) = ref(JsonField.of(ref))

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [Ref] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun ref(ref: JsonField<Ref>) = apply { this.ref = ref }

                    fun refreshIntervalSeconds(refreshIntervalSeconds: Long) =
                        refreshIntervalSeconds(JsonField.of(refreshIntervalSeconds))

                    /**
                     * Sets [Builder.refreshIntervalSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.refreshIntervalSeconds] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun refreshIntervalSeconds(refreshIntervalSeconds: JsonField<Long>) = apply {
                        this.refreshIntervalSeconds = refreshIntervalSeconds
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Git].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .remoteUrl()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Git =
                        Git(
                            checkRequired("remoteUrl", remoteUrl),
                            ref,
                            refreshIntervalSeconds,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Git = apply {
                    if (validated) {
                        return@apply
                    }

                    remoteUrl()
                    ref().ifPresent { it.validate() }
                    refreshIntervalSeconds()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (remoteUrl.asKnown().isPresent) 1 else 0) +
                        (ref.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (refreshIntervalSeconds.asKnown().isPresent) 1 else 0)

                class Ref
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val name: JsonField<String>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(name, type, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Ref].
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Ref]. */
                    class Builder internal constructor() {

                        private var name: JsonField<String>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ref: Ref) = apply {
                            name = ref.name
                            type = ref.type
                            additionalProperties = ref.additionalProperties.toMutableMap()
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Ref].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Ref =
                            Ref(
                                checkRequired("name", name),
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Ref = apply {
                        if (validated) {
                            return@apply
                        }

                        name()
                        type().validate()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (name.asKnown().isPresent) 1 else 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val BRANCH = of("branch")

                            @JvmField val TAG = of("tag")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            BRANCH,
                            TAG,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            BRANCH,
                            TAG,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                BRANCH -> Value.BRANCH
                                TAG -> Value.TAG
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                BRANCH -> Known.BRANCH
                                TAG -> Known.TAG
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LangChainInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Ref &&
                            name == other.name &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(name, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Ref{name=$name, type=$type, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Git &&
                        remoteUrl == other.remoteUrl &&
                        ref == other.ref &&
                        refreshIntervalSeconds == other.refreshIntervalSeconds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(remoteUrl, ref, refreshIntervalSeconds, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Git{remoteUrl=$remoteUrl, ref=$ref, refreshIntervalSeconds=$refreshIntervalSeconds, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SandboxapiS3BucketMountSpec &&
                    id == other.id &&
                    mountPath == other.mountPath &&
                    s3 == other.s3 &&
                    type == other.type &&
                    azureBlob == other.azureBlob &&
                    cache == other.cache &&
                    contexthub == other.contexthub &&
                    encryption == other.encryption &&
                    gcs == other.gcs &&
                    git == other.git &&
                    readOnly == other.readOnly &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    mountPath,
                    s3,
                    type,
                    azureBlob,
                    cache,
                    contexthub,
                    encryption,
                    gcs,
                    git,
                    readOnly,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SandboxapiS3BucketMountSpec{id=$id, mountPath=$mountPath, s3=$s3, type=$type, azureBlob=$azureBlob, cache=$cache, contexthub=$contexthub, encryption=$encryption, gcs=$gcs, git=$git, readOnly=$readOnly, additionalProperties=$additionalProperties}"
        }

        class SandboxapiGcsBucketMountSpec
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val gcs: JsonField<Gcs>,
            private val mountPath: JsonField<String>,
            private val type: JsonField<Type>,
            private val azureBlob: JsonField<AzureBlob>,
            private val cache: JsonField<Cache>,
            private val contexthub: JsonField<Contexthub>,
            private val encryption: JsonField<Encryption>,
            private val git: JsonField<Git>,
            private val readOnly: JsonField<Boolean>,
            private val s3: JsonField<S3>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("gcs") @ExcludeMissing gcs: JsonField<Gcs> = JsonMissing.of(),
                @JsonProperty("mount_path")
                @ExcludeMissing
                mountPath: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("azure_blob")
                @ExcludeMissing
                azureBlob: JsonField<AzureBlob> = JsonMissing.of(),
                @JsonProperty("cache") @ExcludeMissing cache: JsonField<Cache> = JsonMissing.of(),
                @JsonProperty("contexthub")
                @ExcludeMissing
                contexthub: JsonField<Contexthub> = JsonMissing.of(),
                @JsonProperty("encryption")
                @ExcludeMissing
                encryption: JsonField<Encryption> = JsonMissing.of(),
                @JsonProperty("git") @ExcludeMissing git: JsonField<Git> = JsonMissing.of(),
                @JsonProperty("read_only")
                @ExcludeMissing
                readOnly: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("s3") @ExcludeMissing s3: JsonField<S3> = JsonMissing.of(),
            ) : this(
                id,
                gcs,
                mountPath,
                type,
                azureBlob,
                cache,
                contexthub,
                encryption,
                git,
                readOnly,
                s3,
                mutableMapOf(),
            )

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gcs(): Gcs = gcs.getRequired("gcs")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mountPath(): String = mountPath.getRequired("mount_path")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun azureBlob(): Optional<AzureBlob> = azureBlob.getOptional("azure_blob")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun cache(): Optional<Cache> = cache.getOptional("cache")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun contexthub(): Optional<Contexthub> = contexthub.getOptional("contexthub")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun encryption(): Optional<Encryption> = encryption.getOptional("encryption")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun git(): Optional<Git> = git.getOptional("git")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun s3(): Optional<S3> = s3.getOptional("s3")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [gcs].
             *
             * Unlike [gcs], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gcs") @ExcludeMissing fun _gcs(): JsonField<Gcs> = gcs

            /**
             * Returns the raw JSON value of [mountPath].
             *
             * Unlike [mountPath], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("mount_path")
            @ExcludeMissing
            fun _mountPath(): JsonField<String> = mountPath

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [azureBlob].
             *
             * Unlike [azureBlob], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("azure_blob")
            @ExcludeMissing
            fun _azureBlob(): JsonField<AzureBlob> = azureBlob

            /**
             * Returns the raw JSON value of [cache].
             *
             * Unlike [cache], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cache") @ExcludeMissing fun _cache(): JsonField<Cache> = cache

            /**
             * Returns the raw JSON value of [contexthub].
             *
             * Unlike [contexthub], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contexthub")
            @ExcludeMissing
            fun _contexthub(): JsonField<Contexthub> = contexthub

            /**
             * Returns the raw JSON value of [encryption].
             *
             * Unlike [encryption], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("encryption")
            @ExcludeMissing
            fun _encryption(): JsonField<Encryption> = encryption

            /**
             * Returns the raw JSON value of [git].
             *
             * Unlike [git], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("git") @ExcludeMissing fun _git(): JsonField<Git> = git

            /**
             * Returns the raw JSON value of [readOnly].
             *
             * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("read_only")
            @ExcludeMissing
            fun _readOnly(): JsonField<Boolean> = readOnly

            /**
             * Returns the raw JSON value of [s3].
             *
             * Unlike [s3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("s3") @ExcludeMissing fun _s3(): JsonField<S3> = s3

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [SandboxapiGcsBucketMountSpec].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .gcs()
                 * .mountPath()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SandboxapiGcsBucketMountSpec]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var gcs: JsonField<Gcs>? = null
                private var mountPath: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var azureBlob: JsonField<AzureBlob> = JsonMissing.of()
                private var cache: JsonField<Cache> = JsonMissing.of()
                private var contexthub: JsonField<Contexthub> = JsonMissing.of()
                private var encryption: JsonField<Encryption> = JsonMissing.of()
                private var git: JsonField<Git> = JsonMissing.of()
                private var readOnly: JsonField<Boolean> = JsonMissing.of()
                private var s3: JsonField<S3> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(sandboxapiGcsBucketMountSpec: SandboxapiGcsBucketMountSpec) =
                    apply {
                        id = sandboxapiGcsBucketMountSpec.id
                        gcs = sandboxapiGcsBucketMountSpec.gcs
                        mountPath = sandboxapiGcsBucketMountSpec.mountPath
                        type = sandboxapiGcsBucketMountSpec.type
                        azureBlob = sandboxapiGcsBucketMountSpec.azureBlob
                        cache = sandboxapiGcsBucketMountSpec.cache
                        contexthub = sandboxapiGcsBucketMountSpec.contexthub
                        encryption = sandboxapiGcsBucketMountSpec.encryption
                        git = sandboxapiGcsBucketMountSpec.git
                        readOnly = sandboxapiGcsBucketMountSpec.readOnly
                        s3 = sandboxapiGcsBucketMountSpec.s3
                        additionalProperties =
                            sandboxapiGcsBucketMountSpec.additionalProperties.toMutableMap()
                    }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun gcs(gcs: Gcs) = gcs(JsonField.of(gcs))

                /**
                 * Sets [Builder.gcs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gcs] with a well-typed [Gcs] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun gcs(gcs: JsonField<Gcs>) = apply { this.gcs = gcs }

                fun mountPath(mountPath: String) = mountPath(JsonField.of(mountPath))

                /**
                 * Sets [Builder.mountPath] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mountPath] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun mountPath(mountPath: JsonField<String>) = apply { this.mountPath = mountPath }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun azureBlob(azureBlob: AzureBlob) = azureBlob(JsonField.of(azureBlob))

                /**
                 * Sets [Builder.azureBlob] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.azureBlob] with a well-typed [AzureBlob] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun azureBlob(azureBlob: JsonField<AzureBlob>) = apply {
                    this.azureBlob = azureBlob
                }

                fun cache(cache: Cache) = cache(JsonField.of(cache))

                /**
                 * Sets [Builder.cache] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cache] with a well-typed [Cache] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cache(cache: JsonField<Cache>) = apply { this.cache = cache }

                fun contexthub(contexthub: Contexthub) = contexthub(JsonField.of(contexthub))

                /**
                 * Sets [Builder.contexthub] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contexthub] with a well-typed [Contexthub] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contexthub(contexthub: JsonField<Contexthub>) = apply {
                    this.contexthub = contexthub
                }

                fun encryption(encryption: Encryption) = encryption(JsonField.of(encryption))

                /**
                 * Sets [Builder.encryption] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.encryption] with a well-typed [Encryption] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun encryption(encryption: JsonField<Encryption>) = apply {
                    this.encryption = encryption
                }

                fun git(git: Git) = git(JsonField.of(git))

                /**
                 * Sets [Builder.git] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.git] with a well-typed [Git] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun git(git: JsonField<Git>) = apply { this.git = git }

                fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

                /**
                 * Sets [Builder.readOnly] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.readOnly] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

                fun s3(s3: S3) = s3(JsonField.of(s3))

                /**
                 * Sets [Builder.s3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.s3] with a well-typed [S3] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun s3(s3: JsonField<S3>) = apply { this.s3 = s3 }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SandboxapiGcsBucketMountSpec].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .gcs()
                 * .mountPath()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SandboxapiGcsBucketMountSpec =
                    SandboxapiGcsBucketMountSpec(
                        checkRequired("id", id),
                        checkRequired("gcs", gcs),
                        checkRequired("mountPath", mountPath),
                        checkRequired("type", type),
                        azureBlob,
                        cache,
                        contexthub,
                        encryption,
                        git,
                        readOnly,
                        s3,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SandboxapiGcsBucketMountSpec = apply {
                if (validated) {
                    return@apply
                }

                id()
                gcs().validate()
                mountPath()
                type().validate()
                azureBlob().ifPresent { it.validate() }
                cache().ifPresent { it.validate() }
                contexthub().ifPresent { it.validate() }
                encryption().ifPresent { it.validate() }
                git().ifPresent { it.validate() }
                readOnly()
                s3().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (gcs.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (mountPath.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (azureBlob.asKnown().getOrNull()?.validity() ?: 0) +
                    (cache.asKnown().getOrNull()?.validity() ?: 0) +
                    (contexthub.asKnown().getOrNull()?.validity() ?: 0) +
                    (encryption.asKnown().getOrNull()?.validity() ?: 0) +
                    (git.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (readOnly.asKnown().isPresent) 1 else 0) +
                    (s3.asKnown().getOrNull()?.validity() ?: 0)

            class Gcs
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bucket: JsonField<String>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    bucket: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(bucket, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bucket(): String = bucket.getRequired("bucket")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [bucket].
                 *
                 * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Gcs].
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Gcs]. */
                class Builder internal constructor() {

                    private var bucket: JsonField<String>? = null
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(gcs: Gcs) = apply {
                        bucket = gcs.bucket
                        prefix = gcs.prefix
                        additionalProperties = gcs.additionalProperties.toMutableMap()
                    }

                    fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                    /**
                     * Sets [Builder.bucket] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bucket] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Gcs].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Gcs =
                        Gcs(
                            checkRequired("bucket", bucket),
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Gcs = apply {
                    if (validated) {
                        return@apply
                    }

                    bucket()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (bucket.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Gcs &&
                        bucket == other.bucket &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(bucket, prefix, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Gcs{bucket=$bucket, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val S3 = of("s3")

                    @JvmField val GCS = of("gcs")

                    @JvmField val AZURE_BLOB = of("azure_blob")

                    @JvmField val GIT = of("git")

                    @JvmField val CONTEXTHUB = of("contexthub")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    S3,
                    GCS,
                    AZURE_BLOB,
                    GIT,
                    CONTEXTHUB,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    S3,
                    GCS,
                    AZURE_BLOB,
                    GIT,
                    CONTEXTHUB,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        S3 -> Value.S3
                        GCS -> Value.GCS
                        AZURE_BLOB -> Value.AZURE_BLOB
                        GIT -> Value.GIT
                        CONTEXTHUB -> Value.CONTEXTHUB
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        S3 -> Known.S3
                        GCS -> Known.GCS
                        AZURE_BLOB -> Known.AZURE_BLOB
                        GIT -> Known.GIT
                        CONTEXTHUB -> Known.CONTEXTHUB
                        else -> throw LangChainInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangChainInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class AzureBlob
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val container: JsonField<String>,
                private val storageAccount: JsonField<String>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("container")
                    @ExcludeMissing
                    container: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("storage_account")
                    @ExcludeMissing
                    storageAccount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(container, storageAccount, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun container(): String = container.getRequired("container")

                /**
                 * StorageAccount is the storage account name: 3 to 24 lowercase letters and digits.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun storageAccount(): String = storageAccount.getRequired("storage_account")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [container].
                 *
                 * Unlike [container], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("container")
                @ExcludeMissing
                fun _container(): JsonField<String> = container

                /**
                 * Returns the raw JSON value of [storageAccount].
                 *
                 * Unlike [storageAccount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("storage_account")
                @ExcludeMissing
                fun _storageAccount(): JsonField<String> = storageAccount

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [AzureBlob].
                     *
                     * The following fields are required:
                     * ```java
                     * .container()
                     * .storageAccount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AzureBlob]. */
                class Builder internal constructor() {

                    private var container: JsonField<String>? = null
                    private var storageAccount: JsonField<String>? = null
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(azureBlob: AzureBlob) = apply {
                        container = azureBlob.container
                        storageAccount = azureBlob.storageAccount
                        prefix = azureBlob.prefix
                        additionalProperties = azureBlob.additionalProperties.toMutableMap()
                    }

                    fun container(container: String) = container(JsonField.of(container))

                    /**
                     * Sets [Builder.container] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.container] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun container(container: JsonField<String>) = apply {
                        this.container = container
                    }

                    /**
                     * StorageAccount is the storage account name: 3 to 24 lowercase letters and
                     * digits.
                     */
                    fun storageAccount(storageAccount: String) =
                        storageAccount(JsonField.of(storageAccount))

                    /**
                     * Sets [Builder.storageAccount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.storageAccount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun storageAccount(storageAccount: JsonField<String>) = apply {
                        this.storageAccount = storageAccount
                    }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AzureBlob].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .container()
                     * .storageAccount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AzureBlob =
                        AzureBlob(
                            checkRequired("container", container),
                            checkRequired("storageAccount", storageAccount),
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): AzureBlob = apply {
                    if (validated) {
                        return@apply
                    }

                    container()
                    storageAccount()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (container.asKnown().isPresent) 1 else 0) +
                        (if (storageAccount.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AzureBlob &&
                        container == other.container &&
                        storageAccount == other.storageAccount &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(container, storageAccount, prefix, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AzureBlob{container=$container, storageAccount=$storageAccount, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            class Cache
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val maxSizeBytes: JsonField<Long>,
                private val writebackSeconds: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("max_size_bytes")
                    @ExcludeMissing
                    maxSizeBytes: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("writeback_seconds")
                    @ExcludeMissing
                    writebackSeconds: JsonField<Long> = JsonMissing.of(),
                ) : this(maxSizeBytes, writebackSeconds, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun maxSizeBytes(): Optional<Long> = maxSizeBytes.getOptional("max_size_bytes")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun writebackSeconds(): Optional<Long> =
                    writebackSeconds.getOptional("writeback_seconds")

                /**
                 * Returns the raw JSON value of [maxSizeBytes].
                 *
                 * Unlike [maxSizeBytes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("max_size_bytes")
                @ExcludeMissing
                fun _maxSizeBytes(): JsonField<Long> = maxSizeBytes

                /**
                 * Returns the raw JSON value of [writebackSeconds].
                 *
                 * Unlike [writebackSeconds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("writeback_seconds")
                @ExcludeMissing
                fun _writebackSeconds(): JsonField<Long> = writebackSeconds

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Cache]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Cache]. */
                class Builder internal constructor() {

                    private var maxSizeBytes: JsonField<Long> = JsonMissing.of()
                    private var writebackSeconds: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cache: Cache) = apply {
                        maxSizeBytes = cache.maxSizeBytes
                        writebackSeconds = cache.writebackSeconds
                        additionalProperties = cache.additionalProperties.toMutableMap()
                    }

                    fun maxSizeBytes(maxSizeBytes: Long) = maxSizeBytes(JsonField.of(maxSizeBytes))

                    /**
                     * Sets [Builder.maxSizeBytes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxSizeBytes] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maxSizeBytes(maxSizeBytes: JsonField<Long>) = apply {
                        this.maxSizeBytes = maxSizeBytes
                    }

                    fun writebackSeconds(writebackSeconds: Long) =
                        writebackSeconds(JsonField.of(writebackSeconds))

                    /**
                     * Sets [Builder.writebackSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.writebackSeconds] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun writebackSeconds(writebackSeconds: JsonField<Long>) = apply {
                        this.writebackSeconds = writebackSeconds
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Cache].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Cache =
                        Cache(maxSizeBytes, writebackSeconds, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Cache = apply {
                    if (validated) {
                        return@apply
                    }

                    maxSizeBytes()
                    writebackSeconds()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (maxSizeBytes.asKnown().isPresent) 1 else 0) +
                        (if (writebackSeconds.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cache &&
                        maxSizeBytes == other.maxSizeBytes &&
                        writebackSeconds == other.writebackSeconds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(maxSizeBytes, writebackSeconds, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Cache{maxSizeBytes=$maxSizeBytes, writebackSeconds=$writebackSeconds, additionalProperties=$additionalProperties}"
            }

            class Contexthub
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val repo: JsonField<String>,
                private val initialPullOnly: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("repo")
                    @ExcludeMissing
                    repo: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("initial_pull_only")
                    @ExcludeMissing
                    initialPullOnly: JsonField<Boolean> = JsonMissing.of(),
                ) : this(repo, initialPullOnly, mutableMapOf())

                /**
                 * Repo is the Context Hub repository to sync, as "owner/repo" (e.g. "-/my-agent",
                 * where "-" is the current workspace). The repo's latest commit tree is mirrored
                 * into the mount path.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun repo(): String = repo.getRequired("repo")

                /**
                 * InitialPullOnly syncs the repo once at startup instead of polling for updates for
                 * the sandbox's lifetime.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun initialPullOnly(): Optional<Boolean> =
                    initialPullOnly.getOptional("initial_pull_only")

                /**
                 * Returns the raw JSON value of [repo].
                 *
                 * Unlike [repo], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("repo") @ExcludeMissing fun _repo(): JsonField<String> = repo

                /**
                 * Returns the raw JSON value of [initialPullOnly].
                 *
                 * Unlike [initialPullOnly], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("initial_pull_only")
                @ExcludeMissing
                fun _initialPullOnly(): JsonField<Boolean> = initialPullOnly

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Contexthub].
                     *
                     * The following fields are required:
                     * ```java
                     * .repo()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Contexthub]. */
                class Builder internal constructor() {

                    private var repo: JsonField<String>? = null
                    private var initialPullOnly: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(contexthub: Contexthub) = apply {
                        repo = contexthub.repo
                        initialPullOnly = contexthub.initialPullOnly
                        additionalProperties = contexthub.additionalProperties.toMutableMap()
                    }

                    /**
                     * Repo is the Context Hub repository to sync, as "owner/repo" (e.g.
                     * "-/my-agent", where "-" is the current workspace). The repo's latest commit
                     * tree is mirrored into the mount path.
                     */
                    fun repo(repo: String) = repo(JsonField.of(repo))

                    /**
                     * Sets [Builder.repo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.repo] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun repo(repo: JsonField<String>) = apply { this.repo = repo }

                    /**
                     * InitialPullOnly syncs the repo once at startup instead of polling for updates
                     * for the sandbox's lifetime.
                     */
                    fun initialPullOnly(initialPullOnly: Boolean) =
                        initialPullOnly(JsonField.of(initialPullOnly))

                    /**
                     * Sets [Builder.initialPullOnly] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.initialPullOnly] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun initialPullOnly(initialPullOnly: JsonField<Boolean>) = apply {
                        this.initialPullOnly = initialPullOnly
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Contexthub].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .repo()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Contexthub =
                        Contexthub(
                            checkRequired("repo", repo),
                            initialPullOnly,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Contexthub = apply {
                    if (validated) {
                        return@apply
                    }

                    repo()
                    initialPullOnly()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (repo.asKnown().isPresent) 1 else 0) +
                        (if (initialPullOnly.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Contexthub &&
                        repo == other.repo &&
                        initialPullOnly == other.initialPullOnly &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(repo, initialPullOnly, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Contexthub{repo=$repo, initialPullOnly=$initialPullOnly, additionalProperties=$additionalProperties}"
            }

            class Encryption
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val kmsKey: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("kms_key")
                    @ExcludeMissing
                    kmsKey: JsonField<String> = JsonMissing.of()
                ) : this(kmsKey, mutableMapOf())

                /**
                 * KMSKey is the key to encrypt uploads with. S3 mounts take a KMS key ARN in the
                 * mount's region.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun kmsKey(): String = kmsKey.getRequired("kms_key")

                /**
                 * Returns the raw JSON value of [kmsKey].
                 *
                 * Unlike [kmsKey], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("kms_key") @ExcludeMissing fun _kmsKey(): JsonField<String> = kmsKey

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Encryption].
                     *
                     * The following fields are required:
                     * ```java
                     * .kmsKey()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Encryption]. */
                class Builder internal constructor() {

                    private var kmsKey: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(encryption: Encryption) = apply {
                        kmsKey = encryption.kmsKey
                        additionalProperties = encryption.additionalProperties.toMutableMap()
                    }

                    /**
                     * KMSKey is the key to encrypt uploads with. S3 mounts take a KMS key ARN in
                     * the mount's region.
                     */
                    fun kmsKey(kmsKey: String) = kmsKey(JsonField.of(kmsKey))

                    /**
                     * Sets [Builder.kmsKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.kmsKey] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun kmsKey(kmsKey: JsonField<String>) = apply { this.kmsKey = kmsKey }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Encryption].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .kmsKey()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Encryption =
                        Encryption(
                            checkRequired("kmsKey", kmsKey),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Encryption = apply {
                    if (validated) {
                        return@apply
                    }

                    kmsKey()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int = (if (kmsKey.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Encryption &&
                        kmsKey == other.kmsKey &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(kmsKey, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Encryption{kmsKey=$kmsKey, additionalProperties=$additionalProperties}"
            }

            class Git
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val remoteUrl: JsonField<String>,
                private val ref: JsonField<Ref>,
                private val refreshIntervalSeconds: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("remote_url")
                    @ExcludeMissing
                    remoteUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<Ref> = JsonMissing.of(),
                    @JsonProperty("refresh_interval_seconds")
                    @ExcludeMissing
                    refreshIntervalSeconds: JsonField<Long> = JsonMissing.of(),
                ) : this(remoteUrl, ref, refreshIntervalSeconds, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun remoteUrl(): String = remoteUrl.getRequired("remote_url")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<Ref> = ref.getOptional("ref")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun refreshIntervalSeconds(): Optional<Long> =
                    refreshIntervalSeconds.getOptional("refresh_interval_seconds")

                /**
                 * Returns the raw JSON value of [remoteUrl].
                 *
                 * Unlike [remoteUrl], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("remote_url")
                @ExcludeMissing
                fun _remoteUrl(): JsonField<String> = remoteUrl

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<Ref> = ref

                /**
                 * Returns the raw JSON value of [refreshIntervalSeconds].
                 *
                 * Unlike [refreshIntervalSeconds], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("refresh_interval_seconds")
                @ExcludeMissing
                fun _refreshIntervalSeconds(): JsonField<Long> = refreshIntervalSeconds

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Git].
                     *
                     * The following fields are required:
                     * ```java
                     * .remoteUrl()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Git]. */
                class Builder internal constructor() {

                    private var remoteUrl: JsonField<String>? = null
                    private var ref: JsonField<Ref> = JsonMissing.of()
                    private var refreshIntervalSeconds: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(git: Git) = apply {
                        remoteUrl = git.remoteUrl
                        ref = git.ref
                        refreshIntervalSeconds = git.refreshIntervalSeconds
                        additionalProperties = git.additionalProperties.toMutableMap()
                    }

                    fun remoteUrl(remoteUrl: String) = remoteUrl(JsonField.of(remoteUrl))

                    /**
                     * Sets [Builder.remoteUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.remoteUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun remoteUrl(remoteUrl: JsonField<String>) = apply {
                        this.remoteUrl = remoteUrl
                    }

                    fun ref(ref: Ref) = ref(JsonField.of(ref))

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [Ref] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun ref(ref: JsonField<Ref>) = apply { this.ref = ref }

                    fun refreshIntervalSeconds(refreshIntervalSeconds: Long) =
                        refreshIntervalSeconds(JsonField.of(refreshIntervalSeconds))

                    /**
                     * Sets [Builder.refreshIntervalSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.refreshIntervalSeconds] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun refreshIntervalSeconds(refreshIntervalSeconds: JsonField<Long>) = apply {
                        this.refreshIntervalSeconds = refreshIntervalSeconds
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Git].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .remoteUrl()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Git =
                        Git(
                            checkRequired("remoteUrl", remoteUrl),
                            ref,
                            refreshIntervalSeconds,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Git = apply {
                    if (validated) {
                        return@apply
                    }

                    remoteUrl()
                    ref().ifPresent { it.validate() }
                    refreshIntervalSeconds()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (remoteUrl.asKnown().isPresent) 1 else 0) +
                        (ref.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (refreshIntervalSeconds.asKnown().isPresent) 1 else 0)

                class Ref
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val name: JsonField<String>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(name, type, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Ref].
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Ref]. */
                    class Builder internal constructor() {

                        private var name: JsonField<String>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ref: Ref) = apply {
                            name = ref.name
                            type = ref.type
                            additionalProperties = ref.additionalProperties.toMutableMap()
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Ref].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Ref =
                            Ref(
                                checkRequired("name", name),
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Ref = apply {
                        if (validated) {
                            return@apply
                        }

                        name()
                        type().validate()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (name.asKnown().isPresent) 1 else 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val BRANCH = of("branch")

                            @JvmField val TAG = of("tag")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            BRANCH,
                            TAG,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            BRANCH,
                            TAG,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                BRANCH -> Value.BRANCH
                                TAG -> Value.TAG
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                BRANCH -> Known.BRANCH
                                TAG -> Known.TAG
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LangChainInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Ref &&
                            name == other.name &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(name, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Ref{name=$name, type=$type, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Git &&
                        remoteUrl == other.remoteUrl &&
                        ref == other.ref &&
                        refreshIntervalSeconds == other.refreshIntervalSeconds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(remoteUrl, ref, refreshIntervalSeconds, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Git{remoteUrl=$remoteUrl, ref=$ref, refreshIntervalSeconds=$refreshIntervalSeconds, additionalProperties=$additionalProperties}"
            }

            class S3
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bucket: JsonField<String>,
                private val region: JsonField<String>,
                private val endpointUrl: JsonField<String>,
                private val pathStyle: JsonField<Boolean>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    bucket: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("region")
                    @ExcludeMissing
                    region: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("endpoint_url")
                    @ExcludeMissing
                    endpointUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("path_style")
                    @ExcludeMissing
                    pathStyle: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(bucket, region, endpointUrl, pathStyle, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bucket(): String = bucket.getRequired("bucket")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun region(): String = region.getRequired("region")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endpointUrl(): Optional<String> = endpointUrl.getOptional("endpoint_url")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pathStyle(): Optional<Boolean> = pathStyle.getOptional("path_style")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [bucket].
                 *
                 * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

                /**
                 * Returns the raw JSON value of [region].
                 *
                 * Unlike [region], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

                /**
                 * Returns the raw JSON value of [endpointUrl].
                 *
                 * Unlike [endpointUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("endpoint_url")
                @ExcludeMissing
                fun _endpointUrl(): JsonField<String> = endpointUrl

                /**
                 * Returns the raw JSON value of [pathStyle].
                 *
                 * Unlike [pathStyle], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("path_style")
                @ExcludeMissing
                fun _pathStyle(): JsonField<Boolean> = pathStyle

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [S3].
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * .region()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [S3]. */
                class Builder internal constructor() {

                    private var bucket: JsonField<String>? = null
                    private var region: JsonField<String>? = null
                    private var endpointUrl: JsonField<String> = JsonMissing.of()
                    private var pathStyle: JsonField<Boolean> = JsonMissing.of()
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(s3: S3) = apply {
                        bucket = s3.bucket
                        region = s3.region
                        endpointUrl = s3.endpointUrl
                        pathStyle = s3.pathStyle
                        prefix = s3.prefix
                        additionalProperties = s3.additionalProperties.toMutableMap()
                    }

                    fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                    /**
                     * Sets [Builder.bucket] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bucket] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                    fun region(region: String) = region(JsonField.of(region))

                    /**
                     * Sets [Builder.region] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.region] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun region(region: JsonField<String>) = apply { this.region = region }

                    fun endpointUrl(endpointUrl: String) = endpointUrl(JsonField.of(endpointUrl))

                    /**
                     * Sets [Builder.endpointUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endpointUrl] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun endpointUrl(endpointUrl: JsonField<String>) = apply {
                        this.endpointUrl = endpointUrl
                    }

                    fun pathStyle(pathStyle: Boolean) = pathStyle(JsonField.of(pathStyle))

                    /**
                     * Sets [Builder.pathStyle] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pathStyle] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pathStyle(pathStyle: JsonField<Boolean>) = apply {
                        this.pathStyle = pathStyle
                    }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [S3].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * .region()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): S3 =
                        S3(
                            checkRequired("bucket", bucket),
                            checkRequired("region", region),
                            endpointUrl,
                            pathStyle,
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): S3 = apply {
                    if (validated) {
                        return@apply
                    }

                    bucket()
                    region()
                    endpointUrl()
                    pathStyle()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (bucket.asKnown().isPresent) 1 else 0) +
                        (if (region.asKnown().isPresent) 1 else 0) +
                        (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                        (if (pathStyle.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is S3 &&
                        bucket == other.bucket &&
                        region == other.region &&
                        endpointUrl == other.endpointUrl &&
                        pathStyle == other.pathStyle &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        bucket,
                        region,
                        endpointUrl,
                        pathStyle,
                        prefix,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "S3{bucket=$bucket, region=$region, endpointUrl=$endpointUrl, pathStyle=$pathStyle, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SandboxapiGcsBucketMountSpec &&
                    id == other.id &&
                    gcs == other.gcs &&
                    mountPath == other.mountPath &&
                    type == other.type &&
                    azureBlob == other.azureBlob &&
                    cache == other.cache &&
                    contexthub == other.contexthub &&
                    encryption == other.encryption &&
                    git == other.git &&
                    readOnly == other.readOnly &&
                    s3 == other.s3 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    gcs,
                    mountPath,
                    type,
                    azureBlob,
                    cache,
                    contexthub,
                    encryption,
                    git,
                    readOnly,
                    s3,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SandboxapiGcsBucketMountSpec{id=$id, gcs=$gcs, mountPath=$mountPath, type=$type, azureBlob=$azureBlob, cache=$cache, contexthub=$contexthub, encryption=$encryption, git=$git, readOnly=$readOnly, s3=$s3, additionalProperties=$additionalProperties}"
        }

        class SandboxapiGitRepoMountSpec
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val git: JsonField<Git>,
            private val mountPath: JsonField<String>,
            private val type: JsonField<Type>,
            private val azureBlob: JsonField<AzureBlob>,
            private val cache: JsonField<Cache>,
            private val contexthub: JsonField<Contexthub>,
            private val encryption: JsonField<Encryption>,
            private val gcs: JsonField<Gcs>,
            private val readOnly: JsonField<Boolean>,
            private val s3: JsonField<S3>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("git") @ExcludeMissing git: JsonField<Git> = JsonMissing.of(),
                @JsonProperty("mount_path")
                @ExcludeMissing
                mountPath: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("azure_blob")
                @ExcludeMissing
                azureBlob: JsonField<AzureBlob> = JsonMissing.of(),
                @JsonProperty("cache") @ExcludeMissing cache: JsonField<Cache> = JsonMissing.of(),
                @JsonProperty("contexthub")
                @ExcludeMissing
                contexthub: JsonField<Contexthub> = JsonMissing.of(),
                @JsonProperty("encryption")
                @ExcludeMissing
                encryption: JsonField<Encryption> = JsonMissing.of(),
                @JsonProperty("gcs") @ExcludeMissing gcs: JsonField<Gcs> = JsonMissing.of(),
                @JsonProperty("read_only")
                @ExcludeMissing
                readOnly: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("s3") @ExcludeMissing s3: JsonField<S3> = JsonMissing.of(),
            ) : this(
                id,
                git,
                mountPath,
                type,
                azureBlob,
                cache,
                contexthub,
                encryption,
                gcs,
                readOnly,
                s3,
                mutableMapOf(),
            )

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun git(): Git = git.getRequired("git")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mountPath(): String = mountPath.getRequired("mount_path")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun azureBlob(): Optional<AzureBlob> = azureBlob.getOptional("azure_blob")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun cache(): Optional<Cache> = cache.getOptional("cache")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun contexthub(): Optional<Contexthub> = contexthub.getOptional("contexthub")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun encryption(): Optional<Encryption> = encryption.getOptional("encryption")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun gcs(): Optional<Gcs> = gcs.getOptional("gcs")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun s3(): Optional<S3> = s3.getOptional("s3")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [git].
             *
             * Unlike [git], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("git") @ExcludeMissing fun _git(): JsonField<Git> = git

            /**
             * Returns the raw JSON value of [mountPath].
             *
             * Unlike [mountPath], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("mount_path")
            @ExcludeMissing
            fun _mountPath(): JsonField<String> = mountPath

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [azureBlob].
             *
             * Unlike [azureBlob], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("azure_blob")
            @ExcludeMissing
            fun _azureBlob(): JsonField<AzureBlob> = azureBlob

            /**
             * Returns the raw JSON value of [cache].
             *
             * Unlike [cache], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cache") @ExcludeMissing fun _cache(): JsonField<Cache> = cache

            /**
             * Returns the raw JSON value of [contexthub].
             *
             * Unlike [contexthub], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contexthub")
            @ExcludeMissing
            fun _contexthub(): JsonField<Contexthub> = contexthub

            /**
             * Returns the raw JSON value of [encryption].
             *
             * Unlike [encryption], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("encryption")
            @ExcludeMissing
            fun _encryption(): JsonField<Encryption> = encryption

            /**
             * Returns the raw JSON value of [gcs].
             *
             * Unlike [gcs], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gcs") @ExcludeMissing fun _gcs(): JsonField<Gcs> = gcs

            /**
             * Returns the raw JSON value of [readOnly].
             *
             * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("read_only")
            @ExcludeMissing
            fun _readOnly(): JsonField<Boolean> = readOnly

            /**
             * Returns the raw JSON value of [s3].
             *
             * Unlike [s3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("s3") @ExcludeMissing fun _s3(): JsonField<S3> = s3

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [SandboxapiGitRepoMountSpec].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .git()
                 * .mountPath()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SandboxapiGitRepoMountSpec]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var git: JsonField<Git>? = null
                private var mountPath: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var azureBlob: JsonField<AzureBlob> = JsonMissing.of()
                private var cache: JsonField<Cache> = JsonMissing.of()
                private var contexthub: JsonField<Contexthub> = JsonMissing.of()
                private var encryption: JsonField<Encryption> = JsonMissing.of()
                private var gcs: JsonField<Gcs> = JsonMissing.of()
                private var readOnly: JsonField<Boolean> = JsonMissing.of()
                private var s3: JsonField<S3> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(sandboxapiGitRepoMountSpec: SandboxapiGitRepoMountSpec) = apply {
                    id = sandboxapiGitRepoMountSpec.id
                    git = sandboxapiGitRepoMountSpec.git
                    mountPath = sandboxapiGitRepoMountSpec.mountPath
                    type = sandboxapiGitRepoMountSpec.type
                    azureBlob = sandboxapiGitRepoMountSpec.azureBlob
                    cache = sandboxapiGitRepoMountSpec.cache
                    contexthub = sandboxapiGitRepoMountSpec.contexthub
                    encryption = sandboxapiGitRepoMountSpec.encryption
                    gcs = sandboxapiGitRepoMountSpec.gcs
                    readOnly = sandboxapiGitRepoMountSpec.readOnly
                    s3 = sandboxapiGitRepoMountSpec.s3
                    additionalProperties =
                        sandboxapiGitRepoMountSpec.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun git(git: Git) = git(JsonField.of(git))

                /**
                 * Sets [Builder.git] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.git] with a well-typed [Git] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun git(git: JsonField<Git>) = apply { this.git = git }

                fun mountPath(mountPath: String) = mountPath(JsonField.of(mountPath))

                /**
                 * Sets [Builder.mountPath] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mountPath] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun mountPath(mountPath: JsonField<String>) = apply { this.mountPath = mountPath }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun azureBlob(azureBlob: AzureBlob) = azureBlob(JsonField.of(azureBlob))

                /**
                 * Sets [Builder.azureBlob] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.azureBlob] with a well-typed [AzureBlob] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun azureBlob(azureBlob: JsonField<AzureBlob>) = apply {
                    this.azureBlob = azureBlob
                }

                fun cache(cache: Cache) = cache(JsonField.of(cache))

                /**
                 * Sets [Builder.cache] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cache] with a well-typed [Cache] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cache(cache: JsonField<Cache>) = apply { this.cache = cache }

                fun contexthub(contexthub: Contexthub) = contexthub(JsonField.of(contexthub))

                /**
                 * Sets [Builder.contexthub] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contexthub] with a well-typed [Contexthub] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contexthub(contexthub: JsonField<Contexthub>) = apply {
                    this.contexthub = contexthub
                }

                fun encryption(encryption: Encryption) = encryption(JsonField.of(encryption))

                /**
                 * Sets [Builder.encryption] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.encryption] with a well-typed [Encryption] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun encryption(encryption: JsonField<Encryption>) = apply {
                    this.encryption = encryption
                }

                fun gcs(gcs: Gcs) = gcs(JsonField.of(gcs))

                /**
                 * Sets [Builder.gcs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gcs] with a well-typed [Gcs] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun gcs(gcs: JsonField<Gcs>) = apply { this.gcs = gcs }

                fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

                /**
                 * Sets [Builder.readOnly] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.readOnly] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

                fun s3(s3: S3) = s3(JsonField.of(s3))

                /**
                 * Sets [Builder.s3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.s3] with a well-typed [S3] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun s3(s3: JsonField<S3>) = apply { this.s3 = s3 }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SandboxapiGitRepoMountSpec].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .git()
                 * .mountPath()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SandboxapiGitRepoMountSpec =
                    SandboxapiGitRepoMountSpec(
                        checkRequired("id", id),
                        checkRequired("git", git),
                        checkRequired("mountPath", mountPath),
                        checkRequired("type", type),
                        azureBlob,
                        cache,
                        contexthub,
                        encryption,
                        gcs,
                        readOnly,
                        s3,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SandboxapiGitRepoMountSpec = apply {
                if (validated) {
                    return@apply
                }

                id()
                git().validate()
                mountPath()
                type().validate()
                azureBlob().ifPresent { it.validate() }
                cache().ifPresent { it.validate() }
                contexthub().ifPresent { it.validate() }
                encryption().ifPresent { it.validate() }
                gcs().ifPresent { it.validate() }
                readOnly()
                s3().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (git.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (mountPath.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (azureBlob.asKnown().getOrNull()?.validity() ?: 0) +
                    (cache.asKnown().getOrNull()?.validity() ?: 0) +
                    (contexthub.asKnown().getOrNull()?.validity() ?: 0) +
                    (encryption.asKnown().getOrNull()?.validity() ?: 0) +
                    (gcs.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (readOnly.asKnown().isPresent) 1 else 0) +
                    (s3.asKnown().getOrNull()?.validity() ?: 0)

            class Git
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val remoteUrl: JsonField<String>,
                private val ref: JsonField<Ref>,
                private val refreshIntervalSeconds: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("remote_url")
                    @ExcludeMissing
                    remoteUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<Ref> = JsonMissing.of(),
                    @JsonProperty("refresh_interval_seconds")
                    @ExcludeMissing
                    refreshIntervalSeconds: JsonField<Long> = JsonMissing.of(),
                ) : this(remoteUrl, ref, refreshIntervalSeconds, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun remoteUrl(): String = remoteUrl.getRequired("remote_url")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<Ref> = ref.getOptional("ref")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun refreshIntervalSeconds(): Optional<Long> =
                    refreshIntervalSeconds.getOptional("refresh_interval_seconds")

                /**
                 * Returns the raw JSON value of [remoteUrl].
                 *
                 * Unlike [remoteUrl], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("remote_url")
                @ExcludeMissing
                fun _remoteUrl(): JsonField<String> = remoteUrl

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<Ref> = ref

                /**
                 * Returns the raw JSON value of [refreshIntervalSeconds].
                 *
                 * Unlike [refreshIntervalSeconds], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("refresh_interval_seconds")
                @ExcludeMissing
                fun _refreshIntervalSeconds(): JsonField<Long> = refreshIntervalSeconds

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Git].
                     *
                     * The following fields are required:
                     * ```java
                     * .remoteUrl()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Git]. */
                class Builder internal constructor() {

                    private var remoteUrl: JsonField<String>? = null
                    private var ref: JsonField<Ref> = JsonMissing.of()
                    private var refreshIntervalSeconds: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(git: Git) = apply {
                        remoteUrl = git.remoteUrl
                        ref = git.ref
                        refreshIntervalSeconds = git.refreshIntervalSeconds
                        additionalProperties = git.additionalProperties.toMutableMap()
                    }

                    fun remoteUrl(remoteUrl: String) = remoteUrl(JsonField.of(remoteUrl))

                    /**
                     * Sets [Builder.remoteUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.remoteUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun remoteUrl(remoteUrl: JsonField<String>) = apply {
                        this.remoteUrl = remoteUrl
                    }

                    fun ref(ref: Ref) = ref(JsonField.of(ref))

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [Ref] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun ref(ref: JsonField<Ref>) = apply { this.ref = ref }

                    fun refreshIntervalSeconds(refreshIntervalSeconds: Long) =
                        refreshIntervalSeconds(JsonField.of(refreshIntervalSeconds))

                    /**
                     * Sets [Builder.refreshIntervalSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.refreshIntervalSeconds] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun refreshIntervalSeconds(refreshIntervalSeconds: JsonField<Long>) = apply {
                        this.refreshIntervalSeconds = refreshIntervalSeconds
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Git].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .remoteUrl()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Git =
                        Git(
                            checkRequired("remoteUrl", remoteUrl),
                            ref,
                            refreshIntervalSeconds,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Git = apply {
                    if (validated) {
                        return@apply
                    }

                    remoteUrl()
                    ref().ifPresent { it.validate() }
                    refreshIntervalSeconds()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (remoteUrl.asKnown().isPresent) 1 else 0) +
                        (ref.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (refreshIntervalSeconds.asKnown().isPresent) 1 else 0)

                class Ref
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val name: JsonField<String>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(name, type, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Ref].
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Ref]. */
                    class Builder internal constructor() {

                        private var name: JsonField<String>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ref: Ref) = apply {
                            name = ref.name
                            type = ref.type
                            additionalProperties = ref.additionalProperties.toMutableMap()
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Ref].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Ref =
                            Ref(
                                checkRequired("name", name),
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Ref = apply {
                        if (validated) {
                            return@apply
                        }

                        name()
                        type().validate()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (name.asKnown().isPresent) 1 else 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val BRANCH = of("branch")

                            @JvmField val TAG = of("tag")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            BRANCH,
                            TAG,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            BRANCH,
                            TAG,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                BRANCH -> Value.BRANCH
                                TAG -> Value.TAG
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                BRANCH -> Known.BRANCH
                                TAG -> Known.TAG
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LangChainInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Ref &&
                            name == other.name &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(name, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Ref{name=$name, type=$type, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Git &&
                        remoteUrl == other.remoteUrl &&
                        ref == other.ref &&
                        refreshIntervalSeconds == other.refreshIntervalSeconds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(remoteUrl, ref, refreshIntervalSeconds, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Git{remoteUrl=$remoteUrl, ref=$ref, refreshIntervalSeconds=$refreshIntervalSeconds, additionalProperties=$additionalProperties}"
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val S3 = of("s3")

                    @JvmField val GCS = of("gcs")

                    @JvmField val AZURE_BLOB = of("azure_blob")

                    @JvmField val GIT = of("git")

                    @JvmField val CONTEXTHUB = of("contexthub")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    S3,
                    GCS,
                    AZURE_BLOB,
                    GIT,
                    CONTEXTHUB,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    S3,
                    GCS,
                    AZURE_BLOB,
                    GIT,
                    CONTEXTHUB,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        S3 -> Value.S3
                        GCS -> Value.GCS
                        AZURE_BLOB -> Value.AZURE_BLOB
                        GIT -> Value.GIT
                        CONTEXTHUB -> Value.CONTEXTHUB
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        S3 -> Known.S3
                        GCS -> Known.GCS
                        AZURE_BLOB -> Known.AZURE_BLOB
                        GIT -> Known.GIT
                        CONTEXTHUB -> Known.CONTEXTHUB
                        else -> throw LangChainInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangChainInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class AzureBlob
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val container: JsonField<String>,
                private val storageAccount: JsonField<String>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("container")
                    @ExcludeMissing
                    container: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("storage_account")
                    @ExcludeMissing
                    storageAccount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(container, storageAccount, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun container(): String = container.getRequired("container")

                /**
                 * StorageAccount is the storage account name: 3 to 24 lowercase letters and digits.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun storageAccount(): String = storageAccount.getRequired("storage_account")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [container].
                 *
                 * Unlike [container], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("container")
                @ExcludeMissing
                fun _container(): JsonField<String> = container

                /**
                 * Returns the raw JSON value of [storageAccount].
                 *
                 * Unlike [storageAccount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("storage_account")
                @ExcludeMissing
                fun _storageAccount(): JsonField<String> = storageAccount

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [AzureBlob].
                     *
                     * The following fields are required:
                     * ```java
                     * .container()
                     * .storageAccount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AzureBlob]. */
                class Builder internal constructor() {

                    private var container: JsonField<String>? = null
                    private var storageAccount: JsonField<String>? = null
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(azureBlob: AzureBlob) = apply {
                        container = azureBlob.container
                        storageAccount = azureBlob.storageAccount
                        prefix = azureBlob.prefix
                        additionalProperties = azureBlob.additionalProperties.toMutableMap()
                    }

                    fun container(container: String) = container(JsonField.of(container))

                    /**
                     * Sets [Builder.container] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.container] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun container(container: JsonField<String>) = apply {
                        this.container = container
                    }

                    /**
                     * StorageAccount is the storage account name: 3 to 24 lowercase letters and
                     * digits.
                     */
                    fun storageAccount(storageAccount: String) =
                        storageAccount(JsonField.of(storageAccount))

                    /**
                     * Sets [Builder.storageAccount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.storageAccount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun storageAccount(storageAccount: JsonField<String>) = apply {
                        this.storageAccount = storageAccount
                    }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AzureBlob].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .container()
                     * .storageAccount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AzureBlob =
                        AzureBlob(
                            checkRequired("container", container),
                            checkRequired("storageAccount", storageAccount),
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): AzureBlob = apply {
                    if (validated) {
                        return@apply
                    }

                    container()
                    storageAccount()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (container.asKnown().isPresent) 1 else 0) +
                        (if (storageAccount.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AzureBlob &&
                        container == other.container &&
                        storageAccount == other.storageAccount &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(container, storageAccount, prefix, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AzureBlob{container=$container, storageAccount=$storageAccount, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            class Cache
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val maxSizeBytes: JsonField<Long>,
                private val writebackSeconds: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("max_size_bytes")
                    @ExcludeMissing
                    maxSizeBytes: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("writeback_seconds")
                    @ExcludeMissing
                    writebackSeconds: JsonField<Long> = JsonMissing.of(),
                ) : this(maxSizeBytes, writebackSeconds, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun maxSizeBytes(): Optional<Long> = maxSizeBytes.getOptional("max_size_bytes")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun writebackSeconds(): Optional<Long> =
                    writebackSeconds.getOptional("writeback_seconds")

                /**
                 * Returns the raw JSON value of [maxSizeBytes].
                 *
                 * Unlike [maxSizeBytes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("max_size_bytes")
                @ExcludeMissing
                fun _maxSizeBytes(): JsonField<Long> = maxSizeBytes

                /**
                 * Returns the raw JSON value of [writebackSeconds].
                 *
                 * Unlike [writebackSeconds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("writeback_seconds")
                @ExcludeMissing
                fun _writebackSeconds(): JsonField<Long> = writebackSeconds

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Cache]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Cache]. */
                class Builder internal constructor() {

                    private var maxSizeBytes: JsonField<Long> = JsonMissing.of()
                    private var writebackSeconds: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cache: Cache) = apply {
                        maxSizeBytes = cache.maxSizeBytes
                        writebackSeconds = cache.writebackSeconds
                        additionalProperties = cache.additionalProperties.toMutableMap()
                    }

                    fun maxSizeBytes(maxSizeBytes: Long) = maxSizeBytes(JsonField.of(maxSizeBytes))

                    /**
                     * Sets [Builder.maxSizeBytes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxSizeBytes] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maxSizeBytes(maxSizeBytes: JsonField<Long>) = apply {
                        this.maxSizeBytes = maxSizeBytes
                    }

                    fun writebackSeconds(writebackSeconds: Long) =
                        writebackSeconds(JsonField.of(writebackSeconds))

                    /**
                     * Sets [Builder.writebackSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.writebackSeconds] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun writebackSeconds(writebackSeconds: JsonField<Long>) = apply {
                        this.writebackSeconds = writebackSeconds
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Cache].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Cache =
                        Cache(maxSizeBytes, writebackSeconds, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Cache = apply {
                    if (validated) {
                        return@apply
                    }

                    maxSizeBytes()
                    writebackSeconds()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (maxSizeBytes.asKnown().isPresent) 1 else 0) +
                        (if (writebackSeconds.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cache &&
                        maxSizeBytes == other.maxSizeBytes &&
                        writebackSeconds == other.writebackSeconds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(maxSizeBytes, writebackSeconds, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Cache{maxSizeBytes=$maxSizeBytes, writebackSeconds=$writebackSeconds, additionalProperties=$additionalProperties}"
            }

            class Contexthub
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val repo: JsonField<String>,
                private val initialPullOnly: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("repo")
                    @ExcludeMissing
                    repo: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("initial_pull_only")
                    @ExcludeMissing
                    initialPullOnly: JsonField<Boolean> = JsonMissing.of(),
                ) : this(repo, initialPullOnly, mutableMapOf())

                /**
                 * Repo is the Context Hub repository to sync, as "owner/repo" (e.g. "-/my-agent",
                 * where "-" is the current workspace). The repo's latest commit tree is mirrored
                 * into the mount path.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun repo(): String = repo.getRequired("repo")

                /**
                 * InitialPullOnly syncs the repo once at startup instead of polling for updates for
                 * the sandbox's lifetime.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun initialPullOnly(): Optional<Boolean> =
                    initialPullOnly.getOptional("initial_pull_only")

                /**
                 * Returns the raw JSON value of [repo].
                 *
                 * Unlike [repo], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("repo") @ExcludeMissing fun _repo(): JsonField<String> = repo

                /**
                 * Returns the raw JSON value of [initialPullOnly].
                 *
                 * Unlike [initialPullOnly], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("initial_pull_only")
                @ExcludeMissing
                fun _initialPullOnly(): JsonField<Boolean> = initialPullOnly

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Contexthub].
                     *
                     * The following fields are required:
                     * ```java
                     * .repo()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Contexthub]. */
                class Builder internal constructor() {

                    private var repo: JsonField<String>? = null
                    private var initialPullOnly: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(contexthub: Contexthub) = apply {
                        repo = contexthub.repo
                        initialPullOnly = contexthub.initialPullOnly
                        additionalProperties = contexthub.additionalProperties.toMutableMap()
                    }

                    /**
                     * Repo is the Context Hub repository to sync, as "owner/repo" (e.g.
                     * "-/my-agent", where "-" is the current workspace). The repo's latest commit
                     * tree is mirrored into the mount path.
                     */
                    fun repo(repo: String) = repo(JsonField.of(repo))

                    /**
                     * Sets [Builder.repo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.repo] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun repo(repo: JsonField<String>) = apply { this.repo = repo }

                    /**
                     * InitialPullOnly syncs the repo once at startup instead of polling for updates
                     * for the sandbox's lifetime.
                     */
                    fun initialPullOnly(initialPullOnly: Boolean) =
                        initialPullOnly(JsonField.of(initialPullOnly))

                    /**
                     * Sets [Builder.initialPullOnly] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.initialPullOnly] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun initialPullOnly(initialPullOnly: JsonField<Boolean>) = apply {
                        this.initialPullOnly = initialPullOnly
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Contexthub].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .repo()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Contexthub =
                        Contexthub(
                            checkRequired("repo", repo),
                            initialPullOnly,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Contexthub = apply {
                    if (validated) {
                        return@apply
                    }

                    repo()
                    initialPullOnly()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (repo.asKnown().isPresent) 1 else 0) +
                        (if (initialPullOnly.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Contexthub &&
                        repo == other.repo &&
                        initialPullOnly == other.initialPullOnly &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(repo, initialPullOnly, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Contexthub{repo=$repo, initialPullOnly=$initialPullOnly, additionalProperties=$additionalProperties}"
            }

            class Encryption
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val kmsKey: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("kms_key")
                    @ExcludeMissing
                    kmsKey: JsonField<String> = JsonMissing.of()
                ) : this(kmsKey, mutableMapOf())

                /**
                 * KMSKey is the key to encrypt uploads with. S3 mounts take a KMS key ARN in the
                 * mount's region.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun kmsKey(): String = kmsKey.getRequired("kms_key")

                /**
                 * Returns the raw JSON value of [kmsKey].
                 *
                 * Unlike [kmsKey], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("kms_key") @ExcludeMissing fun _kmsKey(): JsonField<String> = kmsKey

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Encryption].
                     *
                     * The following fields are required:
                     * ```java
                     * .kmsKey()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Encryption]. */
                class Builder internal constructor() {

                    private var kmsKey: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(encryption: Encryption) = apply {
                        kmsKey = encryption.kmsKey
                        additionalProperties = encryption.additionalProperties.toMutableMap()
                    }

                    /**
                     * KMSKey is the key to encrypt uploads with. S3 mounts take a KMS key ARN in
                     * the mount's region.
                     */
                    fun kmsKey(kmsKey: String) = kmsKey(JsonField.of(kmsKey))

                    /**
                     * Sets [Builder.kmsKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.kmsKey] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun kmsKey(kmsKey: JsonField<String>) = apply { this.kmsKey = kmsKey }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Encryption].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .kmsKey()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Encryption =
                        Encryption(
                            checkRequired("kmsKey", kmsKey),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Encryption = apply {
                    if (validated) {
                        return@apply
                    }

                    kmsKey()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int = (if (kmsKey.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Encryption &&
                        kmsKey == other.kmsKey &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(kmsKey, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Encryption{kmsKey=$kmsKey, additionalProperties=$additionalProperties}"
            }

            class Gcs
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bucket: JsonField<String>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    bucket: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(bucket, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bucket(): String = bucket.getRequired("bucket")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [bucket].
                 *
                 * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Gcs].
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Gcs]. */
                class Builder internal constructor() {

                    private var bucket: JsonField<String>? = null
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(gcs: Gcs) = apply {
                        bucket = gcs.bucket
                        prefix = gcs.prefix
                        additionalProperties = gcs.additionalProperties.toMutableMap()
                    }

                    fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                    /**
                     * Sets [Builder.bucket] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bucket] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Gcs].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Gcs =
                        Gcs(
                            checkRequired("bucket", bucket),
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Gcs = apply {
                    if (validated) {
                        return@apply
                    }

                    bucket()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (bucket.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Gcs &&
                        bucket == other.bucket &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(bucket, prefix, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Gcs{bucket=$bucket, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            class S3
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bucket: JsonField<String>,
                private val region: JsonField<String>,
                private val endpointUrl: JsonField<String>,
                private val pathStyle: JsonField<Boolean>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    bucket: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("region")
                    @ExcludeMissing
                    region: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("endpoint_url")
                    @ExcludeMissing
                    endpointUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("path_style")
                    @ExcludeMissing
                    pathStyle: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(bucket, region, endpointUrl, pathStyle, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bucket(): String = bucket.getRequired("bucket")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun region(): String = region.getRequired("region")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endpointUrl(): Optional<String> = endpointUrl.getOptional("endpoint_url")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pathStyle(): Optional<Boolean> = pathStyle.getOptional("path_style")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [bucket].
                 *
                 * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

                /**
                 * Returns the raw JSON value of [region].
                 *
                 * Unlike [region], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

                /**
                 * Returns the raw JSON value of [endpointUrl].
                 *
                 * Unlike [endpointUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("endpoint_url")
                @ExcludeMissing
                fun _endpointUrl(): JsonField<String> = endpointUrl

                /**
                 * Returns the raw JSON value of [pathStyle].
                 *
                 * Unlike [pathStyle], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("path_style")
                @ExcludeMissing
                fun _pathStyle(): JsonField<Boolean> = pathStyle

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [S3].
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * .region()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [S3]. */
                class Builder internal constructor() {

                    private var bucket: JsonField<String>? = null
                    private var region: JsonField<String>? = null
                    private var endpointUrl: JsonField<String> = JsonMissing.of()
                    private var pathStyle: JsonField<Boolean> = JsonMissing.of()
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(s3: S3) = apply {
                        bucket = s3.bucket
                        region = s3.region
                        endpointUrl = s3.endpointUrl
                        pathStyle = s3.pathStyle
                        prefix = s3.prefix
                        additionalProperties = s3.additionalProperties.toMutableMap()
                    }

                    fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                    /**
                     * Sets [Builder.bucket] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bucket] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                    fun region(region: String) = region(JsonField.of(region))

                    /**
                     * Sets [Builder.region] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.region] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun region(region: JsonField<String>) = apply { this.region = region }

                    fun endpointUrl(endpointUrl: String) = endpointUrl(JsonField.of(endpointUrl))

                    /**
                     * Sets [Builder.endpointUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endpointUrl] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun endpointUrl(endpointUrl: JsonField<String>) = apply {
                        this.endpointUrl = endpointUrl
                    }

                    fun pathStyle(pathStyle: Boolean) = pathStyle(JsonField.of(pathStyle))

                    /**
                     * Sets [Builder.pathStyle] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pathStyle] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pathStyle(pathStyle: JsonField<Boolean>) = apply {
                        this.pathStyle = pathStyle
                    }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [S3].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * .region()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): S3 =
                        S3(
                            checkRequired("bucket", bucket),
                            checkRequired("region", region),
                            endpointUrl,
                            pathStyle,
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): S3 = apply {
                    if (validated) {
                        return@apply
                    }

                    bucket()
                    region()
                    endpointUrl()
                    pathStyle()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (bucket.asKnown().isPresent) 1 else 0) +
                        (if (region.asKnown().isPresent) 1 else 0) +
                        (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                        (if (pathStyle.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is S3 &&
                        bucket == other.bucket &&
                        region == other.region &&
                        endpointUrl == other.endpointUrl &&
                        pathStyle == other.pathStyle &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        bucket,
                        region,
                        endpointUrl,
                        pathStyle,
                        prefix,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "S3{bucket=$bucket, region=$region, endpointUrl=$endpointUrl, pathStyle=$pathStyle, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SandboxapiGitRepoMountSpec &&
                    id == other.id &&
                    git == other.git &&
                    mountPath == other.mountPath &&
                    type == other.type &&
                    azureBlob == other.azureBlob &&
                    cache == other.cache &&
                    contexthub == other.contexthub &&
                    encryption == other.encryption &&
                    gcs == other.gcs &&
                    readOnly == other.readOnly &&
                    s3 == other.s3 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    git,
                    mountPath,
                    type,
                    azureBlob,
                    cache,
                    contexthub,
                    encryption,
                    gcs,
                    readOnly,
                    s3,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SandboxapiGitRepoMountSpec{id=$id, git=$git, mountPath=$mountPath, type=$type, azureBlob=$azureBlob, cache=$cache, contexthub=$contexthub, encryption=$encryption, gcs=$gcs, readOnly=$readOnly, s3=$s3, additionalProperties=$additionalProperties}"
        }

        class SandboxapiContextHubRepoMountSpec
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val contexthub: JsonField<Contexthub>,
            private val mountPath: JsonField<String>,
            private val type: JsonField<Type>,
            private val azureBlob: JsonField<AzureBlob>,
            private val cache: JsonField<Cache>,
            private val encryption: JsonField<Encryption>,
            private val gcs: JsonField<Gcs>,
            private val git: JsonField<Git>,
            private val readOnly: JsonField<Boolean>,
            private val s3: JsonField<S3>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("contexthub")
                @ExcludeMissing
                contexthub: JsonField<Contexthub> = JsonMissing.of(),
                @JsonProperty("mount_path")
                @ExcludeMissing
                mountPath: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("azure_blob")
                @ExcludeMissing
                azureBlob: JsonField<AzureBlob> = JsonMissing.of(),
                @JsonProperty("cache") @ExcludeMissing cache: JsonField<Cache> = JsonMissing.of(),
                @JsonProperty("encryption")
                @ExcludeMissing
                encryption: JsonField<Encryption> = JsonMissing.of(),
                @JsonProperty("gcs") @ExcludeMissing gcs: JsonField<Gcs> = JsonMissing.of(),
                @JsonProperty("git") @ExcludeMissing git: JsonField<Git> = JsonMissing.of(),
                @JsonProperty("read_only")
                @ExcludeMissing
                readOnly: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("s3") @ExcludeMissing s3: JsonField<S3> = JsonMissing.of(),
            ) : this(
                id,
                contexthub,
                mountPath,
                type,
                azureBlob,
                cache,
                encryption,
                gcs,
                git,
                readOnly,
                s3,
                mutableMapOf(),
            )

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun contexthub(): Contexthub = contexthub.getRequired("contexthub")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mountPath(): String = mountPath.getRequired("mount_path")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun azureBlob(): Optional<AzureBlob> = azureBlob.getOptional("azure_blob")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun cache(): Optional<Cache> = cache.getOptional("cache")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun encryption(): Optional<Encryption> = encryption.getOptional("encryption")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun gcs(): Optional<Gcs> = gcs.getOptional("gcs")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun git(): Optional<Git> = git.getOptional("git")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun s3(): Optional<S3> = s3.getOptional("s3")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [contexthub].
             *
             * Unlike [contexthub], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contexthub")
            @ExcludeMissing
            fun _contexthub(): JsonField<Contexthub> = contexthub

            /**
             * Returns the raw JSON value of [mountPath].
             *
             * Unlike [mountPath], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("mount_path")
            @ExcludeMissing
            fun _mountPath(): JsonField<String> = mountPath

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [azureBlob].
             *
             * Unlike [azureBlob], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("azure_blob")
            @ExcludeMissing
            fun _azureBlob(): JsonField<AzureBlob> = azureBlob

            /**
             * Returns the raw JSON value of [cache].
             *
             * Unlike [cache], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cache") @ExcludeMissing fun _cache(): JsonField<Cache> = cache

            /**
             * Returns the raw JSON value of [encryption].
             *
             * Unlike [encryption], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("encryption")
            @ExcludeMissing
            fun _encryption(): JsonField<Encryption> = encryption

            /**
             * Returns the raw JSON value of [gcs].
             *
             * Unlike [gcs], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gcs") @ExcludeMissing fun _gcs(): JsonField<Gcs> = gcs

            /**
             * Returns the raw JSON value of [git].
             *
             * Unlike [git], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("git") @ExcludeMissing fun _git(): JsonField<Git> = git

            /**
             * Returns the raw JSON value of [readOnly].
             *
             * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("read_only")
            @ExcludeMissing
            fun _readOnly(): JsonField<Boolean> = readOnly

            /**
             * Returns the raw JSON value of [s3].
             *
             * Unlike [s3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("s3") @ExcludeMissing fun _s3(): JsonField<S3> = s3

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [SandboxapiContextHubRepoMountSpec].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .contexthub()
                 * .mountPath()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SandboxapiContextHubRepoMountSpec]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var contexthub: JsonField<Contexthub>? = null
                private var mountPath: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var azureBlob: JsonField<AzureBlob> = JsonMissing.of()
                private var cache: JsonField<Cache> = JsonMissing.of()
                private var encryption: JsonField<Encryption> = JsonMissing.of()
                private var gcs: JsonField<Gcs> = JsonMissing.of()
                private var git: JsonField<Git> = JsonMissing.of()
                private var readOnly: JsonField<Boolean> = JsonMissing.of()
                private var s3: JsonField<S3> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    sandboxapiContextHubRepoMountSpec: SandboxapiContextHubRepoMountSpec
                ) = apply {
                    id = sandboxapiContextHubRepoMountSpec.id
                    contexthub = sandboxapiContextHubRepoMountSpec.contexthub
                    mountPath = sandboxapiContextHubRepoMountSpec.mountPath
                    type = sandboxapiContextHubRepoMountSpec.type
                    azureBlob = sandboxapiContextHubRepoMountSpec.azureBlob
                    cache = sandboxapiContextHubRepoMountSpec.cache
                    encryption = sandboxapiContextHubRepoMountSpec.encryption
                    gcs = sandboxapiContextHubRepoMountSpec.gcs
                    git = sandboxapiContextHubRepoMountSpec.git
                    readOnly = sandboxapiContextHubRepoMountSpec.readOnly
                    s3 = sandboxapiContextHubRepoMountSpec.s3
                    additionalProperties =
                        sandboxapiContextHubRepoMountSpec.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun contexthub(contexthub: Contexthub) = contexthub(JsonField.of(contexthub))

                /**
                 * Sets [Builder.contexthub] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contexthub] with a well-typed [Contexthub] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contexthub(contexthub: JsonField<Contexthub>) = apply {
                    this.contexthub = contexthub
                }

                fun mountPath(mountPath: String) = mountPath(JsonField.of(mountPath))

                /**
                 * Sets [Builder.mountPath] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mountPath] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun mountPath(mountPath: JsonField<String>) = apply { this.mountPath = mountPath }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun azureBlob(azureBlob: AzureBlob) = azureBlob(JsonField.of(azureBlob))

                /**
                 * Sets [Builder.azureBlob] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.azureBlob] with a well-typed [AzureBlob] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun azureBlob(azureBlob: JsonField<AzureBlob>) = apply {
                    this.azureBlob = azureBlob
                }

                fun cache(cache: Cache) = cache(JsonField.of(cache))

                /**
                 * Sets [Builder.cache] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cache] with a well-typed [Cache] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cache(cache: JsonField<Cache>) = apply { this.cache = cache }

                fun encryption(encryption: Encryption) = encryption(JsonField.of(encryption))

                /**
                 * Sets [Builder.encryption] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.encryption] with a well-typed [Encryption] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun encryption(encryption: JsonField<Encryption>) = apply {
                    this.encryption = encryption
                }

                fun gcs(gcs: Gcs) = gcs(JsonField.of(gcs))

                /**
                 * Sets [Builder.gcs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gcs] with a well-typed [Gcs] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun gcs(gcs: JsonField<Gcs>) = apply { this.gcs = gcs }

                fun git(git: Git) = git(JsonField.of(git))

                /**
                 * Sets [Builder.git] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.git] with a well-typed [Git] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun git(git: JsonField<Git>) = apply { this.git = git }

                fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

                /**
                 * Sets [Builder.readOnly] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.readOnly] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

                fun s3(s3: S3) = s3(JsonField.of(s3))

                /**
                 * Sets [Builder.s3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.s3] with a well-typed [S3] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun s3(s3: JsonField<S3>) = apply { this.s3 = s3 }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SandboxapiContextHubRepoMountSpec].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .contexthub()
                 * .mountPath()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SandboxapiContextHubRepoMountSpec =
                    SandboxapiContextHubRepoMountSpec(
                        checkRequired("id", id),
                        checkRequired("contexthub", contexthub),
                        checkRequired("mountPath", mountPath),
                        checkRequired("type", type),
                        azureBlob,
                        cache,
                        encryption,
                        gcs,
                        git,
                        readOnly,
                        s3,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SandboxapiContextHubRepoMountSpec = apply {
                if (validated) {
                    return@apply
                }

                id()
                contexthub().validate()
                mountPath()
                type().validate()
                azureBlob().ifPresent { it.validate() }
                cache().ifPresent { it.validate() }
                encryption().ifPresent { it.validate() }
                gcs().ifPresent { it.validate() }
                git().ifPresent { it.validate() }
                readOnly()
                s3().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (contexthub.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (mountPath.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (azureBlob.asKnown().getOrNull()?.validity() ?: 0) +
                    (cache.asKnown().getOrNull()?.validity() ?: 0) +
                    (encryption.asKnown().getOrNull()?.validity() ?: 0) +
                    (gcs.asKnown().getOrNull()?.validity() ?: 0) +
                    (git.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (readOnly.asKnown().isPresent) 1 else 0) +
                    (s3.asKnown().getOrNull()?.validity() ?: 0)

            class Contexthub
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val repo: JsonField<String>,
                private val initialPullOnly: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("repo")
                    @ExcludeMissing
                    repo: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("initial_pull_only")
                    @ExcludeMissing
                    initialPullOnly: JsonField<Boolean> = JsonMissing.of(),
                ) : this(repo, initialPullOnly, mutableMapOf())

                /**
                 * Repo is the Context Hub repository to sync, as "owner/repo" (e.g. "-/my-agent",
                 * where "-" is the current workspace). The repo's latest commit tree is mirrored
                 * into the mount path.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun repo(): String = repo.getRequired("repo")

                /**
                 * InitialPullOnly syncs the repo once at startup instead of polling for updates for
                 * the sandbox's lifetime.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun initialPullOnly(): Optional<Boolean> =
                    initialPullOnly.getOptional("initial_pull_only")

                /**
                 * Returns the raw JSON value of [repo].
                 *
                 * Unlike [repo], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("repo") @ExcludeMissing fun _repo(): JsonField<String> = repo

                /**
                 * Returns the raw JSON value of [initialPullOnly].
                 *
                 * Unlike [initialPullOnly], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("initial_pull_only")
                @ExcludeMissing
                fun _initialPullOnly(): JsonField<Boolean> = initialPullOnly

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Contexthub].
                     *
                     * The following fields are required:
                     * ```java
                     * .repo()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Contexthub]. */
                class Builder internal constructor() {

                    private var repo: JsonField<String>? = null
                    private var initialPullOnly: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(contexthub: Contexthub) = apply {
                        repo = contexthub.repo
                        initialPullOnly = contexthub.initialPullOnly
                        additionalProperties = contexthub.additionalProperties.toMutableMap()
                    }

                    /**
                     * Repo is the Context Hub repository to sync, as "owner/repo" (e.g.
                     * "-/my-agent", where "-" is the current workspace). The repo's latest commit
                     * tree is mirrored into the mount path.
                     */
                    fun repo(repo: String) = repo(JsonField.of(repo))

                    /**
                     * Sets [Builder.repo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.repo] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun repo(repo: JsonField<String>) = apply { this.repo = repo }

                    /**
                     * InitialPullOnly syncs the repo once at startup instead of polling for updates
                     * for the sandbox's lifetime.
                     */
                    fun initialPullOnly(initialPullOnly: Boolean) =
                        initialPullOnly(JsonField.of(initialPullOnly))

                    /**
                     * Sets [Builder.initialPullOnly] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.initialPullOnly] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun initialPullOnly(initialPullOnly: JsonField<Boolean>) = apply {
                        this.initialPullOnly = initialPullOnly
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Contexthub].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .repo()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Contexthub =
                        Contexthub(
                            checkRequired("repo", repo),
                            initialPullOnly,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Contexthub = apply {
                    if (validated) {
                        return@apply
                    }

                    repo()
                    initialPullOnly()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (repo.asKnown().isPresent) 1 else 0) +
                        (if (initialPullOnly.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Contexthub &&
                        repo == other.repo &&
                        initialPullOnly == other.initialPullOnly &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(repo, initialPullOnly, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Contexthub{repo=$repo, initialPullOnly=$initialPullOnly, additionalProperties=$additionalProperties}"
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val S3 = of("s3")

                    @JvmField val GCS = of("gcs")

                    @JvmField val AZURE_BLOB = of("azure_blob")

                    @JvmField val GIT = of("git")

                    @JvmField val CONTEXTHUB = of("contexthub")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    S3,
                    GCS,
                    AZURE_BLOB,
                    GIT,
                    CONTEXTHUB,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    S3,
                    GCS,
                    AZURE_BLOB,
                    GIT,
                    CONTEXTHUB,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        S3 -> Value.S3
                        GCS -> Value.GCS
                        AZURE_BLOB -> Value.AZURE_BLOB
                        GIT -> Value.GIT
                        CONTEXTHUB -> Value.CONTEXTHUB
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        S3 -> Known.S3
                        GCS -> Known.GCS
                        AZURE_BLOB -> Known.AZURE_BLOB
                        GIT -> Known.GIT
                        CONTEXTHUB -> Known.CONTEXTHUB
                        else -> throw LangChainInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangChainInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class AzureBlob
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val container: JsonField<String>,
                private val storageAccount: JsonField<String>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("container")
                    @ExcludeMissing
                    container: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("storage_account")
                    @ExcludeMissing
                    storageAccount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(container, storageAccount, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun container(): String = container.getRequired("container")

                /**
                 * StorageAccount is the storage account name: 3 to 24 lowercase letters and digits.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun storageAccount(): String = storageAccount.getRequired("storage_account")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [container].
                 *
                 * Unlike [container], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("container")
                @ExcludeMissing
                fun _container(): JsonField<String> = container

                /**
                 * Returns the raw JSON value of [storageAccount].
                 *
                 * Unlike [storageAccount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("storage_account")
                @ExcludeMissing
                fun _storageAccount(): JsonField<String> = storageAccount

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [AzureBlob].
                     *
                     * The following fields are required:
                     * ```java
                     * .container()
                     * .storageAccount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AzureBlob]. */
                class Builder internal constructor() {

                    private var container: JsonField<String>? = null
                    private var storageAccount: JsonField<String>? = null
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(azureBlob: AzureBlob) = apply {
                        container = azureBlob.container
                        storageAccount = azureBlob.storageAccount
                        prefix = azureBlob.prefix
                        additionalProperties = azureBlob.additionalProperties.toMutableMap()
                    }

                    fun container(container: String) = container(JsonField.of(container))

                    /**
                     * Sets [Builder.container] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.container] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun container(container: JsonField<String>) = apply {
                        this.container = container
                    }

                    /**
                     * StorageAccount is the storage account name: 3 to 24 lowercase letters and
                     * digits.
                     */
                    fun storageAccount(storageAccount: String) =
                        storageAccount(JsonField.of(storageAccount))

                    /**
                     * Sets [Builder.storageAccount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.storageAccount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun storageAccount(storageAccount: JsonField<String>) = apply {
                        this.storageAccount = storageAccount
                    }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AzureBlob].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .container()
                     * .storageAccount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AzureBlob =
                        AzureBlob(
                            checkRequired("container", container),
                            checkRequired("storageAccount", storageAccount),
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): AzureBlob = apply {
                    if (validated) {
                        return@apply
                    }

                    container()
                    storageAccount()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (container.asKnown().isPresent) 1 else 0) +
                        (if (storageAccount.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AzureBlob &&
                        container == other.container &&
                        storageAccount == other.storageAccount &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(container, storageAccount, prefix, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AzureBlob{container=$container, storageAccount=$storageAccount, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            class Cache
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val maxSizeBytes: JsonField<Long>,
                private val writebackSeconds: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("max_size_bytes")
                    @ExcludeMissing
                    maxSizeBytes: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("writeback_seconds")
                    @ExcludeMissing
                    writebackSeconds: JsonField<Long> = JsonMissing.of(),
                ) : this(maxSizeBytes, writebackSeconds, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun maxSizeBytes(): Optional<Long> = maxSizeBytes.getOptional("max_size_bytes")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun writebackSeconds(): Optional<Long> =
                    writebackSeconds.getOptional("writeback_seconds")

                /**
                 * Returns the raw JSON value of [maxSizeBytes].
                 *
                 * Unlike [maxSizeBytes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("max_size_bytes")
                @ExcludeMissing
                fun _maxSizeBytes(): JsonField<Long> = maxSizeBytes

                /**
                 * Returns the raw JSON value of [writebackSeconds].
                 *
                 * Unlike [writebackSeconds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("writeback_seconds")
                @ExcludeMissing
                fun _writebackSeconds(): JsonField<Long> = writebackSeconds

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Cache]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Cache]. */
                class Builder internal constructor() {

                    private var maxSizeBytes: JsonField<Long> = JsonMissing.of()
                    private var writebackSeconds: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cache: Cache) = apply {
                        maxSizeBytes = cache.maxSizeBytes
                        writebackSeconds = cache.writebackSeconds
                        additionalProperties = cache.additionalProperties.toMutableMap()
                    }

                    fun maxSizeBytes(maxSizeBytes: Long) = maxSizeBytes(JsonField.of(maxSizeBytes))

                    /**
                     * Sets [Builder.maxSizeBytes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxSizeBytes] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maxSizeBytes(maxSizeBytes: JsonField<Long>) = apply {
                        this.maxSizeBytes = maxSizeBytes
                    }

                    fun writebackSeconds(writebackSeconds: Long) =
                        writebackSeconds(JsonField.of(writebackSeconds))

                    /**
                     * Sets [Builder.writebackSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.writebackSeconds] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun writebackSeconds(writebackSeconds: JsonField<Long>) = apply {
                        this.writebackSeconds = writebackSeconds
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Cache].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Cache =
                        Cache(maxSizeBytes, writebackSeconds, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Cache = apply {
                    if (validated) {
                        return@apply
                    }

                    maxSizeBytes()
                    writebackSeconds()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (maxSizeBytes.asKnown().isPresent) 1 else 0) +
                        (if (writebackSeconds.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cache &&
                        maxSizeBytes == other.maxSizeBytes &&
                        writebackSeconds == other.writebackSeconds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(maxSizeBytes, writebackSeconds, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Cache{maxSizeBytes=$maxSizeBytes, writebackSeconds=$writebackSeconds, additionalProperties=$additionalProperties}"
            }

            class Encryption
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val kmsKey: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("kms_key")
                    @ExcludeMissing
                    kmsKey: JsonField<String> = JsonMissing.of()
                ) : this(kmsKey, mutableMapOf())

                /**
                 * KMSKey is the key to encrypt uploads with. S3 mounts take a KMS key ARN in the
                 * mount's region.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun kmsKey(): String = kmsKey.getRequired("kms_key")

                /**
                 * Returns the raw JSON value of [kmsKey].
                 *
                 * Unlike [kmsKey], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("kms_key") @ExcludeMissing fun _kmsKey(): JsonField<String> = kmsKey

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Encryption].
                     *
                     * The following fields are required:
                     * ```java
                     * .kmsKey()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Encryption]. */
                class Builder internal constructor() {

                    private var kmsKey: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(encryption: Encryption) = apply {
                        kmsKey = encryption.kmsKey
                        additionalProperties = encryption.additionalProperties.toMutableMap()
                    }

                    /**
                     * KMSKey is the key to encrypt uploads with. S3 mounts take a KMS key ARN in
                     * the mount's region.
                     */
                    fun kmsKey(kmsKey: String) = kmsKey(JsonField.of(kmsKey))

                    /**
                     * Sets [Builder.kmsKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.kmsKey] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun kmsKey(kmsKey: JsonField<String>) = apply { this.kmsKey = kmsKey }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Encryption].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .kmsKey()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Encryption =
                        Encryption(
                            checkRequired("kmsKey", kmsKey),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Encryption = apply {
                    if (validated) {
                        return@apply
                    }

                    kmsKey()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int = (if (kmsKey.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Encryption &&
                        kmsKey == other.kmsKey &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(kmsKey, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Encryption{kmsKey=$kmsKey, additionalProperties=$additionalProperties}"
            }

            class Gcs
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bucket: JsonField<String>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    bucket: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(bucket, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bucket(): String = bucket.getRequired("bucket")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [bucket].
                 *
                 * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Gcs].
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Gcs]. */
                class Builder internal constructor() {

                    private var bucket: JsonField<String>? = null
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(gcs: Gcs) = apply {
                        bucket = gcs.bucket
                        prefix = gcs.prefix
                        additionalProperties = gcs.additionalProperties.toMutableMap()
                    }

                    fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                    /**
                     * Sets [Builder.bucket] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bucket] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Gcs].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Gcs =
                        Gcs(
                            checkRequired("bucket", bucket),
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Gcs = apply {
                    if (validated) {
                        return@apply
                    }

                    bucket()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (bucket.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Gcs &&
                        bucket == other.bucket &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(bucket, prefix, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Gcs{bucket=$bucket, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            class Git
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val remoteUrl: JsonField<String>,
                private val ref: JsonField<Ref>,
                private val refreshIntervalSeconds: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("remote_url")
                    @ExcludeMissing
                    remoteUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<Ref> = JsonMissing.of(),
                    @JsonProperty("refresh_interval_seconds")
                    @ExcludeMissing
                    refreshIntervalSeconds: JsonField<Long> = JsonMissing.of(),
                ) : this(remoteUrl, ref, refreshIntervalSeconds, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun remoteUrl(): String = remoteUrl.getRequired("remote_url")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<Ref> = ref.getOptional("ref")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun refreshIntervalSeconds(): Optional<Long> =
                    refreshIntervalSeconds.getOptional("refresh_interval_seconds")

                /**
                 * Returns the raw JSON value of [remoteUrl].
                 *
                 * Unlike [remoteUrl], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("remote_url")
                @ExcludeMissing
                fun _remoteUrl(): JsonField<String> = remoteUrl

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<Ref> = ref

                /**
                 * Returns the raw JSON value of [refreshIntervalSeconds].
                 *
                 * Unlike [refreshIntervalSeconds], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("refresh_interval_seconds")
                @ExcludeMissing
                fun _refreshIntervalSeconds(): JsonField<Long> = refreshIntervalSeconds

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Git].
                     *
                     * The following fields are required:
                     * ```java
                     * .remoteUrl()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Git]. */
                class Builder internal constructor() {

                    private var remoteUrl: JsonField<String>? = null
                    private var ref: JsonField<Ref> = JsonMissing.of()
                    private var refreshIntervalSeconds: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(git: Git) = apply {
                        remoteUrl = git.remoteUrl
                        ref = git.ref
                        refreshIntervalSeconds = git.refreshIntervalSeconds
                        additionalProperties = git.additionalProperties.toMutableMap()
                    }

                    fun remoteUrl(remoteUrl: String) = remoteUrl(JsonField.of(remoteUrl))

                    /**
                     * Sets [Builder.remoteUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.remoteUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun remoteUrl(remoteUrl: JsonField<String>) = apply {
                        this.remoteUrl = remoteUrl
                    }

                    fun ref(ref: Ref) = ref(JsonField.of(ref))

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [Ref] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun ref(ref: JsonField<Ref>) = apply { this.ref = ref }

                    fun refreshIntervalSeconds(refreshIntervalSeconds: Long) =
                        refreshIntervalSeconds(JsonField.of(refreshIntervalSeconds))

                    /**
                     * Sets [Builder.refreshIntervalSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.refreshIntervalSeconds] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun refreshIntervalSeconds(refreshIntervalSeconds: JsonField<Long>) = apply {
                        this.refreshIntervalSeconds = refreshIntervalSeconds
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Git].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .remoteUrl()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Git =
                        Git(
                            checkRequired("remoteUrl", remoteUrl),
                            ref,
                            refreshIntervalSeconds,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Git = apply {
                    if (validated) {
                        return@apply
                    }

                    remoteUrl()
                    ref().ifPresent { it.validate() }
                    refreshIntervalSeconds()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (remoteUrl.asKnown().isPresent) 1 else 0) +
                        (ref.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (refreshIntervalSeconds.asKnown().isPresent) 1 else 0)

                class Ref
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val name: JsonField<String>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(name, type, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Ref].
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Ref]. */
                    class Builder internal constructor() {

                        private var name: JsonField<String>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ref: Ref) = apply {
                            name = ref.name
                            type = ref.type
                            additionalProperties = ref.additionalProperties.toMutableMap()
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Ref].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Ref =
                            Ref(
                                checkRequired("name", name),
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Ref = apply {
                        if (validated) {
                            return@apply
                        }

                        name()
                        type().validate()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (name.asKnown().isPresent) 1 else 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val BRANCH = of("branch")

                            @JvmField val TAG = of("tag")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            BRANCH,
                            TAG,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            BRANCH,
                            TAG,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                BRANCH -> Value.BRANCH
                                TAG -> Value.TAG
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                BRANCH -> Known.BRANCH
                                TAG -> Known.TAG
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LangChainInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Ref &&
                            name == other.name &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(name, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Ref{name=$name, type=$type, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Git &&
                        remoteUrl == other.remoteUrl &&
                        ref == other.ref &&
                        refreshIntervalSeconds == other.refreshIntervalSeconds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(remoteUrl, ref, refreshIntervalSeconds, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Git{remoteUrl=$remoteUrl, ref=$ref, refreshIntervalSeconds=$refreshIntervalSeconds, additionalProperties=$additionalProperties}"
            }

            class S3
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bucket: JsonField<String>,
                private val region: JsonField<String>,
                private val endpointUrl: JsonField<String>,
                private val pathStyle: JsonField<Boolean>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    bucket: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("region")
                    @ExcludeMissing
                    region: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("endpoint_url")
                    @ExcludeMissing
                    endpointUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("path_style")
                    @ExcludeMissing
                    pathStyle: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(bucket, region, endpointUrl, pathStyle, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bucket(): String = bucket.getRequired("bucket")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun region(): String = region.getRequired("region")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endpointUrl(): Optional<String> = endpointUrl.getOptional("endpoint_url")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pathStyle(): Optional<Boolean> = pathStyle.getOptional("path_style")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [bucket].
                 *
                 * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

                /**
                 * Returns the raw JSON value of [region].
                 *
                 * Unlike [region], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

                /**
                 * Returns the raw JSON value of [endpointUrl].
                 *
                 * Unlike [endpointUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("endpoint_url")
                @ExcludeMissing
                fun _endpointUrl(): JsonField<String> = endpointUrl

                /**
                 * Returns the raw JSON value of [pathStyle].
                 *
                 * Unlike [pathStyle], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("path_style")
                @ExcludeMissing
                fun _pathStyle(): JsonField<Boolean> = pathStyle

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [S3].
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * .region()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [S3]. */
                class Builder internal constructor() {

                    private var bucket: JsonField<String>? = null
                    private var region: JsonField<String>? = null
                    private var endpointUrl: JsonField<String> = JsonMissing.of()
                    private var pathStyle: JsonField<Boolean> = JsonMissing.of()
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(s3: S3) = apply {
                        bucket = s3.bucket
                        region = s3.region
                        endpointUrl = s3.endpointUrl
                        pathStyle = s3.pathStyle
                        prefix = s3.prefix
                        additionalProperties = s3.additionalProperties.toMutableMap()
                    }

                    fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                    /**
                     * Sets [Builder.bucket] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bucket] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                    fun region(region: String) = region(JsonField.of(region))

                    /**
                     * Sets [Builder.region] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.region] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun region(region: JsonField<String>) = apply { this.region = region }

                    fun endpointUrl(endpointUrl: String) = endpointUrl(JsonField.of(endpointUrl))

                    /**
                     * Sets [Builder.endpointUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endpointUrl] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun endpointUrl(endpointUrl: JsonField<String>) = apply {
                        this.endpointUrl = endpointUrl
                    }

                    fun pathStyle(pathStyle: Boolean) = pathStyle(JsonField.of(pathStyle))

                    /**
                     * Sets [Builder.pathStyle] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pathStyle] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pathStyle(pathStyle: JsonField<Boolean>) = apply {
                        this.pathStyle = pathStyle
                    }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [S3].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * .region()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): S3 =
                        S3(
                            checkRequired("bucket", bucket),
                            checkRequired("region", region),
                            endpointUrl,
                            pathStyle,
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): S3 = apply {
                    if (validated) {
                        return@apply
                    }

                    bucket()
                    region()
                    endpointUrl()
                    pathStyle()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (bucket.asKnown().isPresent) 1 else 0) +
                        (if (region.asKnown().isPresent) 1 else 0) +
                        (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                        (if (pathStyle.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is S3 &&
                        bucket == other.bucket &&
                        region == other.region &&
                        endpointUrl == other.endpointUrl &&
                        pathStyle == other.pathStyle &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        bucket,
                        region,
                        endpointUrl,
                        pathStyle,
                        prefix,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "S3{bucket=$bucket, region=$region, endpointUrl=$endpointUrl, pathStyle=$pathStyle, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SandboxapiContextHubRepoMountSpec &&
                    id == other.id &&
                    contexthub == other.contexthub &&
                    mountPath == other.mountPath &&
                    type == other.type &&
                    azureBlob == other.azureBlob &&
                    cache == other.cache &&
                    encryption == other.encryption &&
                    gcs == other.gcs &&
                    git == other.git &&
                    readOnly == other.readOnly &&
                    s3 == other.s3 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    contexthub,
                    mountPath,
                    type,
                    azureBlob,
                    cache,
                    encryption,
                    gcs,
                    git,
                    readOnly,
                    s3,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SandboxapiContextHubRepoMountSpec{id=$id, contexthub=$contexthub, mountPath=$mountPath, type=$type, azureBlob=$azureBlob, cache=$cache, encryption=$encryption, gcs=$gcs, git=$git, readOnly=$readOnly, s3=$s3, additionalProperties=$additionalProperties}"
        }

        class SandboxapiAzureBlobContainerMountSpec
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val azureBlob: JsonField<AzureBlob>,
            private val mountPath: JsonField<String>,
            private val type: JsonField<Type>,
            private val cache: JsonField<Cache>,
            private val contexthub: JsonField<Contexthub>,
            private val encryption: JsonField<Encryption>,
            private val gcs: JsonField<Gcs>,
            private val git: JsonField<Git>,
            private val readOnly: JsonField<Boolean>,
            private val s3: JsonField<S3>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("azure_blob")
                @ExcludeMissing
                azureBlob: JsonField<AzureBlob> = JsonMissing.of(),
                @JsonProperty("mount_path")
                @ExcludeMissing
                mountPath: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("cache") @ExcludeMissing cache: JsonField<Cache> = JsonMissing.of(),
                @JsonProperty("contexthub")
                @ExcludeMissing
                contexthub: JsonField<Contexthub> = JsonMissing.of(),
                @JsonProperty("encryption")
                @ExcludeMissing
                encryption: JsonField<Encryption> = JsonMissing.of(),
                @JsonProperty("gcs") @ExcludeMissing gcs: JsonField<Gcs> = JsonMissing.of(),
                @JsonProperty("git") @ExcludeMissing git: JsonField<Git> = JsonMissing.of(),
                @JsonProperty("read_only")
                @ExcludeMissing
                readOnly: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("s3") @ExcludeMissing s3: JsonField<S3> = JsonMissing.of(),
            ) : this(
                id,
                azureBlob,
                mountPath,
                type,
                cache,
                contexthub,
                encryption,
                gcs,
                git,
                readOnly,
                s3,
                mutableMapOf(),
            )

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun azureBlob(): AzureBlob = azureBlob.getRequired("azure_blob")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mountPath(): String = mountPath.getRequired("mount_path")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun cache(): Optional<Cache> = cache.getOptional("cache")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun contexthub(): Optional<Contexthub> = contexthub.getOptional("contexthub")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun encryption(): Optional<Encryption> = encryption.getOptional("encryption")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun gcs(): Optional<Gcs> = gcs.getOptional("gcs")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun git(): Optional<Git> = git.getOptional("git")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun s3(): Optional<S3> = s3.getOptional("s3")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [azureBlob].
             *
             * Unlike [azureBlob], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("azure_blob")
            @ExcludeMissing
            fun _azureBlob(): JsonField<AzureBlob> = azureBlob

            /**
             * Returns the raw JSON value of [mountPath].
             *
             * Unlike [mountPath], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("mount_path")
            @ExcludeMissing
            fun _mountPath(): JsonField<String> = mountPath

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [cache].
             *
             * Unlike [cache], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cache") @ExcludeMissing fun _cache(): JsonField<Cache> = cache

            /**
             * Returns the raw JSON value of [contexthub].
             *
             * Unlike [contexthub], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contexthub")
            @ExcludeMissing
            fun _contexthub(): JsonField<Contexthub> = contexthub

            /**
             * Returns the raw JSON value of [encryption].
             *
             * Unlike [encryption], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("encryption")
            @ExcludeMissing
            fun _encryption(): JsonField<Encryption> = encryption

            /**
             * Returns the raw JSON value of [gcs].
             *
             * Unlike [gcs], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gcs") @ExcludeMissing fun _gcs(): JsonField<Gcs> = gcs

            /**
             * Returns the raw JSON value of [git].
             *
             * Unlike [git], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("git") @ExcludeMissing fun _git(): JsonField<Git> = git

            /**
             * Returns the raw JSON value of [readOnly].
             *
             * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("read_only")
            @ExcludeMissing
            fun _readOnly(): JsonField<Boolean> = readOnly

            /**
             * Returns the raw JSON value of [s3].
             *
             * Unlike [s3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("s3") @ExcludeMissing fun _s3(): JsonField<S3> = s3

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [SandboxapiAzureBlobContainerMountSpec].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .azureBlob()
                 * .mountPath()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SandboxapiAzureBlobContainerMountSpec]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var azureBlob: JsonField<AzureBlob>? = null
                private var mountPath: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var cache: JsonField<Cache> = JsonMissing.of()
                private var contexthub: JsonField<Contexthub> = JsonMissing.of()
                private var encryption: JsonField<Encryption> = JsonMissing.of()
                private var gcs: JsonField<Gcs> = JsonMissing.of()
                private var git: JsonField<Git> = JsonMissing.of()
                private var readOnly: JsonField<Boolean> = JsonMissing.of()
                private var s3: JsonField<S3> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    sandboxapiAzureBlobContainerMountSpec: SandboxapiAzureBlobContainerMountSpec
                ) = apply {
                    id = sandboxapiAzureBlobContainerMountSpec.id
                    azureBlob = sandboxapiAzureBlobContainerMountSpec.azureBlob
                    mountPath = sandboxapiAzureBlobContainerMountSpec.mountPath
                    type = sandboxapiAzureBlobContainerMountSpec.type
                    cache = sandboxapiAzureBlobContainerMountSpec.cache
                    contexthub = sandboxapiAzureBlobContainerMountSpec.contexthub
                    encryption = sandboxapiAzureBlobContainerMountSpec.encryption
                    gcs = sandboxapiAzureBlobContainerMountSpec.gcs
                    git = sandboxapiAzureBlobContainerMountSpec.git
                    readOnly = sandboxapiAzureBlobContainerMountSpec.readOnly
                    s3 = sandboxapiAzureBlobContainerMountSpec.s3
                    additionalProperties =
                        sandboxapiAzureBlobContainerMountSpec.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun azureBlob(azureBlob: AzureBlob) = azureBlob(JsonField.of(azureBlob))

                /**
                 * Sets [Builder.azureBlob] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.azureBlob] with a well-typed [AzureBlob] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun azureBlob(azureBlob: JsonField<AzureBlob>) = apply {
                    this.azureBlob = azureBlob
                }

                fun mountPath(mountPath: String) = mountPath(JsonField.of(mountPath))

                /**
                 * Sets [Builder.mountPath] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mountPath] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun mountPath(mountPath: JsonField<String>) = apply { this.mountPath = mountPath }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun cache(cache: Cache) = cache(JsonField.of(cache))

                /**
                 * Sets [Builder.cache] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cache] with a well-typed [Cache] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cache(cache: JsonField<Cache>) = apply { this.cache = cache }

                fun contexthub(contexthub: Contexthub) = contexthub(JsonField.of(contexthub))

                /**
                 * Sets [Builder.contexthub] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contexthub] with a well-typed [Contexthub] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contexthub(contexthub: JsonField<Contexthub>) = apply {
                    this.contexthub = contexthub
                }

                fun encryption(encryption: Encryption) = encryption(JsonField.of(encryption))

                /**
                 * Sets [Builder.encryption] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.encryption] with a well-typed [Encryption] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun encryption(encryption: JsonField<Encryption>) = apply {
                    this.encryption = encryption
                }

                fun gcs(gcs: Gcs) = gcs(JsonField.of(gcs))

                /**
                 * Sets [Builder.gcs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gcs] with a well-typed [Gcs] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun gcs(gcs: JsonField<Gcs>) = apply { this.gcs = gcs }

                fun git(git: Git) = git(JsonField.of(git))

                /**
                 * Sets [Builder.git] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.git] with a well-typed [Git] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun git(git: JsonField<Git>) = apply { this.git = git }

                fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

                /**
                 * Sets [Builder.readOnly] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.readOnly] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

                fun s3(s3: S3) = s3(JsonField.of(s3))

                /**
                 * Sets [Builder.s3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.s3] with a well-typed [S3] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun s3(s3: JsonField<S3>) = apply { this.s3 = s3 }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SandboxapiAzureBlobContainerMountSpec].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .azureBlob()
                 * .mountPath()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SandboxapiAzureBlobContainerMountSpec =
                    SandboxapiAzureBlobContainerMountSpec(
                        checkRequired("id", id),
                        checkRequired("azureBlob", azureBlob),
                        checkRequired("mountPath", mountPath),
                        checkRequired("type", type),
                        cache,
                        contexthub,
                        encryption,
                        gcs,
                        git,
                        readOnly,
                        s3,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SandboxapiAzureBlobContainerMountSpec = apply {
                if (validated) {
                    return@apply
                }

                id()
                azureBlob().validate()
                mountPath()
                type().validate()
                cache().ifPresent { it.validate() }
                contexthub().ifPresent { it.validate() }
                encryption().ifPresent { it.validate() }
                gcs().ifPresent { it.validate() }
                git().ifPresent { it.validate() }
                readOnly()
                s3().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (azureBlob.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (mountPath.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (cache.asKnown().getOrNull()?.validity() ?: 0) +
                    (contexthub.asKnown().getOrNull()?.validity() ?: 0) +
                    (encryption.asKnown().getOrNull()?.validity() ?: 0) +
                    (gcs.asKnown().getOrNull()?.validity() ?: 0) +
                    (git.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (readOnly.asKnown().isPresent) 1 else 0) +
                    (s3.asKnown().getOrNull()?.validity() ?: 0)

            class AzureBlob
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val container: JsonField<String>,
                private val storageAccount: JsonField<String>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("container")
                    @ExcludeMissing
                    container: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("storage_account")
                    @ExcludeMissing
                    storageAccount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(container, storageAccount, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun container(): String = container.getRequired("container")

                /**
                 * StorageAccount is the storage account name: 3 to 24 lowercase letters and digits.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun storageAccount(): String = storageAccount.getRequired("storage_account")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [container].
                 *
                 * Unlike [container], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("container")
                @ExcludeMissing
                fun _container(): JsonField<String> = container

                /**
                 * Returns the raw JSON value of [storageAccount].
                 *
                 * Unlike [storageAccount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("storage_account")
                @ExcludeMissing
                fun _storageAccount(): JsonField<String> = storageAccount

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [AzureBlob].
                     *
                     * The following fields are required:
                     * ```java
                     * .container()
                     * .storageAccount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AzureBlob]. */
                class Builder internal constructor() {

                    private var container: JsonField<String>? = null
                    private var storageAccount: JsonField<String>? = null
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(azureBlob: AzureBlob) = apply {
                        container = azureBlob.container
                        storageAccount = azureBlob.storageAccount
                        prefix = azureBlob.prefix
                        additionalProperties = azureBlob.additionalProperties.toMutableMap()
                    }

                    fun container(container: String) = container(JsonField.of(container))

                    /**
                     * Sets [Builder.container] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.container] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun container(container: JsonField<String>) = apply {
                        this.container = container
                    }

                    /**
                     * StorageAccount is the storage account name: 3 to 24 lowercase letters and
                     * digits.
                     */
                    fun storageAccount(storageAccount: String) =
                        storageAccount(JsonField.of(storageAccount))

                    /**
                     * Sets [Builder.storageAccount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.storageAccount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun storageAccount(storageAccount: JsonField<String>) = apply {
                        this.storageAccount = storageAccount
                    }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [AzureBlob].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .container()
                     * .storageAccount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AzureBlob =
                        AzureBlob(
                            checkRequired("container", container),
                            checkRequired("storageAccount", storageAccount),
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): AzureBlob = apply {
                    if (validated) {
                        return@apply
                    }

                    container()
                    storageAccount()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (container.asKnown().isPresent) 1 else 0) +
                        (if (storageAccount.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AzureBlob &&
                        container == other.container &&
                        storageAccount == other.storageAccount &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(container, storageAccount, prefix, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AzureBlob{container=$container, storageAccount=$storageAccount, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val S3 = of("s3")

                    @JvmField val GCS = of("gcs")

                    @JvmField val AZURE_BLOB = of("azure_blob")

                    @JvmField val GIT = of("git")

                    @JvmField val CONTEXTHUB = of("contexthub")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    S3,
                    GCS,
                    AZURE_BLOB,
                    GIT,
                    CONTEXTHUB,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    S3,
                    GCS,
                    AZURE_BLOB,
                    GIT,
                    CONTEXTHUB,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        S3 -> Value.S3
                        GCS -> Value.GCS
                        AZURE_BLOB -> Value.AZURE_BLOB
                        GIT -> Value.GIT
                        CONTEXTHUB -> Value.CONTEXTHUB
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        S3 -> Known.S3
                        GCS -> Known.GCS
                        AZURE_BLOB -> Known.AZURE_BLOB
                        GIT -> Known.GIT
                        CONTEXTHUB -> Known.CONTEXTHUB
                        else -> throw LangChainInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangChainInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Cache
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val maxSizeBytes: JsonField<Long>,
                private val writebackSeconds: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("max_size_bytes")
                    @ExcludeMissing
                    maxSizeBytes: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("writeback_seconds")
                    @ExcludeMissing
                    writebackSeconds: JsonField<Long> = JsonMissing.of(),
                ) : this(maxSizeBytes, writebackSeconds, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun maxSizeBytes(): Optional<Long> = maxSizeBytes.getOptional("max_size_bytes")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun writebackSeconds(): Optional<Long> =
                    writebackSeconds.getOptional("writeback_seconds")

                /**
                 * Returns the raw JSON value of [maxSizeBytes].
                 *
                 * Unlike [maxSizeBytes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("max_size_bytes")
                @ExcludeMissing
                fun _maxSizeBytes(): JsonField<Long> = maxSizeBytes

                /**
                 * Returns the raw JSON value of [writebackSeconds].
                 *
                 * Unlike [writebackSeconds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("writeback_seconds")
                @ExcludeMissing
                fun _writebackSeconds(): JsonField<Long> = writebackSeconds

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Cache]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Cache]. */
                class Builder internal constructor() {

                    private var maxSizeBytes: JsonField<Long> = JsonMissing.of()
                    private var writebackSeconds: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cache: Cache) = apply {
                        maxSizeBytes = cache.maxSizeBytes
                        writebackSeconds = cache.writebackSeconds
                        additionalProperties = cache.additionalProperties.toMutableMap()
                    }

                    fun maxSizeBytes(maxSizeBytes: Long) = maxSizeBytes(JsonField.of(maxSizeBytes))

                    /**
                     * Sets [Builder.maxSizeBytes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxSizeBytes] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maxSizeBytes(maxSizeBytes: JsonField<Long>) = apply {
                        this.maxSizeBytes = maxSizeBytes
                    }

                    fun writebackSeconds(writebackSeconds: Long) =
                        writebackSeconds(JsonField.of(writebackSeconds))

                    /**
                     * Sets [Builder.writebackSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.writebackSeconds] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun writebackSeconds(writebackSeconds: JsonField<Long>) = apply {
                        this.writebackSeconds = writebackSeconds
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Cache].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Cache =
                        Cache(maxSizeBytes, writebackSeconds, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Cache = apply {
                    if (validated) {
                        return@apply
                    }

                    maxSizeBytes()
                    writebackSeconds()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (maxSizeBytes.asKnown().isPresent) 1 else 0) +
                        (if (writebackSeconds.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cache &&
                        maxSizeBytes == other.maxSizeBytes &&
                        writebackSeconds == other.writebackSeconds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(maxSizeBytes, writebackSeconds, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Cache{maxSizeBytes=$maxSizeBytes, writebackSeconds=$writebackSeconds, additionalProperties=$additionalProperties}"
            }

            class Contexthub
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val repo: JsonField<String>,
                private val initialPullOnly: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("repo")
                    @ExcludeMissing
                    repo: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("initial_pull_only")
                    @ExcludeMissing
                    initialPullOnly: JsonField<Boolean> = JsonMissing.of(),
                ) : this(repo, initialPullOnly, mutableMapOf())

                /**
                 * Repo is the Context Hub repository to sync, as "owner/repo" (e.g. "-/my-agent",
                 * where "-" is the current workspace). The repo's latest commit tree is mirrored
                 * into the mount path.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun repo(): String = repo.getRequired("repo")

                /**
                 * InitialPullOnly syncs the repo once at startup instead of polling for updates for
                 * the sandbox's lifetime.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun initialPullOnly(): Optional<Boolean> =
                    initialPullOnly.getOptional("initial_pull_only")

                /**
                 * Returns the raw JSON value of [repo].
                 *
                 * Unlike [repo], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("repo") @ExcludeMissing fun _repo(): JsonField<String> = repo

                /**
                 * Returns the raw JSON value of [initialPullOnly].
                 *
                 * Unlike [initialPullOnly], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("initial_pull_only")
                @ExcludeMissing
                fun _initialPullOnly(): JsonField<Boolean> = initialPullOnly

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Contexthub].
                     *
                     * The following fields are required:
                     * ```java
                     * .repo()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Contexthub]. */
                class Builder internal constructor() {

                    private var repo: JsonField<String>? = null
                    private var initialPullOnly: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(contexthub: Contexthub) = apply {
                        repo = contexthub.repo
                        initialPullOnly = contexthub.initialPullOnly
                        additionalProperties = contexthub.additionalProperties.toMutableMap()
                    }

                    /**
                     * Repo is the Context Hub repository to sync, as "owner/repo" (e.g.
                     * "-/my-agent", where "-" is the current workspace). The repo's latest commit
                     * tree is mirrored into the mount path.
                     */
                    fun repo(repo: String) = repo(JsonField.of(repo))

                    /**
                     * Sets [Builder.repo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.repo] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun repo(repo: JsonField<String>) = apply { this.repo = repo }

                    /**
                     * InitialPullOnly syncs the repo once at startup instead of polling for updates
                     * for the sandbox's lifetime.
                     */
                    fun initialPullOnly(initialPullOnly: Boolean) =
                        initialPullOnly(JsonField.of(initialPullOnly))

                    /**
                     * Sets [Builder.initialPullOnly] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.initialPullOnly] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun initialPullOnly(initialPullOnly: JsonField<Boolean>) = apply {
                        this.initialPullOnly = initialPullOnly
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Contexthub].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .repo()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Contexthub =
                        Contexthub(
                            checkRequired("repo", repo),
                            initialPullOnly,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Contexthub = apply {
                    if (validated) {
                        return@apply
                    }

                    repo()
                    initialPullOnly()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (repo.asKnown().isPresent) 1 else 0) +
                        (if (initialPullOnly.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Contexthub &&
                        repo == other.repo &&
                        initialPullOnly == other.initialPullOnly &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(repo, initialPullOnly, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Contexthub{repo=$repo, initialPullOnly=$initialPullOnly, additionalProperties=$additionalProperties}"
            }

            class Encryption
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val kmsKey: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("kms_key")
                    @ExcludeMissing
                    kmsKey: JsonField<String> = JsonMissing.of()
                ) : this(kmsKey, mutableMapOf())

                /**
                 * KMSKey is the key to encrypt uploads with. S3 mounts take a KMS key ARN in the
                 * mount's region.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun kmsKey(): String = kmsKey.getRequired("kms_key")

                /**
                 * Returns the raw JSON value of [kmsKey].
                 *
                 * Unlike [kmsKey], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("kms_key") @ExcludeMissing fun _kmsKey(): JsonField<String> = kmsKey

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Encryption].
                     *
                     * The following fields are required:
                     * ```java
                     * .kmsKey()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Encryption]. */
                class Builder internal constructor() {

                    private var kmsKey: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(encryption: Encryption) = apply {
                        kmsKey = encryption.kmsKey
                        additionalProperties = encryption.additionalProperties.toMutableMap()
                    }

                    /**
                     * KMSKey is the key to encrypt uploads with. S3 mounts take a KMS key ARN in
                     * the mount's region.
                     */
                    fun kmsKey(kmsKey: String) = kmsKey(JsonField.of(kmsKey))

                    /**
                     * Sets [Builder.kmsKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.kmsKey] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun kmsKey(kmsKey: JsonField<String>) = apply { this.kmsKey = kmsKey }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Encryption].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .kmsKey()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Encryption =
                        Encryption(
                            checkRequired("kmsKey", kmsKey),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Encryption = apply {
                    if (validated) {
                        return@apply
                    }

                    kmsKey()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int = (if (kmsKey.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Encryption &&
                        kmsKey == other.kmsKey &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(kmsKey, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Encryption{kmsKey=$kmsKey, additionalProperties=$additionalProperties}"
            }

            class Gcs
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bucket: JsonField<String>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    bucket: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(bucket, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bucket(): String = bucket.getRequired("bucket")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [bucket].
                 *
                 * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Gcs].
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Gcs]. */
                class Builder internal constructor() {

                    private var bucket: JsonField<String>? = null
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(gcs: Gcs) = apply {
                        bucket = gcs.bucket
                        prefix = gcs.prefix
                        additionalProperties = gcs.additionalProperties.toMutableMap()
                    }

                    fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                    /**
                     * Sets [Builder.bucket] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bucket] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Gcs].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Gcs =
                        Gcs(
                            checkRequired("bucket", bucket),
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Gcs = apply {
                    if (validated) {
                        return@apply
                    }

                    bucket()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (bucket.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Gcs &&
                        bucket == other.bucket &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(bucket, prefix, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Gcs{bucket=$bucket, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            class Git
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val remoteUrl: JsonField<String>,
                private val ref: JsonField<Ref>,
                private val refreshIntervalSeconds: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("remote_url")
                    @ExcludeMissing
                    remoteUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ref") @ExcludeMissing ref: JsonField<Ref> = JsonMissing.of(),
                    @JsonProperty("refresh_interval_seconds")
                    @ExcludeMissing
                    refreshIntervalSeconds: JsonField<Long> = JsonMissing.of(),
                ) : this(remoteUrl, ref, refreshIntervalSeconds, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun remoteUrl(): String = remoteUrl.getRequired("remote_url")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ref(): Optional<Ref> = ref.getOptional("ref")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun refreshIntervalSeconds(): Optional<Long> =
                    refreshIntervalSeconds.getOptional("refresh_interval_seconds")

                /**
                 * Returns the raw JSON value of [remoteUrl].
                 *
                 * Unlike [remoteUrl], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("remote_url")
                @ExcludeMissing
                fun _remoteUrl(): JsonField<String> = remoteUrl

                /**
                 * Returns the raw JSON value of [ref].
                 *
                 * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<Ref> = ref

                /**
                 * Returns the raw JSON value of [refreshIntervalSeconds].
                 *
                 * Unlike [refreshIntervalSeconds], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("refresh_interval_seconds")
                @ExcludeMissing
                fun _refreshIntervalSeconds(): JsonField<Long> = refreshIntervalSeconds

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Git].
                     *
                     * The following fields are required:
                     * ```java
                     * .remoteUrl()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Git]. */
                class Builder internal constructor() {

                    private var remoteUrl: JsonField<String>? = null
                    private var ref: JsonField<Ref> = JsonMissing.of()
                    private var refreshIntervalSeconds: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(git: Git) = apply {
                        remoteUrl = git.remoteUrl
                        ref = git.ref
                        refreshIntervalSeconds = git.refreshIntervalSeconds
                        additionalProperties = git.additionalProperties.toMutableMap()
                    }

                    fun remoteUrl(remoteUrl: String) = remoteUrl(JsonField.of(remoteUrl))

                    /**
                     * Sets [Builder.remoteUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.remoteUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun remoteUrl(remoteUrl: JsonField<String>) = apply {
                        this.remoteUrl = remoteUrl
                    }

                    fun ref(ref: Ref) = ref(JsonField.of(ref))

                    /**
                     * Sets [Builder.ref] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ref] with a well-typed [Ref] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun ref(ref: JsonField<Ref>) = apply { this.ref = ref }

                    fun refreshIntervalSeconds(refreshIntervalSeconds: Long) =
                        refreshIntervalSeconds(JsonField.of(refreshIntervalSeconds))

                    /**
                     * Sets [Builder.refreshIntervalSeconds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.refreshIntervalSeconds] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun refreshIntervalSeconds(refreshIntervalSeconds: JsonField<Long>) = apply {
                        this.refreshIntervalSeconds = refreshIntervalSeconds
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Git].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .remoteUrl()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Git =
                        Git(
                            checkRequired("remoteUrl", remoteUrl),
                            ref,
                            refreshIntervalSeconds,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Git = apply {
                    if (validated) {
                        return@apply
                    }

                    remoteUrl()
                    ref().ifPresent { it.validate() }
                    refreshIntervalSeconds()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (remoteUrl.asKnown().isPresent) 1 else 0) +
                        (ref.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (refreshIntervalSeconds.asKnown().isPresent) 1 else 0)

                class Ref
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val name: JsonField<String>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(name, type, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Ref].
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Ref]. */
                    class Builder internal constructor() {

                        private var name: JsonField<String>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ref: Ref) = apply {
                            name = ref.name
                            type = ref.type
                            additionalProperties = ref.additionalProperties.toMutableMap()
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Ref].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Ref =
                            Ref(
                                checkRequired("name", name),
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Ref = apply {
                        if (validated) {
                            return@apply
                        }

                        name()
                        type().validate()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (name.asKnown().isPresent) 1 else 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val BRANCH = of("branch")

                            @JvmField val TAG = of("tag")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            BRANCH,
                            TAG,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            BRANCH,
                            TAG,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                BRANCH -> Value.BRANCH
                                TAG -> Value.TAG
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                BRANCH -> Known.BRANCH
                                TAG -> Known.TAG
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: LangChainInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Ref &&
                            name == other.name &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(name, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Ref{name=$name, type=$type, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Git &&
                        remoteUrl == other.remoteUrl &&
                        ref == other.ref &&
                        refreshIntervalSeconds == other.refreshIntervalSeconds &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(remoteUrl, ref, refreshIntervalSeconds, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Git{remoteUrl=$remoteUrl, ref=$ref, refreshIntervalSeconds=$refreshIntervalSeconds, additionalProperties=$additionalProperties}"
            }

            class S3
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bucket: JsonField<String>,
                private val region: JsonField<String>,
                private val endpointUrl: JsonField<String>,
                private val pathStyle: JsonField<Boolean>,
                private val prefix: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    bucket: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("region")
                    @ExcludeMissing
                    region: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("endpoint_url")
                    @ExcludeMissing
                    endpointUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("path_style")
                    @ExcludeMissing
                    pathStyle: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    prefix: JsonField<String> = JsonMissing.of(),
                ) : this(bucket, region, endpointUrl, pathStyle, prefix, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun bucket(): String = bucket.getRequired("bucket")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun region(): String = region.getRequired("region")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endpointUrl(): Optional<String> = endpointUrl.getOptional("endpoint_url")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pathStyle(): Optional<Boolean> = pathStyle.getOptional("path_style")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prefix(): Optional<String> = prefix.getOptional("prefix")

                /**
                 * Returns the raw JSON value of [bucket].
                 *
                 * Unlike [bucket], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bucket") @ExcludeMissing fun _bucket(): JsonField<String> = bucket

                /**
                 * Returns the raw JSON value of [region].
                 *
                 * Unlike [region], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

                /**
                 * Returns the raw JSON value of [endpointUrl].
                 *
                 * Unlike [endpointUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("endpoint_url")
                @ExcludeMissing
                fun _endpointUrl(): JsonField<String> = endpointUrl

                /**
                 * Returns the raw JSON value of [pathStyle].
                 *
                 * Unlike [pathStyle], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("path_style")
                @ExcludeMissing
                fun _pathStyle(): JsonField<Boolean> = pathStyle

                /**
                 * Returns the raw JSON value of [prefix].
                 *
                 * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [S3].
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * .region()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [S3]. */
                class Builder internal constructor() {

                    private var bucket: JsonField<String>? = null
                    private var region: JsonField<String>? = null
                    private var endpointUrl: JsonField<String> = JsonMissing.of()
                    private var pathStyle: JsonField<Boolean> = JsonMissing.of()
                    private var prefix: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(s3: S3) = apply {
                        bucket = s3.bucket
                        region = s3.region
                        endpointUrl = s3.endpointUrl
                        pathStyle = s3.pathStyle
                        prefix = s3.prefix
                        additionalProperties = s3.additionalProperties.toMutableMap()
                    }

                    fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                    /**
                     * Sets [Builder.bucket] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bucket] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                    fun region(region: String) = region(JsonField.of(region))

                    /**
                     * Sets [Builder.region] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.region] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun region(region: JsonField<String>) = apply { this.region = region }

                    fun endpointUrl(endpointUrl: String) = endpointUrl(JsonField.of(endpointUrl))

                    /**
                     * Sets [Builder.endpointUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endpointUrl] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun endpointUrl(endpointUrl: JsonField<String>) = apply {
                        this.endpointUrl = endpointUrl
                    }

                    fun pathStyle(pathStyle: Boolean) = pathStyle(JsonField.of(pathStyle))

                    /**
                     * Sets [Builder.pathStyle] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pathStyle] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pathStyle(pathStyle: JsonField<Boolean>) = apply {
                        this.pathStyle = pathStyle
                    }

                    fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                    /**
                     * Sets [Builder.prefix] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prefix] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [S3].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .bucket()
                     * .region()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): S3 =
                        S3(
                            checkRequired("bucket", bucket),
                            checkRequired("region", region),
                            endpointUrl,
                            pathStyle,
                            prefix,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): S3 = apply {
                    if (validated) {
                        return@apply
                    }

                    bucket()
                    region()
                    endpointUrl()
                    pathStyle()
                    prefix()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (bucket.asKnown().isPresent) 1 else 0) +
                        (if (region.asKnown().isPresent) 1 else 0) +
                        (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                        (if (pathStyle.asKnown().isPresent) 1 else 0) +
                        (if (prefix.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is S3 &&
                        bucket == other.bucket &&
                        region == other.region &&
                        endpointUrl == other.endpointUrl &&
                        pathStyle == other.pathStyle &&
                        prefix == other.prefix &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        bucket,
                        region,
                        endpointUrl,
                        pathStyle,
                        prefix,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "S3{bucket=$bucket, region=$region, endpointUrl=$endpointUrl, pathStyle=$pathStyle, prefix=$prefix, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SandboxapiAzureBlobContainerMountSpec &&
                    id == other.id &&
                    azureBlob == other.azureBlob &&
                    mountPath == other.mountPath &&
                    type == other.type &&
                    cache == other.cache &&
                    contexthub == other.contexthub &&
                    encryption == other.encryption &&
                    gcs == other.gcs &&
                    git == other.git &&
                    readOnly == other.readOnly &&
                    s3 == other.s3 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    azureBlob,
                    mountPath,
                    type,
                    cache,
                    contexthub,
                    encryption,
                    gcs,
                    git,
                    readOnly,
                    s3,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SandboxapiAzureBlobContainerMountSpec{id=$id, azureBlob=$azureBlob, mountPath=$mountPath, type=$type, cache=$cache, contexthub=$contexthub, encryption=$encryption, gcs=$gcs, git=$git, readOnly=$readOnly, s3=$s3, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SandboxMountConfig &&
            auth == other.auth &&
            mounts == other.mounts &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(auth, mounts, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SandboxMountConfig{auth=$auth, mounts=$mounts, additionalProperties=$additionalProperties}"
}
