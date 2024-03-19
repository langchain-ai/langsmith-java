import com.langsmith.core.Traceable;
import com.langsmith.core.TraceConfig;
import com.langsmith.core.RunTree;
import static com.langsmith.core.RunTreeKt.getCurrentSpan;

class TestTraceable {
    public static void main(String[] args) {
        TestTraceable testInstance = new TestTraceable();

        // Trace a class method by applying Traceable.trace to the method reference
        var tracedMethod = Traceable.<Integer, String>trace(testInstance::someMethod);
        var currentSpan = getCurrentSpan();
        System.out.println("getCurrentSpan: " + currentSpan);
        String result = tracedMethod.apply(42);
        System.out.println("Traced method result: " + result);
        currentSpan = getCurrentSpan();
        System.out.println("getCurrentSpan: " + currentSpan);

        var tracedLambda = Traceable.<Integer, Integer>trace(input -> testInstance.anotherMethod(input));
        Integer lambdaResult = tracedLambda.apply(24);
        System.out.println("Traced lambda result: " + lambdaResult);
    }

    public String someNestedMethod(Integer input) {
        return "Nested Input: " + input;
    }

    public String someMethod(Integer input) {
        TraceConfig config = new TraceConfig();
        config.setName("CustomTraceName");
        return "Top input: " + Traceable.trace(this::someNestedMethod, config).apply(input);
    }

    public Integer anotherMethod(Integer value) {
        return value * 2;
    }
}
