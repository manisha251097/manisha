import java.util.Scanner;

class FurthestPair {
    public void Difference(double a[]) { //
        double max = a[0];
        double min = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];

        }
        double d = max - min;
        System.out.println(max);
        System.out.println(min);
        System.out.println(d);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter elements you want in array:");
        String[] x = s.nextLine().split(" ");
        double arr[] = new double[x.length];
        // System.out.println("Enter all the elements:");
        for (int i = 0; i < x.length; i++)
            arr[i] = Double.valueOf(x[i]);

        FurthestPair m = new FurthestPair();
        // int arr[] = { 80, 2, 6, 3, 70 };
        m.Difference(arr);
    }
}