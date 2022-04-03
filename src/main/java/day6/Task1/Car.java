package day6.Task1;

public class Car {
   private String model;                                                     //Создать класс Автомобиль (англ. Car) с полями
   private String  color;                                                    // “Модель”, “Цвет”, “Год выпуска”.
   private int productYear;

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getProductYear() {
      return productYear;
   }

   public void setProductYear(int productYear) {
      this.productYear = productYear;
   }

   public void info (){
      System.out.println("Это автомобиль");
   }

   public int yearDifference(int inputYear){

      return getProductYear() - inputYear;

   }
}
