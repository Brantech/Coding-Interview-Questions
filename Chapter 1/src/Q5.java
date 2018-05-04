/**
 * 5/4/2018 - Brandon Gotay
 */

import java.util.Scanner;

/**
 * Write a method to replace all spaces in a string with ‘%20’
 */
public class Q5 {
    /**
     * Replaces ' ' with rep using regex;
     *
     * @param str - String
     * @param rep - ' ' replacement
     * @return - String with ' ' replaced
     */
    private static String cheatReplace(String str, String rep) {
        return str.replaceAll(" ", rep);
    }

    /**
     * Replaces ' ' with rep using regex;
     *
     * @param str - String
     * @param rep - ' ' replacement
     * @return - String with ' ' replaced
     */
    private static String replace(String str, String rep) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ')
                builder.append(rep);
            else
                builder.append(str.charAt(i));
        }

        return builder.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(str);
        System.out.println(cheatReplace(str, "%20"));
        System.out.println(replace(str, "%20"));
    }
}
