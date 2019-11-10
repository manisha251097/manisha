import java.util.Arrays;

/**
 * BinarySearchST
 */
public class BinarySearchST<Key extends Comparable<Key>, Value> {
    private Value[] valuesArray;
    private Key[] keys;
    private int count = 0;
    private int arrSize = 10;

    /**
     * constructor to initialise Arrays
     */
    public BinarySearchST() {
        keys = (Key[]) new Comparable[10];
        valuesArray = (Value[]) new Object[10];

    }

    /**
     *
     * @param key keys to put
     * @param val values to put. Complexity is O(n) in all cases.
     */
    public void resize(Key key, Value val) {
        Key[] k1 = (Key[]) new Comparable[count * 2];
        Value[] v1 = (Value[]) new Object[count * 2];
        for (int i = 0; i < count; i++) {
            k1[i] = keys[i];
            v1[i] = valuesArray[i];
        }
        keys = k1;
        valuesArray = v1;
        int index = rank(key);
        if (contains(key)) {
            valuesArray[index] = val;
        }
    }

    /**
     * @return count. Complexity is O(1).
     */
    public int size() {
        return count;
    }

    /**
     * @param key   key to place in array
     * @param value values to place in array. Complexity is O(n) in all cases..
     */
    public void put(Key key, Value value) {
        if (count >= arrSize) {
            resize(key, value);
        } else {
            int index = rank(key);
            if (!contains(key)) {
                for (int k = count; k > index; k--) {
                    keys[k] = keys[k - 1];
                    valuesArray[k] = valuesArray[k - 1];
                }
                keys[index] = key;
                valuesArray[index] = value;
                count++;
            } else {
                valuesArray[index] = value;
            }

        }
    }

    /**
     * @param k of key type
     * @return the position to be placed in array. Complexity is O(logn) in worst
     *         cases and O(1) in best cases.
     */
    public int rank(Key k) {
        int lo = 0, hi = count - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = k.compareTo(keys[mid]);
            if (cmp < 0) {
                hi = mid - 1;
            } else if (cmp > 0) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return lo;
    }

    /**
     * @param k key
     * @return whether key contains in it or not. Complexity is O(n).
     */
    public boolean contains(Key k) {
        for (int i = 0; i < size(); i++) {
            if (keys[i].equals(k)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return max element in array. Complexity is O(1).
     */
    public Key max() {
        return keys[count - 1];
    }

    /***
     * @param key
     * @return the value of specified key. Complexity is O(1)
     */
    public Value get(Key key) {
        if (count == 0) {
            return null;
        }
        int index = rank(key);
        if (index < count && keys[index].compareTo(key) == 0) {
            return valuesArray[index];
        } else
            return null;
    }

    /**
     * @param key
     * @return the largest key less than or equal to key. Complexity is O(1)
     */
    public Key floor(Key key) {
        int index = rank(key);
        if (index < count && keys[index].compareTo(key) == 0) {
            return keys[index];
        } else {
            return keys[index - 1];
        }
    }

    /**
     * delete smallest key. Complexity is O(n)
     */
    public void deleteMin() {
        for (int i = 0; i < count - 1; i++) {
            keys[i] = keys[i + 1];
            valuesArray[i] = valuesArray[i + 1];
        }
        keys[count - 1] = null;
        valuesArray[count - 1] = null;
        count--;
    }

    /**
     * Iterable method Complexity:O(n).
     */

    public Iterable<Key> keys() {
        Queue queue = new Queue();
        for (int i = 0; i < count; i++)
            queue.enqueue(keys[i]);
        return queue;
    }
}
