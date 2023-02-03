package interview

fun main() {
    val board1 = arrayOf(
        intArrayOf(2, 4, 8, 3, 6, 5, 7, 9, 1),
        intArrayOf(9, 3, 7, 8, 1, 4, 6, 2, 5),
        intArrayOf(5, 1, 6, 7, 2, 9, 3, 8, 4),
        intArrayOf(7, 8, 1, 4, 3, 2, 5, 6, 9),
        intArrayOf(4, 6, 9, 5, 8, 1, 2, 7, 3),
        intArrayOf(3, 5, 2, 9, 7, 6, 4, 1, 8),
        intArrayOf(8, 9, 5, 2, 4, 7, 1, 3, 6),
        intArrayOf(6, 2, 4, 1, 9, 3, 8, 5, 7),
        intArrayOf(1, 7, 3, 6, 5, 8, 9, 4, 2),
    )

    val board2 = arrayOf(
        intArrayOf(2, 9, 5, 7, 4, 3, 8, 6, 1),
        intArrayOf(4, 3, 1, 8, 6, 5, 9, 2, 7),
        intArrayOf(8, 7, 6, 1, 9, 2, 5, 4, 3),
        intArrayOf(3, 8, 7, 4, 5, 9, 2, 1, 6),
        intArrayOf(6, 1, 2, 3, 8, 7, 4, 9, 5),
        intArrayOf(5, 4, 9, 2, 1, 6, 7, 3, 8),
        intArrayOf(7, 6, 3, 5, 2, 4, 1, 8, 9),
        intArrayOf(9, 2, 8, 6, 7, 1, 3, 5, 4),
        intArrayOf(1, 5, 4, 9, 3, 8, 6, 7, 2)
    )
    Sudoku().test(board1)
}

const val N = 45

class Sudoku {

    fun test(board: Array<IntArray>): Boolean {

        // Row
        for (row in board) {
            val isValid = row.reduce { sum, element -> sum + element } == N

            println("Row is valid: $isValid")
            if (!isValid) return false
        }

        // Columm
        for (col in 0 until 9) {
            var sum = 0
            for (j in 0 until 9) {
                sum += board[j][col]
            }

            println("Column is valid:  ${sum == N} ")
            if (sum != N) return false
        }

        return checkSquares(board)
    }

    private fun checkSquares(array: Array<IntArray>): Boolean {
        return checkSquare(0, 3, array) &&
                checkSquare(3, 6, array) &&
                checkSquare(6, 9, array)
    }

    private fun checkSquare(x: Int, y: Int, array: Array<IntArray>): Boolean {
        var sum = 0
        for (i in 0 until 3) {
            for (j in x until y) {
                sum += array[i][j]
                print("${array[i][j]} - ")
            }
        }
        println("TEST")

        for (i in 3 until 6) {
            for (j in x until y) {
                sum += array[i][j]
                print("${array[i][j]} - ")
            }
        }
        println("TEST")

        for (i in 6 until 9) {
            for (j in x until y) {
                sum += array[i][j]
                print("${array[i][j]} - ")
            }
        }
        println("TEST")
        println("Square is valid: ${sum == (N * 3)}")
        return sum == (N * 3)
    }
}

class SudokuPrototype {

    fun test(board: Array<IntArray>) {

        // Row
        for (row in board) {
            val isValid = row.reduce { sum, element -> sum + element } == N

            println("Row is valid: $isValid")
        }

        // Columm
        for (col in 0 until 9) {
            var sum = 0
            for (j in 0 until 9) {
                sum += board[j][col]
            }

            println("Column is valid:  ${sum == N} ")
        }

        checkSquares(board)
    }

    fun checkSquares(array: Array<IntArray>) {
        checkSquare(0, 3, array)
        checkSquare(3, 6, array)
        checkSquare(6, 9, array)
    }

    fun checkSquare(x: Int, y: Int, array: Array<IntArray>) {
        var sum = 0
        for (i in 0 until 3) {
            for (j in x until y) {
                sum += array[i][j]
                print("${array[i][j]} - ")
            }
        }
        println("TEST")

        for (i in 3 until 6) {
            for (j in x until y) {
                sum += array[i][j]
                print("${array[i][j]} - ")
            }
        }
        println("TEST")

        for (i in 6 until 9) {
            for (j in x until y) {
                sum += array[i][j]
                print("${array[i][j]} - ")
            }
        }
        println("TEST")
        println("Square is valid: ${sum == (N * 3)}")
    }
}
