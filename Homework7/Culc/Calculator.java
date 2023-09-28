package Homework7.Culc;

public final class Calculator implements Calculable {

    private static int firstArg;

    public Calculator(int firstArg) {
        Calculator.firstArg = firstArg;
    }

    /**
     * Метод, который производит сложение реальных и мнимых чисел
     *
     * @param c переменная, которая хранит в себе значение, введённое пользователем
     */
    @Override
    public Calculable sum(int arg) {
        firstArg += arg;
        return this;
    }

    /**
     * Метод, который производит умножение реальных и мнимых чисел
     *
     * @param c переменная, которая хранит в себе значение, введённое пользователем
     */
    @Override
    public Calculable multi(int arg) {
        firstArg *= arg;
        return this;
    }

    /**
     * Метод, который производит деление реальных и мнимых чисел
     *
     * @param c переменная, которая хранит в себе значение, введённое пользователем
     */
    @Override
    public Calculable devide(int arg) {
        firstArg /= arg;
        return this;
    }
    
    /**
     * Метод, который выводит результат математических операций
     *
     * @param c переменная, которая хранит в себе значение, введённое пользователем
     */
    @Override
    public int getResult() {
        return firstArg;
    }
}