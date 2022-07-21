package org.sonaspy.leetcode;

import javafx.util.Pair;

import java.util.*;

public class S0144 {
    public List<Integer> preorderTraversal(TreeNode root) {
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
                if (root.left != null) {
                    deque.push(new Pair<>(root.left, false));
                }
                deque.push(new Pair<>(root, true));
            }
        }
        return res;
    }


    List<Integer> res0 = new LinkedList<>();

    public List<Integer> preorderTraversal0(TreeNode root) {
        if (root != null) {
            res0.add(root.val);
            preorderTraversal0(root.left);
            preorderTraversal0(root.right);
        }
        return res0;
    }
}
