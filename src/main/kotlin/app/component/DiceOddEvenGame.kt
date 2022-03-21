package app.component

class DiceOddEvenGame {
    fun startGame(){
        println("Game start")
        println("6면 주사위가 던져집니다. 먼저 주사위의 결과값이 홀인지 짝인지 정해주십시오.")
        println("1을 입력하시면 홀, 2를 입력하시면 짝입니다.")
        println("1 : 홀, 2: 짝")
        val isOdd = userPick()
        val diceNumber = Dice().roll();
        println("주사위를 던졌습니다. 나온 결과값 = "+diceNumber.number)
        if (diceNumber.isOdd() == isOdd){
            println("결과를 맞추셧습니다. 플레이어 승리")
        }else{
            println("결과를 못 맞추셧습니다. 플레이어 패배")
        }
    }

    private fun userPick():Boolean{
        return when(inputNumber()){
            1 -> {
                println("홀을 선택하셨습니다.")
                true
            }
            2 -> {
                println("짝을 선택하셨습니다.")
                false
            }
            else -> throw IllegalArgumentException("1, 2 둘중의 하나를 선택하여주십시오.")
        }
    }

    private fun inputNumber(): Int {
        val readLine = readLine()
        if (readLine != null) {
            // todo String 받은것 확인해야함 
            return readLine.toInt()
        }else{
            throw IllegalArgumentException("잘못된 입력입니다.")
        }
    }
}