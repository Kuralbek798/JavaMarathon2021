package day6.Task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Task3 {
    /*. Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”. Создать класс Student (Студент) с полем “Имя”.
    Каждый класс имеет конструктор (с параметрами), set и get методы по необходимости, а также у преподавателя есть метод
     evaluate (оценить студента), принимающий в качестве аргумента студента, и работающий следующим образом:
      внутри метода случайным образом генерируется число от 2 до 5, затем в консоль выводится строка:
      "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
    Все слова, написанные большими буквами, должны быть заменены соответствующими значениями.
    ОЦЕНКА должна принимать значения "отлично”, "хорошо”, "удовлетворительно" или "неудовлетворительно",
    в зависимости от значения случайно сгенерированного числа.
*/




        public class Main {
            public static void main(String[] args) {
                try {
                    String baseUrl = "https://api.example.com/data";
                    String param1 = "value1";
                    String param2 = "value2";

                    String fullUrl = baseUrl + "?param1=" + param1 + "&param2=" + param2;

                    URL url = new URL(fullUrl);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");

                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    System.out.println(response.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
