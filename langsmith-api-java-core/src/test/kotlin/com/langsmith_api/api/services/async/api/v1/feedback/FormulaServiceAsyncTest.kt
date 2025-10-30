// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.feedback

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.feedback.formulas.FeedbackFormulaWeightedVariable
import com.langsmith_api.api.models.api.v1.feedback.formulas.FormulaCreateParams
import com.langsmith_api.api.models.api.v1.feedback.formulas.FormulaListParams
import com.langsmith_api.api.models.api.v1.feedback.formulas.FormulaUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FormulaServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val formulaServiceAsync = client.api().v1().feedback().formulas()

        val feedbackFormulaFuture =
            formulaServiceAsync.create(
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

        val feedbackFormula = feedbackFormulaFuture.get()
        feedbackFormula.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val formulaServiceAsync = client.api().v1().feedback().formulas()

        val feedbackFormulaFuture =
            formulaServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val feedbackFormula = feedbackFormulaFuture.get()
        feedbackFormula.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val formulaServiceAsync = client.api().v1().feedback().formulas()

        val feedbackFormulaFuture =
            formulaServiceAsync.update(
                FormulaUpdateParams.builder()
                    .feedbackFormulaId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .aggregationType(FormulaUpdateParams.AggregationType.SUM)
                    .feedbackKey("feedback_key")
                    .addFormulaPart(
                        FeedbackFormulaWeightedVariable.builder().key("x").weight(0.0).build()
                    )
                    .build()
            )

        val feedbackFormula = feedbackFormulaFuture.get()
        feedbackFormula.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val formulaServiceAsync = client.api().v1().feedback().formulas()

        val feedbackFormulasFuture =
            formulaServiceAsync.list(
                FormulaListParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(0L)
                    .offset(0L)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val feedbackFormulas = feedbackFormulasFuture.get()
        feedbackFormulas.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val formulaServiceAsync = client.api().v1().feedback().formulas()

        val formulaFuture = formulaServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val formula = formulaFuture.get()
        formula.validate()
    }
}
