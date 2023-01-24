import easy.ReverseString
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ReverseStringTest {
    private lateinit var test: ReverseString

    @BeforeEach
    fun configureFindAllDuplicates() {
        test = ReverseString()
    }

    @Test
    @DisplayName("Should reverse string input")
    fun shouldReverseString() {
        test.reverseString("Hello ".toCharArray())
    }

    @Test
    fun shouldReverseString2() {
        test.reverseString("Test1 ".toCharArray())
    }
}