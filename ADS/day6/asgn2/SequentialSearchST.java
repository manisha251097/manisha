/**
 * Sequential search symbol table.
 * 
 * @author manisha.
 */
public class SequentialSearchST<Key extends Comparable<Key>, Value> {
    private Node first;

    private class Node {
        private Key key;
        private Value val;
        private Node next;

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;

        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public SequentialSearchST() {
    }

    /**
     * Returns true if this symbol table contains the specified key.
     * 
     * @param key the key
     * @return true if this symbol table contains key. false otherwise.
     *         Complexity:O(n).
     */
    public boolean contains(Key key) {
        return get(key) != null;
    }

    /**
     * Returns the value associated with the given key in this symbol table.
     * 
     * @param key the key
     * @return the value associated with the given key Complexity:O(n).
     */
    public Value get(Key key) {
        if (key == null) {
            return null;
        }
        if (first.key.compareTo(key) == 0) {
            return exchange(first);
        }
        Node current = first;
        while (current != null) {
            if (current.next.key.compareTo(key) == 0) {
                return exchange(current);
            }
            current = current.next;
        }
        return null;
    }

    /**
     * Inserts the specified key-value pair into the symbol table
     * 
     * @param key the key
     * @param val the value Complexity:O(n).
     */
    public void put(Key key, Value val) {
        Node node = new Node(key, val);
        if (first == null) {
            first = node;
            return;
        }
        Node current = first;
        while (current != null) {
            if (current.key.compareTo(key) == 0) {
                current.val = val;
                return;
            }
            current = current.next;
        }
        Node oldFirst = first;
        first = new Node(key, val);
        first.next = oldFirst;
    }

    /**
     * exchange method
     * 
     * @param current current node. complexity:O(n).
     */

    private Value exchange(Node current) {
        Node temp = current.next;
        Value val = temp.val;
        current.next = current.next.next;
        Node node = first;
        while (node.next != null) {
            node = node.next;
        }
        node.next = temp;
        temp.next = null;
        return val;
    }

    /**
     * Returns all keys in the symbol table as an Iterable.
     * 
     * @return all keys in the symbol table Complexity:O(n).
     */
    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue<Key>();
        Node current = first;
        while (current != null) {
            queue.enqueue(current.key);
            current = current.next;
        }
        return queue;
    }
}
