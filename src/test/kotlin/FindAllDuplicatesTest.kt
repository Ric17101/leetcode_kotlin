import medium.FindAllDuplicates
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class FindAllDuplicatesTest {
    private lateinit var test: FindAllDuplicates

    @BeforeEach
    fun configureFindAllDuplicates() {
        test = FindAllDuplicates()
    }

    @Test
    @DisplayName("Should return the correct list of duplicates")
    fun shouldReturnCorrectDuplicates() {
        val duplicates = test.findDuplicates(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1))
        assert(duplicates == listOf(2,3))
    }

    @Test
    fun shouldReturnCorrectDuplicates2() {
        val duplicates = test.findDuplicates(intArrayOf(1,1,2))
        assert(duplicates == listOf(1))
    }
}