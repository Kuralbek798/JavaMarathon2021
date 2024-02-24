package day11.task1;

import lombok.Getter;

public class Courier implements Worker {
    @Getter
    private double salary;

    @Override
    public void doWork() {
        salary = 100;
    }

    @Override
    public void bonus() {

    }
}
