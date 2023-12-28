package lesson.lesson18.task1;

import java.util.ArrayList;
import java.util.Objects;

public class Zoo {
    private ArrayList<Object> animals = new ArrayList<>();

    public Zoo() {
    }

    public void addAnimal(Object animal) {
        animals.add(animal);
    }

    public void simulateDay() {

        for (Object animal : animals) {

            if (animal instanceof Lion) {
                ((Lion) animal).makeSound();
            }
            if (animal instanceof Monkey) {
                ((Monkey) animal).makeSound();
            }
            if (animal instanceof Elephant) {
                ((Elephant) animal).makeSound();
            }

        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(animals, zoo.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animals);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }

}
