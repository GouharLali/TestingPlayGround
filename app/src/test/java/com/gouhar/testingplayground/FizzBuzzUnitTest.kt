package com.gouhar.testingplayground

import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Test

class FizzBuzzUnitTest {
    @Test
    fun `fizzBuzz 1=1`() {
        val result = fizzBuzz(1)
        assertEquals("1", result)
    }

    @Test
    fun `13=13`() {
        val result = fizzBuzz(13)
        assertEquals("13",result)
    }

    @Test
    fun `3,6,9 = Fizz`() {
        assertEquals("Fizz", fizzBuzz(3))
        assertEquals("Fizz", fizzBuzz(6))
        assertEquals("Fizz", fizzBuzz(9))
    }

    @Test
    fun `5,25,95 = Buzz`() {
        assertEquals("Buzz", fizzBuzz(5))
        assertEquals("Buzz", fizzBuzz(25))
        assertEquals("Buzz", fizzBuzz(95))
    }
    
    @Test
    fun `15,30,45,60,75,90 = FizzBuzz`() {
        assertEquals("FizzBuzz", fizzBuzz(15))
        assertEquals("FizzBuzz", fizzBuzz(30))
        assertEquals("FizzBuzz", fizzBuzz(45))
        assertEquals("FizzBuzz", fizzBuzz(60))
        assertEquals("FizzBuzz", fizzBuzz(75))
        assertEquals("FizzBuzz", fizzBuzz(90))
    }
}
