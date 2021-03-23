package com.mouse.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    void should_be_able_to_execute() {
        TwoSum twoSum = new TwoSum();
        assertThat(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)).containsOnly(0, 1);
        assertThat(twoSum.twoSum(new int[]{3, 2, 4}, 6)).containsOnly(1, 2);
        assertThat(twoSum.twoSum(new int[]{3, 3}, 6)).containsOnly(0, 1);
    }
}
