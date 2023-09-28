package Homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main implements Constants {
    public static void main(String[] args) {
        Cat cat = new Cat();
        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Мурзик", 12, "Костя"));
        cats.add(new Cat("Саймон", 5, "Анна"));
        cats.add(new Cat("Васька", 7, "Никита"));
        cats.add(new Cat("Пират", 2, "Вероника"));
        cats.add(new Cat("Белочка", 10, "Надежда"));

        cat.setName(CAT_NAME);
        cat.setAge(CAT_AGE);
        cat.setOwnerName(OWNER_NAME);

        cat.greet();

        Predicate<Integer> howOldCat = ageValue -> ageValue > OLD_CAT_AGE;
        boolean result = howOldCat.test(cat.getAge());
        if (result) {
            System.out.println(cat.getName() + ", пора на прививку!");
        }

        cat.makeSound();
        cat.makeStep();
        cat.startEating();
        cat.animalFood();

        System.out.println("\nКотики до сортировки: ");
        for (Cat item : cats) {
            System.out.println(item);
        }

        Comparator<Cat> ageComparator = Comparator.comparingInt(item -> item.getAge());
        Collections.sort(cats, ageComparator);

        System.out.println("\nПосле сортировки котиков по возрасту: ");
        for (Cat item : cats) {
            System.out.println(item);
        }
    }
}
