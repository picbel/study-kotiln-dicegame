package app.component

import app.domain.DiceNumber
import java.util.*

class Dice{
    private val random : SplittableRandom = SplittableRandom()

    fun roll(): DiceNumber {
        return DiceNumber(random.nextInt(1,6));
    }
}