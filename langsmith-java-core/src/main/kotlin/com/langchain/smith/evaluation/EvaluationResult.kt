package com.langchain.smith.evaluation

import java.util.Optional

/** A single row-level evaluation metric to submit as LangSmith feedback. */
class EvaluationResult
private constructor(
    private val key: String,
    private val score: Any?,
    private val value: Any?,
    private val comment: String?,
    private val correction: Any?,
) {

    fun key(): String = key

    fun score(): Optional<Any> = Optional.ofNullable(score)

    fun value(): Optional<Any> = Optional.ofNullable(value)

    fun comment(): Optional<String> = Optional.ofNullable(comment)

    fun correction(): Optional<Any> = Optional.ofNullable(correction)

    fun toBuilder(): Builder = Builder().from(this)

    companion object {

        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {

        private var key: String? = null
        private var score: Any? = null
        private var value: Any? = null
        private var comment: String? = null
        private var correction: Any? = null

        internal fun from(result: EvaluationResult) = apply {
            key = result.key
            score = result.score
            value = result.value
            comment = result.comment
            correction = result.correction
        }

        fun key(key: String) = apply { this.key = key }

        fun score(score: Double) = apply { this.score = score }

        fun score(score: Boolean) = apply { this.score = score }

        fun value(value: Double) = apply { this.value = value }

        fun value(value: Boolean) = apply { this.value = value }

        fun value(value: String) = apply { this.value = value }

        fun comment(comment: String?) = apply { this.comment = comment }

        fun correction(correction: String?) = apply { this.correction = correction }

        fun correction(correction: Map<String, Any?>) = apply { this.correction = correction }

        fun build(): EvaluationResult =
            EvaluationResult(
                key = requireNotNull(key) { "key must be set" },
                score = score,
                value = value,
                comment = comment,
                correction = correction,
            )
    }
}
