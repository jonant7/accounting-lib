package org.accountinglib.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Basic smoke test to validate that the build and CI pipeline
 * are correctly configured and able to run JUnit tests.
 */
class SanityCheckTest {

    @Test
    @DisplayName("Sanity check: 2 + 2 equals 4")
    void sanityCheck() {
        int result = 2 + 2;
        assertEquals(4, result, "2 + 2 should equal 4");
    }
}