package ArraysClass.Practice8;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] ar = {33, 55, 44, 66, 77};
        Arrays.sort(ar);
        for (int a : ar) {
            System.out.printf(a + "\t");
        }
        System.out.println();

        int idx = Arrays.binarySearch(ar, 33);
        System.out.println("Index of 33 : " + idx);

    }
}
