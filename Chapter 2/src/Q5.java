/**
 * 5/5/2018 - Brandon Gotay
 */

import common.Node;

import java.util.HashSet;

/**
 * Given a circular linked list, implement an algorithm which returns node at the begin-
 * ning of the loop
 * DEFINITION
 * Circular linked list: A (corrupt) linked list in which a node’s next pointer points to an
 * earlier node, so as to make a loop in the linked list
 * EXAMPLE
 * input: A -> B -> C -> D -> E -> C [the same C as earlier]
 * output: C
 */
public class Q5 {
    private static Node findLoopStart(Node head) {
        HashSet<Node> visited = new HashSet<>();

        while(head != null) {
            if(visited.contains(head))
                return head;
            visited.add(head);
            head = head.getNext();
        }

        return null;
    }
}
