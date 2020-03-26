package com.maksimnovikov.test

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val price = priceFormat(100.2, "штуки", 10)
        assertEquals("90,18/шт (скидка 10%)", price)
    }
}

fun priceFormat(price: Double, measure: String, discountPercent: Int = 0): String {
    val finalPrice: String
    if ((discountPercent > 0) and (discountPercent <= 100)) {
        //вычисляем цену по скидке
        val discountPrice: Double = ((100 - discountPercent) * price) / 100
        //определяем, целое число или дробное
        if (Math.floor(discountPrice) == (discountPrice)) {
            //число целое - цена без дробной части
            finalPrice = Math.floor(discountPrice).toInt().toString()
        } else {
            //число дробное - цена с дробной частью
            finalPrice = String.format("%.2f", discountPrice);
        }
        return "$finalPrice/$measure (скидка $discountPercent%)"
    }
    else if (discountPercent == 0) {
        //определяем, целое число или дробное
        if (Math.floor(price) == (price)) {
            //число целое - цена без дробной части
            finalPrice = Math.floor(price).toInt().toString()
        } else {
            //число дробное - цена с дробной частью
            finalPrice = String.format("%.2f", price);
        }
        //выводим цену без скидки
        return "$finalPrice/$measure"
    }
    else {
        return "Скидка не может принимать значение меньше 0 или больше 100"
    }
}
