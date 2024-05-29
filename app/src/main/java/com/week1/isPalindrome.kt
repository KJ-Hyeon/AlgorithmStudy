package com.week1

fun main() {
    val str1 = "A man, a plan, a canal: Panama"
    val str2 = "race a car"
    val str3 = ""
    println(isPalindrome(str1))
}

fun isPalindrome(str: String): Boolean {
//    isLetterOrDigit() -> 문자가 알파벳 or 숫자인지 판별 (true 리턴)
//    val filterStr = str.filter { it.isLetterOrDigit() }.lowercase()
    val filterStr = str.lowercase().filter { it in 'a'..'z' || it in '0'..'9' }

    return filterStr == filterStr.reversed()

}