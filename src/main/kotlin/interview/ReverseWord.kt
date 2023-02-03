package interview

fun main() {

//    print(FizzBuzz().print((1..100)))
    print((1..100).map { index ->
        mapOf(
            0 to index,
            index % 3 to "Fizz",
            index % 5 to "Buzz",
            index % 15 to "Fizz Buzz"
        )[0] 
    })
}

class FizzBuzz {
//    fun print(intRange: IntRange): List<Map<Int, Any>> {
//        return intRange.map { index -> mapOf(0 to index,
//            index % 3 to "Fizz",
//            index % 5 to "Buzz",
//            index % 15 to "Fizz Buzz"
//        )[0]
//        }
//    }
}