package medium

fun main() {
    val test = NumIslands().numIslands(
//        arrayOf(
//            charArrayOf('1', '1', '1', '1', '0'),
//            charArrayOf('1', '1', '0', '1', '0'),
//            charArrayOf('1', '1', '0', '0', '0'),
//            charArrayOf('0', '0', '0', '0', '0'),
//        ),
        arrayOf(
            charArrayOf('1','1','0','0','0'),
            charArrayOf('1','1','0','0','0'),
            charArrayOf('0','0','1','0','0'),
            charArrayOf('0','0','0','1','1')
        ),
    )

    print(test)
}

class NumIslands {
    fun numIslands(grid: Array<CharArray>): Int {
        var counter = 0;
        for (i in grid.indices) {
            for (j in grid[i].indices) {

                if (grid[i][j] == '1') {
                    counter++
                    callBFS(grid, i, j)
                }
            }
        }
        return counter
    }

    private fun callBFS(grid: Array<CharArray>, i: Int, j: Int) {
        if (i < 0 || i >= grid.size || j < 0 || j >= grid[i].size || grid[i][j] == '0') return

        grid[i][j] = '0'
        callBFS(grid, i + 1, j) // up
        callBFS(grid, i - 1 , j) // down
        callBFS(grid, i, j - 1) // left
        callBFS(grid, i, j + 1) // right
    }
}