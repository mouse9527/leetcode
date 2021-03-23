package com.mouse.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LengthOfLongestSubstringTest {

    @Test
    void should_be_able_to_execute() {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();

        assertThat(lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
        assertThat(lengthOfLongestSubstring.lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
        assertThat(lengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
        assertThat(lengthOfLongestSubstring.lengthOfLongestSubstring("")).isEqualTo(0);
        assertThat(lengthOfLongestSubstring.lengthOfLongestSubstring(" ")).isEqualTo(1);
        assertThat(lengthOfLongestSubstring.lengthOfLongestSubstring("aa")).isEqualTo(1);
        assertThat(lengthOfLongestSubstring.lengthOfLongestSubstring("au")).isEqualTo(2);
        assertThat(lengthOfLongestSubstring.lengthOfLongestSubstring("cdd")).isEqualTo(2);
        assertThat(lengthOfLongestSubstring.lengthOfLongestSubstring("dvdf")).isEqualTo(3);
    }
}
