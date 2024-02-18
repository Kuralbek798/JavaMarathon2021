package day9.Task1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human {
    //Поле имя
    private String name;

    public Human(String name) {
        this.name = name;
    }

    // Метод printInfo выводит в консоль информацию о человеке
    void printInfo(){
        System.out.printf("Это человек с именем %s", name);
    }

}
