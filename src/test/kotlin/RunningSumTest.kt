import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class RunningSumTest {
    private lateinit var test: RunningSum

    @BeforeEach
    fun configureRunningSum() {
        test = RunningSum()
    }

    @Test
    @DisplayName("Should return the correct list of sum")
    fun shouldReturnCorrectDuplicates() {
        val sums = test.runningSum(intArrayOf(1,2,3,4))
        assert(sums.contentEquals(intArrayOf(1, 3, 6, 10)))
    }
}