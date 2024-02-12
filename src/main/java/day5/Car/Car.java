package day5.Car;

import java.util.Calendar;
import java.util.Date;

public class Car {
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

   public Calendar getProductDate() {
      return productDate;
   }

   public void setProductDate(Calendar productDate) {
      this.productDate = productDate;
   }

   private String model;
   private String color;
   private Calendar productDate;




}
