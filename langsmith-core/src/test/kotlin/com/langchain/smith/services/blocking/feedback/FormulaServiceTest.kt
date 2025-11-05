// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.feedback

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.feedback.formulas.FeedbackFormulaWeightedVariable
import com.langchain.smith.models.feedback.formulas.FormulaCreateParams
import com.langchain.smith.models.feedback.formulas.FormulaListParams
import com.langchain.smith.models.feedback.formulas.FormulaUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FormulaServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val formulaService = client.feedback().formulas()

        val feedbackFormula =
            formulaService.create(
                FormulaCreateParams.builder()
                    .aggregationType(FormulaCreateParams.AggregationType.SUM)
                    .feedbackKey("feedback_key")
                    .addFormulaPart(
                        FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build()
                    )
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        feedbackFormula.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val formulaService = client.feedback().formulas()

        val feedbackFormula = formulaService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        feedbackFormula.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val formulaService = client.feedback().formulas()

        val feedbackFormula =
            formulaService.update(
                FormulaUpdateParams.builder()
                    .feedbackFormulaId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .aggregationType(FormulaUpdateParams.AggregationType.SUM)
                    .feedbackKey("feedback_key")
                    .addFormulaPart(
                        FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build()
                    )
                    .build()
            )

        feedbackFormula.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val formulaService = client.feedback().formulas()

        val feedbackFormulas =
            formulaService.list(
                FormulaListParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(0L)
                    .offset(0L)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        feedbackFormulas.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val formulaService = client.feedback().formulas()

        val formula = formulaService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        formula.validate()
    }
}
