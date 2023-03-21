import java.util.Scanner;

/**
 * Zadanie1
 * Вычислить [n-ое треугольноe число](сумма чисел от 1 до n), n! (произведение
 * чисел от 1 до n)
 */
public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int n = scan.nextInt();
        int points = (n * (n + 1)) / 2; // n-е треугольное число может быть записано как сумма n натуральных чисел, то
                                   // есть n * (n + 1) / 2.
        System.out.printf("Треугольное число: %s\n", points);
        scan.close();
    }
}