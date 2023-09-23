package hw.task4;

//в данном коде применен принцип Single Responsibility
public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(42, "Привет"); // Использование шаблона аргументов
        Pair<Double, Boolean> pair2 = new Pair<>(3.14, true);   // Использование шаблона аргументов

        Pair<Integer, String> pair3 = new Pair<>(100, "Мир");  // Использование шаблона аргументов

        Pair pair4 = new Pair(42, "Hello"); // Без явного указания типов (предупреждение о неявном использовании)
        // Компилятор предупреждает о неявном использовании raw-типов (непараметризованных) и рекомендует
        // использовать параметризованные типы.
    }
}