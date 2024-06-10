package com.week2

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    println(twoSum(nums, target).contentToString())

}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val result = mutableListOf<Int>()
    for (i in 0 until nums.size ) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                result.add(i)
                result.add(j)
            }
        }
    }
    return result.toIntArray()
}


