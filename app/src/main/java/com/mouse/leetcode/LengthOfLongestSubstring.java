package com.mouse.leetcode;

public class LengthOfLongestSubstring {
    /**
     * "abcabcbb"
     * i=1: current = a, prev = 0, start = 1, length = 1
     * i=2: current = b, prev = 0, start = 1, length = 2
     * i=3: current = c, prev = 0, start = 1, length = 3
     * i=4: current = a, prev = 1, start = 2, length = 3
     * i=5: current = b, prev = 2, start = 3, length = 3
     * i=6: current = c, prev = 3, start = 4, length = 3
     * i=7: current = b, prev = 5, start = 6, length = 3
     * i=8: current = b, prev = 7, start = 8, length = 3
     * <p>
     * "pwwkew"
     * i=1: current = p, prev = 0, start = 1, length = 1
     * i=2: current = w, prev = 0, start = 1, length = 2
     * i=3: current = w, prev = 2, start = 3, length = 2
     * i=4, current = k, prev = 0, start = 3, length = 2
     * i=5, current = e, prev = 0, start = 3, length = 3
     * i=6, current = w, prev = 3, start = 4, length = 3
     * <p>
     * " "
     * i=1, current = " ", prev = 0, start = 1, length = 1
     * <p>
     * "aa"
     * i=1, current = a, prev = 0, start = 1, length = 1
     * i=2, current = a, prev = 1, start = 2, length = 1
     * <p>
     * "au"
     * i=1, current = a, prev = 0, start = 1, length = 1
     * i=2, current = u, prev = 0, start = 1, length = 2
     * <p>
     * "add"
     * i=1, current = a, prev = 0, start = 1, length = 1
     * i=2, current = d, prev = 0, start = 1, length = 2
     * i=3, current = d, prev = 2, start = 3, length = 2
     * <p>
     * "dvdf"
     * i=1, current = d, prev = 0, start = 1, length = 1
     * i=2, current = v, prev = 0, start = 1, length = 2
     * i=3, current = d, prev = 1, start = 2, length = 2
     * i=4, current = f, prev = 0, start = 2, length = 3
     */
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int length = 0;
        int start = 0;
        for (int i = 1; i < s.length() + 1; i++) {
            char current = s.charAt(i - 1);
            start = Math.max(start, index[current] + 1);
            length = Math.max(length, i - start + 1);
            index[current] = i;
        }
        return length;
    }
}
