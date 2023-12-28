package lesson.lesson18.task1;

import java.util.Objects;

public class Monkey {

    private String name;
    private int age;
    private int energy;

    public Monkey() {
    }

    public Monkey(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100;
    }

    public void makeSound() {
        energy -= 5;
    }

    public void eat() {
        energy += 10;
    }

    public void eat(int extraEnergy) {
        energy += extraEnergy;
    }

    public int getEnergy() {
        return energy;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", energy=" + energy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monkey monkey = (Monkey) o;
        return age == monkey.age && energy == monkey.energy && Objects.equals(name, monkey.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, energy);
    }

}
