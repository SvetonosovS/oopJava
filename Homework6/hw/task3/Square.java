package Homework6.hw.task3;

public class Square<T extends Number> {

    public double square(T currentValue) {
        return currentValue.doubleValue() * currentValue.doubleValue();
    }
}