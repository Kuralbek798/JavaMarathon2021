package day9.Task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Human {
    //Поле имя
    private String name;

    // Метод printInfo выводит в консоль информацию о человеке
    void printInfo(){
        System.out.printf("Это человек с именем %s.\n", name);
    }

}
