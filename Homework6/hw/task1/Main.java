package hw.task1;

/***
 * Главный класс для демонстрации работы с контейнером.
 */
public class Main {
    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<Integer>(42);
        Container<String> stringContainer = new Container<>("Привет, мир!");

        intContainer.printType();    // Вывод: Тип элемента: java.lang.Integer
        stringContainer.printType(); // Вывод: Тип элемента: java.lang.String
    }
}