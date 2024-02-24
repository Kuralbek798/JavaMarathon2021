package day11.task1;

import lombok.Getter;


public class Picker implements Worker {
    @Getter
    private double salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
        ;
    }

    @Override
    public void doWork() {
        salary = 80;
        warehouse.setCountOrder(1);
    }

    @Override
    public void bonus() {

    }
}
