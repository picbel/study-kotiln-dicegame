package app.function


val inputNumber: Int = readLine()?.toInt() ?: throw IllegalArgumentException("숫자만 입력하여 주세요.")

val oddEvenPick: Boolean = when (inputNumber) {
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