// Calculate the power of a number using recursion

package problem1.recursion;

import java.util.*;

public class Problem1Recursion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = input.nextInt();

        System.out.print("Enter a Power : ");
        int p = input.nextInt();

        System.out.println(power(n, p));
    }

    static int power(int n, int p) {
        if (p == 0) {
            return 1;
        } else {
            return n * power(n, p - 1);
        }
    }
}
