/**
 * 5/4/2018 - Brandon Gotay
 */

import java.util.HashSet;
import java.util.Scanner;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you
 * can not use additional data structures?
 */
public class Q1 {
    /**
     * Time complexity O(n) assuming the set has no collisions
     *
     * @param str - Input string
     * @return - Does the string contain duplicates
     */
    private static boolean simpleDuplicateFinder(String str) {
        HashSet<Character> set = new HashSet<>();

        for(char c : str.toCharArray()) {
            if(set.contains(c))
                return true;
            set.add(c);
        }

        return false;
    }

    /**
     * Time complexity O(n^2)
     *
     * @param str - Input string
     * @return - Does the string contain duplicates
     */
    private static boolean inefficientDuplicateFinder(String str) {
        for(int i = 0; i < str.length() - 1; i++)
            for(int j = i + 1; j < str.length(); j++)
                if(str.charAt(i) == str.charAt(j))
                    return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        if(simpleDuplicateFinder(str))
            System.out.println("Duplicates found in \"" + str + "\"");
        else
            System.out.println("No duplicates found in \"" + str + "\"");
    }
}
