package com.jhowcs.calculator

import com.jhowcs.multimodulecoverage.AppCalculator
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class AppCalculatorTest {

    private val calc = AppCalculator()

    @Test
    fun sum() {
        val actual = calc.sum(5, 5)
        assertEquals(10, actual)
    }

    @Test
    fun multiply() {
        val actual = calc.multiply(5, 5)
        assertEquals(25, actual)
    }

    @Test
    fun divide() {
        val actual = calc.divide(5, 5)
        assertEquals(1, actual)
    }

    @Test
    fun subtract() {
        val actual = calc.subtract(5, 5)
        assertEquals(0, actual)
    }
}