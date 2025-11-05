// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Download a repo. */
class CommitRetrieveParams
private constructor(
    private val owner: String,
    private val repo: String,
    private val commit: String?,
    private val getExamples: Boolean?,
    private val includeModel: Boolean?,
    private val isView: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun owner(): String = owner

    fun repo(): String = repo

    fun commit(): Optional<String> = Optional.ofNullable(commit)

    fun getExamples(): Optional<Boolean> = Optional.ofNullable(getExamples)

    fun includeModel(): Optional<Boolean> = Optional.ofNullable(includeModel)

    fun isView(): Optional<Boolean> = Optional.ofNullable(isView)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .owner()
         * .repo()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitRetrieveParams]. */
    class Builder internal constructor() {

        private var owner: String? = null
        private var repo: String? = null
        private var commit: String? = null
        private var getExamples: Boolean? = null
        private var includeModel: Boolean? = null
        private var isView: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(commitRetrieveParams: CommitRetrieveParams) = apply {
            owner = commitRetrieveParams.owner
            repo = commitRetrieveParams.repo
            commit = commitRetrieveParams.commit
            getExamples = commitRetrieveParams.getExamples
            includeModel = commitRetrieveParams.includeModel
            isView = commitRetrieveParams.isView
            additionalHeaders = commitRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = commitRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun owner(owner: String) = apply { this.owner = owner }

        fun repo(repo: String) = apply { this.repo = repo }

        fun commit(commit: String?) = apply { this.commit = commit }

        /** Alias for calling [Builder.commit] with `commit.orElse(null)`. */
        fun commit(commit: Optional<String>) = commit(commit.getOrNull())

        fun getExamples(getExamples: Boolean?) = apply { this.getExamples = getExamples }

        /**
         * Alias for [Builder.getExamples].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun getExamples(getExamples: Boolean) = getExamples(getExamples as Boolean?)

        /** Alias for calling [Builder.getExamples] with `getExamples.orElse(null)`. */
        fun getExamples(getExamples: Optional<Boolean>) = getExamples(getExamples.getOrNull())

        fun includeModel(includeModel: Boolean?) = apply { this.includeModel = includeModel }

        /**
         * Alias for [Builder.includeModel].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeModel(includeModel: Boolean) = includeModel(includeModel as Boolean?)

        /** Alias for calling [Builder.includeModel] with `includeModel.orElse(null)`. */
        fun includeModel(includeModel: Optional<Boolean>) = includeModel(includeModel.getOrNull())

        fun isView(isView: Boolean?) = apply { this.isView = isView }

        /**
         * Alias for [Builder.isView].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isView(isView: Boolean) = isView(isView as Boolean?)

        /** Alias for calling [Builder.isView] with `isView.orElse(null)`. */
        fun isView(isView: Optional<Boolean>) = isView(isView.getOrNull())

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
         * Returns an immutable instance of [CommitRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .owner()
         * .repo()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CommitRetrieveParams =
            CommitRetrieveParams(
                checkRequired("owner", owner),
                checkRequired("repo", repo),
                commit,
                getExamples,
                includeModel,
                isView,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> owner
            1 -> repo
            2 -> commit ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                getExamples?.let { put("get_examples", it.toString()) }
                includeModel?.let { put("include_model", it.toString()) }
                isView?.let { put("is_view", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitRetrieveParams &&
            owner == other.owner &&
            repo == other.repo &&
            commit == other.commit &&
            getExamples == other.getExamples &&
            includeModel == other.includeModel &&
            isView == other.isView &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            owner,
            repo,
            commit,
            getExamples,
            includeModel,
            isView,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CommitRetrieveParams{owner=$owner, repo=$repo, commit=$commit, getExamples=$getExamples, includeModel=$includeModel, isView=$isView, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
