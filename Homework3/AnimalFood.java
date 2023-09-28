package Homework3;

public interface AnimalFood {
    void makeSound();
    default void animalFood() {
        System.out.println("Всем хорошо");
    } 
}
