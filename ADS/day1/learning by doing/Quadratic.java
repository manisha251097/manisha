import java.util.Arrays;

/**
 * Qudratic
 */
public class Quadratic {
    public int sort1(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        int count = 0;
        for (int i = 0; i < l - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Quadratic s = new Quadratic();
        int[] arr = { 1, 6, 4, 5, 7, 6, 6, 8, 7 };
        System.out.println(s.sort1(arr));
    }

}
