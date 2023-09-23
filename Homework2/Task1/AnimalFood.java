package Homework2.Task1;

public interface AnimalFood {
    void makeSound();
    default void animalFood() {
        System.out.println("Всем хорошо");
    } 
}
