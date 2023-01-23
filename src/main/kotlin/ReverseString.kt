fun main(args: Array<String>) {
//    val reverseString = ReverseString().reverseString("Test1".toCharArray())
    val reverseString = ReverseString().reverseString("Hello ".toCharArray())
    print(reverseString)
}

class ReverseString {
    fun reverseString(s: CharArray): Unit {

        var pointerA = 0
        var pointerB = s.size - 1
        while (pointerA < pointerB) {
            val temp = s[pointerA]
            s[pointerA] = s[pointerB]
            s[pointerB] = temp

            pointerA++
            pointerB--
        }
    }
}