package day5.Motorbike;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike("Yamaha","red",2024);
        System.out.printf("Model: %s, color: %s, productionYear: %d\n",motorbike.getModel(),motorbike.getColor(),motorbike.getProductionYear());

    }
}
