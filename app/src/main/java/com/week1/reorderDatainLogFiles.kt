package com.week1

import androidx.core.text.isDigitsOnly

fun main() {
    val logs =
        arrayOf("a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo")
    println(sortLogSort(logs))
}

fun sortLogSort(logs: Array<String>) {
    val digitArr = mutableListOf<String>()
    val letterArr = mutableListOf<String>()
    val comparator = Comparator<String> { o1, o2 ->
        println(o1.split(" ", limit = 2))
        if (o1.split(" ", limit = 2)[1].compareTo(o2.split(" ", limit = 2)[1]) == 0) {
            o1.split(" ", limit = 2)[0].compareTo(o2.split(" ", limit = 2)[0])
        } else {
            o1.split(" ", limit = 2)[1].compareTo(o2.split(" ", limit = 2)[1])
        }
    }
    for (log in logs) {
        if (log.split(" ")[1].all { it.isDigit() }) {
            digitArr.add(log)
        } else {
            letterArr.add(log)
        }
    }
    letterArr.sortWith(comparator)
    println(letterArr + digitArr)
}
