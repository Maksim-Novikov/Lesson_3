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


    @Test
    fun divideTest() {
        assertEquals(2, 4 / 2)
    }


    @Test
    fun multiplicationTest() {
        assertEquals(4, 2 * 2)
    }
}