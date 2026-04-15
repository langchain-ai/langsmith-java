// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.services.blocking.sandboxes.BoxService
import com.langchain.smith.services.blocking.sandboxes.BoxServiceImpl
import com.langchain.smith.services.blocking.sandboxes.PoolService
import com.langchain.smith.services.blocking.sandboxes.PoolServiceImpl
import com.langchain.smith.services.blocking.sandboxes.SnapshotService
import com.langchain.smith.services.blocking.sandboxes.SnapshotServiceImpl
import com.langchain.smith.services.blocking.sandboxes.TemplateService
import com.langchain.smith.services.blocking.sandboxes.TemplateServiceImpl
import java.util.function.Consumer

class SandboxServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SandboxService {

    private val withRawResponse: SandboxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val boxes: BoxService by lazy { BoxServiceImpl(clientOptions) }

    private val pools: PoolService by lazy { PoolServiceImpl(clientOptions) }

    private val snapshots: SnapshotService by lazy { SnapshotServiceImpl(clientOptions) }

    private val templates: TemplateService by lazy { TemplateServiceImpl(clientOptions) }

    override fun withRawResponse(): SandboxService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxService =
        SandboxServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun boxes(): BoxService = boxes

    override fun pools(): PoolService = pools

    override fun snapshots(): SnapshotService = snapshots

    override fun templates(): TemplateService = templates

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SandboxService.WithRawResponse {

        private val boxes: BoxService.WithRawResponse by lazy {
            BoxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val pools: PoolService.WithRawResponse by lazy {
            PoolServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val snapshots: SnapshotService.WithRawResponse by lazy {
            SnapshotServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val templates: TemplateService.WithRawResponse by lazy {
            TemplateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SandboxService.WithRawResponse =
            SandboxServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun boxes(): BoxService.WithRawResponse = boxes

        override fun pools(): PoolService.WithRawResponse = pools

        override fun snapshots(): SnapshotService.WithRawResponse = snapshots

        override fun templates(): TemplateService.WithRawResponse = templates
    }
}
