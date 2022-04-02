package day5.Motorbike;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike("Bugatti","Yelloew",2022);
        System.out.print(motorbike.getModel() + "\n" + motorbike.getColor() + "\n" + motorbike.getProductionYear());
    }
}
