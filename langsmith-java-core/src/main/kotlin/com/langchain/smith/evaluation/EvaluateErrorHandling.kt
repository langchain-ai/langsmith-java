package com.langchain.smith.evaluation

/** How to handle errors when the target function fails on a dataset row. */
enum class EvaluateErrorHandling {
    /** Log the error and include the run in the experiment (default). */
    LOG,

    /** Log the error and omit the run from the experiment. */
    IGNORE,
}
