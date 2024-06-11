package com.week2

fun main() {
    val array = intArrayOf(-1,0,1,2,-1,-4)
    println(threeSum(array))
}

fun threeSum(nums: IntArray): List<List<Int>> {
    val result = hashSetOf<List<Int>>()
    nums.sort()

    for (i in nums.indices) {
        var front = i+1
        var end = nums.lastIndex

        while (front < end) {
            val sum = nums[i] + nums[front] + nums[end]

            if (sum == 0) {
                result.add(listOf(nums[i], nums[front], nums[end]))
                front++
                end--
            } else if (sum > 0) {
                end--
            } else {
                front++
            }
        }
    }
    return result.toMutableList()
}