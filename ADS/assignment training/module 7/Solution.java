class Solution {
    /**
     * @author Manisha
     */
    public static void main(String[] args) {
        int c = 0;
        LinearProb<Integer, Integer> s = new LinearProb<Integer, Integer>();
        Object[] a = s.keys;
        for (int i = 0; i <= 500000; i++) {
            s.put(i * 19, i);
            if (a[i] != null && i % 100 == 0) {
                c++;
            }
        }
        double probability = c / 1000000.0;
        System.out.println(probability);
    }
}