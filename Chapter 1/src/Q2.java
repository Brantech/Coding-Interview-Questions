/**
 * 5/4/2018 - Brandon Gotay
 */

import java.util.Scanner;

/**
 * Write code to reverse a C-Style String (C-String means that “abcd” is represented as
 * five characters, including the null character )
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] str = in.nextLine().toCharArray();

        System.out.println(str);

        int i = 0, j = str.length - 1;
        while(i <= j) {
            char c = str[i];
            str[i++] = str[j];
            str[j--] = c;
        }

        System.out.println(str);
    }
}
