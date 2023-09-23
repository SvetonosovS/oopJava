package hw.task2;

/***
 * Публичный класс Container содержит пример того, как можно создать поля и методы с универсальными типами.
 * В данном классе соблюден принцип одной ответственности (Single responsibility principle).
 * @param <T>
 * @param <U>
 */
public class Pair<T, U> {
    private T first;
    private U second;

    /***
     * Конструктор для создания приватного поля с универсальными типами
     * @param first название поля
     * @param second название поля
     */
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    /***
     * Возвращает значение поля first
     * @return
     */
    public T getFirst() {
        return first;
    }

    /***
     * Возвращает значение поля second
     * @return
     */
    public U getSecond() {
        return second;
    }

    /***
     * Позволяет присвоить полю first необходимое значение
     * @param first
     */
    public void setFirst(T first) {
        this.first = first;
    }

    /***
     * Позволяет присвоить полю second необходимое значение
     * @param second
     */
    public void setSecond(U second) {
        this.second = second;
    }

    /***
     * Выводит в консоль типы и значения поле first и second
     */
    public void printTypes() {
        System.out.println("Тип первого элемента: " + first.getClass().getName());
        System.out.println("Тип второго элемента: " + second.getClass().getName());
    }
}
