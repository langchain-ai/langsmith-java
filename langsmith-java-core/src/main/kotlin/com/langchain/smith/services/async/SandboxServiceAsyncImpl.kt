// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.async.sandboxes.BoxServiceAsync
import com.langchain.smith.services.async.sandboxes.BoxServiceAsyncImpl
import com.langchain.smith.services.async.sandboxes.RegistryServiceAsync
import com.langchain.smith.services.async.sandboxes.RegistryServiceAsyncImpl
import com.langchain.smith.services.async.sandboxes.SnapshotServiceAsync
import com.langchain.smith.services.async.sandboxes.SnapshotServiceAsyncImpl
import java.util.function.Consumer

class SandboxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SandboxServiceAsync {

    private val withRawResponse: SandboxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val boxes: BoxServiceAsync by lazy { BoxServiceAsyncImpl(clientOptions) }

    private val registries: RegistryServiceAsync by lazy { RegistryServiceAsyncImpl(clientOptions) }

    private val snapshots: SnapshotServiceAsync by lazy { SnapshotServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SandboxServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxServiceAsync =
        SandboxServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun boxes(): BoxServiceAsync = boxes

    override fun registries(): RegistryServiceAsync = registries

    override fun snapshots(): SnapshotServiceAsync = snapshots

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SandboxServiceAsync.WithRawResponse {

        private val boxes: BoxServiceAsync.WithRawResponse by lazy {
            BoxServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val registries: RegistryServiceAsync.WithRawResponse by lazy {
            RegistryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val snapshots: SnapshotServiceAsync.WithRawResponse by lazy {
            SnapshotServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SandboxServiceAsync.WithRawResponse =
            SandboxServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun boxes(): BoxServiceAsync.WithRawResponse = boxes

        override fun registries(): RegistryServiceAsync.WithRawResponse = registries

        override fun snapshots(): SnapshotServiceAsync.WithRawResponse = snapshots
    }
}
