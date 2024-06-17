package com.week3

fun main() {
    val listNode1 = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(4)
        }
    }
    var reverseNode = reverseList(listNode1)
    while (reverseNode != null) {
        println(reverseNode.`val`)
        reverseNode = reverseNode.next
    }
}
fun reverseList(head: ListNode?): ListNode? {
    var current = head
    var reversed: ListNode? = null

    while (current != null) {
        val next = current.next
        current.next = reversed
        reversed = current
        current = next
    }
    return reversed
}