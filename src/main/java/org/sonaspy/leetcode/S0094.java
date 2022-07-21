package org.sonaspy.leetcode;

import javafx.util.Pair;

import java.util.*;

public class S0094 {
    public List<Integer> inorderTraversal(TreeNode root) {
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
                if (root.right != null) {
                    deque.push(new Pair<>(root.right, false));
                }
                deque.push(new Pair<>(root, true));
                if (root.left != null) {
                    deque.push(new Pair<>(root.left, false));
                }
            }
        }
        return res;
    }

    List<Integer> res0 = new LinkedList<>();

    public List<Integer> inorderTraversal0(TreeNode root) {
        if (root != null) {
            inorderTraversal0(root.left);
            res0.add(root.val);
            inorderTraversal0(root.right);
        }
        return res0;
    }

}
