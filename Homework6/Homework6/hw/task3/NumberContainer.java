package Homework6.hw.task3;

public class NumberContainer<T extends Number> extends Square<T> {
    private T number;

    public NumberContainer(T number) {
        this.number = number;
    }

    public NumberContainer() {
        this(null);
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}