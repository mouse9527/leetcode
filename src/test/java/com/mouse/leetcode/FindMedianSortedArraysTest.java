package com.mouse.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindMedianSortedArraysTest {

    @Test
    void should_be_able_to_execute() {
        FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();

        assertThat(findMedianSortedArrays.findMedianSortedArrays(new int[]{2, 3}, new int[]{6, 7})).isEqualTo(4.5);
        assertThat(findMedianSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})).isEqualTo(2.5);
        assertThat(findMedianSortedArrays.findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0})).isEqualTo(0);
        assertThat(findMedianSortedArrays.findMedianSortedArrays(new int[]{2}, new int[]{})).isEqualTo(2);
        assertThat(findMedianSortedArrays.findMedianSortedArrays(new int[]{2, 5}, new int[]{3, 4})).isEqualTo(3.5);

        assertThat(findMedianSortedArrays.findMedianSortedArrays(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6, 8})).isEqualTo(5);
        assertThat(findMedianSortedArrays.findMedianSortedArrays(new int[]{1, 5, 6, 7, 8}, new int[]{2, 4, 6, 8})).isEqualTo(6);
        assertThat(findMedianSortedArrays.findMedianSortedArrays(new int[]{2}, new int[]{6, 7})).isEqualTo(6);
        assertThat(findMedianSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2})).isEqualTo(2);
        assertThat(findMedianSortedArrays.findMedianSortedArrays(new int[]{}, new int[]{1})).isEqualTo(1);
        assertThat(findMedianSortedArrays.findMedianSortedArrays(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6, 8})).isEqualTo(5);

    }
}
