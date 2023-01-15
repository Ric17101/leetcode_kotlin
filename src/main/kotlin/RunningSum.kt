fun main(args: Array<String>) {

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