import java.util.*;

/**
 * implementation
 * 
 * @author manisha
 */
public class MinPriorityQ {
    /**
     * 
     * @param ar array
     * @param x  No. of operations
     */

    public static void minQueue(double[] ar, int x) {
        int len = ar.length;
        double d[] = Arrays.copyOf(ar, len);
        double[] result = new double[x];
        MaxPQ<Double> max = new MaxPQ<Double>(len);
        MinPQ<Double> min = new MinPQ<Double>(len);
        MaxPQ<Double> max1 = new MaxPQ<Double>(len);

        for (int i = 0; i < len; i++) {
            min.insert(ar[i]);

        }
        for (int i = 0; i < len; i++) {
            max.insert(ar[i]);
        }
        for (int i = 0; i < len; i++) {
            max1.insert(d[i]);
        }
        for (int i = 0; i < len - x; i++) {
            ar[i] = min.delMin();
        }
        for (int i = 0; i < x; i++) {
            result[i] = max1.delMax();
        }
        System.out.println(Arrays.toString(result));
        int w = 0;
        for (int i = 0; i < x; i++) {
            if (result[i] == max.delMax()) {
                w++;
            }
        }
        System.out.println(w);
        if (w == x) {
            System.out.println(true);
        }
    }

    public static void main(String[] args) {
        double[] ar = { 6, 9, 2, 7, 3, 2, 1 };
        minQueue(ar, 3);
    }
}