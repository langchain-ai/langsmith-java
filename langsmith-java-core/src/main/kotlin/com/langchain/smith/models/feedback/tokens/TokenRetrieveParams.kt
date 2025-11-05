// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback.tokens

import com.langchain.smith.core.Params
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new feedback with a token. */
class TokenRetrieveParams
private constructor(
    private val token: String?,
    private val comment: String?,
    private val correction: String?,
    private val score: Score?,
    private val value: Value?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun token(): Optional<String> = Optional.ofNullable(token)

    fun comment(): Optional<String> = Optional.ofNullable(comment)

    fun correction(): Optional<String> = Optional.ofNullable(correction)

    fun score(): Optional<Score> = Optional.ofNullable(score)

    fun value(): Optional<Value> = Optional.ofNullable(value)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TokenRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TokenRetrieveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenRetrieveParams]. */
    class Builder internal constructor() {

        private var token: String? = null
        private var comment: String? = null
        private var correction: String? = null
        private var score: Score? = null
        private var value: Value? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tokenRetrieveParams: TokenRetrieveParams) = apply {
            token = tokenRetrieveParams.token
            comment = tokenRetrieveParams.comment
            correction = tokenRetrieveParams.correction
            score = tokenRetrieveParams.score
            value = tokenRetrieveParams.value
            additionalHeaders = tokenRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = tokenRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun token(token: String?) = apply { this.token = token }

        /** Alias for calling [Builder.token] with `token.orElse(null)`. */
        fun token(token: Optional<String>) = token(token.getOrNull())

        fun comment(comment: String?) = apply { this.comment = comment }

        /** Alias for calling [Builder.comment] with `comment.orElse(null)`. */
        fun comment(comment: Optional<String>) = comment(comment.getOrNull())

        fun correction(correction: String?) = apply { this.correction = correction }

        /** Alias for calling [Builder.correction] with `correction.orElse(null)`. */
        fun correction(correction: Optional<String>) = correction(correction.getOrNull())

        fun score(score: Score?) = apply { this.score = score }

        /** Alias for calling [Builder.score] with `score.orElse(null)`. */
        fun score(score: Optional<Score>) = score(score.getOrNull())

        /** Alias for calling [score] with `Score.ofNumber(number)`. */
        fun score(number: Double) = score(Score.ofNumber(number))

        /** Alias for calling [score] with `Score.ofBool(bool)`. */
        fun score(bool: Boolean) = score(Score.ofBool(bool))

        fun value(value: Value?) = apply { this.value = value }

        /** Alias for calling [Builder.value] with `value.orElse(null)`. */
        fun value(value: Optional<Value>) = value(value.getOrNull())

        /** Alias for calling [value] with `Value.ofNumber(number)`. */
        fun value(number: Double) = value(Value.ofNumber(number))

        /** Alias for calling [value] with `Value.ofBool(bool)`. */
        fun value(bool: Boolean) = value(Value.ofBool(bool))

        /** Alias for calling [value] with `Value.ofString(string)`. */
        fun value(string: String) = value(Value.ofString(string))

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
         * Returns an immutable instance of [TokenRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TokenRetrieveParams =
            TokenRetrieveParams(
                token,
                comment,
                correction,
                score,
                value,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> token ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                comment?.let { put("comment", it) }
                correction?.let { put("correction", it) }
                score?.accept(
                    object : Score.Visitor<Unit> {
                        override fun visitNumber(number: Double) {
                            put("score", number.toString())
                        }

                        override fun visitBool(bool: Boolean) {
                            put("score", bool.toString())
                        }
                    }
                )
                value?.accept(
                    object : Value.Visitor<Unit> {
                        override fun visitNumber(number: Double) {
                            put("value", number.toString())
                        }

                        override fun visitBool(bool: Boolean) {
                            put("value", bool.toString())
                        }

                        override fun visitString(string: String) {
                            put("value", string)
                        }
                    }
                )
                putAll(additionalQueryParams)
            }
            .build()

    class Score
    private constructor(private val number: Double? = null, private val bool: Boolean? = null) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

        fun isNumber(): Boolean = number != null

        fun isBool(): Boolean = bool != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asBool(): Boolean = bool.getOrThrow("bool")

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                bool != null -> visitor.visitBool(bool)
                else -> throw IllegalStateException("Invalid Score")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Score && number == other.number && bool == other.bool
        }

        override fun hashCode(): Int = Objects.hash(number, bool)

        override fun toString(): String =
            when {
                number != null -> "Score{number=$number}"
                bool != null -> "Score{bool=$bool}"
                else -> throw IllegalStateException("Invalid Score")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = Score(number = number)

            @JvmStatic fun ofBool(bool: Boolean) = Score(bool = bool)
        }

        /** An interface that defines how to map each variant of [Score] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitBool(bool: Boolean): T
        }
    }

    class Value
    private constructor(
        private val number: Double? = null,
        private val bool: Boolean? = null,
        private val string: String? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isBool(): Boolean = bool != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asBool(): Boolean = bool.getOrThrow("bool")

        fun asString(): String = string.getOrThrow("string")

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                bool != null -> visitor.visitBool(bool)
                string != null -> visitor.visitString(string)
                else -> throw IllegalStateException("Invalid Value")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Value &&
                number == other.number &&
                bool == other.bool &&
                string == other.string
        }

        override fun hashCode(): Int = Objects.hash(number, bool, string)

        override fun toString(): String =
            when {
                number != null -> "Value{number=$number}"
                bool != null -> "Value{bool=$bool}"
                string != null -> "Value{string=$string}"
                else -> throw IllegalStateException("Invalid Value")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = Value(number = number)

            @JvmStatic fun ofBool(bool: Boolean) = Value(bool = bool)

            @JvmStatic fun ofString(string: String) = Value(string = string)
        }

        /** An interface that defines how to map each variant of [Value] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitBool(bool: Boolean): T

            fun visitString(string: String): T
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenRetrieveParams &&
            token == other.token &&
            comment == other.comment &&
            correction == other.correction &&
            score == other.score &&
            value == other.value &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            token,
            comment,
            correction,
            score,
            value,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TokenRetrieveParams{token=$token, comment=$comment, correction=$correction, score=$score, value=$value, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
