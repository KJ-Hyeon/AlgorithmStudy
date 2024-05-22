package com.sort

import kotlin.math.min

fun main() {
    val array = intArrayOf(1,2,2,3,4,7,8,1,9,12,15,16,55,21,11)
    println(selection(array).joinToString())
}

fun selection(arr: IntArray): IntArray {
    var minIndex = 0
    for (i in arr.indices) {
        minIndex = i
        for (j in i+1..arr.lastIndex) {
            if (arr[minIndex] > arr[j]) minIndex = j
        }
        val temp = arr[i]
        arr[i] = arr[minIndex]
        arr[minIndex] = temp
    }
    return arr
}