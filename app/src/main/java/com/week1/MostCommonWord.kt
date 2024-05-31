package com.week1

fun main() {
    val paragraph = "Bob. hIt, baLl"
    val banned = arrayOf("bob","hit")
    println((mostCommonWord(paragraph, banned)))
}

fun mostCommonWord(paragraph: String, banned: Array<String>): String {
    val countMap = mutableMapOf<String, Int>()
    // trim() -> 문자열의 양끝 공백을 제거
    val filterString = paragraph.replace(Regex("[^\\w]+")," ").trim().lowercase().split(" ")

    for (word in filterString) {
        if (!banned.contains(word)) {
            countMap[word] = countMap.getOrDefault(word, 0) + 1
        }
    }
    println(paragraph.trim())

    val result = countMap.maxByOrNull { it.value }?.key

    return result!!

}