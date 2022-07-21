package org.sonaspy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class S0017 {
    private String letterMap[] = {
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };

    public List<String> letterCombinations(String digits) {
        res = new ArrayList<String>();
        if (digits.equals("")) {
            return res;
        }

        dfs(digits, 0, new StringBuilder(""));
        return res;

    }

    private ArrayList<String> res;

    private void dfs(String digits, int cur, StringBuilder sb) {

        if (cur == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String letters = letterMap[digits.charAt(cur) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            dfs(digits, cur + 1, sb.append(letters.charAt(i)));
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
