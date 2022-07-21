package org.sonaspy.leetcode;

public class S0009 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        return sb.reverse().toString().equals(String.valueOf(x));
    }
}
