package app.function

import java.util.*

val isOdd: (Int) -> Boolean = { i: Int -> i and 1 == 1 }
val supplyDiceNum: Int = Random().nextInt(1, 6)
