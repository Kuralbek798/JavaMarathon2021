package day6.Task2.aairplane;



public class Airplane {



    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    /* 2. Создать класс Самолет (Airplane) с полями:
                 producer (изготовитель), year (год выпуска),length (длина), weight (вес), fuel (количество топлива в баке)
               Для всех полей должны быть реализованы сеттеры, а для поля fuel еще и геттер.
               Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса
               (значение поля “количество топлива в баке” установить равным 0). В конструкторе для передачи полям значений
                использовать ключевое слово this. Помимо этого, в классе необходимо реализовать метод info(), который выводит сообщение
                 в следующем формате: “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
               Также, необходимо реализовать метод fillUp(int n), который в качестве аргумента принимает число и заправляет топливный бак
                самолета на это значение.
               Создать новый объект класса Самолет с произвольными данными.
               Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp(int n) два раза,
               передав разные значения. Вызвать метод info().
           */
private String producer;
private int year;
private int length;
private int weight;
private int fuel;

   public Airplane(String producer, int year, int length, int wight) {
      this.producer = producer;
      this.year = year;
      this.length = length;
      this.weight = wight;
      this.fuel = 0;
   }
 public  void info(){
      System.out.printf("Изготовитель: %s\n", this.producer);
      System.out.printf("год выпуска: %s\n", this.year);
      System.out.printf("длина: %s\n",this.length);
      System.out.printf("вес: %s\n",this.weight);
      System.out.printf("количество топлива в баке: %s\n",this.fuel);
 }
 public void filItUp(int fuel){
      this.fuel = fuel;
 }

}
