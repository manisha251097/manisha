class Node {
    int value;
    int next;
    int prev;

    Node(int val) {
        this.value = val;
    }
}

/**
 * CircularDoubleLL
 */
public class CircularDoubleLL {

    Node head;
    Node tail;

    public void add(int val) {
        Node node = new Node(val);
        if (head == null) {
            this.head = node;
            this.tail = node;

        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }

    public void formCircle() {
        this.tail.next = this.head;
        this.head.prev = this.tail;
    }
}