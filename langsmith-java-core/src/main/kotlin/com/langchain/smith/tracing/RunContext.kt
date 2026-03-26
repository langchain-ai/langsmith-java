package com.langchain.smith.tracing

import java.lang.reflect.InvocationTargetException
import org.slf4j.LoggerFactory

/**
 * Thread-scoped storage for the current [RunTree].
 *
 * On Java 21+ this uses `ScopedValue`, which propagates into child tasks forked via
 * `StructuredTaskScope`. On older JVMs it falls back to [ThreadLocal]. Neither mechanism
 * automatically propagates across unstructured async boundaries like `CompletableFuture` or
 * `ExecutorService` — use [RunTree.withParent] for those cases.
 */
internal interface RunContext {
    /** Returns the current [RunTree], or `null` if there is no active run on this thread. */
    fun get(): RunTree?

    /**
     * Executes [block] with [value] as the current run. The previous value is restored when [block]
     * completes (normally or exceptionally).
     */
    fun <T> runWith(value: RunTree?, block: () -> T): T

    companion object {
        /** Creates the best available [RunContext] for the current JVM. */
        fun create(): RunContext = scopedValueContext ?: ThreadLocalRunContext()
    }
}

// ---------------------------------------------------------------------------
// ThreadLocal implementation (Java 8+)
// ---------------------------------------------------------------------------

private class ThreadLocalRunContext : RunContext {
    private val threadLocal = ThreadLocal<RunTree?>()

    override fun get(): RunTree? = threadLocal.get()

    override fun <T> runWith(value: RunTree?, block: () -> T): T {
        val previous = threadLocal.get()
        threadLocal.set(value)
        try {
            return block()
        } finally {
            threadLocal.set(previous)
        }
    }
}

// ---------------------------------------------------------------------------
// ScopedValue implementation (Java 21+, resolved via reflection)
// ---------------------------------------------------------------------------

private val logger = LoggerFactory.getLogger("com.langchain.smith.tracing.RunContext")

/**
 * Attempts to create a [RunContext] backed by `java.lang.ScopedValue`. Returns `null` on JVMs that
 * don't have it.
 */
private val scopedValueContext: RunContext? by lazy {
    try {
        val svClass = Class.forName("java.lang.ScopedValue")
        val newValue = svClass.getMethod("newInstance")
        val get = svClass.getMethod("get")
        val isBound = svClass.getMethod("isBound")

        // ScopedValue.where(key, value) returns a ScopedValue.Carrier
        val where = svClass.getMethod("where", svClass, Any::class.java)
        val carrierClass = Class.forName("java.lang.ScopedValue\$Carrier")
        // Carrier.call(Callable) returns T
        val carrierCall = carrierClass.getMethod("call", java.util.concurrent.Callable::class.java)

        val scopedValue = newValue.invoke(null) // ScopedValue<RunTree?>

        object : RunContext {
            override fun get(): RunTree? =
                try {
                    if (isBound.invoke(scopedValue) == true) {
                        get.invoke(scopedValue) as? RunTree
                    } else {
                        null
                    }
                } catch (_: InvocationTargetException) {
                    null
                }

            override fun <T> runWith(value: RunTree?, block: () -> T): T {
                val carrier = where.invoke(null, scopedValue, value)
                try {
                    // Unavoidable: Method.invoke returns Object; the Callable<T> guarantees the
                    // actual runtime type matches T.
                    @Suppress("UNCHECKED_CAST")
                    return carrierCall.invoke(carrier, java.util.concurrent.Callable { block() })
                        as T
                } catch (e: InvocationTargetException) {
                    throw e.cause ?: e
                }
            }
        }
    } catch (_: ReflectiveOperationException) {
        logger.debug("ScopedValue not available; using ThreadLocal for run context")
        null
    }
}
