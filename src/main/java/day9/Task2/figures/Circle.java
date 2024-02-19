package day9.Task2.figures;

import day9.Task2.Figure;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

@Getter
@Setter
public class Circle extends Figure {
    //Поле радиус окружности.
    private double radius;
    //Поле константа числа ПИ.
    private double PI;
    public Circle(double radius,String color) {
        super(color);
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
        this.PI = Double.parseDouble(new DecimalFormat("#.0000",otherSymbols).format(Math.PI));
        this.radius = radius;
    }

    @Override
    public double area() {
        double result = Math.pow(radius,2) * PI;
        return result;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
