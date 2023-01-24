import easy.ReverseStr
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ReverseStrTest {
    private lateinit var test: ReverseStr

    @BeforeEach
    fun configureFindAllDuplicates() {
        test = ReverseStr()
    }

    @Test
    @DisplayName("Should reverse string input for every 2*k")
    fun shouldReverseString() {
        val string = test.reverseStr("abcd", 2)
        assertEquals(string, "bacd")
    }

    @Test
    fun shouldReverseString2() {
        assertEquals(test.reverseStr("abcdefg", 2), "bacdfeg")
    }

    @Test
    @DisplayName("Should reverse string input for every 2*k")
    fun shouldReverseString3() {
        assertEquals(test.reverseStr("abcdef", 3),"cbadef")
    }
}
