package app.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class DiceTest{

    @Test
    fun `주사위 생성시 주사위는 값을 가진다`(){
        assertThat(Dice(6).value).isNotNull
    }


    @ParameterizedTest
    @ValueSource(ints = [1,2,3,4,5,6])
    fun `주사위값을 임의로 지정한채로 주사위를 생성할수 있다`(num: Int) {
        assertThat(Dice(6,num).value).isEqualTo(num)
    }


    @ParameterizedTest
    @ValueSource(ints = [1, 3, 5])
    fun `주사위값이 홀수라면 참을 반환한다`(num: Int) {
        assertTrue(Dice(6,num).isOdd())
    }

    @ParameterizedTest
    @ValueSource(ints = [2, 4, 6])
    fun `주사위값이 짝수라면 거짓을 반환한다`(num: Int) {
        assertFalse(Dice(6,num).isOdd())
    }

}