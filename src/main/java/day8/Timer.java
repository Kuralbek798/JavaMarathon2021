package day8;

public class Timer {
    //Поле для записи стартового времени.
    private static long startTime = 0;
    //Поле для записи времени остановки.
    private static long stopTime = 0;
    //field result which consist from differences between startTime and stopTime.
    private static long result = 0;
    public static void executionTime(Runnable method) {
        // Начальное время
        startTime = System.currentTimeMillis();
        //Вызываем метод run на полученном методе.
        method.run();
        // Время завершения
        stopTime = System.currentTimeMillis();
        // Вычисляем время выполнения метода.
        result = stopTime - startTime;
        // Выводим в консоль результат измерений.
        String temp1 = "результат выполнения метода составляет %d миллисекунда.\n";
        String temp2 = "результат выполнения метода составляет %d миллисекунды.\n";
        long term = result;
        switch ((int) term){
            case 1:
                System.out.printf(temp1,result);
                break;
            default:
                System.out.printf(temp2,result);
        }

    }

}
/*
public class MethodTimer {
    public static void measureMethodExecutionTime(Runnable methodToMeasure) {
        long startTime = System.nanoTime();

        methodToMeasure.run();  // Вызов переданного метода

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  // время выполнения в наносекундах

        System.out.println("Время выполнения метода: " + duration + " наносекунд");
    }


}*/
