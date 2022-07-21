package org.sonaspy.leetcode;

import javafx.util.Pair;

import java.util.*;

public class S0145 {


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<Pair<TreeNode, Boolean>> deque = new LinkedList<>();
        deque.push(new Pair<>(root, false));
        while (!deque.isEmpty()) {
            root = deque.peek().getKey();
            if (deque.pop().getValue()) {
                res.add(root.val);
            } else {
                deque.push(new Pair<>(root, true));
                if (root.right != null) {
                    deque.push(new Pair<>(root.right, false));
                }
                if (root.left != null) {
                    deque.push(new Pair<>(root.left, false));
                }
            }
        }
        return res;
    }


    List<Integer> res0 = new LinkedList<>();

    public List<Integer> postorderTraversal0(TreeNode root) {
        if (root != null) {
            postorderTraversal0(root.left);
            postorderTraversal0(root.right);
            res0.add(root.val);
        }
        return res0;
    }
}
