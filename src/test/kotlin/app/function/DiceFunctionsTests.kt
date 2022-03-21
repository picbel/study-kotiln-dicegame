package app.function

import app.domain.isEven
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class DiceFunctionsTests {
    @ParameterizedTest
    @ValueSource(ints = [0, 2, 4, 6, 8, 10])
    fun `입력값이 짝수라면 참을 반환한다`(num: Int) {
        assertTrue(isEven(num))
    }

    @ParameterizedTest
    @ValueSource(ints = [1, 3, 5, 7, 9])
    fun `입력값이 짝수라면 거짓을 반환한다`(num: Int) {
        assertFalse(isEven(num))
    }
}
