package day9.Task1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student extends Human {

    //this is the  students subject field.
    private String subject;

    public Student(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.printf("Это студент с именем %s.\n", getName());

    }

    @Override
    public String toString() {
        return System.out.printf("Это предмет %s студента %s.\n",subject,getName()).toString();
    }
}
