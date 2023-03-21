
// Вывести все простые числа от 1 до 1000
import java.util.ArrayList;

public class Zadanie2 {
    public static void main(String[] args) {
        ArrayList<Integer> simpleNumbers = new ArrayList<Integer>();
        for (int i = 2; i <= 1000; i++) {
            int count = 1;
            for (int j = 2; j < i; j++) {
                if ((i % j == 0)) {
                    count = 0;
                    break;
                }
            }
            if (count == 1) {
                simpleNumbers.add(i);
            }
        }
        System.out.println(simpleNumbers);
    }
}
