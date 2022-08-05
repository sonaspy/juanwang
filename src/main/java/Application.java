import org.sonaspy.leetcode.S0007;

import java.util.Arrays;

/**
 * @author gnx
 */
public class Application {
    public static void main(String[] args) {

        S0007 s0003 = new S0007();

        s0003.reverse(Integer.MAX_VALUE);

        Integer[] a = {1, 2, 3};

        Arrays.sort(a, (Integer o1, Integer o2) -> {
            return o2 - o1;
        });

        System.out.println(Arrays.toString(a));

    }
}
