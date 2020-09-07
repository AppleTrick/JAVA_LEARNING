package ArraysClass.Practice1;

import java.util.Arrays;

public class CopyOfArrays {
    public static void main(String[] args) {
        double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};

        //배열 전체를 복사
        double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);

        //세번째 요소까지만 복사
        double[] arCpy2 = Arrays.copyOf(arOrg, 3);

        for (double d : arCpy1) {
            System.out.print(d + "\t");
        }
        System.out.println();

        for (double d : arCpy2) {
            System.out.print(d + "\t");
        }
        System.out.println();

        //copyOfRange 를 사용하여 범위를 조정
        double[] arCpy3 = Arrays.copyOfRange(arOrg, 1, 3);
        for (double d : arCpy3) {
            System.out.print(d + "\t");
        }
        System.out.println();
    }
}
