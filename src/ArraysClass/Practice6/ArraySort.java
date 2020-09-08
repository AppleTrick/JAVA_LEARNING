package ArraysClass.Practice6;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] ar1 = {1, 5, 3, 4, 2};
        double[] ar2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        for (int n : ar1) {
            System.out.printf(n +"\t");
        }
        System.out.println();
        for (double n : ar2) {
            System.out.printf(n +"\t");
        }
        System.out.println();
    }
}
