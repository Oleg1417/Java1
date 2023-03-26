import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class taskNumber2 {

    public static void main(String[] args) throws IOException {
        int[] array = { 6, 4, 2, 7, 12, 4, 45, 1 };

        garden(array);
    }

    public static int[] garden(int array[]) throws IOException {
        Logger logger = Logger.getLogger(taskNumber2.class.getName());
        FileHandler fHandler = new FileHandler("taskNumber2.txt");
        SimpleFormatter sFormat = new SimpleFormatter();
        fHandler.setFormatter(sFormat);
        logger.addHandler(fHandler);
        logger.info(Arrays.toString(array));
        
        int[] b = array;
        int count = 0;
        int p = 0;
        for (int i = 1; i < b.length; i++) {
            p = 0;
            if (b[i] < b[i - 1]) {
                p = b[i];
                b[i] = b[i - 1];
                b[i - 1] = p;
                count++;
            }
        }      
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        if (count > 0) {
            garden(b);
        }
        return b;
    }
}