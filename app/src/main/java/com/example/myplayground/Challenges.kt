package com.example.myplayground

/**
 * Challenge 1: Palindrome
 * Write an extension function for String that returns true if the string is a palindrome.
 * A palindrome is a word that reads the same backward as forward (e.g., "level", "radar").
 */
fun String.isPalindrome(): Boolean {
    val reversed = this.reversed()
    return reversed == this
}

/**
 * Challenge 2: FizzBuzz
 * Write a function that prints numbers from 1 to n.
 * For multiples of 3, print "Fizz" instead of the number.
 * For multiples of 5, print "Buzz".
 * For multiples of both 3 and 5, print "FizzBuzz".
 * No if/else chain: each rule contributes its word when it matches, the words are glued together,
 * and a number with no matching rule falls back to itself. Adding "Bazz" for 7 is a one-line change.
 */
fun fizzBuzzSequence(
    n: Int,
    rules: List<Pair<Int, String>> = listOf(3 to "Fizz", 5 to "Buzz"),
): Sequence<String> =
    (1..n).asSequence().map { i ->
        rules
            .filter { (divisor, _) -> i % divisor == 0 }
            .joinToString("") { (_, word) -> word }
            .ifEmpty { i.toString() }
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
fun reverseString(input: String): String =
    buildString(input.length) {
        for (i in input.lastIndex downTo 0) append(input[i])
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
        val current =
            when (s[i]) {
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

/**
 * Challenge 6: Valid Parentheses
 * Write a function that returns true if every bracket in the string is correctly closed.
 * Brackets are (), [] and {}. Each opener must be closed by the same type, in the right order.
 * Any other character is ignored.
 * Example: "()[]{}" -> true, "{[()]}" -> true, "(]" -> false, "([)]" -> false, "((" -> false.
 */
fun isValidParentheses(s: String): Boolean {
    // TODO: Implement this
    return false
}

/**
 * Challenge 7: Two Sum
 * Write a function that finds two different positions in the list whose numbers add up to target.
 * Return the pair of indices (smaller index first), or null if no such pair exists.
 * The same position can't be used twice. You can assume there is at most one valid pair.
 * Bonus: solve it in a single pass over the list, without checking every pair.
 * Example: [2, 7, 11, 15], target 9 -> (0, 1); [3, 2, 4], target 6 -> (1, 2); [1, 2], target 7 -> null.
 */
fun twoSum(nums: List<Int>, target: Int): Pair<Int, Int>? {
    // TODO: Implement this
    return null
}
