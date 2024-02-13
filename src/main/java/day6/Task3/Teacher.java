package day6.Task3;

import java.util.Random;

public class Teacher{
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
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void evaluete(Student student){
        Random random = new Random();
        int value = 0;
        String grade = "";
        value = random.nextInt(2,6);

        switch(value){
            case 2:
                grade = "неудовлетворительно";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            case 5:
                grade = "отлично";
                break;
            default:
            break;

        }
        System.out.printf("Преподаватель %s оценил студента %s по предмету %s на оценку %s.",this.name, student.getName(), this.subject, grade);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}
