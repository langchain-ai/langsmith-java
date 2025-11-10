package com.langchain.smith.example;

import com.langchain.smith.client.LangsmithClient;
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient;
import com.langchain.smith.core.JsonValue;
import com.langchain.smith.models.datasets.Dataset;
import com.langchain.smith.models.datasets.DatasetCreateParams;
import com.langchain.smith.models.datasets.DatasetListParams;
import com.langchain.smith.models.examples.Example;
import com.langchain.smith.models.examples.ExampleCreateParams;

import java.util.List;
import java.util.Map;

/**
 * Example demonstrating how to create a dataset and add examples programmatically.
 *
 * This is the Java equivalent of the Python SDK example:
 *
 * <pre>{@code
 * from langsmith import Client
 *
 * client = Client()
 * dataset = client.create_dataset(
 *     dataset_name="Sample dataset",
 *     description="A sample dataset in LangSmith."
 * )
 *
 * examples = [
 *     {
 *         "inputs": {"question": "Which country is Mount Kilimanjaro located in?"},
 *         "outputs": {"answer": "Mount Kilimanjaro is located in Tanzania."},
 *     },
 *     {
 *         "inputs": {"question": "What is Earth's lowest point?"},
 *         "outputs": {"answer": "Earth's lowest point is The Dead Sea."},
 *     },
 * ]
 *
 * client.create_examples(dataset_id=dataset.id, examples=examples)
 * print("Created dataset:", dataset.name)
 * }</pre>
 */
public class CreateExamplesExample {
    public static void main(String[] args) {
        // Configure client from environment variables
        // Requires: LANGSMITH_API_KEY and LANGSMITH_BASE_URL
        LangsmithClient client = LangsmithOkHttpClient.fromEnv();

        // Get or create a dataset
        String datasetName = "Sample Dataset created in Java";
        Dataset dataset;

        // Try to find existing dataset by name
        DatasetListParams listParams = DatasetListParams.builder()
                .name(datasetName)
                .build();
        List<Dataset> existingDatasets = client.datasets().list(listParams);

        if (!existingDatasets.isEmpty()) {
            dataset = existingDatasets.get(0);
            System.out.println("Found existing dataset: " + dataset.name() + " (ID: " + dataset.id() + ")");
        } else {
            // Create a new dataset if it doesn't exist
            DatasetCreateParams datasetParams = DatasetCreateParams.builder()
                    .name(datasetName)
                    .description("A sample dataset in LangSmith.")
                    .build();
            dataset = client.datasets().create(datasetParams);
            System.out.println("Created dataset: " + dataset.name() + " (ID: " + dataset.id() + ")");
        }

        // Create examples

        // Example 1: Mount Kilimanjaro
        ExampleCreateParams example1Params = ExampleCreateParams.builder()
                .putAdditionalBodyProperty("dataset_id", JsonValue.from(dataset.id()))
                .putAdditionalBodyProperty("inputs", JsonValue.from(
                        Map.of("question", "Which country is Mount Kilimanjaro located in?")))
                .putAdditionalBodyProperty("outputs", JsonValue.from(
                        Map.of("answer", "Mount Kilimanjaro is located in Tanzania.")))
                .build();
        Example example1 = client.examples().create(example1Params);
        System.out.println("Created example 1: " + example1.id());

        // Example 2: Earth's lowest point
        ExampleCreateParams example2Params = ExampleCreateParams.builder()
                .putAdditionalBodyProperty("dataset_id", JsonValue.from(dataset.id()))
                .putAdditionalBodyProperty("inputs", JsonValue.from(
                        Map.of("question", "What is Earth's lowest point?")))
                .putAdditionalBodyProperty("outputs", JsonValue.from(
                        Map.of("answer", "Earth's lowest point is The Dead Sea.")))
                .build();
        Example example2 = client.examples().create(example2Params);
        System.out.println("Created example 2: " + example2.id());

        // TODO: Add a bulk example

        System.out.println("Successfully added examples to dataset: " + dataset.name());
    }
}
