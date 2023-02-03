package interview

fun main() {

    val string = "Reverse word in a string"

    val reversed = string.split(" ")
        .reversed()
        .joinToString(" ")

    print(reversed)
}
