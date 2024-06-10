package com.week2

fun main() {
    val nums = intArrayOf(1, 4, 3, 2)
    println(arrayPartition(nums))
}

fun arrayPartition(nums: IntArray): Int {
    nums.sort()
    var sum = 0
    for (i in 0 until nums.size step 2) {
        sum += nums[i]
    }
    return sum
}