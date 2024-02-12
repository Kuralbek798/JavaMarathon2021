package day6.Task1;

/*
1. Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня в пакет текущего дня.
        В классах Автомобиль и Мотоцикл реализуйте два метода:
        void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
        int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год) и возвращает разницу
        между переданным годом и годом выпуска транспортного средства (возвращаться должно всегда положительное число).
        В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.
*/

public class Task1 {
    public static void main(String[] args) {

Car car = new Car();
car.setModel("Toyota");
car.setColor("Green");
car.setProductionYear(2020);
car.info();
System.out.printf("разница в годах автомобиля: %d\n",car.yearDifference(2024));
Motorbike motorbike = new Motorbike("Yamaha", "red", 2020);
motorbike.info();
System.out.printf("разница в годах мотоцикла: %d\n",motorbike.yearDifference(2024));


    }
}
