package app.domain

class DiceNumber constructor(val number: Int){
    fun isOdd() : Boolean{
        return number%2 == 1
    }
}