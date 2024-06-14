package com.week3

import kotlinx.coroutines.flow.merge

fun main() {
    val listNode1 = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(4)
        }
    }
    val listNode2 = ListNode(1).apply {
        next = ListNode(3).apply {
            next = ListNode(4)
        }
    }

    var current = mergeTwoLists(list1 = listNode1, list2 = listNode2)

    while (current != null) {
        print("${current.`val`} -> ")
        current = current.next
    }
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var list1 = list1
    var list2 = list2
    val dummy = ListNode(0) // 더미 노드를 사용하여 병합 리스트의 시작부분 추적을 쉽게 만듬
    var mergeList = dummy

    while (list1 != null && list2 != null) {
        if (list1.`val` < list2.`val`) {
            mergeList.next = list1
            list1 = list1.next
        } else {
            mergeList.next = list2
            list2 = list2.next
        }
        // 해당 코드 때문에 더미를 사용하지 않고 mergeList.next를 반환하게 되면 mergeList의 끝부분만 반환됨
        // 따라서 더미 노드를 사용하여 dummy.next가 정확히 mergeList의 시작부분을 가리킴
        mergeList = mergeList.next!!
    }

    if (list1 != null) {
        mergeList.next = list1
    } else {
        mergeList.next = list2
    }

    return dummy.next
}

