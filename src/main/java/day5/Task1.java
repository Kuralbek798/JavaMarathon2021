package day5;

public class Task1 {
    public static void main(String[] args) {

        /*1. Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
         Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
         Задать значение для каждого поля, используя set методы. Вывести в консоль значение каждого из полей,
         используя get методы.
        Созданный вами класс должен отвечать принципам инкапсуляции.*/
   Car car = new Car();

   car.setColor("Green");
   car.setModel("Bugatti");
   car.setProductYear(2021);
        System.out.println(car.getModel() + "\n" + car.getColor() + "\n" + car.getProductYear() );


    }
}
