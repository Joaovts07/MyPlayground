package com.example.myplayground

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
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
    fun testFizzBuzz() {
        assertEquals(
            listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"),
            fizzBuzzSequence(15).toList()
        )
        assertEquals(emptyList<String>(), fizzBuzzSequence(0).toList())
        assertEquals("FizzBuzzBazz", fizzBuzzSequence(105, listOf(3 to "Fizz", 5 to "Buzz", 7 to "Bazz")).last())
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
        assertEquals("niltok", reverseString("kotlin"))
        assertEquals("a", reverseString("a"))
        assertEquals("", reverseString(""))
    }

    @Test
    fun testRomanToInt() {
        assertEquals(3, romanToInt("III"))
        assertEquals(4, romanToInt("IV"))
        assertEquals(9, romanToInt("IX"))
        assertEquals(58, romanToInt("LVIII"))
        assertEquals(1994, romanToInt("MCMXCIV"))
    }

    @Test
    fun testIsValidParentheses() {
        assertTrue(isValidParentheses(""))
        assertTrue(isValidParentheses("()"))
        assertTrue(isValidParentheses("()[]{}"))
        assertTrue(isValidParentheses("{[()]}"))
        assertTrue(isValidParentheses("fun main() { println(list[0]) }"))
        assertFalse(isValidParentheses("(]"))
        assertFalse(isValidParentheses("([)]"))
        assertFalse(isValidParentheses("(("))
        assertFalse(isValidParentheses("))"))
        assertFalse(isValidParentheses("}{"))
    }

    @Test
    fun testTwoSum() {
        assertEquals(0 to 1, twoSum(listOf(2, 7, 11, 15), 9))
        assertEquals(1 to 2, twoSum(listOf(3, 2, 4), 6))
        assertEquals(0 to 1, twoSum(listOf(3, 3), 6))
        assertEquals(2 to 4, twoSum(listOf(-1, -2, -3, -4, -5), -8))
        assertEquals(0 to 3, twoSum(listOf(0, 4, 3, 0), 0))
        assertNull(twoSum(listOf(1, 2), 7))
        assertNull(twoSum(listOf(5), 10))
        assertNull(twoSum(emptyList(), 0))
    }
}
