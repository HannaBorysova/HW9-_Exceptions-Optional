package main.java.com.hw9.division;

import java.util.Scanner;

public class SafeDivision {
    private final Scanner scanner = new Scanner(System.in);

    public void enterTwoNumbers() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Сannot be divided by 0, please change number B");
        }
    }
}
