package app.component

import app.domain.Dice
import app.function.oddEvenPick
import java.sql.DriverManager.println

class DiceOddEvenGame {
    fun startGame() {
        println("Game start")
        println("6면 주사위가 던져집니다. 먼저 주사위의 결과값이 홀인지 짝인지 정해주십시오.")
        println("1을 입력하시면 홀, 2를 입력하시면 짝입니다.")
        println("1 : 홀, 2: 짝")
        val pick = oddEvenPick
        val dice = Dice.diceRoll(6)
        println("주사위를 던졌습니다. 나온 결과값 = $dice")
        if (dice.isOdd() == pick) {
            println("결과를 맞추셧습니다. 플레이어 승리")
        } else {
            println("결과를 못 맞추셧습니다. 플레이어 패배")
        }
    }
}
