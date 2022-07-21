package org.sonaspy.leetcode;

public class S0011 {
    public int maxArea(int[] a) {
        int max = 0;
        for (int i = 0, j = a.length - 1; i < j; ) {
            int valH = a[i] < a[j] ? a[i++] : a[j--];
            max = Math.max(max, (j - i + 1) * valH);
        }
        return max;
    }
}
