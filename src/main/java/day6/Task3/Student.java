package day6.Task3;

public class Student {
  /*. Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”. Создать класс Student (Студент) с полем “Имя”.
    Каждый класс имеет конструктор (с параметрами), set и get методы по необходимости, а также у преподавателя есть метод
     evaluate (оценить студента), принимающий в качестве аргумента студента, и работающий следующим образом:
      внутри метода случайным образом генерируется число от 2 до 5, затем в консоль выводится строка:
      "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
    Все слова, написанные большими буквами, должны быть заменены соответствующими значениями.
    ОЦЕНКА должна принимать значения "отлично”, "хорошо”, "удовлетворительно" или "неудовлетворительно",
    в зависимости от значения случайно сгенерированного числа.
*/
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }
}
