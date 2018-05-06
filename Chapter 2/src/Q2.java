/**
 * 5/5/2018 - Brandon Gotay
 */

import common.Node;

/**
 * Implement an algorithm to find the nth to last element of a singly linked list
 */
public class Q2 {

    /**
     * Get the nth to last node in the list
     *
     * @param head - List to get the node from
     * @param n
     * @return - nth to last node
     */
    private static Node nthToLast(Node head, int n) {
        int count = head.count();

        if(n > count)
            return null;

        int steps = count - n;
        for(int i = 0; i < steps; i++)
            head = head.getNext();
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node((int)(Math.random() * 100)), temp = head;

        for(int i = 0; i < 10; i++) {
            temp.setNext(new Node((int)(Math.random() * 100)));
            temp = temp.getNext();
        }

        head.print();
        System.out.println(nthToLast(head, 5).getVal());
    }
}
