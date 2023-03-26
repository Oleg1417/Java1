import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Дана строка sql-запроса "select * from students where ". Сформируйте часть 
// WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены 
// ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", 
// "age":"null"}

public class taskNumber1 {

    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Russia");
        map.put("city", "Moscow");
        map.put("age", "null");
        System.out.println(ask(map));
    }

    public static String ask(Map<String, String> means) {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> key : means.entrySet()) {
            if (key.getKey() == "null" || key.getValue() == "null")
                continue;

            result.append(key.getKey()).append(" : ").append(key.getValue()).append("\n");
        }

        if (result.length() > 0)
            result.delete(result.length() - 1, result.length());

        return result.toString();
    }

}