package com.week1
fun main() {
    val charArr = charArrayOf('h','e','l','l','o')
    println(reverseString(charArr))
}

fun reverseString(arr: CharArray): List<Char> {
    var i = 0
    var j = arr.lastIndex
    while (i < arr.size/2) {
        var temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        i++
        j--
    }
    return arr.toList()
//    return arr.reversed()
}
