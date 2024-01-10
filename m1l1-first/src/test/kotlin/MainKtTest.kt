import org.example.sum
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class MainKtTest{

    @Test
    fun testSum() {
        val expected = 5
        assertEquals(expected, sum())
    }
}