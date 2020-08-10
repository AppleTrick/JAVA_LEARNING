package ExceptionPractice.Practice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("a값을 입력하세요");
            int num1 = sc.nextInt();
            System.out.println("b값을 입력하세요");
            int num2 = sc.nextInt();
            System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("good bye~~~");
    }
}
