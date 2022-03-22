package app.function

import java.util.*

val isEven: (Int) -> Boolean = { i: Int -> i and 1 == 0 }
val supplyDiceNum: Int = Random().nextInt(1, 6)
val inputNumber: Int = readLine()?.toInt() ?: throw IllegalArgumentException("잘못된 입력입니다.")
