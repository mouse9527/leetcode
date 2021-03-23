package com.mouse.leetcode;

import java.util.Objects;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        fullAdder(root, l1, l2, 0);
        return root.next;
    }

    public void fullAdder(ListNode root, ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) return;
        ListNode emptyAbleL1 = emptyAble(l1);
        ListNode emptyAbleL2 = emptyAble(l2);
        int sum = emptyAbleL1.val + emptyAbleL2.val + carry;
        root.next = new ListNode(sum % 10);
        fullAdder(root.next, emptyAbleL1.next, emptyAbleL2.next, sum >= 10 ? 1 : 0);
    }

    private ListNode emptyAble(ListNode node) {
        return node == null ? new ListNode(0) : node;
    }
}

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
