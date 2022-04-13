package day7.Task1;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Task1 {
   /* 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
    В классе Самолет реализовать статический метод compareAirplanes,
    который в качестве аргументов принимает два объекта класса Airplane (два самолета)
    и выводит сообщение в консоль о том, какой из самолетов длиннее.
*/
   public static void main(String[] args) {
      Airplane airplane1 = new Airplane("Boeing",2019,300,2000);

      Airplane airplane2 = new Airplane("Tu 154",2018,150,3000);

      Airplane.airplanesDifference(airplane1,airplane2);
      airplane2.setLength(300);
      Airplane.airplanesDifference(airplane1,airplane2);
      airplane2.setLength(500);
      Airplane.airplanesDifference(airplane1,airplane2);
   }


}