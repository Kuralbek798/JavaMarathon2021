package day9.Task2.figures;

import day9.Task2.Figure;

public class Triangle extends Figure {
    //Длина одной из трех сторон треугольника.
    private double a;
    //Длина второй из трех сторон треугольника.
    private double b;
    //Длина третьей из трех сторон треугольника.
    private double c;
    public Triangle(double a,double b, double c,String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
        double s = perimeter() / 2;
        return  Math.sqrt(s * (s - a)*(s - b)*(s - c)) ;
    }
    @Override
    public double perimeter() {
        return a + b + c;
    }
}
