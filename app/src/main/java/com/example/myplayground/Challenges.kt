package com.example.myplayground

/**
 * Challenge 1: Palindrome
 * Write an extension function for String that returns true if the string is a palindrome.
 * A palindrome is a word that reads the same backward as forward (e.g., "level", "radar").
 */
fun String. isPalindrome(): Boolean {
    val reversed = this.reversed()
    return reversed == this
}

/**
 * Challenge 2: FizzBuzz
 * Write a function that prints numbers from 1 to n.
 * For multiples of 3, print "Fizz" instead of the number.
 * For multiples of 5, print "Buzz".
 * For multiples of both 3 and 5, print "FizzBuzz".
 */
fun fizzBuzz(n: Int) {
    // TODO: Implement this
}

/**
 * Challenge 3: Factorial
 * Write a function to calculate the factorial of a number n (n!).
 */
fun factorial(n: Int): Long {
    if (n < 0) return 0
    return (2..n).fold(1L) { acc, i -> acc * i }
}

/**
 * Challenge 4: Reverse String
 * Write a function to reverse a string without using the built-in .reversed() function.
 */
fun reverseString(input: String): String {
    // TODO: Implement this
    return ""
}

/**
 * Challenge 5: Roman to Integer
 * Write a function to convert a Roman numeral string to an integer.
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Example: "III" -> 3, "LVIII" -> 58, "MCMXCIV" -> 1994.
 */
fun romanToInt(s: String): Int {
    var result = 0
    var lastValue = 0

    for (i in s.length - 1 downTo 0) {
        val current = when (s[i]) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }

        if (current < lastValue) {
            result -= current
        } else {
            result += current
        }
        lastValue = current
    }

    return result
}
