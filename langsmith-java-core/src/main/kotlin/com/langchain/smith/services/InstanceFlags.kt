package com.langchain.smith.services

import com.langchain.smith.models.info.InfoListResponse
import kotlin.jvm.optionals.getOrNull

/** A boolean from `/info`'s free-form `instance_flags`; null when absent or not a boolean. */
internal fun InfoListResponse.booleanInstanceFlag(name: String): Boolean? =
    instanceFlags().getOrNull()?._additionalProperties()?.get(name)?.asBoolean()?.getOrNull()

/** True when the server answers the v2 runs query from SmithDB. Off when the flag is absent. */
internal fun supportsSmithDbQuery(info: InfoListResponse): Boolean =
    info.booleanInstanceFlag("sdb_query_enabled") == true
