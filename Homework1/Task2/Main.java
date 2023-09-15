package Homework1.Task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8,5);
        System.out.println("Площадь = " + rectangle.calculateArea(rectangle.getWidth(), rectangle.getHeight()));
        System.out.println("Периметр = " + rectangle.calculatePerimeter(rectangle.getWidth(), rectangle.getHeight()));

    }
}