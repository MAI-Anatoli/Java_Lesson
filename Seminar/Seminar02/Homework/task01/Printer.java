package Seminar.Seminar02.Homework.task01;

// Дана строка sql-запроса:
//
//select * from students where "
//Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже.
// Если значение null, то параметр не должен попадать в запрос.
//
//Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
//
//String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами
//
//Пример: Строка sql-запроса:
//
//select * from students where
//Параметры для фильтрации:
//
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//Результат:
//
//select * from students where name='Ivanov' and country='Russia' and city='Moscow'
class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже
    StringBuilder whereClause = new StringBuilder();

        // Удаляем пробелы и лишние символы из JSON-строки
        PARAMS = PARAMS.replaceAll("\\s+", "");

        // Разбиваем параметры по запятой
        String[] paramsArray = PARAMS.substring(1, PARAMS.length() - 1).split(",");
        boolean hasCondition = false;

        for (String param : paramsArray) {
            String[] keyValue = param.split(":");
            String key = keyValue[0].replaceAll("\"", "");
            String value = keyValue[1].replaceAll("\"", "");

            // Игнорируем параметры со значением "null"
            if (!value.equals("null")) {
                if (!hasCondition) {
                    whereClause.append(" ");
                    hasCondition = true;
                } else {
                    whereClause.append(" and ");
                }
                whereClause.append(key).append("='").append(value).append("'");
            }
        }

        return new StringBuilder(QUERY).append(whereClause);
            }
        }





// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}

//**************************************************************************************************************************/
// Решения с автотеста


//String paramsNew = PARAMS.replace('{',' ').replace('}', ' ');
//        String[] params = paramsNew.split(",");
//        StringBuilder stringBuilder = new StringBuilder(QUERY);
//
//        for (int i = 0; i < params.length; i++){
//            String[] elements = params[i].replace('"', ' ').split(":");
//            if(!"null".equals(elements[1].trim())){
//              stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
//                if (i < params.length - 2) stringBuilder.append(" and ");
//            }
//        }
//        return stringBuilder;
