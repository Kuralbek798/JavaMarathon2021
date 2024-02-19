package day9.Task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
public abstract   class  Figure {
    //Поле цвет фигуры
    private String color;

    public abstract double area();
    public abstract double perimeter();
}
