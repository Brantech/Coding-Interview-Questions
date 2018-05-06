/**
 * 5/5/2018 - Brandon Gotay
 */

import common.Node;

/**
 * You have two numbers represented by a linked list, where each node contains a sin-
 * gle digit The digits are stored in reverse order, such that the 1’s digit is at the head of
 * the list Write a function that adds the two numbers and returns the sum as a linked
 * list
 * EXAMPLE
 * Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
 * Output: 8 -> 0 -> 8
 */
public class Q4 {
    /**
     * Adds two linked list numbers together
     *
     * @param n1 - First number
     * @param n2 - Second number
     * @return - Sum of n1 and n2
     */
    private static Node add(Node n1, Node n2) {
        Node sum = new Node(0), temp = sum;

        while(n1 != null && n2 != null) {
            if(n1 != null) {
                temp.setVal(temp.getVal() + n1.getVal());
                n1 = n1.getNext();
            }
            if(n2 != null) {
                temp.setVal(temp.getVal() + n2.getVal());
                n2 = n2.getNext();
            }

            if(temp.getVal() > 9)
                temp.setNext(new Node(1));
            else if(n1 != null && n2 != null)
                temp.setNext(new Node(0));

            temp.setVal(temp.getVal() % 10);
            temp = temp.getNext();
        }

        return sum;
    }

    /**
     * Genereate a random number
     *
     * @param digits - length of the number
     * @return
     */
    private static Node genNum(int digits) {
        if(digits == 0) return null;

        Node head = new Node((int)(Math.random() * 9)), temp = head;

        for(int i = 0; i < digits; i++) {
            temp.setNext(new Node((int)(Math.random() * 9)));
            temp = temp.getNext();
        }

        return head;
    }

    public static void main(String[] args) {
        Node n1 = genNum(4), n2 = genNum(4);

        n1.print();
        n2.print();

        add(n1, n2).print();
    }
}
