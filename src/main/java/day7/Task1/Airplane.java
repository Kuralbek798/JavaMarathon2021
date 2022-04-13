package day7.Task1;

public class Airplane {
    /*
     2. Создать класс Самолет (Airplane) с полями:

       producer (изготовитель), year (год выпуска),length (длина), weight (вес), fuel (количество топлива в баке)

     Для всех полей должны быть реализованы сеттеры, а для поля fuel еще и геттер.
     Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса
     (значение поля “количество топлива в баке” установить равным 0). В конструкторе для передачи полям значений
      использовать ключевое слово this. Помимо этого, в классе необходимо реализовать метод info(), который выводит сообщение
       в следующем формате:
             “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
     Также, необходимо реализовать метод fillUp(int n), который в качестве аргумента принимает число и заправляет топливный бак
      самолета на это значение.
     Создать новый объект класса Самолет с произвольными данными.
     Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp(int n) два раза,
     передав разные значения. Вызвать метод info().
 */
    private String produser;
    private int year;
    private int length;
    private int weight;
    private int fuel;
    private static String airplanesLength;

    public Airplane(String produser, int year, int length, int weight) {
        this.produser = produser;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public String getProduser() {
        return produser;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + getProduser() + ", год выпуска:  " + getYear() + ", длина: " + getLength() +
                ", вес: " + getWeight() + ", количество топлива в баке: " + getFuel());


    }

    public void filUp(int n) {

        setFuel(n);
    }

        public static void airplanesDifference (Airplane airplane1, Airplane airplane2){
            int difLength;

        if (airplane1.getLength() < airplane2.getLength()){

            difLength = airplane2.getLength() - airplane2.getLength();
            System.out.println("Длина самолета: " + airplane2.getProduser() + " больше на " + difLength + " длины самолета: " + airplane1.getProduser());
        }

        else if ( airplane2.getLength() < airplane1.getLength()){

          difLength  =  airplane1.getLength() - airplane2.getLength();
          System.out.println("Длина самолета: " + airplane1.getProduser() + " больше на " + difLength + " длины самолета: " + airplane2.getProduser());
        }

        else if( airplane1.getLength() == airplane2.getLength()){

            System.out.println("Длины самолетов: " + airplane1.getProduser() + " и " + airplane2.getProduser() + " одинаковы.");
        }
        else System.out.println("С длинами " + airplane1.getProduser() + " и " + airplane2.getProduser() +  " что-то не так.");


        }


}
