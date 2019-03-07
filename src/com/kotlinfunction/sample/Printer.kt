package com.kotlinfunction.sample

import sun.rmi.runtime.Log

fun main(args: Array<String>) {
//    val laserPrinter = laserPrinter("Brother 1234")
//    laserPrinter.PrintModel()
//    println("\nYour fortune is: ${getFortune()}")

//    var fortune: String
//    for (i in 1..10) {
//        fortune = getFortune(getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break;
//    }
//    print("hello")
    var fortune: String

        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy"));


}

fun getBirthday() : Int {
    print("\n Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}


fun getFortune(birthday : Int) : String {

    val fortunes = listOf("You will have a great day!",
    "Things will go well for you today.",
    "Enjoy a wonderful day of success.",
    "Be humble and all will turn out well.",
    "Today is a good day for exercising restraint.",
    "Take it easy and enjoy life!",
    "Treasure your friends, because they are your greatest fortune.")

    val index = when(birthday){
        in 1..7 -> 4
        28, 31 -> 2
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]
}


open class Printer(val modelName : String) {

    open fun PrintModel(){
        println("The model name of this printer is $modelName")
    }
}

class laserPrinter(modelName: String): Printer(modelName){

//    override fun PrintModel(){
//        println("The model name of laser printer $modelName")
//    }
}


//fun getFortune() : String {
//    val fortunes = listOf( "You will have a great day!",
//        "Things will go well for you today.",
//        "Enjoy a wonderful day of success.",
//        "Be humble and all will turn out well.",
//        "Today is a good day for exercising restraint.",
//        "Take it easy and enjoy life!",
//        "Treasure your friends, because they are your greatest fortune.")
//
//}
