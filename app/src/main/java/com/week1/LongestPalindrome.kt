package com.week1

fun main() {
    val str = "abccccdd"
    println((longestPalindrome(str)))
}

fun longestPalindrome(s: String): Int {
    var result = 0
    var isOdd = false
    s.groupingBy { it }.eachCount().forEach {
        if (it.value % 2 == 0) {
            // 문자의 갯수가 짝수라면, 무조건 결과에 더해줌
            result += it.value
        } else {
            // 문자의 갯수가 홀수라면, 하나를 뺀 값을 결과에 더해줌
            // 홀수라면, Boolean값을 true로 바꿔줘서 추후에 결과에 1를 더해줌
            // 팰린드롬 문자열중에 중앙에 하나의 문자가 위치할 수 있기 때문에
            result += it.value - 1
            isOdd = true
        }
    }

    if (isOdd) result++

    return result
}