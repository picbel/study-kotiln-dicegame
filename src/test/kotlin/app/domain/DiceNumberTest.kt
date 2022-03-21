package app.domain

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DiceNumberTest {

    @Test
    fun isOdd() {
        //given
        val sut = DiceNumber(1)

        //when
        val odd = sut.isOdd()

        //then
        assertTrue(odd)
    }

    @Test
    fun isEven() {
        //given
        val sut = DiceNumber(2)

        //when
        val odd = sut.isOdd()

        //then
        assertFalse(odd)
    }
}