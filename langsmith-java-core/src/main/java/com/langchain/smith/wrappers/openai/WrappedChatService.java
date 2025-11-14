package com.langchain.smith.wrappers.openai;

import com.openai.core.ClientOptions;
import com.openai.core.RequestOptions;
import com.openai.core.http.StreamResponse;
import com.openai.models.chat.completions.ChatCompletion;
import com.openai.models.chat.completions.ChatCompletionChunk;
import com.openai.models.chat.completions.ChatCompletionCreateParams;
import com.openai.models.chat.completions.ChatCompletionMessageFunctionToolCall;
import com.openai.models.chat.completions.ChatCompletionMessageToolCall;
import com.openai.models.chat.completions.StructuredChatCompletion;
import com.openai.models.chat.completions.StructuredChatCompletionCreateParams;
import com.openai.services.blocking.ChatService;
import com.openai.services.blocking.chat.ChatCompletionService;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.context.Scope;
import java.util.function.Consumer;

/**
 * Wrapped ChatService that adds OpenTelemetry tracing to chat completion
 * operations.
 */
class WrappedChatService implements ChatService {

    private final ChatService delegate;

    WrappedChatService(ChatService delegate) {
        this.delegate = delegate;
    }

    @Override
    public ChatService.WithRawResponse withRawResponse() {
        return delegate.withRawResponse();
    }

    @Override
    public ChatService withOptions(Consumer<ClientOptions.Builder> options) {
        return new WrappedChatService(delegate.withOptions(options));
    }

    @Override
    public ChatCompletionService completions() {
        return new WrappedChatCompletionService(delegate.completions());
    }

    /**
     * Wrapped ChatCompletionService that adds tracing to create operations.
     */
    private static class WrappedChatCompletionService implements ChatCompletionService {

        private final ChatCompletionService delegate;

        WrappedChatCompletionService(ChatCompletionService delegate) {
            this.delegate = delegate;
        }

        @Override
        public ChatCompletionService.WithRawResponse withRawResponse() {
            return delegate.withRawResponse();
        }

        @Override
        public ChatCompletionService withOptions(Consumer<ClientOptions.Builder> options) {
            return new WrappedChatCompletionService(delegate.withOptions(options));
        }

        @Override
        public com.openai.services.blocking.chat.completions.MessageService messages() {
            return delegate.messages();
        }

        @Override
        public ChatCompletion create(ChatCompletionCreateParams params) {
            return create(params, null);
        }

        @Override
        public ChatCompletion create(ChatCompletionCreateParams params, RequestOptions requestOptions) {
            // Extract model from params for span naming
            String model = params.model() != null ? params.model().toString() : "unknown";

            Span span = TracingUtils.createSpanBuilder(model, "chat").startSpan();

            // Debug: Check if span is recording (not a noop span)
            boolean debug =
                    Boolean.getBoolean("langsmith.debug") || "true".equalsIgnoreCase(System.getenv("LANGSMITH_DEBUG"));
            if (debug) {
                boolean isRecording = span.isRecording();
                System.out.println("[WrappedChatService] Created span: "
                        + span.getSpanContext().getSpanId() + ", isRecording: " + isRecording + ", traceId: "
                        + span.getSpanContext().getTraceId());
            }

            try (Scope scope = span.makeCurrent()) {
                // Set experiment context attributes if present
                setExperimentContextAttributes(span);

                // Set request attributes (core attributes already set on builder)
                TracingUtils.setRequestAttributes(span, model);

                // Set request parameters if available (handle Optional types)
                Double temperature = params.temperature().orElse(null);
                Double topP = params.topP().orElse(null);
                Long maxTokens = params.maxCompletionTokens().orElse(null);
                TracingUtils.setRequestParameters(span, temperature, topP, maxTokens);

                // Capture input messages in JSON format
                String inputMessagesJson = formatInputMessages(params);
                TracingUtils.setInputMessages(span, inputMessagesJson);

                ChatCompletion result;
                // If requestOptions is null, use the single-parameter version
                if (requestOptions == null) {
                    result = delegate.create(params);
                } else {
                    result = delegate.create(params, requestOptions);
                }

                // Extract response model and finish reason
                String responseModel = result.model() != null ? result.model().toString() : null;
                String finishReason =
                        !result.choices().isEmpty() && result.choices().get(0).finishReason() != null
                                ? result.choices().get(0).finishReason().toString()
                                : "stop";
                TracingUtils.setResponseMetadata(span, responseModel, finishReason);

                // Capture output messages in JSON format
                String outputMessagesJson = formatOutputMessages(result);
                TracingUtils.setOutputMessages(span, outputMessagesJson);

                // Extract usage information from result
                result.usage().ifPresent(usage -> {
                    TracingUtils.setResponseAttributes(
                            span, (long) usage.promptTokens(), (long) usage.completionTokens(), (long)
                                    usage.totalTokens());
                });

                // Create tool call spans for any tool calls in the response
                createToolCallSpans(result, span);

                return result;
            } catch (Exception e) {
                TracingUtils.recordException(span, e);
                throw e;
            } finally {
                if (debug) {
                    System.out.println("[WrappedChatService] Ending span: "
                            + span.getSpanContext().getSpanId());
                }
                span.end();
                if (debug) {
                    System.out.println("[WrappedChatService] Span ended: "
                            + span.getSpanContext().getSpanId());
                }
            }
        }

        /**
         * Sets experiment context attributes on the span if they are present.
         * This includes reference example ID, session ID, and metadata.
         *
         * @param span the span to set attributes on
         */
        private void setExperimentContextAttributes(Span span) {
            // Set reference example ID if present
            String referenceExampleId = ExperimentContext.current().getReferenceExampleId();
            if (referenceExampleId != null && !referenceExampleId.isEmpty()) {
                span.setAttribute("langsmith.reference_example_id", referenceExampleId);
            }

            // Set session ID (experiment ID) if present
            // This is critical for linking runs to experiments in the dataset's Experiments tab
            String sessionId = ExperimentContext.current().getSessionId();
            if (sessionId != null && !sessionId.isEmpty()) {
                span.setAttribute("langsmith.trace.session_id", sessionId);
            }

            // Set custom metadata
            java.util.Map<String, String> metadata = ExperimentContext.current().getMetadata();
            for (java.util.Map.Entry<String, String> entry : metadata.entrySet()) {
                span.setAttribute("langsmith.metadata." + entry.getKey(), entry.getValue());
            }
        }

        /**
         * Formats input messages from ChatCompletionCreateParams as a JSON array
         * string.
         *
         * <p>
         * Properly formats messages as JSON with role and content, following
         * LangSmith conventions.
         */
        private String formatInputMessages(ChatCompletionCreateParams params) {
            if (params.messages() == null || params.messages().isEmpty()) {
                return "[]";
            }

            boolean debug =
                    Boolean.getBoolean("langsmith.debug") || "true".equalsIgnoreCase(System.getenv("LANGSMITH_DEBUG"));
            if (debug) {
                System.out.println(
                        "[formatInputMessages] Processing " + params.messages().size() + " message(s)");
            }

            StringBuilder json = new StringBuilder("[");
            boolean first = true;
            for (com.openai.models.chat.completions.ChatCompletionMessageParam messageParam : params.messages()) {
                if (!first) {
                    json.append(",");
                }
                first = false;

                json.append("{");

                String role = null;
                String content = null;

                // Try to extract role and content based on message type
                // The OpenAI SDK uses different message types (UserMessage, SystemMessage,
                // etc.)
                String className = messageParam.getClass().getSimpleName();
                String fullClassName = messageParam.getClass().getName();

                // Debug logging (debug variable already declared above)
                if (debug) {
                    System.out.println("[formatInputMessages] Processing message: " + fullClassName);
                    java.lang.reflect.Method[] allMethods =
                            messageParam.getClass().getMethods();
                    System.out.println("[formatInputMessages] Available methods: "
                            + java.util.Arrays.stream(allMethods)
                                    .map(m -> m.getName() + "(" + m.getParameterCount() + ")")
                                    .collect(java.util.stream.Collectors.joining(", ")));
                }

                // ChatCompletionMessageParam is a union type - check type FIRST before calling
                // as*() methods
                // This prevents InvocationTargetException when calling asUser() on non-user
                // messages
                Object actualMessage = null;

                try {
                    // Use type checking methods first to avoid exceptions
                    java.lang.reflect.Method isUserMethod =
                            messageParam.getClass().getMethod("isUser");
                    java.lang.reflect.Method isSystemMethod =
                            messageParam.getClass().getMethod("isSystem");
                    java.lang.reflect.Method isAssistantMethod =
                            messageParam.getClass().getMethod("isAssistant");
                    java.lang.reflect.Method isToolMethod =
                            messageParam.getClass().getMethod("isTool");

                    boolean isUser = (Boolean) isUserMethod.invoke(messageParam);
                    boolean isSystem = (Boolean) isSystemMethod.invoke(messageParam);
                    boolean isAssistant = (Boolean) isAssistantMethod.invoke(messageParam);
                    boolean isTool = (Boolean) isToolMethod.invoke(messageParam);

                    if (isUser) {
                        java.lang.reflect.Method asUserMethod =
                                messageParam.getClass().getMethod("asUser");
                        actualMessage = asUserMethod.invoke(messageParam);
                        role = "user";
                        if (debug) {
                            System.out.println("[formatInputMessages] Found user message: "
                                    + actualMessage.getClass().getName());
                        }
                    } else if (isSystem) {
                        java.lang.reflect.Method asSystemMethod =
                                messageParam.getClass().getMethod("asSystem");
                        actualMessage = asSystemMethod.invoke(messageParam);
                        role = "system";
                        if (debug) {
                            System.out.println("[formatInputMessages] Found system message: "
                                    + actualMessage.getClass().getName());
                        }
                    } else if (isAssistant) {
                        java.lang.reflect.Method asAssistantMethod =
                                messageParam.getClass().getMethod("asAssistant");
                        actualMessage = asAssistantMethod.invoke(messageParam);
                        role = "assistant";
                        if (debug) {
                            System.out.println("[formatInputMessages] Found assistant message: "
                                    + actualMessage.getClass().getName());
                        }
                    } else if (isTool) {
                        java.lang.reflect.Method asToolMethod =
                                messageParam.getClass().getMethod("asTool");
                        actualMessage = asToolMethod.invoke(messageParam);
                        role = "tool";
                        if (debug) {
                            System.out.println("[formatInputMessages] Found tool message: "
                                    + actualMessage.getClass().getName());
                        }
                    }

                    // Now get content from the actual message object
                    if (actualMessage != null) {
                        try {
                            java.lang.reflect.Method contentMethod =
                                    actualMessage.getClass().getMethod("content");
                            Object contentResult = contentMethod.invoke(actualMessage);

                            if (debug) {
                                System.out.println("[formatInputMessages] content() returned: "
                                        + (contentResult != null
                                                ? contentResult.getClass().getName()
                                                : "null"));
                            }

                            // Content might be a Content object with text() method
                            if (contentResult != null) {
                                try {
                                    java.lang.reflect.Method textMethod =
                                            contentResult.getClass().getMethod("text");
                                    Object textResult = textMethod.invoke(contentResult);
                                    if (textResult instanceof java.util.Optional) {
                                        @SuppressWarnings("unchecked")
                                        java.util.Optional<String> textOpt = (java.util.Optional<String>) textResult;
                                        if (textOpt.isPresent()) {
                                            content = textOpt.get();
                                        }
                                    } else if (textResult instanceof String) {
                                        content = (String) textResult;
                                    }
                                } catch (NoSuchMethodException e) {
                                    // Content might be a String directly
                                    if (contentResult instanceof String) {
                                        content = (String) contentResult;
                                    } else if (contentResult instanceof java.util.Optional) {
                                        @SuppressWarnings("unchecked")
                                        java.util.Optional<String> contentOpt =
                                                (java.util.Optional<String>) contentResult;
                                        if (contentOpt.isPresent()) {
                                            content = contentOpt.get();
                                        }
                                    }
                                }
                            }
                        } catch (NoSuchMethodException e) {
                            if (debug) {
                                System.out.println("[formatInputMessages] No content() method on actual message");
                            }
                        }
                    }
                } catch (Exception e) {
                    if (debug) {
                        System.out.println("[formatInputMessages] Error accessing message: " + e.getMessage());
                        e.printStackTrace();
                    }
                }

                // Role should already be set from asUser/asSystem/asAssistant above
                // If not, try to get it from the message
                if (role == null) {
                    try {
                        java.lang.reflect.Method roleMethod =
                                messageParam.getClass().getMethod("role");
                        Object roleResult = roleMethod.invoke(messageParam);
                        if (roleResult != null) {
                            role = roleResult.toString().toLowerCase();
                        }
                    } catch (NoSuchMethodException e) {
                        // Fallback: determine role from class name
                        if (className.contains("User") || fullClassName.contains("User")) {
                            role = "user";
                        } else if (className.contains("System") || fullClassName.contains("System")) {
                            role = "system";
                        } else if (className.contains("Assistant") || fullClassName.contains("Assistant")) {
                            role = "assistant";
                        } else if (className.contains("Tool") || fullClassName.contains("Tool")) {
                            role = "tool";
                        }
                    } catch (Exception e) {
                        if (debug) {
                            System.out.println("[formatInputMessages] Error calling role(): " + e.getMessage());
                        }
                        // Fallback to class name
                        if (className.contains("User") || fullClassName.contains("User")) {
                            role = "user";
                        } else if (className.contains("System") || fullClassName.contains("System")) {
                            role = "system";
                        } else if (className.contains("Assistant") || fullClassName.contains("Assistant")) {
                            role = "assistant";
                        } else if (className.contains("Tool") || fullClassName.contains("Tool")) {
                            role = "tool";
                        }
                    }
                }

                // Final fallback: try toString parsing
                if (content == null) {
                    String messageStr = messageParam.toString();
                    if (debug) {
                        System.out.println("[formatInputMessages] toString(): " + messageStr);
                    }

                    // For tool messages, look for content=Content{text={...}} pattern
                    if (role != null && role.equals("tool")) {
                        // Extract JSON content from tool messages:
                        // content=Content{text={"key":"value"}}
                        java.util.regex.Pattern toolContentPattern =
                                java.util.regex.Pattern.compile("text=\\{([^}]+)\\}");
                        java.util.regex.Matcher toolMatcher = toolContentPattern.matcher(messageStr);
                        if (toolMatcher.find()) {
                            content = "{" + toolMatcher.group(1) + "}";
                        } else {
                            // Try simpler pattern: text="..."
                            java.util.regex.Pattern simplePattern =
                                    java.util.regex.Pattern.compile("text=[\"']([^\"']+)[\"']");
                            java.util.regex.Matcher simpleMatcher = simplePattern.matcher(messageStr);
                            if (simpleMatcher.find()) {
                                content = simpleMatcher.group(1);
                            }
                        }
                    }

                    // Improved extraction: try multiple patterns
                    if (content == null) {
                        // Pattern 1: content="..."
                        int contentIdx = messageStr.indexOf("content=");
                        if (contentIdx >= 0) {
                            // Look for Content{text="..."} pattern
                            int textIdx = messageStr.indexOf("text=", contentIdx);
                            if (textIdx > contentIdx) {
                                int start = messageStr.indexOf("\"", textIdx);
                                if (start >= 0) {
                                    // Find matching closing quote, handling escaped quotes
                                    int end = start + 1;
                                    while (end < messageStr.length() && messageStr.charAt(end) != '"') {
                                        if (messageStr.charAt(end) == '\\') {
                                            end += 2; // Skip escaped character
                                        } else {
                                            end++;
                                        }
                                    }
                                    if (end < messageStr.length()) {
                                        content = messageStr.substring(start + 1, end);
                                    }
                                }
                            }

                            // Fallback to simple quote matching
                            if (content == null) {
                                int start = messageStr.indexOf("\"", contentIdx);
                                if (start >= 0) {
                                    int end = messageStr.indexOf("\"", start + 1);
                                    if (end > start) {
                                        content = messageStr.substring(start + 1, end);
                                    }
                                } else {
                                    // Try single quotes
                                    start = messageStr.indexOf("'", contentIdx);
                                    if (start >= 0) {
                                        int end = messageStr.indexOf("'", start + 1);
                                        if (end > start) {
                                            content = messageStr.substring(start + 1, end);
                                        }
                                    }
                                }
                            }
                        }
                    }

                    // Pattern 2: Look for content in JSON-like format
                    if (content == null) {
                        java.util.regex.Pattern pattern =
                                java.util.regex.Pattern.compile("content[=:]\\s*[\"']([^\"']+)[\"']");
                        java.util.regex.Matcher matcher = pattern.matcher(messageStr);
                        if (matcher.find()) {
                            content = matcher.group(1);
                        }
                    }

                    // Pattern 3: If still null, try to extract from the end of the string
                    if (content == null && messageStr.length() > 0) {
                        // Last resort: try to find any quoted string that might be content
                        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("[\"']([^\"']+)[\"']");
                        java.util.regex.Matcher matcher = pattern.matcher(messageStr);
                        if (matcher.find()) {
                            String potentialContent = matcher.group(1);
                            // Only use if it looks like actual content (not a class name or role)
                            if (!potentialContent.contains("com.openai")
                                    && !potentialContent.equals("user")
                                    && !potentialContent.equals("system")
                                    && !potentialContent.equals("assistant")
                                    && !potentialContent.equals("tool")
                                    && potentialContent.length() > 0) {
                                content = potentialContent;
                            }
                        }
                    }
                }

                // Build JSON
                if (role != null) {
                    json.append("\"role\":\"").append(role).append("\"");
                }
                if (content != null) {
                    if (role != null) {
                        json.append(",");
                    }
                    json.append("\"content\":\"")
                            .append(TracingUtils.escapeJsonString(content))
                            .append("\"");
                }

                if (debug) {
                    System.out.println("[formatInputMessages] Final: role=" + role + ", content="
                            + (content != null ? content.substring(0, Math.min(50, content.length())) : "null"));
                }

                json.append("}");
            }
            json.append("]");

            String result = json.toString();
            if (debug) {
                System.out.println("[formatInputMessages] Final JSON: " + result);
            }
            return result;
        }

        /**
         * Creates tool call spans for any tool calls detected in the chat completion
         * response.
         *
         * @param completion the chat completion response
         * @param parentSpan the parent span (the chat completion span)
         */
        private void createToolCallSpans(ChatCompletion completion, Span parentSpan) {
            if (completion.choices() == null || completion.choices().isEmpty()) {
                return;
            }

            boolean debug =
                    Boolean.getBoolean("langsmith.debug") || "true".equalsIgnoreCase(System.getenv("LANGSMITH_DEBUG"));

            for (com.openai.models.chat.completions.ChatCompletion.Choice choice : completion.choices()) {
                com.openai.models.chat.completions.ChatCompletionMessage message = choice.message();

                // Check if message has tool calls
                java.util.Optional<java.util.List<ChatCompletionMessageToolCall>> toolCallsOpt = message.toolCalls();
                if (toolCallsOpt.isPresent()) {
                    java.util.List<ChatCompletionMessageToolCall> toolCalls = toolCallsOpt.get();
                    for (ChatCompletionMessageToolCall toolCall : toolCalls) {
                        // Check if it's a function tool call
                        if (toolCall.isFunction()) {
                            ChatCompletionMessageFunctionToolCall functionToolCall = toolCall.asFunction();
                            createToolCallSpan(functionToolCall, parentSpan, debug);
                        }
                        // Note: Custom tool calls are not yet supported
                    }
                }
            }
        }

        /**
         * Creates a single tool call span from a function tool call object.
         *
         * @param functionToolCall the function tool call object from the OpenAI SDK
         * @param parentSpan       the parent span (the chat completion span)
         * @param debug            whether debug logging is enabled
         */
        private void createToolCallSpan(
                ChatCompletionMessageFunctionToolCall functionToolCall, Span parentSpan, boolean debug) {
            try {
                io.opentelemetry.api.OpenTelemetry openTelemetry = io.opentelemetry.api.GlobalOpenTelemetry.get();
                io.opentelemetry.api.trace.Tracer tracer = openTelemetry.getTracer("langsmith-java-otel-wrappers");

                // Extract tool call information directly from the SDK objects
                String toolCallId = functionToolCall.id();
                com.openai.models.chat.completions.ChatCompletionMessageFunctionToolCall.Function function =
                        functionToolCall.function();
                String toolName = function.name();
                String toolArguments = function.arguments();

                // Create span name
                String spanName = toolName != null ? "tool_call " + toolName : "tool_call";

                // Create tool call span as a child of the parent span
                io.opentelemetry.api.trace.Span toolCallSpan = tracer.spanBuilder(spanName)
                        .setSpanKind(io.opentelemetry.api.trace.SpanKind.CLIENT)
                        .setAttribute("gen_ai.operation.name", "tool_call")
                        .setAttribute("langsmith.span.kind", "tool")
                        .setAttribute("gen_ai.system", "openai")
                        .setAttribute("gen_ai.provider.name", "openai")
                        .startSpan();

                try (io.opentelemetry.context.Scope toolScope = toolCallSpan.makeCurrent()) {
                    // Set tool call attributes
                    if (toolCallId != null) {
                        toolCallSpan.setAttribute("gen_ai.tool.call.id", toolCallId);
                    }
                    if (toolName != null) {
                        toolCallSpan.setAttribute("gen_ai.tool.name", toolName);
                        toolCallSpan.setAttribute("langsmith.trace.name", "Tool Call: " + toolName);
                    }
                    if (toolArguments != null && !toolArguments.isEmpty()) {
                        toolCallSpan.setAttribute("gen_ai.tool.arguments", toolArguments);
                    }

                    if (debug) {
                        System.out.println("[WrappedChatService] Created tool call span: "
                                + toolCallSpan.getSpanContext().getSpanId()
                                + ", tool=" + toolName + ", arguments=" + toolArguments + ", parent="
                                + parentSpan.getSpanContext().getSpanId());
                    }

                    // Note: Tool call result would be set when the tool is actually executed
                    // This span represents the tool call request, not the execution
                } finally {
                    toolCallSpan.end();
                }
            } catch (Exception e) {
                if (debug) {
                    System.out.println("[WrappedChatService] Error creating tool call span: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }

        /**
         * Formats output messages from ChatCompletion as a JSON array string.
         */
        private String formatOutputMessages(ChatCompletion completion) {
            if (completion.choices() == null || completion.choices().isEmpty()) {
                return "[]";
            }

            StringBuilder json = new StringBuilder("[");
            boolean first = true;
            for (com.openai.models.chat.completions.ChatCompletion.Choice choice : completion.choices()) {
                if (!first) {
                    json.append(",");
                }
                first = false;

                com.openai.models.chat.completions.ChatCompletionMessage message = choice.message();
                json.append("{");

                // Add role
                json.append("\"role\":\"assistant\"");

                // Add content if present
                message.content().ifPresent(content -> {
                    json.append(",\"content\":\"")
                            .append(TracingUtils.escapeJsonString(content))
                            .append("\"");
                });

                json.append("}");
            }
            json.append("]");

            return json.toString();
        }

        @Override
        public <T> StructuredChatCompletion<T> create(StructuredChatCompletionCreateParams<T> params) {
            return create(params, null);
        }

        @Override
        public <T> StructuredChatCompletion<T> create(
                StructuredChatCompletionCreateParams<T> params, RequestOptions requestOptions) {
            // Get model from the underlying params - StructuredChatCompletionCreateParams
            // wraps ChatCompletionCreateParams
            String model = params != null
                            && params.rawParams() != null
                            && params.rawParams().model() != null
                    ? params.rawParams().model().toString()
                    : "unknown";

            Span span = TracingUtils.createSpanBuilder(model, "chat").startSpan();

            try (Scope scope = span.makeCurrent()) {
                // Set experiment context attributes if present
                setExperimentContextAttributes(span);

                // Set request attributes (core attributes already set on builder)
                TracingUtils.setRequestAttributes(span, model);

                // Set request parameters if available
                if (params.rawParams() != null) {
                    Double temperature = params.rawParams().temperature().orElse(null);
                    Double topP = params.rawParams().topP().orElse(null);
                    Long maxTokens = params.rawParams().maxCompletionTokens().orElse(null);
                    TracingUtils.setRequestParameters(span, temperature, topP, maxTokens);

                    // Capture input messages in JSON format
                    String inputMessagesJson = formatInputMessages(params.rawParams());
                    TracingUtils.setInputMessages(span, inputMessagesJson);
                }

                StructuredChatCompletion<T> result;
                // If requestOptions is null, use the single-parameter version
                if (requestOptions == null) {
                    result = delegate.create(params);
                } else {
                    result = delegate.create(params, requestOptions);
                }

                // For structured completions, we'll just set basic model info
                // The actual structured output is in the parsed result
                TracingUtils.setResponseMetadata(span, model, null);

                result.usage().ifPresent(usage -> {
                    TracingUtils.setResponseAttributes(
                            span, (long) usage.promptTokens(), (long) usage.completionTokens(), (long)
                                    usage.totalTokens());
                });

                return result;
            } catch (Exception e) {
                TracingUtils.recordException(span, e);
                throw e;
            } finally {
                span.end();
            }
        }

        @Override
        public StreamResponse<ChatCompletionChunk> createStreaming(ChatCompletionCreateParams params) {
            return createStreaming(params, null);
        }

        @Override
        public StreamResponse<ChatCompletionChunk> createStreaming(
                ChatCompletionCreateParams params, RequestOptions requestOptions) {
            String model = params.model() != null ? params.model().toString() : "unknown";

            Span span = TracingUtils.createSpanBuilder(model, "chat").startSpan();

            try (Scope scope = span.makeCurrent()) {
                // Set experiment context attributes if present
                setExperimentContextAttributes(span);

                // Set request attributes (core attributes already set on builder)
                TracingUtils.setRequestAttributes(span, model);
                span.setAttribute("gen_ai.streaming", true);

                // Set request parameters if available (handle Optional types)
                Double temperature = params.temperature().orElse(null);
                Double topP = params.topP().orElse(null);
                Long maxTokens = params.maxCompletionTokens().orElse(null);
                TracingUtils.setRequestParameters(span, temperature, topP, maxTokens);

                // Capture input messages in JSON format
                String inputMessagesJson = formatInputMessages(params);
                TracingUtils.setInputMessages(span, inputMessagesJson);

                // For streaming, we can't easily extract usage info, so we'll just mark it as
                // streaming
                StreamResponse<ChatCompletionChunk> result;
                // If requestOptions is null, use the single-parameter version
                if (requestOptions == null) {
                    result = delegate.createStreaming(params);
                } else {
                    result = delegate.createStreaming(params, requestOptions);
                }

                // Note: For streaming, the span will end immediately
                // This is a simplified implementation - in production you might want to
                // wrap the stream to collect the full response
                return result;
            } catch (Exception e) {
                TracingUtils.recordException(span, e);
                throw e;
            } finally {
                span.end();
            }
        }

        // Delegate other methods without tracing (for now)
        @Override
        public ChatCompletion retrieve(String completionId) {
            return delegate.retrieve(completionId);
        }

        @Override
        public ChatCompletion retrieve(
                String completionId, com.openai.models.chat.completions.ChatCompletionRetrieveParams params) {
            return delegate.retrieve(completionId, params);
        }

        @Override
        public ChatCompletion retrieve(String completionId, RequestOptions requestOptions) {
            return delegate.retrieve(completionId, requestOptions);
        }

        @Override
        public ChatCompletion retrieve(
                String completionId,
                com.openai.models.chat.completions.ChatCompletionRetrieveParams params,
                RequestOptions requestOptions) {
            return delegate.retrieve(completionId, params, requestOptions);
        }

        @Override
        public ChatCompletion retrieve(com.openai.models.chat.completions.ChatCompletionRetrieveParams params) {
            return delegate.retrieve(params);
        }

        @Override
        public ChatCompletion retrieve(
                com.openai.models.chat.completions.ChatCompletionRetrieveParams params, RequestOptions requestOptions) {
            return delegate.retrieve(params, requestOptions);
        }

        @Override
        public ChatCompletion update(
                String completionId, com.openai.models.chat.completions.ChatCompletionUpdateParams params) {
            return delegate.update(completionId, params);
        }

        @Override
        public ChatCompletion update(
                String completionId,
                com.openai.models.chat.completions.ChatCompletionUpdateParams params,
                RequestOptions requestOptions) {
            return delegate.update(completionId, params, requestOptions);
        }

        @Override
        public ChatCompletion update(com.openai.models.chat.completions.ChatCompletionUpdateParams params) {
            return delegate.update(params);
        }

        @Override
        public ChatCompletion update(
                com.openai.models.chat.completions.ChatCompletionUpdateParams params, RequestOptions requestOptions) {
            return delegate.update(params, requestOptions);
        }

        @Override
        public com.openai.models.chat.completions.ChatCompletionListPage list() {
            return delegate.list();
        }

        @Override
        public com.openai.models.chat.completions.ChatCompletionListPage list(RequestOptions requestOptions) {
            return delegate.list(requestOptions);
        }

        @Override
        public com.openai.models.chat.completions.ChatCompletionListPage list(
                com.openai.models.chat.completions.ChatCompletionListParams params) {
            return delegate.list(params);
        }

        @Override
        public com.openai.models.chat.completions.ChatCompletionListPage list(
                com.openai.models.chat.completions.ChatCompletionListParams params, RequestOptions requestOptions) {
            return delegate.list(params, requestOptions);
        }

        @Override
        public com.openai.models.chat.completions.ChatCompletionDeleted delete(String completionId) {
            return delegate.delete(completionId);
        }

        @Override
        public com.openai.models.chat.completions.ChatCompletionDeleted delete(
                String completionId, RequestOptions requestOptions) {
            return delegate.delete(completionId, requestOptions);
        }

        @Override
        public com.openai.models.chat.completions.ChatCompletionDeleted delete(
                String completionId, com.openai.models.chat.completions.ChatCompletionDeleteParams params) {
            return delegate.delete(completionId, params);
        }

        @Override
        public com.openai.models.chat.completions.ChatCompletionDeleted delete(
                String completionId,
                com.openai.models.chat.completions.ChatCompletionDeleteParams params,
                RequestOptions requestOptions) {
            return delegate.delete(completionId, params, requestOptions);
        }

        @Override
        public com.openai.models.chat.completions.ChatCompletionDeleted delete(
                com.openai.models.chat.completions.ChatCompletionDeleteParams params) {
            return delegate.delete(params);
        }

        @Override
        public com.openai.models.chat.completions.ChatCompletionDeleted delete(
                com.openai.models.chat.completions.ChatCompletionDeleteParams params, RequestOptions requestOptions) {
            return delegate.delete(params, requestOptions);
        }
    }
}
