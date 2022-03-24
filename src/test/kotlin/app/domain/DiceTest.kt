package app.domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.junit.jupiter.api.Assertions.assertTrue

internal class DiceTest{
    @ParameterizedTest
    @ValueSource(ints = [1, 3, 5])
    fun `주사위값이 홀수라면 참을 반환한다`(num: Int) {
        assertTrue(Dice(6,num).isOdd())
    }

    @ParameterizedTest
    @ValueSource(ints = [0, 2, 4])
    fun `주사위값이 짝수라면 거짓을 반환한다`(num: Int) {
        assertFalse(Dice(6,num).isOdd())
    }
}