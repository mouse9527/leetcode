package com.mouse.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LengthOfLongestSubstringTest {

    @Test
    void should_be_able_to_sub_string() {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();

        assertThat(lengthOfLongestSubstring.execute("abcabcbb")).isEqualTo(3);
        assertThat(lengthOfLongestSubstring.execute("bbbbb")).isEqualTo(1);
        assertThat(lengthOfLongestSubstring.execute("pwwkew")).isEqualTo(3);
        assertThat(lengthOfLongestSubstring.execute("")).isEqualTo(0);
        assertThat(lengthOfLongestSubstring.execute(" ")).isEqualTo(1);
        assertThat(lengthOfLongestSubstring.execute("aa")).isEqualTo(1);
        assertThat(lengthOfLongestSubstring.execute("au")).isEqualTo(2);
        assertThat(lengthOfLongestSubstring.execute("cdd")).isEqualTo(2);
        assertThat(lengthOfLongestSubstring.execute("dvdf")).isEqualTo(3);
    }
}
