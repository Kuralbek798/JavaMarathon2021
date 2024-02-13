package day7.Task1;

import day6.Task2.aairplane.Airplane;

public class AirlplaneTwo extends Airplane {

    /*
     1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
    В классе Самолет реализовать статический метод compareAirplanes,
    который в качестве аргументов принимает два объекта класса Airplane (два самолета)
    и выводит сообщение в консоль о том, какой из самолетов длиннее.
 */
    public AirlplaneTwo(String producer, int year, int length, int wight) {
        super(producer, year, length, wight);
    }
    public static void compareAirplane(AirlplaneTwo airplane, AirlplaneTwo airlplaneTwo) {

        int lengthDiff = Math.abs(airlplaneTwo.getLength() - airplane.getLength());

        if(airplane.getLength()> airlplaneTwo.getLength()){
            System.out.printf("Самолет %s длиннее самолета %s на  %d метров.",airplane.getProducer(),airlplaneTwo.getProducer(), lengthDiff);
        }else {
            System.out.printf("Самолет %s длиннее самолета %s на %d метров.",airlplaneTwo.getProducer(),airplane.getProducer(),lengthDiff);
        }
    }
}
