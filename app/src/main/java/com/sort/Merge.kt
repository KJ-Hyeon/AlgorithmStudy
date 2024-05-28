package com.sort

fun main() {
    val array = mutableListOf(1, 2, 2, 3, 4, 7, 8, 1, 9, 12, 15, 16, 66, 21, 11)
    println(divide(array))
}

fun divide(arr: MutableList<Int>): MutableList<Int> {
    if (arr.size < 2) return arr

    val middle = arr.size / 2

    val left = divide(arr.subList(0, middle))
    val right = divide(arr.subList(middle, arr.size))

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