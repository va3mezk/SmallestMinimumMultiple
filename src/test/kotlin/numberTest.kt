import org.junit.Test
import kotlin.test.assertEquals

class numberTest {
    @Test
    fun `test one`() = assertEquals(2, number().search(2))

    @Test
    fun `test two`() = assertEquals(2520, number().search(10))

    @Test
    fun `test there`() = assertEquals(60, number().search(5))

    @Test
    fun `test four`() = assertEquals(232792560, number().search(20))

    @Test
    fun `test five`() = assertEquals(840, number().search(8))
}