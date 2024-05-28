package com.sort

fun main() {
    val array = mutableListOf(3, 1, 2, 5)
    println(divide(array))
}

fun divide(arr: MutableList<Int>): MutableList<Int> {
    if (arr.size < 2) return arr

    val middle = arr.size / 2

    val left = divide(arr.subList(0, middle))
    println("left: $left")
    val right = divide(arr.subList(middle, arr.size))
//    println("right: $right")

    return mergeList(left, right)
}

fun mergeList(left: MutableList<Int>, right: MutableList<Int>): MutableList<Int> {
    val mergeList = mutableListOf<Int>()
    var leftIndex = 0
    var rightIndex = 0

    while (leftIndex < left.size && rightIndex < right.size) {
        if (left[leftIndex] > right[rightIndex]) {
            mergeList.add(right[rightIndex])
            rightIndex++
        } else {
            mergeList.add(left[leftIndex])
            leftIndex++
        }
    }

    while (leftIndex < left.size) {
        mergeList.add(left[leftIndex])
        leftIndex++
    }

    while (rightIndex < right.size) {
        mergeList.add(right[rightIndex])
        rightIndex++
    }

    return mergeList
}