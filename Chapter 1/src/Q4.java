/**
 * 5/4/2018 - Brandon Gotay
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 * Write a method to decide if two strings are anagrams or not
 */
public class Q4 {
    /**
     * Determines if two strings are anagrams of each other
     *
     * @param s1 - String 1
     * @param s2 - String 2
     * @return - Are they anagrams?
     */
    private static boolean areAnagrams(String s1, String s2) {
        // Remove white space
        String cpy1 = s1.replaceAll("\\s+", "");
        String cpy2 = s2.replaceAll("\\s+", "");

        if(cpy1.length() != cpy2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < cpy1.length(); i++) {
            map.put(cpy1.charAt(i), map.containsKey(cpy1.charAt(i)) ? map.get(cpy1.charAt(i)) + 1 : 1);
        }

        for(int i = 0; i < cpy2.length(); i++) {

            if(map.containsKey(cpy2.charAt(i)) && map.get(cpy2.charAt(i)) == 0)
                return false;

            map.put(cpy2.charAt(i), map.get(cpy2.charAt(i)) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        System.out.printf("\"%s\" and \"%s\" are " + (areAnagrams(s1, s2) ? "" : "not ") + "anagrams of each other", s1, s2);
    }
}
