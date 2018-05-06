/**
 * 5/5/2018 - Brandon Gotay
 */

import common.Node;

/**
 * Implement an algorithm to delete a node in the middle of a single linked list, given
 * only access to that node
 * EXAMPLE
 * Input: the node ‘c’ from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a->b->d->e
 */
public class Q3 {
    /**
     * Deletes the node in the list.
     *
     * @param head - Linked list to remove the node from
     */
    private static void deleteMidNode(Node head) {
        // This is not possible if the node is the last node in the list
        if(head == null || head.getNext() == null)
            return;

        Node prev = head, curr = head;

        while(curr.getNext() != null) {
            prev = curr;
            curr.setVal(curr.getNext().getVal());
            curr = curr.getNext();
        }

        prev.setNext(null);
    }

    public static void main(String[] args) {
        Node head = new Node((int)(Math.random() * 100)), temp = head;

        for(int i = 0; i < 10; i++) {
            temp.setNext(new Node((int)(Math.random() * 100)));
            temp = temp.getNext();
        }

        head.print();
        deleteMidNode(head.getNext());
        head.print();
    }
}
