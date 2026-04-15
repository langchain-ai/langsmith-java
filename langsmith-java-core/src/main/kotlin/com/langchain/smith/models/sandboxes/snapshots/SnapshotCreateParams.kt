// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.snapshots

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Create a snapshot from a Docker image (async build). */
class SnapshotCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dockerImage(): String = body.dockerImage()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fsCapacityBytes(): Long = body.fsCapacityBytes()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registryId(): Optional<String> = body.registryId()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registryPassword(): Optional<String> = body.registryPassword()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registryUrl(): Optional<String> = body.registryUrl()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registryUsername(): Optional<String> = body.registryUsername()

    /**
     * Returns the raw JSON value of [dockerImage].
     *
     * Unlike [dockerImage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dockerImage(): JsonField<String> = body._dockerImage()

    /**
     * Returns the raw JSON value of [fsCapacityBytes].
     *
     * Unlike [fsCapacityBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fsCapacityBytes(): JsonField<Long> = body._fsCapacityBytes()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [registryId].
     *
     * Unlike [registryId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _registryId(): JsonField<String> = body._registryId()

    /**
     * Returns the raw JSON value of [registryPassword].
     *
     * Unlike [registryPassword], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _registryPassword(): JsonField<String> = body._registryPassword()

    /**
     * Returns the raw JSON value of [registryUrl].
     *
     * Unlike [registryUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _registryUrl(): JsonField<String> = body._registryUrl()

    /**
     * Returns the raw JSON value of [registryUsername].
     *
     * Unlike [registryUsername], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _registryUsername(): JsonField<String> = body._registryUsername()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SnapshotCreateParams].
         *
         * The following fields are required:
         * ```java
         * .dockerImage()
         * .fsCapacityBytes()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SnapshotCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(snapshotCreateParams: SnapshotCreateParams) = apply {
            body = snapshotCreateParams.body.toBuilder()
            additionalHeaders = snapshotCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = snapshotCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [dockerImage]
         * - [fsCapacityBytes]
         * - [name]
         * - [registryId]
         * - [registryPassword]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun dockerImage(dockerImage: String) = apply { body.dockerImage(dockerImage) }

        /**
         * Sets [Builder.dockerImage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dockerImage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dockerImage(dockerImage: JsonField<String>) = apply { body.dockerImage(dockerImage) }

        fun fsCapacityBytes(fsCapacityBytes: Long) = apply { body.fsCapacityBytes(fsCapacityBytes) }

        /**
         * Sets [Builder.fsCapacityBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fsCapacityBytes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fsCapacityBytes(fsCapacityBytes: JsonField<Long>) = apply {
            body.fsCapacityBytes(fsCapacityBytes)
        }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun registryId(registryId: String) = apply { body.registryId(registryId) }

        /**
         * Sets [Builder.registryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registryId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun registryId(registryId: JsonField<String>) = apply { body.registryId(registryId) }

        fun registryPassword(registryPassword: String) = apply {
            body.registryPassword(registryPassword)
        }

        /**
         * Sets [Builder.registryPassword] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registryPassword] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun registryPassword(registryPassword: JsonField<String>) = apply {
            body.registryPassword(registryPassword)
        }

        fun registryUrl(registryUrl: String) = apply { body.registryUrl(registryUrl) }

        /**
         * Sets [Builder.registryUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registryUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun registryUrl(registryUrl: JsonField<String>) = apply { body.registryUrl(registryUrl) }

        fun registryUsername(registryUsername: String) = apply {
            body.registryUsername(registryUsername)
        }

        /**
         * Sets [Builder.registryUsername] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registryUsername] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun registryUsername(registryUsername: JsonField<String>) = apply {
            body.registryUsername(registryUsername)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SnapshotCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dockerImage()
         * .fsCapacityBytes()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SnapshotCreateParams =
            SnapshotCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dockerImage: JsonField<String>,
        private val fsCapacityBytes: JsonField<Long>,
        private val name: JsonField<String>,
        private val registryId: JsonField<String>,
        private val registryPassword: JsonField<String>,
        private val registryUrl: JsonField<String>,
        private val registryUsername: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("docker_image")
            @ExcludeMissing
            dockerImage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fs_capacity_bytes")
            @ExcludeMissing
            fsCapacityBytes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registry_id")
            @ExcludeMissing
            registryId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registry_password")
            @ExcludeMissing
            registryPassword: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registry_url")
            @ExcludeMissing
            registryUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("registry_username")
            @ExcludeMissing
            registryUsername: JsonField<String> = JsonMissing.of(),
        ) : this(
            dockerImage,
            fsCapacityBytes,
            name,
            registryId,
            registryPassword,
            registryUrl,
            registryUsername,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dockerImage(): String = dockerImage.getRequired("docker_image")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fsCapacityBytes(): Long = fsCapacityBytes.getRequired("fs_capacity_bytes")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun registryId(): Optional<String> = registryId.getOptional("registry_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun registryPassword(): Optional<String> = registryPassword.getOptional("registry_password")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun registryUrl(): Optional<String> = registryUrl.getOptional("registry_url")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun registryUsername(): Optional<String> = registryUsername.getOptional("registry_username")

        /**
         * Returns the raw JSON value of [dockerImage].
         *
         * Unlike [dockerImage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("docker_image")
        @ExcludeMissing
        fun _dockerImage(): JsonField<String> = dockerImage

        /**
         * Returns the raw JSON value of [fsCapacityBytes].
         *
         * Unlike [fsCapacityBytes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fs_capacity_bytes")
        @ExcludeMissing
        fun _fsCapacityBytes(): JsonField<Long> = fsCapacityBytes

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [registryId].
         *
         * Unlike [registryId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("registry_id")
        @ExcludeMissing
        fun _registryId(): JsonField<String> = registryId

        /**
         * Returns the raw JSON value of [registryPassword].
         *
         * Unlike [registryPassword], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("registry_password")
        @ExcludeMissing
        fun _registryPassword(): JsonField<String> = registryPassword

        /**
         * Returns the raw JSON value of [registryUrl].
         *
         * Unlike [registryUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("registry_url")
        @ExcludeMissing
        fun _registryUrl(): JsonField<String> = registryUrl

        /**
         * Returns the raw JSON value of [registryUsername].
         *
         * Unlike [registryUsername], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("registry_username")
        @ExcludeMissing
        fun _registryUsername(): JsonField<String> = registryUsername

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .dockerImage()
             * .fsCapacityBytes()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var dockerImage: JsonField<String>? = null
            private var fsCapacityBytes: JsonField<Long>? = null
            private var name: JsonField<String>? = null
            private var registryId: JsonField<String> = JsonMissing.of()
            private var registryPassword: JsonField<String> = JsonMissing.of()
            private var registryUrl: JsonField<String> = JsonMissing.of()
            private var registryUsername: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                dockerImage = body.dockerImage
                fsCapacityBytes = body.fsCapacityBytes
                name = body.name
                registryId = body.registryId
                registryPassword = body.registryPassword
                registryUrl = body.registryUrl
                registryUsername = body.registryUsername
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun dockerImage(dockerImage: String) = dockerImage(JsonField.of(dockerImage))

            /**
             * Sets [Builder.dockerImage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dockerImage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dockerImage(dockerImage: JsonField<String>) = apply {
                this.dockerImage = dockerImage
            }

            fun fsCapacityBytes(fsCapacityBytes: Long) =
                fsCapacityBytes(JsonField.of(fsCapacityBytes))

            /**
             * Sets [Builder.fsCapacityBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fsCapacityBytes] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fsCapacityBytes(fsCapacityBytes: JsonField<Long>) = apply {
                this.fsCapacityBytes = fsCapacityBytes
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun registryId(registryId: String) = registryId(JsonField.of(registryId))

            /**
             * Sets [Builder.registryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registryId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registryId(registryId: JsonField<String>) = apply { this.registryId = registryId }

            fun registryPassword(registryPassword: String) =
                registryPassword(JsonField.of(registryPassword))

            /**
             * Sets [Builder.registryPassword] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registryPassword] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registryPassword(registryPassword: JsonField<String>) = apply {
                this.registryPassword = registryPassword
            }

            fun registryUrl(registryUrl: String) = registryUrl(JsonField.of(registryUrl))

            /**
             * Sets [Builder.registryUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registryUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registryUrl(registryUrl: JsonField<String>) = apply {
                this.registryUrl = registryUrl
            }

            fun registryUsername(registryUsername: String) =
                registryUsername(JsonField.of(registryUsername))

            /**
             * Sets [Builder.registryUsername] to an arbitrary JSON value.
             *
             * You should usually call [Builder.registryUsername] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun registryUsername(registryUsername: JsonField<String>) = apply {
                this.registryUsername = registryUsername
            }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .dockerImage()
             * .fsCapacityBytes()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("dockerImage", dockerImage),
                    checkRequired("fsCapacityBytes", fsCapacityBytes),
                    checkRequired("name", name),
                    registryId,
                    registryPassword,
                    registryUrl,
                    registryUsername,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            dockerImage()
            fsCapacityBytes()
            name()
            registryId()
            registryPassword()
            registryUrl()
            registryUsername()
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
            (if (dockerImage.asKnown().isPresent) 1 else 0) +
                (if (fsCapacityBytes.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (registryId.asKnown().isPresent) 1 else 0) +
                (if (registryPassword.asKnown().isPresent) 1 else 0) +
                (if (registryUrl.asKnown().isPresent) 1 else 0) +
                (if (registryUsername.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                dockerImage == other.dockerImage &&
                fsCapacityBytes == other.fsCapacityBytes &&
                name == other.name &&
                registryId == other.registryId &&
                registryPassword == other.registryPassword &&
                registryUrl == other.registryUrl &&
                registryUsername == other.registryUsername &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                dockerImage,
                fsCapacityBytes,
                name,
                registryId,
                registryPassword,
                registryUrl,
                registryUsername,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{dockerImage=$dockerImage, fsCapacityBytes=$fsCapacityBytes, name=$name, registryId=$registryId, registryPassword=$registryPassword, registryUrl=$registryUrl, registryUsername=$registryUsername, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SnapshotCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SnapshotCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
