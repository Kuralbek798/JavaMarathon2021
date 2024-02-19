package day9.Task2;


import day9.Task2.figures.Circle;
import day9.Task2.figures.Rectangle;
import day9.Task2.figures.Triangle;

public class TestFigures {
    /*2. Создайте абстрактный класс Фигура (англ. Figure). Этот класс будет являться
абстрактным представлением геометрической фигуры в нашей программе.
У всех фигур в нашей программе есть цвет, поэтому в классе Фигура есть строковое
поле color. Создайте конструктор, геттер и сеттер для этого поля.
У класса Фигура определены два абстрактных метода:
public abstract double area();
public abstract double perimeter();
Реализация первого метода должна возвращать площадь фигуры, а реализация
второго метода должна возвращать периметр фигуры.
Создайте 3 геометрические фигуры: Круг (англ. Circle), Прямоугольник (англ.
Rectangle) и Треугольник (англ. Triangle). Каждая из фигур должна наследоваться
от абстрактного класса Фигура (англ. Figure).
У класса Круг будет одно поле - радиус окружности.
У класса Прямоугольник будет два поля - ширина и высота.
У класса Треугольник будет три поля - длина каждой из сторон.
Для каждого из этих трех классов необходимо реализовать конструктор, который
принимает на вход размерности фигуры и цвет фигуры.
В этих же классах, вам необходимо реализовать два метода ( area() и
perimeter() ). Реализация этих методов будет разной для каждой из геометрических
фигур. Формулы для вычисления площади и периметра легко находятся в интернете.
После того как геометрические фигуры будут полностью реализованы, вам
необходимо будет реализовать еще один класс - TestFigures. В этом классе, в методе main() должны быть созданы и помещены в массив следующие
геометрические фигуры:
Figure[] figures = {
new Triangle (10,10,10,"Red"),
new Triangle (10,20,30,"Green"),
new Triangle (10,20,15,"Red"),
new Rectangle (5,10,"Red"),
new Rectangle (40,15,"Orange"),
new Circle (4,"Red"),
new Circle (10,"Red"),
new Circle (5,"Blue")};
В этом же классе реализуйте два метода:
public static double calculateRedPerimeter(Figure[] figures)
public static double calculateRedArea(Figure[] figures)
Первый метод, принимая на вход массив геометрических фигур, должен вернуть
сумму периметров красных фигур. Второй метод, принимая на вход массив
геометрических фигур, должен вернуть сумму площадей красных фигур.
Вызовите эти два метода на массиве figures и выведите результат в консоль.*/
    public static void main(String[] args) {
     /*   Circle circle = new Circle("sdf",3234);
        Rectangle rectangle = new Rectangle("green",22,33);
        Triangle triangle = new Triangle("Orange",12,44,33);
        System.out.printf("%.4f\n%.4f\n",circle.area(),circle.perimeter());
        System.out.printf("%.4f\n%.4f\n",rectangle.area(),rectangle.perimeter());
        System.out.printf("%.4f\n%.4f\n",triangle.area(),triangle.area());*/
        Figure[] figures ={new Triangle (10,10,10,"Red"),
                new Triangle (10,20,30,"Green"),
                new Triangle (10,20,15,"Red"),
                new Rectangle (5,10,"Red"),
                new Rectangle (40,15,"Orange"),
                new Circle (4,"Red"),
                new Circle (10,"Red"),
                new Circle (5,"Blue")};
       System.out.printf("Сумма периметров геометрических фигур красного цвета %.4f\n", calculateRedPerimeter(figures));
       System.out.printf("Cумма площадей геометрических фигур красного цвета  %.4f\n",calculateRedArea(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures){
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            if(figures[i].getColor() == "Red"){
                sum += figures[i].perimeter();
            }
        }
        return sum;
    }
    public static double calculateRedArea(Figure[] figures){
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
         if(figures[i].getColor() == "Red"){
             sum += figures[i].area();
         }
        }
        return sum;
    }
}
