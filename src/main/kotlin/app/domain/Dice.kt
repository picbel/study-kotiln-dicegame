package app.domain

import java.util.Random

class Dice (private val limit: Int){

    private val random : Random = Random()

    var value: Int

    init {
        value = randomNumber()
    }

    constructor(limit: Int, value: Int) : this(limit){
        if (limit < 2)
            throw IllegalArgumentException("주사위의 최소 한계치는 1보다 커야합니다.")

        if (value !in 1..limit)
            throw IllegalArgumentException("올바른 주사위의 값이 아닙니다.")

        this.value = value
    }

    operator fun plus(dice: Dice) = value + dice.value

    fun isOdd() : Boolean = value and 1 == 1

    fun reroll() = run { value = randomNumber() }

    private fun randomNumber() = random.nextInt(1, limit)

    companion object{

        fun diceRoll(limit : Int) : Dice {
            return Dice(limit)
        }

    }


}