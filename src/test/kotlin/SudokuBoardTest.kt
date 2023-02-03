import interview.Sudoku
import medium.FindAllDuplicates
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class SudokuBoardTest {
    private lateinit var test: Sudoku

    @BeforeEach
    fun configureFindAllDuplicates() {
        test = Sudoku()
    }

    @Test
    fun hasValidSudokuBoard() {
        val board = arrayOf(
            intArrayOf(2, 9, 5, 7, 4, 3, 8, 6, 1),
            intArrayOf(4, 3, 1, 8, 6, 5, 9, 2, 7),
            intArrayOf(8, 7, 6, 1, 9, 2, 5, 4, 3),
            intArrayOf(3, 8, 7, 4, 5, 9, 2, 1, 6),
            intArrayOf(6, 1, 2, 3, 8, 7, 4, 9, 5),
            intArrayOf(5, 4, 9, 2, 1, 6, 7, 3, 8),
            intArrayOf(7, 6, 3, 5, 2, 4, 1, 8, 9),
            intArrayOf(9, 2, 8, 6, 7, 1, 3, 5, 4),
            intArrayOf(1, 5, 4, 9, 3, 8, 6, 7, 2)
        );

        val isValidSudoku = test.test(board)
        assert(isValidSudoku)
    }

    @Test
    fun hasValidSudokuBoard2() {
        val board = arrayOf(
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

        val isValidSudoku = test.test(board)
        assert(isValidSudoku)
    }
}