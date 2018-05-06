/**
 * 5/5/2018 - Brandon Gotay
 */

import common.Node;

import java.util.HashSet;

/**
 * Write code to remove duplicates from an unsorted linked list
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class Q1 {
    /**
     * Removes duplicates from the linked list with O(n^2) time complexity
     * and O(1) space complexity.
     *
     * @param head - Linked list to remove duplicates from
     */
    private static void removeDuplicatesN2(Node head) {
        Node prev, curr, comp = head;

        while(comp != null) {
            prev = comp;
            curr = comp.getNext();

            while(curr != null) {
                if (curr.getVal() == comp.getVal())
                    remove(prev, curr);
                else
                    prev = curr;

                curr = curr.getNext();
            }
            comp = comp.getNext();
        }
    }

    /**
     * Removes duplicates from the linked list with O(n) time complexity
     * and O(n) space complexity
     *
     * @param head - Linked list to remove duplicates from
     */
    private static void removeDuplicatesN(Node head) {
        Node prev = head, curr = head;
        HashSet<Integer> used = new HashSet<>();

        while(curr != null) {
            if(used.contains(curr.getVal()))
                remove(prev, curr);
            else
                prev = curr;

            used.add(curr.getVal());
            curr = curr.getNext();
        }
    }

    /**
     * Points the node before the current node to the current node's next node
     *
     * @param prev - common.Node directly before the current node
     * @param curr - Current node
     */
    private static void remove(Node prev, Node curr) {
        if(prev == null || curr == null)
            return;

        prev.setNext(curr.getNext());
    }

    public static void main(String[] args) {
        Node head = new Node((int)(Math.random() * 10)), temp = head;

        for(int i = 0; i < 10; i++) {
            temp.setNext(new Node((int)(Math.random() * 10)));
            temp = temp.getNext();
        }

        head.print();
        removeDuplicatesN(head);
        head.print();
    }
}
