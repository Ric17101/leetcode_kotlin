fun main(args: Array<String>) {
    val test = ProductArrayExceptSelf().productExceptSelf(intArrayOf(1,2,3,4))
//    val test = ProductArrayExceptSelf().productExceptSelf(intArrayOf(4,5,1,8,2))
//    val test = ProductArrayExceptSelf().prodxuctExceptSelf(intArrayOf(-1, 1, 0, -3, 3))
    print(test.toList())
}

class ProductArrayExceptSelf {
    // Optimized
    fun productExceptSelf(nums: IntArray): IntArray {

        val N = nums.size

        val products = IntArray(N)

        products[0] = 1

        for (i in 1 until N) {
            products[i] = nums[i - 1] * products[i - 1]
        }

        var R = 1
        for (i in N - 1 downTo 0) {
            products[i] = products[i] * R
            R *= nums[i]
        }

        return products
    }

    fun productExceptSelf_Dummy(nums: IntArray): IntArray {

        val N = nums.size

        val left_products = IntArray(N)
        val right_products = IntArray(N)

        val products = IntArray(N)

        left_products[0] = 1
        right_products[N - 1] = 1

        for (i in 1 until N) {
            left_products[i] = nums[i - 1] * left_products[i - 1]
        }

        for (i in N - 2 downTo 0) {
            right_products[i] = nums[i + 1] * right_products[i + 1]
        }

        for (i in 0 until N) {
            products[i] = right_products[i] * left_products[i]
        }

        return products
    }
}