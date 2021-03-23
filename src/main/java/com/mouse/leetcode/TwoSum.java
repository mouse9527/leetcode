package com.mouse.leetcode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int summandIndex = findSummandIndex(nums, target, i);
            if (summandIndex != -1)
                return new int[]{i, summandIndex};
        }
        throw new RuntimeException("Not Found");
    }

    private int findSummandIndex(int[] nums, int target, int addendIndex) {
        for(int i = addendIndex + 1; i < nums.length; i++ ) {
            if (nums[addendIndex] + nums[i] == target) return i;
        }
        return -1;
    }
}
