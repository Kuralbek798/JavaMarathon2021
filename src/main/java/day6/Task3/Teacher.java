package day6.Task3;

import java.util.Random;

public class Teacher {
    private final String name;
    private final String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }


public String evaluateStudent(Student student){
    Random random = new Random();
   int rand = (random.nextInt(4)+2);
    String value;
    switch (rand) {
        case 2:
            value = "неудовлетворительно";
            break;
        case 3:
            value = "удовлетворительно";
            break;
        case 4:
            value = "хорошо";
            break;
        case 5:
            value = "отлично";
            break;
        default:
            throw new IllegalStateException("Unexpected value: " + rand);
    }
    return "Преподователь " + getName() + " оценил студента с именем " + student.getName() + " на оценку " + value;

    }
}



