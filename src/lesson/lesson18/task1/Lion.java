package lesson.lesson18.task1;

import java.util.Objects;

public class Lion {

    private String name;
    private int age;
    private int energy;

    public Lion() {
    }

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100;
    }

    public void makeSound() {
        energy -= 15; // Lions use more energy to roar
    }

    public void eat() {
        energy += 20; // Lions gain more energy from eating
    }

    public void eat(int extraEnergy) {
        energy += extraEnergy;
    }

    public int getEnergy() {
        return energy;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", energy=" + energy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lion lion = (Lion) o;
        return age == lion.age && energy == lion.energy && Objects.equals(name, lion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, energy);
    }

}
