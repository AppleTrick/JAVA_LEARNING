package CodingTest_BAEKJOON.BASIC;

import java.util.Scanner;

public class Basic007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int div = 0;
        int result =0 ;
        num = scanner.nextInt();
        div = scanner.nextInt();
        int fin = num * div;
        while (div != 0) {
            result = num * (div % 10);
            div = div / 10;
            System.out.println(result);
        }
        System.out.println(fin);
    }
    //백준 2588 문제
}
