package ru.samsung.itacademy.mdev.simplecalctemplate

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.After

class CalculatorTest {
    private var calculator: Calculator? = null

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(5, calculator?.add(3, 2))
    }

    @Test
    fun addition_negative_isCorrect() {
        assertEquals(-5, calculator?.add(-3, -2))
    }

    @Test
    fun subtract_isCorrect() {
        assertEquals(1, calculator?.subtract(3, 2))
    }

    @Test
    fun subtract_negative_isCorrect() {
        assertEquals(-1, calculator?.subtract(2, 3))
    }

    @Test
    fun multiply_isCorrect() {
        assertEquals(6, calculator?.multiply(3, 2))
    }

    @Test
    fun multiply_negative_isCorrect() {
        assertEquals(-6, calculator?.multiply(-3, 2))
    }

    @Test
    fun divide_negative_isCorrect() {
        assertEquals(-1, calculator?.divide(-3, 2))
    }

    @Test
    fun zeroDivision() {
        assertEquals(0, calculator?.divide(2, 0))
    }

    @Test
    fun complex() {
        // (3 + 2) * 2 - 6 / 2 = 7
        assertEquals(5, calculator?.add(3, 2))
        assertEquals(10, calculator?.multiply(5, 2))
        assertEquals(3, calculator?.divide(6, 2))
        assertEquals(7, calculator?.subtract(10, 3))
        assertEquals(0, calculator?.divide(123, 0))
    }

    @After
    fun teardown() {
        calculator = null
    }
}
