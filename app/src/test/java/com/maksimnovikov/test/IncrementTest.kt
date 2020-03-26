package com.maksimnovikov.test

import org.junit.Assert.assertEquals
import org.junit.Test

class IncrementTest {

    @Test
    fun incrementTest() {
        var i = 1
        i += 1
        assertEquals(2, i)
    }
}