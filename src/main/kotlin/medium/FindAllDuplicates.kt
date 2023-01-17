package medium

import kotlin.math.abs

fun main(args: Array<String>) {
    val test = FindAllDuplicates().findDuplicates(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1))
//    val test = FindAllDuplicates().findDuplicates(intArrayOf(1,1,2))
    print(test)
}

class FindAllDuplicates {
    fun findDuplicates(nums: IntArray): List<Int> {
        val list = mutableListOf<Int>()
        for (i in nums.indices) {
            val index = abs(nums[i]) - 1
            if (nums[index] < 0) list.add(index + 1)
            nums[index] = -nums[index]
            println(nums.toList().toString())
        }

        return list.toList()
    }

    fun findDuplicates2(nums: IntArray): List<Int> {
        val list = mutableListOf<Int>()
        for (i in nums.indices) {
            val index = abs(nums[i]) - 1
            if (nums[index] < 0) list.add(index + 1)
            nums[index] = -nums[index]
        }

        return list.toList()
    }
}