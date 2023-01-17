fun main(args: Array<String>) {
    val test = RunningSum().runningSum(intArrayOf(1,2,3,4))
    print(test.toList())
}

class RunningSum {
    fun runningSum(nums: IntArray): IntArray {
        val list = arrayListOf<Int>()
        nums.forEach { num ->
            if (list.isEmpty()) list.add(num)
            else list.add(num + list.last())
        }

        return list.toIntArray()
    }
}