package easy

import kotlin.math.min

fun main(args: Array<String>) {
//    val reverseString = ReverseStr().reverseStr("Hello", 2)
    val reverseString = ReverseStr().reverseStr("abcdefg", 2)
//    val reverseString = ReverseStr().reverseStr("abcdef", 3)
//    val reverseString = ReverseStr().reverseStr("abcd", 2)
    print(reverseString)
}

class ReverseStr {
    fun reverseStr(s: String, k: Int): String {
        val charArray = s.toCharArray()
        var index = 0
        while (index < s.length) {

            var start = index
            var end = min(index + k - 1, charArray.size - 1)

            while (start < end) {
                val temp = charArray[start]
                charArray[start] = charArray[end]
                charArray[end] = temp

                start++
                end--
            }

            index += 2 * k
        }
        return String(charArray)
    }

    // First Attempt wrong: should have loop thru the range of current index to nextPointer (not just a single string reversal
    // Test fail with ("abcdefg", 2)
    fun reverseStr2(s: String, k: Int): String {
        val charArray = s.toCharArray()
        var index = 0
        while (index < s.length) {
            val nextPointer = index + 1

            if (nextPointer < charArray.size) {
                val temp = charArray[index]
                charArray[index] = charArray[nextPointer]
                charArray[nextPointer] = temp
            }
            index += 2 * k
        }
        return String(charArray)
    }
}