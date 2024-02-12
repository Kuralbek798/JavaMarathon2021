package day5.Car;



import java.text.SimpleDateFormat;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Task1 {
    public static void main(String[] args) {

        /*1. Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
         Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
         Задать значение для каждого поля, используя set методы. Вывести в консоль значение каждого из полей,
         используя get методы.
        Созданный вами класс должен отвечать принципам инкапсуляции.*/
        Car myCar = new Car();
        myCar.setProductDate(new GregorianCalendar (20203,0,1));
        myCar.setColor("Green");
        myCar.setModel("Toyota");


        System.out.printf("Модель: %s\nЦвет: %s\nГод производства: %s",myCar.getModel(),myCar.getColor(),myCar.getProductDate().getTime());



    }
}
