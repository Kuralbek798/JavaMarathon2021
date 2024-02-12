package day6.Task1;

public class Car {
    /*1. Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
         Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
         Задать значение для каждого поля, используя set методы. Вывести в консоль значение каждого из полей,
         используя get методы.
        Созданный вами класс должен отвечать принципам инкапсуляции.*/
    private String model;
    private String color;
    private int productionYear;

    public void info() {
        System.out.printf("Это автомобиль %s\n", model);
    }

    public int yearDifference(int inputYear) {
        int result = Math.abs(inputYear - productionYear);
        return result;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
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
}
