package day9.Task2.figures;

import day9.Task2.Figure;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Rectangle extends Figure {

    //Поле для значения ширина.
    private double width;
    //Поле для значения высоты.
    private double height;

    public Rectangle(double width, double height,String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
