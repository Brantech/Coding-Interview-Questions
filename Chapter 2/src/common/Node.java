package common;

/**
 * Node class used by all files for this chapter.
 */
public class Node {
    private int val;
    private Node next;

    public Node(int val) {
        this.val = val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public Node getNext() {
        return next;
    }

    /**
     * Count the number of nodes in the list
     *
     * @return
     */
    public int count() {
        int count = 0;
        Node head = this;

        while(head != null) {
            count++;
            head = head.getNext();
        }
        return count;
    }

    /**
     * Prints the values from this node to the end
     */
    public void print() {
        Node curr = this;
        while(curr != null) {
            System.out.print(curr.getVal() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }
}
