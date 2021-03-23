package com.mouse.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddTwoNumbersTest {

    @Test
    void should_be_able_to_execute() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode oneL1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode oneL2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode oneExpected = new ListNode(7, new ListNode(0, new ListNode(8)));
        assertThat(addTwoNumbers.addTwoNumbers(oneL1, oneL2)).isEqualTo(oneExpected);
        assertThat(addTwoNumbers.addTwoNumbers(new ListNode(0), new ListNode(0))).isEqualTo(new ListNode(0));
        ListNode threeL1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode threeL2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode threeExpected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        assertThat(addTwoNumbers.addTwoNumbers(threeL1, threeL2)).isEqualTo(threeExpected);
    }
}
