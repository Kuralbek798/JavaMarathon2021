package day6;

import java.util.Random;

public class Teacher {
    private String naime;
    private String subject;


    public Teacher(String naime, String subject ) {
        this.naime = naime;
        this.subject = subject;

    }

    public String getNaime() {
        return naime;
    }

    public void setNaime(String naime) {
        this.naime = naime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }




    public void evaluateStudent(Student student){
        Random random = new Random();
        int b = (random.nextInt(4))+2;
        System.out.println("Студент " + student.getName() + " Ответил на оцеку: " + b);

        String value;

        switch (b){
            case 5:
                value = "Отлично";
                break;
            case 4:
                value = "Хорошо";
                break;
            case 3:
                value = "Нормально";
                break;
            default:
                value = "Не очень нормально";
                break;



        }
        System.out.println("Учитель " + getNaime() +" Оценил знания cтудента, " + student.getName() + " по предмеу " + getSubject() + " как " +
                "оценку " +   value);
    }
}
