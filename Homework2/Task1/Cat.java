package Homework2.Task1;

class Cat extends Owner implements AnimalFood,GoingMarker, StartEating {
    private String name;
    private Integer age;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void greet() {
        if (getOwnerName() != null) {
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец " + getOwnerName() + ".");
        } else {
            System.out.println("Вы не указали имя владельца");
        }
    }
    @Override
    public void makeSound() {
        System.out.println(name + " говорит Мяу!" + "\n" + getOwnerName() + " зовет " + name + "а.");
    }

    @Override
    public void animalFood() {
        AnimalFood.super.animalFood();
    }

    @Override
    public void makeStep() {
        System.out.println(name + " идет в сторону " + getOwnerName() + "а.");
    }

    @Override
    public void startEating() {
        System.out.println(getOwnerName() + " кормит " + name + "а.");
    }
}