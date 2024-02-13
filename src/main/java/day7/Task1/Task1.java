package day7.Task1;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Task1 {
   /* 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
    В классе Самолет реализовать статический метод compareAirplanes,
    который в качестве аргументов принимает два объекта класса Airplane (два самолета)
    и выводит сообщение в консоль о том, какой из самолетов длиннее.
*/
   public static void main(String[] args) {
     AirlplaneTwo airlplaneTwo = new AirlplaneTwo("Boeing",1981,7000,200);
     AirlplaneTwo airlplaneTwo1 = new AirlplaneTwo("Scatt",2023,4000,150);
     AirlplaneTwo.compareAirplane(airlplaneTwo1,airlplaneTwo);
   }


}