package com.mouse.leetcode;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int[] array = margeArray(nums1, nums2, totalLength);
        int index = totalLength / 2;
        if (totalLength % 2 == 0) {
            return ((double) array[index - 1] + array[index]) / 2;
        } else {
            return array[index];
        }
    }

    private int[] margeArray(int[] nums1, int[] nums2, int totalLength) {
        int[] array = new int[totalLength];
        int nums1Index = 0;
        int nums2Index = 0;
        for (int i = 0; i < totalLength; i++) {
            if (nums1Index < nums1.length && nums2Index < nums2.length) {
                if (nums1[nums1Index] < nums2[nums2Index]) {
                    array[i] = nums1[nums1Index];
                    nums1Index++;
                } else {
                    array[i] = nums2[nums2Index];
                    nums2Index++;
                }
            } else {
                if (nums1Index < nums1.length) {
                    array[i] = nums1[nums1Index];
                    nums1Index++;
                } else {
                    array[i] = nums2[nums2Index];
                    nums2Index++;
                }
            }
        }
        return array;
    }
}
