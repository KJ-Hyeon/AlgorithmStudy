package com.week2

fun main () {
    val nums = intArrayOf(1, 2, 3, 4)
    println(productExceptSelf(nums).contentToString())
}

fun productExceptSelf(nums: IntArray): IntArray {
    val resultArray = IntArray(nums.size)

    resultArray[0] = 1
    for (i in 1 until nums.size) {
        resultArray[i] = resultArray[i - 1] * nums[i - 1]
    }

    var right = 1
    for (i in nums.size - 1 downTo 0) {
        resultArray[i] *= right
        right *= nums[i]
    }
    return resultArray
}

    // O(n^2)의 시간복잡도를 가짐
//    val resultArray = mutableListOf<Int>()
//
//    for (i in nums.indices) {
//        var result = 1
//
//        for (j in nums.indices) {
//            if (i != j) {
//                result *= nums[j]
//            }
//        }
//        resultArray.add(result)
//    }
//    return resultArray.toIntArray()
