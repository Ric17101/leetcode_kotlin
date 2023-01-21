import medium.NumIslands
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class NumIslandsTest {
    private lateinit var test: NumIslands

    @BeforeEach
    fun configureFindAllDuplicates() {
        test = NumIslands()
    }

    @Test
    @DisplayName("Should return the correct number of islands")
    fun shouldReturnNumberOfIslands() {
        val numberOfIslands = test.numIslands(
            arrayOf(
                charArrayOf('1', '1', '1', '1', '0'),
                charArrayOf('1', '1', '0', '1', '0'),
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('0', '0', '0', '0', '0'),
            ),
        )
        assert(numberOfIslands == 1)
    }

    @Test
    fun shouldReturnNumberOfIslands2() {
        val numberOfIslands = test.numIslands(
            arrayOf(
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('0', '0', '1', '0', '0'),
                charArrayOf('0', '0', '0', '1', '1')
            ),
        )
        assert(numberOfIslands == 3)
    }
}