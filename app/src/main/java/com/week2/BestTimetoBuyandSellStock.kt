package com.week2

import kotlin.math.min

fun main() {
    val stock = intArrayOf(2,4,1)
    println(maxProfit(stock))
}


fun maxProfit(prices: IntArray): Int {
    var maxPrice = 0
    var minPrice = prices.max()

    for (price in prices) {
        if (price < minPrice) {
            minPrice = price
        } else if(price - minPrice > maxPrice) {
            maxPrice = price - minPrice
        }
    }

    return maxPrice
}