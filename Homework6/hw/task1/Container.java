package hw.task1;

/***
 * Публичный класс Container содержит пример того, как можно создать поле и методы с универсальным типом.
 * В данном классе соблюден принцип одной ответственности (Single responsibility principle).
 * @param <T>
 */
public class Container<T> {
    private T item;

    /***
     * Конструктор для создания приватного поля с универсальным типом
     * @param item Название поля
     */
    public Container(T item) {
        this.item = item;
    }

    /***
     * Возвращает значение поля
     * @return
     */
    public T getItem() {
        return item;
    }

    /***
     * Позволяет присвоить полю необходимое значение
     * @param item
     */
    public void setItem(T item) {
        this.item = item;
    }

    /***
     * Выводит в консоль тип значения поля item
     */
    public void printType() {
        System.out.println("Тип элемента: " + item.getClass().getName());
    }
}