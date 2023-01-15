

fun main(args: Array<String>) {
    val difference = Solution().maxProductDifference(listOf(2, 6, -30, 30, -15, 30, -12))
    print(difference)
}
class Solution {
    fun maxProductDifference(nums: List<Int>): Int {
        nums.sorted()
        val n = nums.size
        return nums[n - 1] * nums[n - 2] - nums[0] * nums[1]
    }
}