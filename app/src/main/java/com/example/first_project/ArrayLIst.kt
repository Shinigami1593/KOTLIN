package com.example.first_project

fun main(){
//    var data = arrayListOf("Ram","Sita")
//    var da = mutableListOf<Any>("apple","mango")
    var data = mapOf(
        "Nepal" to "It is a landlocked country",
        "Apple" to "Its a fruit",
        "Andriod" to "Its a operating system"
    )
    println("Enter any words::")
    var word : String = readln()
    var result : String = data[word].toString()
    println("The meaning of $word is $result ")
}