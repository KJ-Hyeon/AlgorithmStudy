package com.sort

fun main() {
    val array = intArrayOf(1, 2, 2, 3, 4, 7, 8, 1, 9, 12, 15, 16, 55, 21, 11)
    println(insertion(array).joinToString())
}

private fun bubble(arr: IntArray) {
    for (i in 0 until arr.lastIndex) {
        for (j in 0 until arr.lastIndex - i) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}