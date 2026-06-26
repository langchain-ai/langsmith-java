// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.blocking.sandboxes.BoxService
import com.langchain.smith.services.blocking.sandboxes.BoxServiceImpl
import com.langchain.smith.services.blocking.sandboxes.RegistryService
import com.langchain.smith.services.blocking.sandboxes.RegistryServiceImpl
import com.langchain.smith.services.blocking.sandboxes.SnapshotService
import com.langchain.smith.services.blocking.sandboxes.SnapshotServiceImpl
import java.util.function.Consumer

class SandboxServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SandboxService {

    private val withRawResponse: SandboxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val boxes: BoxService by lazy { BoxServiceImpl(clientOptions) }

    private val registries: RegistryService by lazy { RegistryServiceImpl(clientOptions) }

    private val snapshots: SnapshotService by lazy { SnapshotServiceImpl(clientOptions) }

    override fun withRawResponse(): SandboxService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxService =
        SandboxServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun boxes(): BoxService = boxes

    override fun registries(): RegistryService = registries

    override fun snapshots(): SnapshotService = snapshots

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SandboxService.WithRawResponse {

        private val boxes: BoxService.WithRawResponse by lazy {
            BoxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val registries: RegistryService.WithRawResponse by lazy {
            RegistryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val snapshots: SnapshotService.WithRawResponse by lazy {
            SnapshotServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SandboxService.WithRawResponse =
            SandboxServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun boxes(): BoxService.WithRawResponse = boxes

        override fun registries(): RegistryService.WithRawResponse = registries

        override fun snapshots(): SnapshotService.WithRawResponse = snapshots
    }
}
