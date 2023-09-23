package hw.task3;

/***
 * в данном коде применен принцип Single Responsibility
 */
public class Main {
    public static void main(String[] args) {
        NumberContainer<Integer> intContainer = new NumberContainer<>();
        NumberContainer<Double> doubleContainer = new NumberContainer<>();

        intContainer.setNumber(8);
        doubleContainer.setNumber(2.2);

        System.out.println("Квадрат целого числа: " + intContainer.square(intContainer.getNumber()));
        System.out.println("Квадрат вещественного числа: " + doubleContainer.square(doubleContainer.getNumber()));
    }
}