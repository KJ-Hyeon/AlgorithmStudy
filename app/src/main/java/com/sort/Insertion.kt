package com.sort

fun main() {
    val array = intArrayOf(1,2,2,3,4,7,8,1,9,12,15,16,55,21,11)
    println(insertion(array).joinToString())
}

fun insertion(arr: IntArray): IntArray {
    for (i in 1 .. arr.lastIndex) {
        var head = i
        while (head >= 0 && arr[head] < arr[head-1]) {
            val temp = arr[head]
            arr[head] = arr[head - 1]
            arr[head - 1] = temp
            head -= 1
        }
    }
//    for (i in 0..<arr.lastIndex) {
//        for (j in i+1 downTo 1) {
//            if (arr[j] < arr[j-1]) {
//                val temp = arr[j]
//                arr[j] = arr[j-1]
//                arr[j-1] = temp
//            } else break
//        }
//    }
    return arr
}