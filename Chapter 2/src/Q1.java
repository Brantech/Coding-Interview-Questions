/**
 * 5/5/2018 - Brandon Gotay
 */

import java.util.HashSet;

/**
 * Write code to remove duplicates from an unsorted linked list
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class Q1 {
    private static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

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
            curr = comp.next;

            while(curr != null) {
                if (curr.val == comp.val)
                    remove(prev, curr);
                else
                    prev = curr;

                curr = curr.next;
            }
            comp = comp.next;
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
            if(used.contains(curr.val))
                remove(prev, curr);
            else
                prev = curr;

            used.add(curr.val);
            curr = curr.next;
        }
    }

    /**
     * Points the node before the current node to the current node's next node
     *
     * @param prev - Node directly before the current node
     * @param curr - Current node
     */
    private static void remove(Node prev, Node curr) {
        if(prev == null || curr == null)
            return;

        prev.next = curr.next;
    }

    private static void print(Node head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node((int)(Math.random() * 10)), temp = head;

        for(int i = 0; i < 10; i++) {
            temp.next = new Node((int)(Math.random() * 10));
            temp = temp.next;
        }

        print(head);
        removeDuplicatesN(head);
        print(head);
    }
}
