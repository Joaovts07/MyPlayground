package com.example.myplayground

import org.junit.Assert.*
import org.junit.Test

class ChallengesTest {

    @Test
    fun testIsPalindrome() {
        assertTrue("racecar".isPalindrome())
        assertTrue("level".isPalindrome())
        assertTrue("a".isPalindrome())
        assertTrue("".isPalindrome())
        assertFalse("hello".isPalindrome())
        assertFalse("kotlin".isPalindrome())
    }

    @Test
    fun testFactorial() {
        assertEquals(1L, factorial(0))
        assertEquals(1L, factorial(1))
        assertEquals(2L, factorial(2))
        assertEquals(6L, factorial(3))
        assertEquals(24L, factorial(4))
        assertEquals(120L, factorial(5))
    }

    @Test
    fun testReverseString() {
        assertEquals("olleh", reverseString("hello"))
        assertEquals("nitlok", reverseString("kotlin"))
        assertEquals("a", reverseString("a"))
        assertEquals("", reverseString(""))
    }
}
