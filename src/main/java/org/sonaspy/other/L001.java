package org.sonaspy.other;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class L001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < q; i++) {
            int ti = sc.nextInt();
            int xi = sc.nextInt() - 1;
            if (ti == 1) {
                LinkedList<Integer> l = new LinkedList(Collections.singletonList(mat[xi]));
                l.addFirst(l.getLast());
                l.removeLast();
                int k = 0;
                for (Integer j : l) {
                    mat[xi][k++] = j;
                }
            } else {
                LinkedList<Integer> l = new LinkedList<>();
                for (int j = 0; j < n; j++) {
                    l.add(mat[j][xi]);
                }
                l.addLast(l.getFirst());
                l.removeFirst();
                int k = 0;
                for (Integer j : l) {
                    mat[k++][xi] = j;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][0]);
            for (int j = 1; j < n; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }


    }
}
