package app.domain

import java.util.Random

class Dice private constructor(val value: Int) {

    operator fun plus(dice: Dice) = value + dice.value

    fun isOdd() : Boolean = value and 1 == 1

    companion object{

        private val random : Random = Random()

        operator fun invoke(limit: Int,value: Int) : Dice {
            if (limit < 2)
                throw IllegalArgumentException("주사위의 최소 한계치는 1보다 커야합니다.")

            if (value !in 1..limit)
                throw IllegalArgumentException("올바른 주사위의 값이 아닙니다.")

            return Dice(value)
        }

        fun diceRoll(limit : Int) : Dice {
            return Dice(limit, random.nextInt(1,limit))
        }

    }


}