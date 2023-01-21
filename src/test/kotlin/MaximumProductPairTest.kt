import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MaximumProductPairTest {
    private lateinit var test: MaximumProductPair

    @BeforeEach
    fun configureRunningSum() {
        test = MaximumProductPair()
    }

    @Test
    @DisplayName("For example, consider array {-10, -3, 5, 6, -2}. The maximum product is the (-10, -3) or (5, 6) pair.")
    fun shouldReturnCorrectDuplicates() {
        val sums = test.maxProductPair(listOf(-10, -3, 5, 6, -2))
        assert(sums == listOf(Pair(-10, -3), Pair(5, 6)))
    }

    @Test
    @DisplayName("Adding the result above with (30, 1) pair.")
    fun shouldReturnCorrectDuplicates2() {
        val sums = test.maxProductPair(listOf(30, 1, 2, 3, -10, -3, 5, 6, -2))
        assert(sums == listOf(Pair(30, 1), Pair(-10, -3), Pair(5, 6)))
    }
}