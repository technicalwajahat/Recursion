// Sum of natural numbers using recursion

package problem2.recursion;

import java.util.*;

public class Problem2Recursion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = input.nextInt();

        System.out.println("Sum : " + sum(n));
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
