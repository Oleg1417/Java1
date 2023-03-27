import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class taskNumber2 {

    public static final Logger logger = Logger.getLogger(taskNumber2.class.getName());

    public static void main(String[] args) throws Exception {
        Handler fHandler = new FileHandler("taskNumber2.txt");
        SimpleFormatter sFormat = new SimpleFormatter();
        fHandler.setFormatter(sFormat);
        logger.addHandler(fHandler);

        int[] c = { 6, 4, 2, 7, 12, 4, 45, 1 };
        garden(c);
    }

    public static void garden(int[] array) throws IOException {

        logger.info(Arrays.toString(array));

        int[] newArray = array;
        boolean temp = false;
        int temporalCh = 0;
        for (int i = 1; i < newArray.length; i++) {
            temporalCh = 0;
            if (newArray[i] < newArray[i - 1]) {
                temporalCh = newArray[i];
                newArray[i] = newArray[i - 1];
                newArray[i - 1] = temporalCh;
                temp = true;
            }
        }
        if (temp) {
            garden(newArray);
        }
    }
}