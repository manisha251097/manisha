import java.util.Arrays;

class ThreeSum {
    Integer[] array1 = new Integer[] { -30, 20, 10, 20, 30, -50, 80, -20, -10 };
    int current;

    public void threeS() {
        Arrays.sort(array1);
        int j;
        int k;
        for (int i = 0; i < array1.length; i++) {

            // System.out.println(i);
            for (j = 0; j < array1.length - 1; j++) {
                // System.out.println(j);

                k = j + 1;
                // System.out.println(k);
                // System.out.println(array1[i]+" "+array1[j]+" "+array1[k]);

                if ((array1[i] + (array1[j] + array1[k])) == 0) {
                    System.out.println(array1[i] + "i " + array1[j] + "j " + array1[k]);
                }

            }

        }

    }

    public static void main(String[] args) {
        ThreeSum obj1 = new ThreeSum();
        obj1.threeS();
        ;
        // obj.display();
    }

}
