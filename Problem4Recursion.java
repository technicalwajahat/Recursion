// Josephus Problem

package problem4.recursion;

import java.util.*;

public class Problem4Recursion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of peoples : ");
        int n = input.nextInt();

        System.out.print("Enter a skipped number of peoples : ");
        int k = input.nextInt();

        System.out.println("The safe person is : " + josephus(n, k));
    }

    static int josephus(int n, int k) {
        if (n == 1) {
            return 0;
        } else {
            return (josephus(n - 1, k) + k) % n;
        }
    }
}
