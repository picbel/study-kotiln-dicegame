package app.component

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

import kotlin.test.assertNotNull
import kotlin.test.assertTrue

internal class DiceTest {

    @Test
    fun createRandomNumber() {
        //given
        val sut = Dice();

        //when
        val createRandomNumber = sut.roll()

        //then
        assertNotNull(createRandomNumber);
    }

    @Test
    fun 생성_범위_확인_테스트() {
        //given
        val sut = Dice();

        //when
        val createRandomNumber = sut.roll()

        //then
        assertAll({
            assertTrue(createRandomNumber.number >= 1 )
            assertTrue(createRandomNumber.number <= 6 )
        })
    }
}