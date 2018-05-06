/**
 * 5/5/2018 - Brandon Gotay
 */

import java.util.Scanner;

/**
 * Assume you have a method isSubstring which checks if one word is a substring of
 * another Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
 * only one call to isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”).
 */
public class Q8 {
    /**
     * Checks if s2 is a rotation of s1
     *
     * @param s1 - String 1
     * @param s2 - String 2
     * @return
     */
    private static boolean checkRotation(String s1, String s2) {
        return (s2 + s2).contains(s1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(checkRotation(in.nextLine(), in.nextLine()));
    }
}
