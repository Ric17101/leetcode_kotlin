/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main(args: Array<String>) {
    val test = MaximumProductPair().maxProductPair(listOf(-10, -3, 5, 6, -2))
//    val test = MaximumProductPair().maxProductPair(listOf(1, 0, 1, 2, 3, -10, -3, 5, 6, -2))
    println(test)
}

fun maxProductPairDuringTest() {

    //
    // For example, consider array {-10, -3, 5, 6, -2}. The maximum product is the (-10, -3) or (5, 6) pair.
    val array1 = listOf(1, 2, 3, -10, -3, 5, 6, -2)
    val products = mutableListOf<Int>()
    val pairs = mutableListOf<Int>()

    for (x in array1) {
        val index = array1.indexOf(x);

        if (index < array1.size - 1) {
            val tempProduct = array1[index] * array1[index + 1];

            // Maybe condition should check which product is the highest
            if (products.contains(tempProduct) || index == 0) {
                pairs.add(array1[index])
                pairs.add(array1[index + 1])
            } else {
                pairs.remove(array1[index + 1])
            }
            products.add(tempProduct)
        }
    }
    println(products.toString())
    println(pairs.toString())
}

class MaximumProductPair {
    fun maxProductPair(nums: List<Int>): List<Pair<Int, Int>> {
        // For example, consider array {-10, -3, 5, 6, -2}. The maximum product is the (-10, -3) or (5, 6) pair.
        val pairs = mutableListOf<Pair<Int, Int>>()
        var maxProduct = 0

        for (i in nums.indices) {
            if (i < nums.size - 1 && maxProduct <= nums[i] * nums[i + 1]) {
                maxProduct = nums[i] * nums[i + 1]
            }
        }

        for (i in nums.indices) {
            if (i < nums.size - 1 && maxProduct <= nums[i] * nums[i + 1]) {
                pairs.add(Pair(nums[i], nums[i + 1]))
            }
        }

        return pairs
    }
}