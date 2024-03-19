import com.langsmith.api.client.LangSmithClientAsync;
import com.langsmith.api.client.okhttp.LangSmithOkHttpClientAsync;
import com.langsmith.core.RunTree;
import com.langsmith.core.RunTreeConfig;
import com.langsmith.core.RunTreeConfigBuilder;
import com.langsmith.api.models.DatasetListParams;
import com.langsmith.api.models.ExampleListParams;
import com.langsmith.api.models.Example;
import com.langsmith.api.models.SessionCreateParams;
import com.langsmith.core.TraceConfig;
import com.langsmith.core.Traceable;
import com.langsmith.core.TraceableInput;
import com.langsmith.core.LangSmithExtra;
import com.langsmith.api.core.JsonValue;

import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;


public class RunOnDataset {

    public static void main(String[] args) {
        // The fake inputs
        Function<JsonValue, Object> originalChain = (inputMap) -> {
            // Perform operations on the input map and generate the output map
            Map<String, Object> outputMap = new HashMap<>();
            outputMap.put("output", "foo");
            return outputMap;
        };
        var datasetName = "foo";
        // *****************/
        LangSmithClientAsync client = LangSmithOkHttpClientAsync.fromEnv();
        // 1. List the examples
        //     a. And record the max example time as the version ID
        // Just get the examples
        var dsListParams = DatasetListParams.builder().name(datasetName).build();
        var datasets = client.datasets().list(dsListParams).join();
        var dataset = datasets.get(0);
        var datasetId = dataset.id();
        System.out.println(datasetId);
        var exampleParams = ExampleListParams.builder()
            .dataset(datasetId)
            .build();
            
        List<Example> examples = client.examples().list(exampleParams).join();
        var maxModifiedAt = examples.stream()
            .map(Example::modifiedAt)
            .max(Comparator.comparing(Optional::get));
        
        String datasetVersion = maxModifiedAt.map(date -> date.toString()).orElseGet(() -> "");
        System.out.println(datasetVersion);

        // 2. Create project 
        //     b. TODO: With project metadata like git version, etc
        var projectName = "Project_" + UUID.randomUUID().toString();
        var projectParams = SessionCreateParams.builder()
            .name(projectName)
            .referenceDatasetId(datasetId)
            .build();
        client.sessions().create(projectParams).join();
        // 3. Wrap the chain as a traceable object
        
        
        TraceConfig config = new TraceConfig();
        config.setName("Wrapped");
        config.setProjectName(projectName);
        var wrapped = Traceable.traceWithConfig(originalChain, config);
        
        var uuid = UUID.randomUUID().toString();
        var extras = examples.stream()
            .map(example -> new LangSmithExtra(UUID.randomUUID().toString(), example.id()))
            .collect(Collectors.toList());
        // 4. Run chain over dataset
        List<CompletableFuture<Object>> futures = IntStream.range(0, examples.size())
        .mapToObj(index -> {
            var example = examples.get(index);
            var traceableInput = Traceable.withExtra(example._inputs(), extras.get(index));
            return CompletableFuture.supplyAsync(() -> wrapped.apply(traceableInput))
                    .exceptionally(ex -> {
                        System.err.println("Error processing example: " + example.id());
                        ex.printStackTrace();
                        return null;
                    });
        })
        .collect(Collectors.toList());

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        List<Object> results = futures.stream()
                .map(future -> future.join())
                .collect(Collectors.toList());

        System.out.println("Results: " + results);
        // 5. Run evaluators over the outputs
        // 6. Assign feedback to the runs 
        // 7. End the project (update with end time)
        // ```
    }
    
}
