
class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 4, 8, 9, 11, 21 };
        int[] arr2 = new int[] { 2, 6, 8, 10, 11, 21 };

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
    }
}