// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Organization level configuration. May include any field that exists in tenant config and
 * additional fields.
 */
class OrganizationConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allowCustomIframes: JsonField<Boolean>,
    private val arbitraryCostTrackingEnabled: JsonField<Boolean>,
    private val canAddSeats: JsonField<Boolean>,
    private val canDisablePublicSharing: JsonField<Boolean>,
    private val canServeDatasets: JsonField<Boolean>,
    private val canUseAbac: JsonField<Boolean>,
    private val canUseAgentBuilder: JsonField<Boolean>,
    private val canUseBulkExport: JsonField<Boolean>,
    private val canUseLanggraphCloud: JsonField<Boolean>,
    private val canUseRbac: JsonField<Boolean>,
    private val canUseRemoteMcpServers: JsonField<Boolean>,
    private val canUseSamlSso: JsonField<Boolean>,
    private val clioEnabled: JsonField<Boolean>,
    private val datadogRumSessionSampleRate: JsonField<Long>,
    private val demoLgpNewGraphEnabled: JsonField<Boolean>,
    private val enableAlignEvaluators: JsonField<Boolean>,
    private val enableIncludeExtendedStats: JsonField<Boolean>,
    private val enableLanggraphPricing: JsonField<Boolean>,
    private val enableLgpListenersPage: JsonField<Boolean>,
    private val enableMarkdownInTracing: JsonField<Boolean>,
    private val enableMonthlyUsageCharts: JsonField<Boolean>,
    private val enableOrgUsageCharts: JsonField<Boolean>,
    private val enablePricingRedesign: JsonField<Boolean>,
    private val enableQueryingV2Endpoints: JsonField<Boolean>,
    private val enableRunTreeStreaming: JsonField<Boolean>,
    private val enableThreadViewPlayground: JsonField<Boolean>,
    private val enableThreadsImprovements: JsonField<Boolean>,
    private val kvDatasetMessageSupport: JsonField<Boolean>,
    private val langgraphDeployOwnCloudEnabled: JsonField<Boolean>,
    private val langgraphEnterpriseEnabled: JsonField<Boolean>,
    private val langgraphRemoteReconcilerEnabled: JsonField<Boolean>,
    private val langsmithAlertsLegacyPocEnabled: JsonField<Boolean>,
    private val langsmithAlertsPocEnabled: JsonField<Boolean>,
    private val langsmithExperimentalSearchEnabled: JsonField<Boolean>,
    private val lgpTemplatesEnabled: JsonField<Boolean>,
    private val maxFreeLanggraphCloudDeployments: JsonField<Long>,
    private val maxIdentities: JsonField<Long>,
    private val maxLanggraphCloudDeployments: JsonField<Long>,
    private val maxPromptWebhooks: JsonField<Long>,
    private val maxThreadEvaluatorsPerTenant: JsonField<Long>,
    private val maxWorkspaces: JsonField<Long>,
    private val newRuleEvaluatorCreationVersion: JsonField<Long>,
    private val partnerPlanApprovalDate: JsonField<String>,
    private val playgroundEvaluatorStrategy: JsonField<String>,
    private val premierPlanApprovalDate: JsonField<String>,
    private val promptOptimizationJobsEnabled: JsonField<Boolean>,
    private val requireCodeEvaluatorLanguageField: JsonField<Boolean>,
    private val showPlaygroundPromptCanvas: JsonField<Boolean>,
    private val showUpdatedResourceTags: JsonField<Boolean>,
    private val showUpdatedSidenav: JsonField<Boolean>,
    private val startupPlanApprovalDate: JsonField<String>,
    private val tenantSkipTopkFacets: JsonField<Boolean>,
    private val threadEvaluatorsEnabled: JsonField<Boolean>,
    private val useExactSearchForPrompts: JsonField<Boolean>,
    private val usePythonPlaygroundService: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allow_custom_iframes")
        @ExcludeMissing
        allowCustomIframes: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("arbitrary_cost_tracking_enabled")
        @ExcludeMissing
        arbitraryCostTrackingEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("can_add_seats")
        @ExcludeMissing
        canAddSeats: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("can_disable_public_sharing")
        @ExcludeMissing
        canDisablePublicSharing: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("can_serve_datasets")
        @ExcludeMissing
        canServeDatasets: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("can_use_abac")
        @ExcludeMissing
        canUseAbac: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("can_use_agent_builder")
        @ExcludeMissing
        canUseAgentBuilder: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("can_use_bulk_export")
        @ExcludeMissing
        canUseBulkExport: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("can_use_langgraph_cloud")
        @ExcludeMissing
        canUseLanggraphCloud: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("can_use_rbac")
        @ExcludeMissing
        canUseRbac: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("can_use_remote_mcp_servers")
        @ExcludeMissing
        canUseRemoteMcpServers: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("can_use_saml_sso")
        @ExcludeMissing
        canUseSamlSso: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("clio_enabled")
        @ExcludeMissing
        clioEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("datadog_rum_session_sample_rate")
        @ExcludeMissing
        datadogRumSessionSampleRate: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("demo_lgp_new_graph_enabled")
        @ExcludeMissing
        demoLgpNewGraphEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable_align_evaluators")
        @ExcludeMissing
        enableAlignEvaluators: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable_include_extended_stats")
        @ExcludeMissing
        enableIncludeExtendedStats: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable_langgraph_pricing")
        @ExcludeMissing
        enableLanggraphPricing: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable_lgp_listeners_page")
        @ExcludeMissing
        enableLgpListenersPage: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable_markdown_in_tracing")
        @ExcludeMissing
        enableMarkdownInTracing: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable_monthly_usage_charts")
        @ExcludeMissing
        enableMonthlyUsageCharts: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable_org_usage_charts")
        @ExcludeMissing
        enableOrgUsageCharts: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable_pricing_redesign")
        @ExcludeMissing
        enablePricingRedesign: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable_querying_v2_endpoints")
        @ExcludeMissing
        enableQueryingV2Endpoints: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable_run_tree_streaming")
        @ExcludeMissing
        enableRunTreeStreaming: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable_thread_view_playground")
        @ExcludeMissing
        enableThreadViewPlayground: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enable_threads_improvements")
        @ExcludeMissing
        enableThreadsImprovements: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("kv_dataset_message_support")
        @ExcludeMissing
        kvDatasetMessageSupport: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("langgraph_deploy_own_cloud_enabled")
        @ExcludeMissing
        langgraphDeployOwnCloudEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("langgraph_enterprise_enabled")
        @ExcludeMissing
        langgraphEnterpriseEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("langgraph_remote_reconciler_enabled")
        @ExcludeMissing
        langgraphRemoteReconcilerEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("langsmith_alerts_legacy_poc_enabled")
        @ExcludeMissing
        langsmithAlertsLegacyPocEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("langsmith_alerts_poc_enabled")
        @ExcludeMissing
        langsmithAlertsPocEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("langsmith_experimental_search_enabled")
        @ExcludeMissing
        langsmithExperimentalSearchEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lgp_templates_enabled")
        @ExcludeMissing
        lgpTemplatesEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("max_free_langgraph_cloud_deployments")
        @ExcludeMissing
        maxFreeLanggraphCloudDeployments: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_identities")
        @ExcludeMissing
        maxIdentities: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_langgraph_cloud_deployments")
        @ExcludeMissing
        maxLanggraphCloudDeployments: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_prompt_webhooks")
        @ExcludeMissing
        maxPromptWebhooks: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_thread_evaluators_per_tenant")
        @ExcludeMissing
        maxThreadEvaluatorsPerTenant: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_workspaces")
        @ExcludeMissing
        maxWorkspaces: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("new_rule_evaluator_creation_version")
        @ExcludeMissing
        newRuleEvaluatorCreationVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("partner_plan_approval_date")
        @ExcludeMissing
        partnerPlanApprovalDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("playground_evaluator_strategy")
        @ExcludeMissing
        playgroundEvaluatorStrategy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("premier_plan_approval_date")
        @ExcludeMissing
        premierPlanApprovalDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_optimization_jobs_enabled")
        @ExcludeMissing
        promptOptimizationJobsEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("require_code_evaluator_language_field")
        @ExcludeMissing
        requireCodeEvaluatorLanguageField: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("show_playground_prompt_canvas")
        @ExcludeMissing
        showPlaygroundPromptCanvas: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("show_updated_resource_tags")
        @ExcludeMissing
        showUpdatedResourceTags: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("show_updated_sidenav")
        @ExcludeMissing
        showUpdatedSidenav: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("startup_plan_approval_date")
        @ExcludeMissing
        startupPlanApprovalDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenant_skip_topk_facets")
        @ExcludeMissing
        tenantSkipTopkFacets: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("thread_evaluators_enabled")
        @ExcludeMissing
        threadEvaluatorsEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("use_exact_search_for_prompts")
        @ExcludeMissing
        useExactSearchForPrompts: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("use_python_playground_service")
        @ExcludeMissing
        usePythonPlaygroundService: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        allowCustomIframes,
        arbitraryCostTrackingEnabled,
        canAddSeats,
        canDisablePublicSharing,
        canServeDatasets,
        canUseAbac,
        canUseAgentBuilder,
        canUseBulkExport,
        canUseLanggraphCloud,
        canUseRbac,
        canUseRemoteMcpServers,
        canUseSamlSso,
        clioEnabled,
        datadogRumSessionSampleRate,
        demoLgpNewGraphEnabled,
        enableAlignEvaluators,
        enableIncludeExtendedStats,
        enableLanggraphPricing,
        enableLgpListenersPage,
        enableMarkdownInTracing,
        enableMonthlyUsageCharts,
        enableOrgUsageCharts,
        enablePricingRedesign,
        enableQueryingV2Endpoints,
        enableRunTreeStreaming,
        enableThreadViewPlayground,
        enableThreadsImprovements,
        kvDatasetMessageSupport,
        langgraphDeployOwnCloudEnabled,
        langgraphEnterpriseEnabled,
        langgraphRemoteReconcilerEnabled,
        langsmithAlertsLegacyPocEnabled,
        langsmithAlertsPocEnabled,
        langsmithExperimentalSearchEnabled,
        lgpTemplatesEnabled,
        maxFreeLanggraphCloudDeployments,
        maxIdentities,
        maxLanggraphCloudDeployments,
        maxPromptWebhooks,
        maxThreadEvaluatorsPerTenant,
        maxWorkspaces,
        newRuleEvaluatorCreationVersion,
        partnerPlanApprovalDate,
        playgroundEvaluatorStrategy,
        premierPlanApprovalDate,
        promptOptimizationJobsEnabled,
        requireCodeEvaluatorLanguageField,
        showPlaygroundPromptCanvas,
        showUpdatedResourceTags,
        showUpdatedSidenav,
        startupPlanApprovalDate,
        tenantSkipTopkFacets,
        threadEvaluatorsEnabled,
        useExactSearchForPrompts,
        usePythonPlaygroundService,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowCustomIframes(): Optional<Boolean> =
        allowCustomIframes.getOptional("allow_custom_iframes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun arbitraryCostTrackingEnabled(): Optional<Boolean> =
        arbitraryCostTrackingEnabled.getOptional("arbitrary_cost_tracking_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun canAddSeats(): Optional<Boolean> = canAddSeats.getOptional("can_add_seats")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun canDisablePublicSharing(): Optional<Boolean> =
        canDisablePublicSharing.getOptional("can_disable_public_sharing")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun canServeDatasets(): Optional<Boolean> = canServeDatasets.getOptional("can_serve_datasets")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun canUseAbac(): Optional<Boolean> = canUseAbac.getOptional("can_use_abac")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun canUseAgentBuilder(): Optional<Boolean> =
        canUseAgentBuilder.getOptional("can_use_agent_builder")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun canUseBulkExport(): Optional<Boolean> = canUseBulkExport.getOptional("can_use_bulk_export")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun canUseLanggraphCloud(): Optional<Boolean> =
        canUseLanggraphCloud.getOptional("can_use_langgraph_cloud")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun canUseRbac(): Optional<Boolean> = canUseRbac.getOptional("can_use_rbac")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun canUseRemoteMcpServers(): Optional<Boolean> =
        canUseRemoteMcpServers.getOptional("can_use_remote_mcp_servers")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun canUseSamlSso(): Optional<Boolean> = canUseSamlSso.getOptional("can_use_saml_sso")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clioEnabled(): Optional<Boolean> = clioEnabled.getOptional("clio_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datadogRumSessionSampleRate(): Optional<Long> =
        datadogRumSessionSampleRate.getOptional("datadog_rum_session_sample_rate")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun demoLgpNewGraphEnabled(): Optional<Boolean> =
        demoLgpNewGraphEnabled.getOptional("demo_lgp_new_graph_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableAlignEvaluators(): Optional<Boolean> =
        enableAlignEvaluators.getOptional("enable_align_evaluators")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableIncludeExtendedStats(): Optional<Boolean> =
        enableIncludeExtendedStats.getOptional("enable_include_extended_stats")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableLanggraphPricing(): Optional<Boolean> =
        enableLanggraphPricing.getOptional("enable_langgraph_pricing")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableLgpListenersPage(): Optional<Boolean> =
        enableLgpListenersPage.getOptional("enable_lgp_listeners_page")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableMarkdownInTracing(): Optional<Boolean> =
        enableMarkdownInTracing.getOptional("enable_markdown_in_tracing")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableMonthlyUsageCharts(): Optional<Boolean> =
        enableMonthlyUsageCharts.getOptional("enable_monthly_usage_charts")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableOrgUsageCharts(): Optional<Boolean> =
        enableOrgUsageCharts.getOptional("enable_org_usage_charts")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enablePricingRedesign(): Optional<Boolean> =
        enablePricingRedesign.getOptional("enable_pricing_redesign")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableQueryingV2Endpoints(): Optional<Boolean> =
        enableQueryingV2Endpoints.getOptional("enable_querying_v2_endpoints")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableRunTreeStreaming(): Optional<Boolean> =
        enableRunTreeStreaming.getOptional("enable_run_tree_streaming")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableThreadViewPlayground(): Optional<Boolean> =
        enableThreadViewPlayground.getOptional("enable_thread_view_playground")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableThreadsImprovements(): Optional<Boolean> =
        enableThreadsImprovements.getOptional("enable_threads_improvements")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun kvDatasetMessageSupport(): Optional<Boolean> =
        kvDatasetMessageSupport.getOptional("kv_dataset_message_support")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun langgraphDeployOwnCloudEnabled(): Optional<Boolean> =
        langgraphDeployOwnCloudEnabled.getOptional("langgraph_deploy_own_cloud_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun langgraphEnterpriseEnabled(): Optional<Boolean> =
        langgraphEnterpriseEnabled.getOptional("langgraph_enterprise_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun langgraphRemoteReconcilerEnabled(): Optional<Boolean> =
        langgraphRemoteReconcilerEnabled.getOptional("langgraph_remote_reconciler_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun langsmithAlertsLegacyPocEnabled(): Optional<Boolean> =
        langsmithAlertsLegacyPocEnabled.getOptional("langsmith_alerts_legacy_poc_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun langsmithAlertsPocEnabled(): Optional<Boolean> =
        langsmithAlertsPocEnabled.getOptional("langsmith_alerts_poc_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun langsmithExperimentalSearchEnabled(): Optional<Boolean> =
        langsmithExperimentalSearchEnabled.getOptional("langsmith_experimental_search_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lgpTemplatesEnabled(): Optional<Boolean> =
        lgpTemplatesEnabled.getOptional("lgp_templates_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxFreeLanggraphCloudDeployments(): Optional<Long> =
        maxFreeLanggraphCloudDeployments.getOptional("max_free_langgraph_cloud_deployments")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxIdentities(): Optional<Long> = maxIdentities.getOptional("max_identities")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxLanggraphCloudDeployments(): Optional<Long> =
        maxLanggraphCloudDeployments.getOptional("max_langgraph_cloud_deployments")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxPromptWebhooks(): Optional<Long> = maxPromptWebhooks.getOptional("max_prompt_webhooks")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxThreadEvaluatorsPerTenant(): Optional<Long> =
        maxThreadEvaluatorsPerTenant.getOptional("max_thread_evaluators_per_tenant")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxWorkspaces(): Optional<Long> = maxWorkspaces.getOptional("max_workspaces")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun newRuleEvaluatorCreationVersion(): Optional<Long> =
        newRuleEvaluatorCreationVersion.getOptional("new_rule_evaluator_creation_version")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun partnerPlanApprovalDate(): Optional<String> =
        partnerPlanApprovalDate.getOptional("partner_plan_approval_date")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun playgroundEvaluatorStrategy(): Optional<String> =
        playgroundEvaluatorStrategy.getOptional("playground_evaluator_strategy")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun premierPlanApprovalDate(): Optional<String> =
        premierPlanApprovalDate.getOptional("premier_plan_approval_date")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptOptimizationJobsEnabled(): Optional<Boolean> =
        promptOptimizationJobsEnabled.getOptional("prompt_optimization_jobs_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requireCodeEvaluatorLanguageField(): Optional<Boolean> =
        requireCodeEvaluatorLanguageField.getOptional("require_code_evaluator_language_field")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun showPlaygroundPromptCanvas(): Optional<Boolean> =
        showPlaygroundPromptCanvas.getOptional("show_playground_prompt_canvas")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun showUpdatedResourceTags(): Optional<Boolean> =
        showUpdatedResourceTags.getOptional("show_updated_resource_tags")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun showUpdatedSidenav(): Optional<Boolean> =
        showUpdatedSidenav.getOptional("show_updated_sidenav")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startupPlanApprovalDate(): Optional<String> =
        startupPlanApprovalDate.getOptional("startup_plan_approval_date")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantSkipTopkFacets(): Optional<Boolean> =
        tenantSkipTopkFacets.getOptional("tenant_skip_topk_facets")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadEvaluatorsEnabled(): Optional<Boolean> =
        threadEvaluatorsEnabled.getOptional("thread_evaluators_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useExactSearchForPrompts(): Optional<Boolean> =
        useExactSearchForPrompts.getOptional("use_exact_search_for_prompts")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usePythonPlaygroundService(): Optional<Boolean> =
        usePythonPlaygroundService.getOptional("use_python_playground_service")

    /**
     * Returns the raw JSON value of [allowCustomIframes].
     *
     * Unlike [allowCustomIframes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allow_custom_iframes")
    @ExcludeMissing
    fun _allowCustomIframes(): JsonField<Boolean> = allowCustomIframes

    /**
     * Returns the raw JSON value of [arbitraryCostTrackingEnabled].
     *
     * Unlike [arbitraryCostTrackingEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("arbitrary_cost_tracking_enabled")
    @ExcludeMissing
    fun _arbitraryCostTrackingEnabled(): JsonField<Boolean> = arbitraryCostTrackingEnabled

    /**
     * Returns the raw JSON value of [canAddSeats].
     *
     * Unlike [canAddSeats], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("can_add_seats")
    @ExcludeMissing
    fun _canAddSeats(): JsonField<Boolean> = canAddSeats

    /**
     * Returns the raw JSON value of [canDisablePublicSharing].
     *
     * Unlike [canDisablePublicSharing], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("can_disable_public_sharing")
    @ExcludeMissing
    fun _canDisablePublicSharing(): JsonField<Boolean> = canDisablePublicSharing

    /**
     * Returns the raw JSON value of [canServeDatasets].
     *
     * Unlike [canServeDatasets], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("can_serve_datasets")
    @ExcludeMissing
    fun _canServeDatasets(): JsonField<Boolean> = canServeDatasets

    /**
     * Returns the raw JSON value of [canUseAbac].
     *
     * Unlike [canUseAbac], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("can_use_abac") @ExcludeMissing fun _canUseAbac(): JsonField<Boolean> = canUseAbac

    /**
     * Returns the raw JSON value of [canUseAgentBuilder].
     *
     * Unlike [canUseAgentBuilder], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("can_use_agent_builder")
    @ExcludeMissing
    fun _canUseAgentBuilder(): JsonField<Boolean> = canUseAgentBuilder

    /**
     * Returns the raw JSON value of [canUseBulkExport].
     *
     * Unlike [canUseBulkExport], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("can_use_bulk_export")
    @ExcludeMissing
    fun _canUseBulkExport(): JsonField<Boolean> = canUseBulkExport

    /**
     * Returns the raw JSON value of [canUseLanggraphCloud].
     *
     * Unlike [canUseLanggraphCloud], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("can_use_langgraph_cloud")
    @ExcludeMissing
    fun _canUseLanggraphCloud(): JsonField<Boolean> = canUseLanggraphCloud

    /**
     * Returns the raw JSON value of [canUseRbac].
     *
     * Unlike [canUseRbac], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("can_use_rbac") @ExcludeMissing fun _canUseRbac(): JsonField<Boolean> = canUseRbac

    /**
     * Returns the raw JSON value of [canUseRemoteMcpServers].
     *
     * Unlike [canUseRemoteMcpServers], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("can_use_remote_mcp_servers")
    @ExcludeMissing
    fun _canUseRemoteMcpServers(): JsonField<Boolean> = canUseRemoteMcpServers

    /**
     * Returns the raw JSON value of [canUseSamlSso].
     *
     * Unlike [canUseSamlSso], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("can_use_saml_sso")
    @ExcludeMissing
    fun _canUseSamlSso(): JsonField<Boolean> = canUseSamlSso

    /**
     * Returns the raw JSON value of [clioEnabled].
     *
     * Unlike [clioEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clio_enabled")
    @ExcludeMissing
    fun _clioEnabled(): JsonField<Boolean> = clioEnabled

    /**
     * Returns the raw JSON value of [datadogRumSessionSampleRate].
     *
     * Unlike [datadogRumSessionSampleRate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("datadog_rum_session_sample_rate")
    @ExcludeMissing
    fun _datadogRumSessionSampleRate(): JsonField<Long> = datadogRumSessionSampleRate

    /**
     * Returns the raw JSON value of [demoLgpNewGraphEnabled].
     *
     * Unlike [demoLgpNewGraphEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("demo_lgp_new_graph_enabled")
    @ExcludeMissing
    fun _demoLgpNewGraphEnabled(): JsonField<Boolean> = demoLgpNewGraphEnabled

    /**
     * Returns the raw JSON value of [enableAlignEvaluators].
     *
     * Unlike [enableAlignEvaluators], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("enable_align_evaluators")
    @ExcludeMissing
    fun _enableAlignEvaluators(): JsonField<Boolean> = enableAlignEvaluators

    /**
     * Returns the raw JSON value of [enableIncludeExtendedStats].
     *
     * Unlike [enableIncludeExtendedStats], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enable_include_extended_stats")
    @ExcludeMissing
    fun _enableIncludeExtendedStats(): JsonField<Boolean> = enableIncludeExtendedStats

    /**
     * Returns the raw JSON value of [enableLanggraphPricing].
     *
     * Unlike [enableLanggraphPricing], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enable_langgraph_pricing")
    @ExcludeMissing
    fun _enableLanggraphPricing(): JsonField<Boolean> = enableLanggraphPricing

    /**
     * Returns the raw JSON value of [enableLgpListenersPage].
     *
     * Unlike [enableLgpListenersPage], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enable_lgp_listeners_page")
    @ExcludeMissing
    fun _enableLgpListenersPage(): JsonField<Boolean> = enableLgpListenersPage

    /**
     * Returns the raw JSON value of [enableMarkdownInTracing].
     *
     * Unlike [enableMarkdownInTracing], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enable_markdown_in_tracing")
    @ExcludeMissing
    fun _enableMarkdownInTracing(): JsonField<Boolean> = enableMarkdownInTracing

    /**
     * Returns the raw JSON value of [enableMonthlyUsageCharts].
     *
     * Unlike [enableMonthlyUsageCharts], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enable_monthly_usage_charts")
    @ExcludeMissing
    fun _enableMonthlyUsageCharts(): JsonField<Boolean> = enableMonthlyUsageCharts

    /**
     * Returns the raw JSON value of [enableOrgUsageCharts].
     *
     * Unlike [enableOrgUsageCharts], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("enable_org_usage_charts")
    @ExcludeMissing
    fun _enableOrgUsageCharts(): JsonField<Boolean> = enableOrgUsageCharts

    /**
     * Returns the raw JSON value of [enablePricingRedesign].
     *
     * Unlike [enablePricingRedesign], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("enable_pricing_redesign")
    @ExcludeMissing
    fun _enablePricingRedesign(): JsonField<Boolean> = enablePricingRedesign

    /**
     * Returns the raw JSON value of [enableQueryingV2Endpoints].
     *
     * Unlike [enableQueryingV2Endpoints], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enable_querying_v2_endpoints")
    @ExcludeMissing
    fun _enableQueryingV2Endpoints(): JsonField<Boolean> = enableQueryingV2Endpoints

    /**
     * Returns the raw JSON value of [enableRunTreeStreaming].
     *
     * Unlike [enableRunTreeStreaming], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enable_run_tree_streaming")
    @ExcludeMissing
    fun _enableRunTreeStreaming(): JsonField<Boolean> = enableRunTreeStreaming

    /**
     * Returns the raw JSON value of [enableThreadViewPlayground].
     *
     * Unlike [enableThreadViewPlayground], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enable_thread_view_playground")
    @ExcludeMissing
    fun _enableThreadViewPlayground(): JsonField<Boolean> = enableThreadViewPlayground

    /**
     * Returns the raw JSON value of [enableThreadsImprovements].
     *
     * Unlike [enableThreadsImprovements], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enable_threads_improvements")
    @ExcludeMissing
    fun _enableThreadsImprovements(): JsonField<Boolean> = enableThreadsImprovements

    /**
     * Returns the raw JSON value of [kvDatasetMessageSupport].
     *
     * Unlike [kvDatasetMessageSupport], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("kv_dataset_message_support")
    @ExcludeMissing
    fun _kvDatasetMessageSupport(): JsonField<Boolean> = kvDatasetMessageSupport

    /**
     * Returns the raw JSON value of [langgraphDeployOwnCloudEnabled].
     *
     * Unlike [langgraphDeployOwnCloudEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("langgraph_deploy_own_cloud_enabled")
    @ExcludeMissing
    fun _langgraphDeployOwnCloudEnabled(): JsonField<Boolean> = langgraphDeployOwnCloudEnabled

    /**
     * Returns the raw JSON value of [langgraphEnterpriseEnabled].
     *
     * Unlike [langgraphEnterpriseEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("langgraph_enterprise_enabled")
    @ExcludeMissing
    fun _langgraphEnterpriseEnabled(): JsonField<Boolean> = langgraphEnterpriseEnabled

    /**
     * Returns the raw JSON value of [langgraphRemoteReconcilerEnabled].
     *
     * Unlike [langgraphRemoteReconcilerEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("langgraph_remote_reconciler_enabled")
    @ExcludeMissing
    fun _langgraphRemoteReconcilerEnabled(): JsonField<Boolean> = langgraphRemoteReconcilerEnabled

    /**
     * Returns the raw JSON value of [langsmithAlertsLegacyPocEnabled].
     *
     * Unlike [langsmithAlertsLegacyPocEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("langsmith_alerts_legacy_poc_enabled")
    @ExcludeMissing
    fun _langsmithAlertsLegacyPocEnabled(): JsonField<Boolean> = langsmithAlertsLegacyPocEnabled

    /**
     * Returns the raw JSON value of [langsmithAlertsPocEnabled].
     *
     * Unlike [langsmithAlertsPocEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("langsmith_alerts_poc_enabled")
    @ExcludeMissing
    fun _langsmithAlertsPocEnabled(): JsonField<Boolean> = langsmithAlertsPocEnabled

    /**
     * Returns the raw JSON value of [langsmithExperimentalSearchEnabled].
     *
     * Unlike [langsmithExperimentalSearchEnabled], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("langsmith_experimental_search_enabled")
    @ExcludeMissing
    fun _langsmithExperimentalSearchEnabled(): JsonField<Boolean> =
        langsmithExperimentalSearchEnabled

    /**
     * Returns the raw JSON value of [lgpTemplatesEnabled].
     *
     * Unlike [lgpTemplatesEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lgp_templates_enabled")
    @ExcludeMissing
    fun _lgpTemplatesEnabled(): JsonField<Boolean> = lgpTemplatesEnabled

    /**
     * Returns the raw JSON value of [maxFreeLanggraphCloudDeployments].
     *
     * Unlike [maxFreeLanggraphCloudDeployments], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("max_free_langgraph_cloud_deployments")
    @ExcludeMissing
    fun _maxFreeLanggraphCloudDeployments(): JsonField<Long> = maxFreeLanggraphCloudDeployments

    /**
     * Returns the raw JSON value of [maxIdentities].
     *
     * Unlike [maxIdentities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_identities")
    @ExcludeMissing
    fun _maxIdentities(): JsonField<Long> = maxIdentities

    /**
     * Returns the raw JSON value of [maxLanggraphCloudDeployments].
     *
     * Unlike [maxLanggraphCloudDeployments], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("max_langgraph_cloud_deployments")
    @ExcludeMissing
    fun _maxLanggraphCloudDeployments(): JsonField<Long> = maxLanggraphCloudDeployments

    /**
     * Returns the raw JSON value of [maxPromptWebhooks].
     *
     * Unlike [maxPromptWebhooks], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_prompt_webhooks")
    @ExcludeMissing
    fun _maxPromptWebhooks(): JsonField<Long> = maxPromptWebhooks

    /**
     * Returns the raw JSON value of [maxThreadEvaluatorsPerTenant].
     *
     * Unlike [maxThreadEvaluatorsPerTenant], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("max_thread_evaluators_per_tenant")
    @ExcludeMissing
    fun _maxThreadEvaluatorsPerTenant(): JsonField<Long> = maxThreadEvaluatorsPerTenant

    /**
     * Returns the raw JSON value of [maxWorkspaces].
     *
     * Unlike [maxWorkspaces], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_workspaces")
    @ExcludeMissing
    fun _maxWorkspaces(): JsonField<Long> = maxWorkspaces

    /**
     * Returns the raw JSON value of [newRuleEvaluatorCreationVersion].
     *
     * Unlike [newRuleEvaluatorCreationVersion], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("new_rule_evaluator_creation_version")
    @ExcludeMissing
    fun _newRuleEvaluatorCreationVersion(): JsonField<Long> = newRuleEvaluatorCreationVersion

    /**
     * Returns the raw JSON value of [partnerPlanApprovalDate].
     *
     * Unlike [partnerPlanApprovalDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("partner_plan_approval_date")
    @ExcludeMissing
    fun _partnerPlanApprovalDate(): JsonField<String> = partnerPlanApprovalDate

    /**
     * Returns the raw JSON value of [playgroundEvaluatorStrategy].
     *
     * Unlike [playgroundEvaluatorStrategy], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("playground_evaluator_strategy")
    @ExcludeMissing
    fun _playgroundEvaluatorStrategy(): JsonField<String> = playgroundEvaluatorStrategy

    /**
     * Returns the raw JSON value of [premierPlanApprovalDate].
     *
     * Unlike [premierPlanApprovalDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("premier_plan_approval_date")
    @ExcludeMissing
    fun _premierPlanApprovalDate(): JsonField<String> = premierPlanApprovalDate

    /**
     * Returns the raw JSON value of [promptOptimizationJobsEnabled].
     *
     * Unlike [promptOptimizationJobsEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("prompt_optimization_jobs_enabled")
    @ExcludeMissing
    fun _promptOptimizationJobsEnabled(): JsonField<Boolean> = promptOptimizationJobsEnabled

    /**
     * Returns the raw JSON value of [requireCodeEvaluatorLanguageField].
     *
     * Unlike [requireCodeEvaluatorLanguageField], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("require_code_evaluator_language_field")
    @ExcludeMissing
    fun _requireCodeEvaluatorLanguageField(): JsonField<Boolean> = requireCodeEvaluatorLanguageField

    /**
     * Returns the raw JSON value of [showPlaygroundPromptCanvas].
     *
     * Unlike [showPlaygroundPromptCanvas], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("show_playground_prompt_canvas")
    @ExcludeMissing
    fun _showPlaygroundPromptCanvas(): JsonField<Boolean> = showPlaygroundPromptCanvas

    /**
     * Returns the raw JSON value of [showUpdatedResourceTags].
     *
     * Unlike [showUpdatedResourceTags], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("show_updated_resource_tags")
    @ExcludeMissing
    fun _showUpdatedResourceTags(): JsonField<Boolean> = showUpdatedResourceTags

    /**
     * Returns the raw JSON value of [showUpdatedSidenav].
     *
     * Unlike [showUpdatedSidenav], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("show_updated_sidenav")
    @ExcludeMissing
    fun _showUpdatedSidenav(): JsonField<Boolean> = showUpdatedSidenav

    /**
     * Returns the raw JSON value of [startupPlanApprovalDate].
     *
     * Unlike [startupPlanApprovalDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("startup_plan_approval_date")
    @ExcludeMissing
    fun _startupPlanApprovalDate(): JsonField<String> = startupPlanApprovalDate

    /**
     * Returns the raw JSON value of [tenantSkipTopkFacets].
     *
     * Unlike [tenantSkipTopkFacets], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tenant_skip_topk_facets")
    @ExcludeMissing
    fun _tenantSkipTopkFacets(): JsonField<Boolean> = tenantSkipTopkFacets

    /**
     * Returns the raw JSON value of [threadEvaluatorsEnabled].
     *
     * Unlike [threadEvaluatorsEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("thread_evaluators_enabled")
    @ExcludeMissing
    fun _threadEvaluatorsEnabled(): JsonField<Boolean> = threadEvaluatorsEnabled

    /**
     * Returns the raw JSON value of [useExactSearchForPrompts].
     *
     * Unlike [useExactSearchForPrompts], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("use_exact_search_for_prompts")
    @ExcludeMissing
    fun _useExactSearchForPrompts(): JsonField<Boolean> = useExactSearchForPrompts

    /**
     * Returns the raw JSON value of [usePythonPlaygroundService].
     *
     * Unlike [usePythonPlaygroundService], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("use_python_playground_service")
    @ExcludeMissing
    fun _usePythonPlaygroundService(): JsonField<Boolean> = usePythonPlaygroundService

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

        /** Returns a mutable builder for constructing an instance of [OrganizationConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrganizationConfig]. */
    class Builder internal constructor() {

        private var allowCustomIframes: JsonField<Boolean> = JsonMissing.of()
        private var arbitraryCostTrackingEnabled: JsonField<Boolean> = JsonMissing.of()
        private var canAddSeats: JsonField<Boolean> = JsonMissing.of()
        private var canDisablePublicSharing: JsonField<Boolean> = JsonMissing.of()
        private var canServeDatasets: JsonField<Boolean> = JsonMissing.of()
        private var canUseAbac: JsonField<Boolean> = JsonMissing.of()
        private var canUseAgentBuilder: JsonField<Boolean> = JsonMissing.of()
        private var canUseBulkExport: JsonField<Boolean> = JsonMissing.of()
        private var canUseLanggraphCloud: JsonField<Boolean> = JsonMissing.of()
        private var canUseRbac: JsonField<Boolean> = JsonMissing.of()
        private var canUseRemoteMcpServers: JsonField<Boolean> = JsonMissing.of()
        private var canUseSamlSso: JsonField<Boolean> = JsonMissing.of()
        private var clioEnabled: JsonField<Boolean> = JsonMissing.of()
        private var datadogRumSessionSampleRate: JsonField<Long> = JsonMissing.of()
        private var demoLgpNewGraphEnabled: JsonField<Boolean> = JsonMissing.of()
        private var enableAlignEvaluators: JsonField<Boolean> = JsonMissing.of()
        private var enableIncludeExtendedStats: JsonField<Boolean> = JsonMissing.of()
        private var enableLanggraphPricing: JsonField<Boolean> = JsonMissing.of()
        private var enableLgpListenersPage: JsonField<Boolean> = JsonMissing.of()
        private var enableMarkdownInTracing: JsonField<Boolean> = JsonMissing.of()
        private var enableMonthlyUsageCharts: JsonField<Boolean> = JsonMissing.of()
        private var enableOrgUsageCharts: JsonField<Boolean> = JsonMissing.of()
        private var enablePricingRedesign: JsonField<Boolean> = JsonMissing.of()
        private var enableQueryingV2Endpoints: JsonField<Boolean> = JsonMissing.of()
        private var enableRunTreeStreaming: JsonField<Boolean> = JsonMissing.of()
        private var enableThreadViewPlayground: JsonField<Boolean> = JsonMissing.of()
        private var enableThreadsImprovements: JsonField<Boolean> = JsonMissing.of()
        private var kvDatasetMessageSupport: JsonField<Boolean> = JsonMissing.of()
        private var langgraphDeployOwnCloudEnabled: JsonField<Boolean> = JsonMissing.of()
        private var langgraphEnterpriseEnabled: JsonField<Boolean> = JsonMissing.of()
        private var langgraphRemoteReconcilerEnabled: JsonField<Boolean> = JsonMissing.of()
        private var langsmithAlertsLegacyPocEnabled: JsonField<Boolean> = JsonMissing.of()
        private var langsmithAlertsPocEnabled: JsonField<Boolean> = JsonMissing.of()
        private var langsmithExperimentalSearchEnabled: JsonField<Boolean> = JsonMissing.of()
        private var lgpTemplatesEnabled: JsonField<Boolean> = JsonMissing.of()
        private var maxFreeLanggraphCloudDeployments: JsonField<Long> = JsonMissing.of()
        private var maxIdentities: JsonField<Long> = JsonMissing.of()
        private var maxLanggraphCloudDeployments: JsonField<Long> = JsonMissing.of()
        private var maxPromptWebhooks: JsonField<Long> = JsonMissing.of()
        private var maxThreadEvaluatorsPerTenant: JsonField<Long> = JsonMissing.of()
        private var maxWorkspaces: JsonField<Long> = JsonMissing.of()
        private var newRuleEvaluatorCreationVersion: JsonField<Long> = JsonMissing.of()
        private var partnerPlanApprovalDate: JsonField<String> = JsonMissing.of()
        private var playgroundEvaluatorStrategy: JsonField<String> = JsonMissing.of()
        private var premierPlanApprovalDate: JsonField<String> = JsonMissing.of()
        private var promptOptimizationJobsEnabled: JsonField<Boolean> = JsonMissing.of()
        private var requireCodeEvaluatorLanguageField: JsonField<Boolean> = JsonMissing.of()
        private var showPlaygroundPromptCanvas: JsonField<Boolean> = JsonMissing.of()
        private var showUpdatedResourceTags: JsonField<Boolean> = JsonMissing.of()
        private var showUpdatedSidenav: JsonField<Boolean> = JsonMissing.of()
        private var startupPlanApprovalDate: JsonField<String> = JsonMissing.of()
        private var tenantSkipTopkFacets: JsonField<Boolean> = JsonMissing.of()
        private var threadEvaluatorsEnabled: JsonField<Boolean> = JsonMissing.of()
        private var useExactSearchForPrompts: JsonField<Boolean> = JsonMissing.of()
        private var usePythonPlaygroundService: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organizationConfig: OrganizationConfig) = apply {
            allowCustomIframes = organizationConfig.allowCustomIframes
            arbitraryCostTrackingEnabled = organizationConfig.arbitraryCostTrackingEnabled
            canAddSeats = organizationConfig.canAddSeats
            canDisablePublicSharing = organizationConfig.canDisablePublicSharing
            canServeDatasets = organizationConfig.canServeDatasets
            canUseAbac = organizationConfig.canUseAbac
            canUseAgentBuilder = organizationConfig.canUseAgentBuilder
            canUseBulkExport = organizationConfig.canUseBulkExport
            canUseLanggraphCloud = organizationConfig.canUseLanggraphCloud
            canUseRbac = organizationConfig.canUseRbac
            canUseRemoteMcpServers = organizationConfig.canUseRemoteMcpServers
            canUseSamlSso = organizationConfig.canUseSamlSso
            clioEnabled = organizationConfig.clioEnabled
            datadogRumSessionSampleRate = organizationConfig.datadogRumSessionSampleRate
            demoLgpNewGraphEnabled = organizationConfig.demoLgpNewGraphEnabled
            enableAlignEvaluators = organizationConfig.enableAlignEvaluators
            enableIncludeExtendedStats = organizationConfig.enableIncludeExtendedStats
            enableLanggraphPricing = organizationConfig.enableLanggraphPricing
            enableLgpListenersPage = organizationConfig.enableLgpListenersPage
            enableMarkdownInTracing = organizationConfig.enableMarkdownInTracing
            enableMonthlyUsageCharts = organizationConfig.enableMonthlyUsageCharts
            enableOrgUsageCharts = organizationConfig.enableOrgUsageCharts
            enablePricingRedesign = organizationConfig.enablePricingRedesign
            enableQueryingV2Endpoints = organizationConfig.enableQueryingV2Endpoints
            enableRunTreeStreaming = organizationConfig.enableRunTreeStreaming
            enableThreadViewPlayground = organizationConfig.enableThreadViewPlayground
            enableThreadsImprovements = organizationConfig.enableThreadsImprovements
            kvDatasetMessageSupport = organizationConfig.kvDatasetMessageSupport
            langgraphDeployOwnCloudEnabled = organizationConfig.langgraphDeployOwnCloudEnabled
            langgraphEnterpriseEnabled = organizationConfig.langgraphEnterpriseEnabled
            langgraphRemoteReconcilerEnabled = organizationConfig.langgraphRemoteReconcilerEnabled
            langsmithAlertsLegacyPocEnabled = organizationConfig.langsmithAlertsLegacyPocEnabled
            langsmithAlertsPocEnabled = organizationConfig.langsmithAlertsPocEnabled
            langsmithExperimentalSearchEnabled =
                organizationConfig.langsmithExperimentalSearchEnabled
            lgpTemplatesEnabled = organizationConfig.lgpTemplatesEnabled
            maxFreeLanggraphCloudDeployments = organizationConfig.maxFreeLanggraphCloudDeployments
            maxIdentities = organizationConfig.maxIdentities
            maxLanggraphCloudDeployments = organizationConfig.maxLanggraphCloudDeployments
            maxPromptWebhooks = organizationConfig.maxPromptWebhooks
            maxThreadEvaluatorsPerTenant = organizationConfig.maxThreadEvaluatorsPerTenant
            maxWorkspaces = organizationConfig.maxWorkspaces
            newRuleEvaluatorCreationVersion = organizationConfig.newRuleEvaluatorCreationVersion
            partnerPlanApprovalDate = organizationConfig.partnerPlanApprovalDate
            playgroundEvaluatorStrategy = organizationConfig.playgroundEvaluatorStrategy
            premierPlanApprovalDate = organizationConfig.premierPlanApprovalDate
            promptOptimizationJobsEnabled = organizationConfig.promptOptimizationJobsEnabled
            requireCodeEvaluatorLanguageField = organizationConfig.requireCodeEvaluatorLanguageField
            showPlaygroundPromptCanvas = organizationConfig.showPlaygroundPromptCanvas
            showUpdatedResourceTags = organizationConfig.showUpdatedResourceTags
            showUpdatedSidenav = organizationConfig.showUpdatedSidenav
            startupPlanApprovalDate = organizationConfig.startupPlanApprovalDate
            tenantSkipTopkFacets = organizationConfig.tenantSkipTopkFacets
            threadEvaluatorsEnabled = organizationConfig.threadEvaluatorsEnabled
            useExactSearchForPrompts = organizationConfig.useExactSearchForPrompts
            usePythonPlaygroundService = organizationConfig.usePythonPlaygroundService
            additionalProperties = organizationConfig.additionalProperties.toMutableMap()
        }

        fun allowCustomIframes(allowCustomIframes: Boolean) =
            allowCustomIframes(JsonField.of(allowCustomIframes))

        /**
         * Sets [Builder.allowCustomIframes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowCustomIframes] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowCustomIframes(allowCustomIframes: JsonField<Boolean>) = apply {
            this.allowCustomIframes = allowCustomIframes
        }

        fun arbitraryCostTrackingEnabled(arbitraryCostTrackingEnabled: Boolean) =
            arbitraryCostTrackingEnabled(JsonField.of(arbitraryCostTrackingEnabled))

        /**
         * Sets [Builder.arbitraryCostTrackingEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arbitraryCostTrackingEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun arbitraryCostTrackingEnabled(arbitraryCostTrackingEnabled: JsonField<Boolean>) = apply {
            this.arbitraryCostTrackingEnabled = arbitraryCostTrackingEnabled
        }

        fun canAddSeats(canAddSeats: Boolean) = canAddSeats(JsonField.of(canAddSeats))

        /**
         * Sets [Builder.canAddSeats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canAddSeats] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun canAddSeats(canAddSeats: JsonField<Boolean>) = apply { this.canAddSeats = canAddSeats }

        fun canDisablePublicSharing(canDisablePublicSharing: Boolean) =
            canDisablePublicSharing(JsonField.of(canDisablePublicSharing))

        /**
         * Sets [Builder.canDisablePublicSharing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canDisablePublicSharing] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun canDisablePublicSharing(canDisablePublicSharing: JsonField<Boolean>) = apply {
            this.canDisablePublicSharing = canDisablePublicSharing
        }

        fun canServeDatasets(canServeDatasets: Boolean) =
            canServeDatasets(JsonField.of(canServeDatasets))

        /**
         * Sets [Builder.canServeDatasets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canServeDatasets] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun canServeDatasets(canServeDatasets: JsonField<Boolean>) = apply {
            this.canServeDatasets = canServeDatasets
        }

        fun canUseAbac(canUseAbac: Boolean) = canUseAbac(JsonField.of(canUseAbac))

        /**
         * Sets [Builder.canUseAbac] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canUseAbac] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun canUseAbac(canUseAbac: JsonField<Boolean>) = apply { this.canUseAbac = canUseAbac }

        fun canUseAgentBuilder(canUseAgentBuilder: Boolean) =
            canUseAgentBuilder(JsonField.of(canUseAgentBuilder))

        /**
         * Sets [Builder.canUseAgentBuilder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canUseAgentBuilder] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun canUseAgentBuilder(canUseAgentBuilder: JsonField<Boolean>) = apply {
            this.canUseAgentBuilder = canUseAgentBuilder
        }

        fun canUseBulkExport(canUseBulkExport: Boolean) =
            canUseBulkExport(JsonField.of(canUseBulkExport))

        /**
         * Sets [Builder.canUseBulkExport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canUseBulkExport] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun canUseBulkExport(canUseBulkExport: JsonField<Boolean>) = apply {
            this.canUseBulkExport = canUseBulkExport
        }

        fun canUseLanggraphCloud(canUseLanggraphCloud: Boolean) =
            canUseLanggraphCloud(JsonField.of(canUseLanggraphCloud))

        /**
         * Sets [Builder.canUseLanggraphCloud] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canUseLanggraphCloud] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun canUseLanggraphCloud(canUseLanggraphCloud: JsonField<Boolean>) = apply {
            this.canUseLanggraphCloud = canUseLanggraphCloud
        }

        fun canUseRbac(canUseRbac: Boolean) = canUseRbac(JsonField.of(canUseRbac))

        /**
         * Sets [Builder.canUseRbac] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canUseRbac] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun canUseRbac(canUseRbac: JsonField<Boolean>) = apply { this.canUseRbac = canUseRbac }

        fun canUseRemoteMcpServers(canUseRemoteMcpServers: Boolean) =
            canUseRemoteMcpServers(JsonField.of(canUseRemoteMcpServers))

        /**
         * Sets [Builder.canUseRemoteMcpServers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canUseRemoteMcpServers] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun canUseRemoteMcpServers(canUseRemoteMcpServers: JsonField<Boolean>) = apply {
            this.canUseRemoteMcpServers = canUseRemoteMcpServers
        }

        fun canUseSamlSso(canUseSamlSso: Boolean) = canUseSamlSso(JsonField.of(canUseSamlSso))

        /**
         * Sets [Builder.canUseSamlSso] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canUseSamlSso] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun canUseSamlSso(canUseSamlSso: JsonField<Boolean>) = apply {
            this.canUseSamlSso = canUseSamlSso
        }

        fun clioEnabled(clioEnabled: Boolean) = clioEnabled(JsonField.of(clioEnabled))

        /**
         * Sets [Builder.clioEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clioEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clioEnabled(clioEnabled: JsonField<Boolean>) = apply { this.clioEnabled = clioEnabled }

        fun datadogRumSessionSampleRate(datadogRumSessionSampleRate: Long) =
            datadogRumSessionSampleRate(JsonField.of(datadogRumSessionSampleRate))

        /**
         * Sets [Builder.datadogRumSessionSampleRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datadogRumSessionSampleRate] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun datadogRumSessionSampleRate(datadogRumSessionSampleRate: JsonField<Long>) = apply {
            this.datadogRumSessionSampleRate = datadogRumSessionSampleRate
        }

        fun demoLgpNewGraphEnabled(demoLgpNewGraphEnabled: Boolean) =
            demoLgpNewGraphEnabled(JsonField.of(demoLgpNewGraphEnabled))

        /**
         * Sets [Builder.demoLgpNewGraphEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.demoLgpNewGraphEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun demoLgpNewGraphEnabled(demoLgpNewGraphEnabled: JsonField<Boolean>) = apply {
            this.demoLgpNewGraphEnabled = demoLgpNewGraphEnabled
        }

        fun enableAlignEvaluators(enableAlignEvaluators: Boolean) =
            enableAlignEvaluators(JsonField.of(enableAlignEvaluators))

        /**
         * Sets [Builder.enableAlignEvaluators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableAlignEvaluators] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableAlignEvaluators(enableAlignEvaluators: JsonField<Boolean>) = apply {
            this.enableAlignEvaluators = enableAlignEvaluators
        }

        fun enableIncludeExtendedStats(enableIncludeExtendedStats: Boolean) =
            enableIncludeExtendedStats(JsonField.of(enableIncludeExtendedStats))

        /**
         * Sets [Builder.enableIncludeExtendedStats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableIncludeExtendedStats] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableIncludeExtendedStats(enableIncludeExtendedStats: JsonField<Boolean>) = apply {
            this.enableIncludeExtendedStats = enableIncludeExtendedStats
        }

        fun enableLanggraphPricing(enableLanggraphPricing: Boolean) =
            enableLanggraphPricing(JsonField.of(enableLanggraphPricing))

        /**
         * Sets [Builder.enableLanggraphPricing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableLanggraphPricing] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableLanggraphPricing(enableLanggraphPricing: JsonField<Boolean>) = apply {
            this.enableLanggraphPricing = enableLanggraphPricing
        }

        fun enableLgpListenersPage(enableLgpListenersPage: Boolean) =
            enableLgpListenersPage(JsonField.of(enableLgpListenersPage))

        /**
         * Sets [Builder.enableLgpListenersPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableLgpListenersPage] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableLgpListenersPage(enableLgpListenersPage: JsonField<Boolean>) = apply {
            this.enableLgpListenersPage = enableLgpListenersPage
        }

        fun enableMarkdownInTracing(enableMarkdownInTracing: Boolean) =
            enableMarkdownInTracing(JsonField.of(enableMarkdownInTracing))

        /**
         * Sets [Builder.enableMarkdownInTracing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableMarkdownInTracing] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableMarkdownInTracing(enableMarkdownInTracing: JsonField<Boolean>) = apply {
            this.enableMarkdownInTracing = enableMarkdownInTracing
        }

        fun enableMonthlyUsageCharts(enableMonthlyUsageCharts: Boolean) =
            enableMonthlyUsageCharts(JsonField.of(enableMonthlyUsageCharts))

        /**
         * Sets [Builder.enableMonthlyUsageCharts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableMonthlyUsageCharts] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableMonthlyUsageCharts(enableMonthlyUsageCharts: JsonField<Boolean>) = apply {
            this.enableMonthlyUsageCharts = enableMonthlyUsageCharts
        }

        fun enableOrgUsageCharts(enableOrgUsageCharts: Boolean) =
            enableOrgUsageCharts(JsonField.of(enableOrgUsageCharts))

        /**
         * Sets [Builder.enableOrgUsageCharts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableOrgUsageCharts] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableOrgUsageCharts(enableOrgUsageCharts: JsonField<Boolean>) = apply {
            this.enableOrgUsageCharts = enableOrgUsageCharts
        }

        fun enablePricingRedesign(enablePricingRedesign: Boolean) =
            enablePricingRedesign(JsonField.of(enablePricingRedesign))

        /**
         * Sets [Builder.enablePricingRedesign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enablePricingRedesign] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enablePricingRedesign(enablePricingRedesign: JsonField<Boolean>) = apply {
            this.enablePricingRedesign = enablePricingRedesign
        }

        fun enableQueryingV2Endpoints(enableQueryingV2Endpoints: Boolean) =
            enableQueryingV2Endpoints(JsonField.of(enableQueryingV2Endpoints))

        /**
         * Sets [Builder.enableQueryingV2Endpoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableQueryingV2Endpoints] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableQueryingV2Endpoints(enableQueryingV2Endpoints: JsonField<Boolean>) = apply {
            this.enableQueryingV2Endpoints = enableQueryingV2Endpoints
        }

        fun enableRunTreeStreaming(enableRunTreeStreaming: Boolean) =
            enableRunTreeStreaming(JsonField.of(enableRunTreeStreaming))

        /**
         * Sets [Builder.enableRunTreeStreaming] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableRunTreeStreaming] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableRunTreeStreaming(enableRunTreeStreaming: JsonField<Boolean>) = apply {
            this.enableRunTreeStreaming = enableRunTreeStreaming
        }

        fun enableThreadViewPlayground(enableThreadViewPlayground: Boolean) =
            enableThreadViewPlayground(JsonField.of(enableThreadViewPlayground))

        /**
         * Sets [Builder.enableThreadViewPlayground] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableThreadViewPlayground] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableThreadViewPlayground(enableThreadViewPlayground: JsonField<Boolean>) = apply {
            this.enableThreadViewPlayground = enableThreadViewPlayground
        }

        fun enableThreadsImprovements(enableThreadsImprovements: Boolean) =
            enableThreadsImprovements(JsonField.of(enableThreadsImprovements))

        /**
         * Sets [Builder.enableThreadsImprovements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableThreadsImprovements] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableThreadsImprovements(enableThreadsImprovements: JsonField<Boolean>) = apply {
            this.enableThreadsImprovements = enableThreadsImprovements
        }

        fun kvDatasetMessageSupport(kvDatasetMessageSupport: Boolean) =
            kvDatasetMessageSupport(JsonField.of(kvDatasetMessageSupport))

        /**
         * Sets [Builder.kvDatasetMessageSupport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kvDatasetMessageSupport] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun kvDatasetMessageSupport(kvDatasetMessageSupport: JsonField<Boolean>) = apply {
            this.kvDatasetMessageSupport = kvDatasetMessageSupport
        }

        fun langgraphDeployOwnCloudEnabled(langgraphDeployOwnCloudEnabled: Boolean) =
            langgraphDeployOwnCloudEnabled(JsonField.of(langgraphDeployOwnCloudEnabled))

        /**
         * Sets [Builder.langgraphDeployOwnCloudEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.langgraphDeployOwnCloudEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun langgraphDeployOwnCloudEnabled(langgraphDeployOwnCloudEnabled: JsonField<Boolean>) =
            apply {
                this.langgraphDeployOwnCloudEnabled = langgraphDeployOwnCloudEnabled
            }

        fun langgraphEnterpriseEnabled(langgraphEnterpriseEnabled: Boolean) =
            langgraphEnterpriseEnabled(JsonField.of(langgraphEnterpriseEnabled))

        /**
         * Sets [Builder.langgraphEnterpriseEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.langgraphEnterpriseEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun langgraphEnterpriseEnabled(langgraphEnterpriseEnabled: JsonField<Boolean>) = apply {
            this.langgraphEnterpriseEnabled = langgraphEnterpriseEnabled
        }

        fun langgraphRemoteReconcilerEnabled(langgraphRemoteReconcilerEnabled: Boolean) =
            langgraphRemoteReconcilerEnabled(JsonField.of(langgraphRemoteReconcilerEnabled))

        /**
         * Sets [Builder.langgraphRemoteReconcilerEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.langgraphRemoteReconcilerEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun langgraphRemoteReconcilerEnabled(langgraphRemoteReconcilerEnabled: JsonField<Boolean>) =
            apply {
                this.langgraphRemoteReconcilerEnabled = langgraphRemoteReconcilerEnabled
            }

        fun langsmithAlertsLegacyPocEnabled(langsmithAlertsLegacyPocEnabled: Boolean) =
            langsmithAlertsLegacyPocEnabled(JsonField.of(langsmithAlertsLegacyPocEnabled))

        /**
         * Sets [Builder.langsmithAlertsLegacyPocEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.langsmithAlertsLegacyPocEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun langsmithAlertsLegacyPocEnabled(langsmithAlertsLegacyPocEnabled: JsonField<Boolean>) =
            apply {
                this.langsmithAlertsLegacyPocEnabled = langsmithAlertsLegacyPocEnabled
            }

        fun langsmithAlertsPocEnabled(langsmithAlertsPocEnabled: Boolean) =
            langsmithAlertsPocEnabled(JsonField.of(langsmithAlertsPocEnabled))

        /**
         * Sets [Builder.langsmithAlertsPocEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.langsmithAlertsPocEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun langsmithAlertsPocEnabled(langsmithAlertsPocEnabled: JsonField<Boolean>) = apply {
            this.langsmithAlertsPocEnabled = langsmithAlertsPocEnabled
        }

        fun langsmithExperimentalSearchEnabled(langsmithExperimentalSearchEnabled: Boolean) =
            langsmithExperimentalSearchEnabled(JsonField.of(langsmithExperimentalSearchEnabled))

        /**
         * Sets [Builder.langsmithExperimentalSearchEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.langsmithExperimentalSearchEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun langsmithExperimentalSearchEnabled(
            langsmithExperimentalSearchEnabled: JsonField<Boolean>
        ) = apply { this.langsmithExperimentalSearchEnabled = langsmithExperimentalSearchEnabled }

        fun lgpTemplatesEnabled(lgpTemplatesEnabled: Boolean) =
            lgpTemplatesEnabled(JsonField.of(lgpTemplatesEnabled))

        /**
         * Sets [Builder.lgpTemplatesEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lgpTemplatesEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lgpTemplatesEnabled(lgpTemplatesEnabled: JsonField<Boolean>) = apply {
            this.lgpTemplatesEnabled = lgpTemplatesEnabled
        }

        fun maxFreeLanggraphCloudDeployments(maxFreeLanggraphCloudDeployments: Long) =
            maxFreeLanggraphCloudDeployments(JsonField.of(maxFreeLanggraphCloudDeployments))

        /**
         * Sets [Builder.maxFreeLanggraphCloudDeployments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxFreeLanggraphCloudDeployments] with a well-typed
         * [Long] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun maxFreeLanggraphCloudDeployments(maxFreeLanggraphCloudDeployments: JsonField<Long>) =
            apply {
                this.maxFreeLanggraphCloudDeployments = maxFreeLanggraphCloudDeployments
            }

        fun maxIdentities(maxIdentities: Long) = maxIdentities(JsonField.of(maxIdentities))

        /**
         * Sets [Builder.maxIdentities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxIdentities] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxIdentities(maxIdentities: JsonField<Long>) = apply {
            this.maxIdentities = maxIdentities
        }

        fun maxLanggraphCloudDeployments(maxLanggraphCloudDeployments: Long) =
            maxLanggraphCloudDeployments(JsonField.of(maxLanggraphCloudDeployments))

        /**
         * Sets [Builder.maxLanggraphCloudDeployments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxLanggraphCloudDeployments] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun maxLanggraphCloudDeployments(maxLanggraphCloudDeployments: JsonField<Long>) = apply {
            this.maxLanggraphCloudDeployments = maxLanggraphCloudDeployments
        }

        fun maxPromptWebhooks(maxPromptWebhooks: Long) =
            maxPromptWebhooks(JsonField.of(maxPromptWebhooks))

        /**
         * Sets [Builder.maxPromptWebhooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxPromptWebhooks] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxPromptWebhooks(maxPromptWebhooks: JsonField<Long>) = apply {
            this.maxPromptWebhooks = maxPromptWebhooks
        }

        fun maxThreadEvaluatorsPerTenant(maxThreadEvaluatorsPerTenant: Long) =
            maxThreadEvaluatorsPerTenant(JsonField.of(maxThreadEvaluatorsPerTenant))

        /**
         * Sets [Builder.maxThreadEvaluatorsPerTenant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxThreadEvaluatorsPerTenant] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun maxThreadEvaluatorsPerTenant(maxThreadEvaluatorsPerTenant: JsonField<Long>) = apply {
            this.maxThreadEvaluatorsPerTenant = maxThreadEvaluatorsPerTenant
        }

        fun maxWorkspaces(maxWorkspaces: Long) = maxWorkspaces(JsonField.of(maxWorkspaces))

        /**
         * Sets [Builder.maxWorkspaces] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxWorkspaces] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxWorkspaces(maxWorkspaces: JsonField<Long>) = apply {
            this.maxWorkspaces = maxWorkspaces
        }

        fun newRuleEvaluatorCreationVersion(newRuleEvaluatorCreationVersion: Long) =
            newRuleEvaluatorCreationVersion(JsonField.of(newRuleEvaluatorCreationVersion))

        /**
         * Sets [Builder.newRuleEvaluatorCreationVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newRuleEvaluatorCreationVersion] with a well-typed
         * [Long] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun newRuleEvaluatorCreationVersion(newRuleEvaluatorCreationVersion: JsonField<Long>) =
            apply {
                this.newRuleEvaluatorCreationVersion = newRuleEvaluatorCreationVersion
            }

        fun partnerPlanApprovalDate(partnerPlanApprovalDate: String?) =
            partnerPlanApprovalDate(JsonField.ofNullable(partnerPlanApprovalDate))

        /**
         * Alias for calling [Builder.partnerPlanApprovalDate] with
         * `partnerPlanApprovalDate.orElse(null)`.
         */
        fun partnerPlanApprovalDate(partnerPlanApprovalDate: Optional<String>) =
            partnerPlanApprovalDate(partnerPlanApprovalDate.getOrNull())

        /**
         * Sets [Builder.partnerPlanApprovalDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partnerPlanApprovalDate] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun partnerPlanApprovalDate(partnerPlanApprovalDate: JsonField<String>) = apply {
            this.partnerPlanApprovalDate = partnerPlanApprovalDate
        }

        fun playgroundEvaluatorStrategy(playgroundEvaluatorStrategy: String?) =
            playgroundEvaluatorStrategy(JsonField.ofNullable(playgroundEvaluatorStrategy))

        /**
         * Alias for calling [Builder.playgroundEvaluatorStrategy] with
         * `playgroundEvaluatorStrategy.orElse(null)`.
         */
        fun playgroundEvaluatorStrategy(playgroundEvaluatorStrategy: Optional<String>) =
            playgroundEvaluatorStrategy(playgroundEvaluatorStrategy.getOrNull())

        /**
         * Sets [Builder.playgroundEvaluatorStrategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playgroundEvaluatorStrategy] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun playgroundEvaluatorStrategy(playgroundEvaluatorStrategy: JsonField<String>) = apply {
            this.playgroundEvaluatorStrategy = playgroundEvaluatorStrategy
        }

        fun premierPlanApprovalDate(premierPlanApprovalDate: String?) =
            premierPlanApprovalDate(JsonField.ofNullable(premierPlanApprovalDate))

        /**
         * Alias for calling [Builder.premierPlanApprovalDate] with
         * `premierPlanApprovalDate.orElse(null)`.
         */
        fun premierPlanApprovalDate(premierPlanApprovalDate: Optional<String>) =
            premierPlanApprovalDate(premierPlanApprovalDate.getOrNull())

        /**
         * Sets [Builder.premierPlanApprovalDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.premierPlanApprovalDate] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun premierPlanApprovalDate(premierPlanApprovalDate: JsonField<String>) = apply {
            this.premierPlanApprovalDate = premierPlanApprovalDate
        }

        fun promptOptimizationJobsEnabled(promptOptimizationJobsEnabled: Boolean) =
            promptOptimizationJobsEnabled(JsonField.of(promptOptimizationJobsEnabled))

        /**
         * Sets [Builder.promptOptimizationJobsEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptOptimizationJobsEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun promptOptimizationJobsEnabled(promptOptimizationJobsEnabled: JsonField<Boolean>) =
            apply {
                this.promptOptimizationJobsEnabled = promptOptimizationJobsEnabled
            }

        fun requireCodeEvaluatorLanguageField(requireCodeEvaluatorLanguageField: Boolean) =
            requireCodeEvaluatorLanguageField(JsonField.of(requireCodeEvaluatorLanguageField))

        /**
         * Sets [Builder.requireCodeEvaluatorLanguageField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requireCodeEvaluatorLanguageField] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun requireCodeEvaluatorLanguageField(
            requireCodeEvaluatorLanguageField: JsonField<Boolean>
        ) = apply { this.requireCodeEvaluatorLanguageField = requireCodeEvaluatorLanguageField }

        fun showPlaygroundPromptCanvas(showPlaygroundPromptCanvas: Boolean) =
            showPlaygroundPromptCanvas(JsonField.of(showPlaygroundPromptCanvas))

        /**
         * Sets [Builder.showPlaygroundPromptCanvas] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showPlaygroundPromptCanvas] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun showPlaygroundPromptCanvas(showPlaygroundPromptCanvas: JsonField<Boolean>) = apply {
            this.showPlaygroundPromptCanvas = showPlaygroundPromptCanvas
        }

        fun showUpdatedResourceTags(showUpdatedResourceTags: Boolean) =
            showUpdatedResourceTags(JsonField.of(showUpdatedResourceTags))

        /**
         * Sets [Builder.showUpdatedResourceTags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showUpdatedResourceTags] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun showUpdatedResourceTags(showUpdatedResourceTags: JsonField<Boolean>) = apply {
            this.showUpdatedResourceTags = showUpdatedResourceTags
        }

        fun showUpdatedSidenav(showUpdatedSidenav: Boolean) =
            showUpdatedSidenav(JsonField.of(showUpdatedSidenav))

        /**
         * Sets [Builder.showUpdatedSidenav] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showUpdatedSidenav] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun showUpdatedSidenav(showUpdatedSidenav: JsonField<Boolean>) = apply {
            this.showUpdatedSidenav = showUpdatedSidenav
        }

        fun startupPlanApprovalDate(startupPlanApprovalDate: String?) =
            startupPlanApprovalDate(JsonField.ofNullable(startupPlanApprovalDate))

        /**
         * Alias for calling [Builder.startupPlanApprovalDate] with
         * `startupPlanApprovalDate.orElse(null)`.
         */
        fun startupPlanApprovalDate(startupPlanApprovalDate: Optional<String>) =
            startupPlanApprovalDate(startupPlanApprovalDate.getOrNull())

        /**
         * Sets [Builder.startupPlanApprovalDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startupPlanApprovalDate] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun startupPlanApprovalDate(startupPlanApprovalDate: JsonField<String>) = apply {
            this.startupPlanApprovalDate = startupPlanApprovalDate
        }

        fun tenantSkipTopkFacets(tenantSkipTopkFacets: Boolean) =
            tenantSkipTopkFacets(JsonField.of(tenantSkipTopkFacets))

        /**
         * Sets [Builder.tenantSkipTopkFacets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantSkipTopkFacets] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tenantSkipTopkFacets(tenantSkipTopkFacets: JsonField<Boolean>) = apply {
            this.tenantSkipTopkFacets = tenantSkipTopkFacets
        }

        fun threadEvaluatorsEnabled(threadEvaluatorsEnabled: Boolean) =
            threadEvaluatorsEnabled(JsonField.of(threadEvaluatorsEnabled))

        /**
         * Sets [Builder.threadEvaluatorsEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadEvaluatorsEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun threadEvaluatorsEnabled(threadEvaluatorsEnabled: JsonField<Boolean>) = apply {
            this.threadEvaluatorsEnabled = threadEvaluatorsEnabled
        }

        fun useExactSearchForPrompts(useExactSearchForPrompts: Boolean) =
            useExactSearchForPrompts(JsonField.of(useExactSearchForPrompts))

        /**
         * Sets [Builder.useExactSearchForPrompts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useExactSearchForPrompts] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun useExactSearchForPrompts(useExactSearchForPrompts: JsonField<Boolean>) = apply {
            this.useExactSearchForPrompts = useExactSearchForPrompts
        }

        fun usePythonPlaygroundService(usePythonPlaygroundService: Boolean) =
            usePythonPlaygroundService(JsonField.of(usePythonPlaygroundService))

        /**
         * Sets [Builder.usePythonPlaygroundService] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usePythonPlaygroundService] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun usePythonPlaygroundService(usePythonPlaygroundService: JsonField<Boolean>) = apply {
            this.usePythonPlaygroundService = usePythonPlaygroundService
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
         * Returns an immutable instance of [OrganizationConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OrganizationConfig =
            OrganizationConfig(
                allowCustomIframes,
                arbitraryCostTrackingEnabled,
                canAddSeats,
                canDisablePublicSharing,
                canServeDatasets,
                canUseAbac,
                canUseAgentBuilder,
                canUseBulkExport,
                canUseLanggraphCloud,
                canUseRbac,
                canUseRemoteMcpServers,
                canUseSamlSso,
                clioEnabled,
                datadogRumSessionSampleRate,
                demoLgpNewGraphEnabled,
                enableAlignEvaluators,
                enableIncludeExtendedStats,
                enableLanggraphPricing,
                enableLgpListenersPage,
                enableMarkdownInTracing,
                enableMonthlyUsageCharts,
                enableOrgUsageCharts,
                enablePricingRedesign,
                enableQueryingV2Endpoints,
                enableRunTreeStreaming,
                enableThreadViewPlayground,
                enableThreadsImprovements,
                kvDatasetMessageSupport,
                langgraphDeployOwnCloudEnabled,
                langgraphEnterpriseEnabled,
                langgraphRemoteReconcilerEnabled,
                langsmithAlertsLegacyPocEnabled,
                langsmithAlertsPocEnabled,
                langsmithExperimentalSearchEnabled,
                lgpTemplatesEnabled,
                maxFreeLanggraphCloudDeployments,
                maxIdentities,
                maxLanggraphCloudDeployments,
                maxPromptWebhooks,
                maxThreadEvaluatorsPerTenant,
                maxWorkspaces,
                newRuleEvaluatorCreationVersion,
                partnerPlanApprovalDate,
                playgroundEvaluatorStrategy,
                premierPlanApprovalDate,
                promptOptimizationJobsEnabled,
                requireCodeEvaluatorLanguageField,
                showPlaygroundPromptCanvas,
                showUpdatedResourceTags,
                showUpdatedSidenav,
                startupPlanApprovalDate,
                tenantSkipTopkFacets,
                threadEvaluatorsEnabled,
                useExactSearchForPrompts,
                usePythonPlaygroundService,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OrganizationConfig = apply {
        if (validated) {
            return@apply
        }

        allowCustomIframes()
        arbitraryCostTrackingEnabled()
        canAddSeats()
        canDisablePublicSharing()
        canServeDatasets()
        canUseAbac()
        canUseAgentBuilder()
        canUseBulkExport()
        canUseLanggraphCloud()
        canUseRbac()
        canUseRemoteMcpServers()
        canUseSamlSso()
        clioEnabled()
        datadogRumSessionSampleRate()
        demoLgpNewGraphEnabled()
        enableAlignEvaluators()
        enableIncludeExtendedStats()
        enableLanggraphPricing()
        enableLgpListenersPage()
        enableMarkdownInTracing()
        enableMonthlyUsageCharts()
        enableOrgUsageCharts()
        enablePricingRedesign()
        enableQueryingV2Endpoints()
        enableRunTreeStreaming()
        enableThreadViewPlayground()
        enableThreadsImprovements()
        kvDatasetMessageSupport()
        langgraphDeployOwnCloudEnabled()
        langgraphEnterpriseEnabled()
        langgraphRemoteReconcilerEnabled()
        langsmithAlertsLegacyPocEnabled()
        langsmithAlertsPocEnabled()
        langsmithExperimentalSearchEnabled()
        lgpTemplatesEnabled()
        maxFreeLanggraphCloudDeployments()
        maxIdentities()
        maxLanggraphCloudDeployments()
        maxPromptWebhooks()
        maxThreadEvaluatorsPerTenant()
        maxWorkspaces()
        newRuleEvaluatorCreationVersion()
        partnerPlanApprovalDate()
        playgroundEvaluatorStrategy()
        premierPlanApprovalDate()
        promptOptimizationJobsEnabled()
        requireCodeEvaluatorLanguageField()
        showPlaygroundPromptCanvas()
        showUpdatedResourceTags()
        showUpdatedSidenav()
        startupPlanApprovalDate()
        tenantSkipTopkFacets()
        threadEvaluatorsEnabled()
        useExactSearchForPrompts()
        usePythonPlaygroundService()
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
        (if (allowCustomIframes.asKnown().isPresent) 1 else 0) +
            (if (arbitraryCostTrackingEnabled.asKnown().isPresent) 1 else 0) +
            (if (canAddSeats.asKnown().isPresent) 1 else 0) +
            (if (canDisablePublicSharing.asKnown().isPresent) 1 else 0) +
            (if (canServeDatasets.asKnown().isPresent) 1 else 0) +
            (if (canUseAbac.asKnown().isPresent) 1 else 0) +
            (if (canUseAgentBuilder.asKnown().isPresent) 1 else 0) +
            (if (canUseBulkExport.asKnown().isPresent) 1 else 0) +
            (if (canUseLanggraphCloud.asKnown().isPresent) 1 else 0) +
            (if (canUseRbac.asKnown().isPresent) 1 else 0) +
            (if (canUseRemoteMcpServers.asKnown().isPresent) 1 else 0) +
            (if (canUseSamlSso.asKnown().isPresent) 1 else 0) +
            (if (clioEnabled.asKnown().isPresent) 1 else 0) +
            (if (datadogRumSessionSampleRate.asKnown().isPresent) 1 else 0) +
            (if (demoLgpNewGraphEnabled.asKnown().isPresent) 1 else 0) +
            (if (enableAlignEvaluators.asKnown().isPresent) 1 else 0) +
            (if (enableIncludeExtendedStats.asKnown().isPresent) 1 else 0) +
            (if (enableLanggraphPricing.asKnown().isPresent) 1 else 0) +
            (if (enableLgpListenersPage.asKnown().isPresent) 1 else 0) +
            (if (enableMarkdownInTracing.asKnown().isPresent) 1 else 0) +
            (if (enableMonthlyUsageCharts.asKnown().isPresent) 1 else 0) +
            (if (enableOrgUsageCharts.asKnown().isPresent) 1 else 0) +
            (if (enablePricingRedesign.asKnown().isPresent) 1 else 0) +
            (if (enableQueryingV2Endpoints.asKnown().isPresent) 1 else 0) +
            (if (enableRunTreeStreaming.asKnown().isPresent) 1 else 0) +
            (if (enableThreadViewPlayground.asKnown().isPresent) 1 else 0) +
            (if (enableThreadsImprovements.asKnown().isPresent) 1 else 0) +
            (if (kvDatasetMessageSupport.asKnown().isPresent) 1 else 0) +
            (if (langgraphDeployOwnCloudEnabled.asKnown().isPresent) 1 else 0) +
            (if (langgraphEnterpriseEnabled.asKnown().isPresent) 1 else 0) +
            (if (langgraphRemoteReconcilerEnabled.asKnown().isPresent) 1 else 0) +
            (if (langsmithAlertsLegacyPocEnabled.asKnown().isPresent) 1 else 0) +
            (if (langsmithAlertsPocEnabled.asKnown().isPresent) 1 else 0) +
            (if (langsmithExperimentalSearchEnabled.asKnown().isPresent) 1 else 0) +
            (if (lgpTemplatesEnabled.asKnown().isPresent) 1 else 0) +
            (if (maxFreeLanggraphCloudDeployments.asKnown().isPresent) 1 else 0) +
            (if (maxIdentities.asKnown().isPresent) 1 else 0) +
            (if (maxLanggraphCloudDeployments.asKnown().isPresent) 1 else 0) +
            (if (maxPromptWebhooks.asKnown().isPresent) 1 else 0) +
            (if (maxThreadEvaluatorsPerTenant.asKnown().isPresent) 1 else 0) +
            (if (maxWorkspaces.asKnown().isPresent) 1 else 0) +
            (if (newRuleEvaluatorCreationVersion.asKnown().isPresent) 1 else 0) +
            (if (partnerPlanApprovalDate.asKnown().isPresent) 1 else 0) +
            (if (playgroundEvaluatorStrategy.asKnown().isPresent) 1 else 0) +
            (if (premierPlanApprovalDate.asKnown().isPresent) 1 else 0) +
            (if (promptOptimizationJobsEnabled.asKnown().isPresent) 1 else 0) +
            (if (requireCodeEvaluatorLanguageField.asKnown().isPresent) 1 else 0) +
            (if (showPlaygroundPromptCanvas.asKnown().isPresent) 1 else 0) +
            (if (showUpdatedResourceTags.asKnown().isPresent) 1 else 0) +
            (if (showUpdatedSidenav.asKnown().isPresent) 1 else 0) +
            (if (startupPlanApprovalDate.asKnown().isPresent) 1 else 0) +
            (if (tenantSkipTopkFacets.asKnown().isPresent) 1 else 0) +
            (if (threadEvaluatorsEnabled.asKnown().isPresent) 1 else 0) +
            (if (useExactSearchForPrompts.asKnown().isPresent) 1 else 0) +
            (if (usePythonPlaygroundService.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrganizationConfig &&
            allowCustomIframes == other.allowCustomIframes &&
            arbitraryCostTrackingEnabled == other.arbitraryCostTrackingEnabled &&
            canAddSeats == other.canAddSeats &&
            canDisablePublicSharing == other.canDisablePublicSharing &&
            canServeDatasets == other.canServeDatasets &&
            canUseAbac == other.canUseAbac &&
            canUseAgentBuilder == other.canUseAgentBuilder &&
            canUseBulkExport == other.canUseBulkExport &&
            canUseLanggraphCloud == other.canUseLanggraphCloud &&
            canUseRbac == other.canUseRbac &&
            canUseRemoteMcpServers == other.canUseRemoteMcpServers &&
            canUseSamlSso == other.canUseSamlSso &&
            clioEnabled == other.clioEnabled &&
            datadogRumSessionSampleRate == other.datadogRumSessionSampleRate &&
            demoLgpNewGraphEnabled == other.demoLgpNewGraphEnabled &&
            enableAlignEvaluators == other.enableAlignEvaluators &&
            enableIncludeExtendedStats == other.enableIncludeExtendedStats &&
            enableLanggraphPricing == other.enableLanggraphPricing &&
            enableLgpListenersPage == other.enableLgpListenersPage &&
            enableMarkdownInTracing == other.enableMarkdownInTracing &&
            enableMonthlyUsageCharts == other.enableMonthlyUsageCharts &&
            enableOrgUsageCharts == other.enableOrgUsageCharts &&
            enablePricingRedesign == other.enablePricingRedesign &&
            enableQueryingV2Endpoints == other.enableQueryingV2Endpoints &&
            enableRunTreeStreaming == other.enableRunTreeStreaming &&
            enableThreadViewPlayground == other.enableThreadViewPlayground &&
            enableThreadsImprovements == other.enableThreadsImprovements &&
            kvDatasetMessageSupport == other.kvDatasetMessageSupport &&
            langgraphDeployOwnCloudEnabled == other.langgraphDeployOwnCloudEnabled &&
            langgraphEnterpriseEnabled == other.langgraphEnterpriseEnabled &&
            langgraphRemoteReconcilerEnabled == other.langgraphRemoteReconcilerEnabled &&
            langsmithAlertsLegacyPocEnabled == other.langsmithAlertsLegacyPocEnabled &&
            langsmithAlertsPocEnabled == other.langsmithAlertsPocEnabled &&
            langsmithExperimentalSearchEnabled == other.langsmithExperimentalSearchEnabled &&
            lgpTemplatesEnabled == other.lgpTemplatesEnabled &&
            maxFreeLanggraphCloudDeployments == other.maxFreeLanggraphCloudDeployments &&
            maxIdentities == other.maxIdentities &&
            maxLanggraphCloudDeployments == other.maxLanggraphCloudDeployments &&
            maxPromptWebhooks == other.maxPromptWebhooks &&
            maxThreadEvaluatorsPerTenant == other.maxThreadEvaluatorsPerTenant &&
            maxWorkspaces == other.maxWorkspaces &&
            newRuleEvaluatorCreationVersion == other.newRuleEvaluatorCreationVersion &&
            partnerPlanApprovalDate == other.partnerPlanApprovalDate &&
            playgroundEvaluatorStrategy == other.playgroundEvaluatorStrategy &&
            premierPlanApprovalDate == other.premierPlanApprovalDate &&
            promptOptimizationJobsEnabled == other.promptOptimizationJobsEnabled &&
            requireCodeEvaluatorLanguageField == other.requireCodeEvaluatorLanguageField &&
            showPlaygroundPromptCanvas == other.showPlaygroundPromptCanvas &&
            showUpdatedResourceTags == other.showUpdatedResourceTags &&
            showUpdatedSidenav == other.showUpdatedSidenav &&
            startupPlanApprovalDate == other.startupPlanApprovalDate &&
            tenantSkipTopkFacets == other.tenantSkipTopkFacets &&
            threadEvaluatorsEnabled == other.threadEvaluatorsEnabled &&
            useExactSearchForPrompts == other.useExactSearchForPrompts &&
            usePythonPlaygroundService == other.usePythonPlaygroundService &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            allowCustomIframes,
            arbitraryCostTrackingEnabled,
            canAddSeats,
            canDisablePublicSharing,
            canServeDatasets,
            canUseAbac,
            canUseAgentBuilder,
            canUseBulkExport,
            canUseLanggraphCloud,
            canUseRbac,
            canUseRemoteMcpServers,
            canUseSamlSso,
            clioEnabled,
            datadogRumSessionSampleRate,
            demoLgpNewGraphEnabled,
            enableAlignEvaluators,
            enableIncludeExtendedStats,
            enableLanggraphPricing,
            enableLgpListenersPage,
            enableMarkdownInTracing,
            enableMonthlyUsageCharts,
            enableOrgUsageCharts,
            enablePricingRedesign,
            enableQueryingV2Endpoints,
            enableRunTreeStreaming,
            enableThreadViewPlayground,
            enableThreadsImprovements,
            kvDatasetMessageSupport,
            langgraphDeployOwnCloudEnabled,
            langgraphEnterpriseEnabled,
            langgraphRemoteReconcilerEnabled,
            langsmithAlertsLegacyPocEnabled,
            langsmithAlertsPocEnabled,
            langsmithExperimentalSearchEnabled,
            lgpTemplatesEnabled,
            maxFreeLanggraphCloudDeployments,
            maxIdentities,
            maxLanggraphCloudDeployments,
            maxPromptWebhooks,
            maxThreadEvaluatorsPerTenant,
            maxWorkspaces,
            newRuleEvaluatorCreationVersion,
            partnerPlanApprovalDate,
            playgroundEvaluatorStrategy,
            premierPlanApprovalDate,
            promptOptimizationJobsEnabled,
            requireCodeEvaluatorLanguageField,
            showPlaygroundPromptCanvas,
            showUpdatedResourceTags,
            showUpdatedSidenav,
            startupPlanApprovalDate,
            tenantSkipTopkFacets,
            threadEvaluatorsEnabled,
            useExactSearchForPrompts,
            usePythonPlaygroundService,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrganizationConfig{allowCustomIframes=$allowCustomIframes, arbitraryCostTrackingEnabled=$arbitraryCostTrackingEnabled, canAddSeats=$canAddSeats, canDisablePublicSharing=$canDisablePublicSharing, canServeDatasets=$canServeDatasets, canUseAbac=$canUseAbac, canUseAgentBuilder=$canUseAgentBuilder, canUseBulkExport=$canUseBulkExport, canUseLanggraphCloud=$canUseLanggraphCloud, canUseRbac=$canUseRbac, canUseRemoteMcpServers=$canUseRemoteMcpServers, canUseSamlSso=$canUseSamlSso, clioEnabled=$clioEnabled, datadogRumSessionSampleRate=$datadogRumSessionSampleRate, demoLgpNewGraphEnabled=$demoLgpNewGraphEnabled, enableAlignEvaluators=$enableAlignEvaluators, enableIncludeExtendedStats=$enableIncludeExtendedStats, enableLanggraphPricing=$enableLanggraphPricing, enableLgpListenersPage=$enableLgpListenersPage, enableMarkdownInTracing=$enableMarkdownInTracing, enableMonthlyUsageCharts=$enableMonthlyUsageCharts, enableOrgUsageCharts=$enableOrgUsageCharts, enablePricingRedesign=$enablePricingRedesign, enableQueryingV2Endpoints=$enableQueryingV2Endpoints, enableRunTreeStreaming=$enableRunTreeStreaming, enableThreadViewPlayground=$enableThreadViewPlayground, enableThreadsImprovements=$enableThreadsImprovements, kvDatasetMessageSupport=$kvDatasetMessageSupport, langgraphDeployOwnCloudEnabled=$langgraphDeployOwnCloudEnabled, langgraphEnterpriseEnabled=$langgraphEnterpriseEnabled, langgraphRemoteReconcilerEnabled=$langgraphRemoteReconcilerEnabled, langsmithAlertsLegacyPocEnabled=$langsmithAlertsLegacyPocEnabled, langsmithAlertsPocEnabled=$langsmithAlertsPocEnabled, langsmithExperimentalSearchEnabled=$langsmithExperimentalSearchEnabled, lgpTemplatesEnabled=$lgpTemplatesEnabled, maxFreeLanggraphCloudDeployments=$maxFreeLanggraphCloudDeployments, maxIdentities=$maxIdentities, maxLanggraphCloudDeployments=$maxLanggraphCloudDeployments, maxPromptWebhooks=$maxPromptWebhooks, maxThreadEvaluatorsPerTenant=$maxThreadEvaluatorsPerTenant, maxWorkspaces=$maxWorkspaces, newRuleEvaluatorCreationVersion=$newRuleEvaluatorCreationVersion, partnerPlanApprovalDate=$partnerPlanApprovalDate, playgroundEvaluatorStrategy=$playgroundEvaluatorStrategy, premierPlanApprovalDate=$premierPlanApprovalDate, promptOptimizationJobsEnabled=$promptOptimizationJobsEnabled, requireCodeEvaluatorLanguageField=$requireCodeEvaluatorLanguageField, showPlaygroundPromptCanvas=$showPlaygroundPromptCanvas, showUpdatedResourceTags=$showUpdatedResourceTags, showUpdatedSidenav=$showUpdatedSidenav, startupPlanApprovalDate=$startupPlanApprovalDate, tenantSkipTopkFacets=$tenantSkipTopkFacets, threadEvaluatorsEnabled=$threadEvaluatorsEnabled, useExactSearchForPrompts=$useExactSearchForPrompts, usePythonPlaygroundService=$usePythonPlaygroundService, additionalProperties=$additionalProperties}"
}
