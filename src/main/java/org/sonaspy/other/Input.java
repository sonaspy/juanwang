package org.sonaspy.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author gnx
 */
public class Input {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();

        BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = input1.readLine();
    }
}
