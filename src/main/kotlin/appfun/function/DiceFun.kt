package appfun.function

import java.util.Random


    fun isOdd(num : Int) : Boolean = num and 1 == 1

    fun supplyRandomNum(limit : Int) : Int = Random().nextInt(1, limit)
