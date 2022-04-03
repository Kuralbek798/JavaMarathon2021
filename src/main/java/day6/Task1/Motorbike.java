package day6.Task1;

public class Motorbike {

   /* 2. Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
    Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
    Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
    Вывести в консоль значение каждого из полей, используя get методы.*/
    private  String model;
    private  String color;
    private  int productionYear;

    public Motorbike(String model, String color, int productionYear) {
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void info (){
        System.out.println("This is a motorbike");
    }

    public int yearDifference(int inputYear){

        return this.productionYear - inputYear;

    }
}
