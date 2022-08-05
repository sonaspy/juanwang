package org.sonaspy.other;

import java.util.Arrays;
import java.util.LinkedList;

public class InAndOut {
    public static void main(String[] args) {

        String[] array0 = new String[5];
        String[] array = new String[]{"12313", "123123"};

        LinkedList linklist = new LinkedList(Arrays.asList(array));
        String[] array1 = (String[]) linklist.toArray(new String[2]);
        String[] array2 = new String[linklist.size()];
        linklist.toArray(array2);
    }
}
