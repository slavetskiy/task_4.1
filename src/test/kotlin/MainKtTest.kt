package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun main() = Unit

    @Test
    fun calculatePrice() {
        val expected = 1000
        val itemCount = 10

        val result = calculatePrice(itemCount)

        assertEquals(expected, result)
    }

    @Test
    fun calculatePrice_Discount() {
        val expected = 900
        val itemCount = 10

        val result = calculatePrice(itemCount, discountStart = 500)

        assertEquals(expected, result)
    }

    @Test
    fun calculatePrice_Gold() {
        val expected = 900
        val itemCount = 10

        val result = calculatePrice(itemCount, userLevel = "gold")

        assertEquals(expected, result)
    }
    @Test
    fun calculatePrice_Silver() {
        val expected = 950
        val itemCount = 10

        val result = calculatePrice(itemCount, userLevel = "silver")

        assertEquals(expected, result)
    }

}