package com.canoo

import frege.prelude.PreludeBase
import frege.runtime.Delayed
import frege.runtime.Lambda

/**
 * Convenience methods when calling Frege from Java/Groovy.
 */

class FregeCaller {

    /**
     * Convenience method to perform a lambda.
     * @param action (better not think about the type)
     */
    static void perform (Lambda action) {
        // This would only be "unsafe" if used inside a pure Frege function.
        // Since we call from Java/Groovy, everything is unsafe (in Frege terms) anyway.
        Delayed.forced(PreludeBase.TST.performUnsafe(action))
    }
}
