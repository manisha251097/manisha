public class CircularLinkedList {
    Node last;
    int n;

    // CircularLinkedList() {

    // this.n = n;

    // }

    public void formCircle() {
        last.next = last;

    }

    public int Size() {
        return n;

    }

    public boolean isEmpty() {
        if (n == 0) {
            return true;

        }
        return false;
    }

    public void enqueue(int i) {
        Node temp = new Node(i);
        if (isEmpty()) {
            last = temp;
            last.next = last;
        } else {
            Node e = last;
            last = temp;
            last.next = e.next;
            e.next = last;
        }
        // if it is null, last.next=last;
        // if it is not null,last.next=temp;
        // new node is created
        n++;
    }

    public int dequeue() {
        Node e = last.next;
        last.next = last.next.next;
        n--;
        return e.item;

    }

    public static void main(String[] args) {
        CircularLinkedList c = new CircularLinkedList();
        c.enqueue(1);
        c.enqueue(11);
        c.enqueue(12);

        System.out.println(c.dequeue());
    }
}

class Node {
    int item;
    Node next;

    Node(int item) {
        this.item = item;
    }

}
