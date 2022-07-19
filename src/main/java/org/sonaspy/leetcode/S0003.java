package org.sonaspy.leetcode;

import java.util.HashSet;

public class S0003 {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 1, ans = 0;
        HashSet<Character> chars = new HashSet<>();
        for (char c : s.toCharArray()) {
            for (; chars.contains(c); ++i) {
                chars.remove(s.charAt(i));
            }
            chars.add(c);
            ans = Math.max(ans, j - i);
            ++j;
        }
        return ans;
    }
}
