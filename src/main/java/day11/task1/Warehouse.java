package day11.task1;

import lombok.Getter;


public class Warehouse {
    // field for setting order counts.
    @Getter
    private int countOrder;
    // field for setting amount  of balance
    @Getter
    private double balance;

    //overrided method toString to show in a string type values of the fields from warehouse object.
    @Override
    public String toString() {
        return String.format("countOrder = %d,\nbalance = %.2f.\n", countOrder, balance);
    }

    public void setCountOrder(int countOrder) {
        this.countOrder += countOrder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
