package com.maksimnovikov.test

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest2 {
    @Test
    fun addition_isCorrect() {
        val price = priceFormat(100.2, "штуки", 10)
        assertEquals("90,18/шт (скидка 10%)", price)
    }
}

