package org.sonaspy.leetcode;

public class S0006 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }
        int offset = -1, cur = 0;
        for (int i = 0; i < s.length(); i++) {
            sbs[cur].append(s.charAt(i));
            if (cur == 0 || cur == numRows - 1) {
                offset = -offset;
            }
            cur += offset;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb : sbs) {
            ans.append(sb);
        }
        return ans.toString();
    }
    //就是弄清楚每个字母应该在哪一行就好了，把字母加到sbs末尾，每次循环到第0行和第numRow-1行的时候记着offset反向，然后串起来
}
