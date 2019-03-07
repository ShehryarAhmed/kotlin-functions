package com.kotlinfunction.sample

fun main(args: Array<String>) {
//println(labelMultiPly(1,1,"The Result is:"))

//        val std = Student("Ali")
//        println(std.upperCaseFirstName())

//        val car1 = Car("Red","Honda","2018")
//        val car2 = Car("Black","Hondas","2018")
//        val car3 = Car("Yellow","Toyata","2018")
//        val car4 = Car("Pink","Civic","2018")

//        printCarColors(car1,car2,car3,car4)
//        val cars = arrayOf(car1,car2,car3,car4)
//        val moreCar = arrayOf(car3,car4)
//        val car5= car4.copy()
//
//    val add : Double? = 10.0
//        val lotsOfCar = arrayOf(*cars,*moreCar,car5,std)
//
//        for(car in lotsOfCar){
//                println(car)
//        }
//        printCarColors(*cars)
//        val s ="this all are in small letter"
//        print(s.upperFirstAndlast());
//
//    var var1 = null
//    var myList1 : List<String?> = listOf(null,null) //list ke value null hu sakte hai
//    var myList2 : List<String>? = null //list null hu sakta hai
//    var myList3 : List<String?>? = listOf(null,null)//list and value both are possible to null
//
//    val numberOfFish = 500
//    when(numberOfFish){
//        0 -> print("o")
//        50 -> print("50")
//        else -> println("Perfect!")
//    }
//
//    val swarm = arrayOf("h","f")
//    for((index, element) in swarm.withIndex()){
//        println("Fish $index element $element")
//    }
//    println("\nYour fortune is: ${getFortune()}")

}




fun labelMultiPly(param1:Int,param2: Int,label:String):String{
        return "$label ${param1/param2}"
}

fun labelMultiPly1(param1:Int,param2: Int,label:String):String = "$label ${param1/param2}"

fun whatever() = 3*4

class Student(val firstName:String){

        fun upperCaseFirstName() = firstName.toUpperCase()
}

data class Car(var color:String,var model:String,var year:String){

}

fun String.upperFirstAndlast():String{
        var upperFirst = this.substring(0,1).toUpperCase()
        upperFirst += this.substring(1)
        return upperFirst.substring(0,upperFirst.length-1)+upperFirst.substring(upperFirst.length-1,upperFirst.length).toUpperCase()
}

fun printCarColors(vararg cars:Car){
        for (car in cars){
                println(car.color)
        }
}