package com.week3

fun main() {
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(2)
    val node4 = ListNode(1)
    node1.next = node2
    node2.next = node3
    node3.next = node4


    println(isPalindrome(node1))
}

fun isPalindrome(head: ListNode?): Boolean {
    var fast = head
    var slow = head

    // 런너 기법 -> 리스트의 중앙을 찾음
    while (fast?.next != null && fast.next?.next != null) {
        fast = fast.next?.next
        slow = slow?.next
    }

    var prev: ListNode? = null
    var current = slow?.next // 짝수의 리스트일 경우 slow를 1칸 뒤로 밀어서 역순으로 돌리기 위해서

    while (current != null) {
        val next = current.next
        current.next = prev
        prev = current
        current = next
    }

    var first = head
    var second = prev
    while (second != null) {
        if (first?.`val` != second.`val`) return false
        first = first.next
        second = second.next
    }

    return true

}