class Node {
    int value;
    Node next;
    Node prev;

    Node(int val) {
        this.value = val;
    }
}

// circular linked lists has head connected tail
class circularDouble {
    Node head;
    Node tail;

    // add menthod adds new elements into the linkedlist
    public void add(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
    // finally formcircle connects head to tail

    public void formCircle() {
        tail.next = head;
        head.prev = tail;
    }
}
