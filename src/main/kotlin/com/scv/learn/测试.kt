package com.scv.learn


fun main() {
    val sSize = sSize()
    sSize.width = 100
    sSize.height = 100
    println("width = ${sSize.width}, height = ${sSize.height}")
    val pSize = pSize()
//    pSize.width = 100 //编译器报错
}

private fun sSize() = object {
    var width: Number = 0
    var height: Number = 0
}

fun pSize() = object {
    var width: Number = 0
    var height: Number = 0
}