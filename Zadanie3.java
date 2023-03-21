// Реализовать простой калькулятор

import java.util.Scanner;

public class Zadanie3 {

    static int scan(int[] args) {
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        // scanner.close();
        return sc;
    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int number1 = scan(null);
        System.out.println("Введите оператор '+', '-', '*', '/': ");
        Scanner scan = new Scanner(System.in);
        String operator = scan.nextLine();
        System.out.println("Введите второе число: ");
        int number2 = scan(null);
        System.out.println("Ответ: " + result(number1, operator, number2));
        scan.close();
    }

    static int result(int number1, String operator, int number2) {
        int res = 0;
        switch (operator) {
            case "+":
                res = number1 + number2;
                break;
            case "-":
                res = number1 - number2;
                break;
            case "*":
                res = number1 * number2;
                break;
            case "/":
                res = number1 / number2;
                break;
        }
        return res;
    }
}
