// Check whether a string is a Palindrome or not

package problem5.recursion;

import java.util.*;

public class Problem5Recursion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word : ");
        String s = input.nextLine();

        int l = 0;
        int r = s.length();

        if (isPalindrome(s, l, r - 1)) {
            System.out.println(s + " is palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }

    static boolean isPalindrome(String s, int l, int r) {

        if (l >= r) {
            return true;
        }
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        return isPalindrome(s, l + 1, r - 1);
    }
}
