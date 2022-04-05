package day6.Task2;

public class Task2 {
    public static void main(String[] args) {
 Airplane airplane = new Airplane("Boeing", 2020, 200,20_000);

 airplane.info();
 airplane.setFuel(123);
 airplane.info();
 airplane.setLength(300);
 airplane.setYear(2023);
 airplane.filUp(1000);
 airplane.info();
    }
}
