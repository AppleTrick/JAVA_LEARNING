package ConsoleOutput.newConsole;

import java.util.Scanner;

public class scannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("제 이름은 " + name + "입니다 ");

    }
}
