package day9.Task1;

import lombok.*;

@Setter
@Getter
public class Teacher extends Human {

    //This is  the field of the teacher's subject.
    private String subject;
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.printf("Этот преподаватель с именем %s.\n",getName());
    }

    @Override
    public String toString() {
        return System.out.printf("Это предмет %s  преподавателя %s.\n",subject,getName()).toString();
    }
}
