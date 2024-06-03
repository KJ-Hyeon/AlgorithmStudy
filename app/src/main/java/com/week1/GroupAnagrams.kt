package com.week1

fun main() {
    val arr1 = arrayOf("eat","tea","tan","ate","nat","bat")
    println(groupAnagrams(arr1))
}

fun groupAnagrams(arr: Array<String>): List<List<String>> {
    val anagramMap : MutableMap<String, MutableList<String>> = mutableMapOf()
    for (str in arr) {
        val anagram = str.toList().sorted().joinToString("")
        anagramMap.getOrPut(anagram) { mutableListOf() }.add(str)
        anagramMap[anagram]?.sort()
    }
    return anagramMap.values.sortedBy { it.size }
}
