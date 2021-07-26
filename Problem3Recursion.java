// Count all possible paths from top left to bottom right of a mXn matrix

package problem3.recursion;

import java.util.*;

public class Problem3Recursion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Rows : ");
        int m = input.nextInt();

        System.out.print("Enter a Columns : ");
        int n = input.nextInt();

        System.out.println("Total Number of Paths : " + numberOfPaths(m, n));
    }

    static int numberOfPaths(int m, int n) {

        if (m == 1 || n == 1) {
            return 1;
        }
        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
    }
}
