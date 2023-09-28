package Homework1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName("Мурзик");
        cat.setAge(2);
        cat.setOwnerName("Костя");

        cat.greet();
    }
}