package lesson.lesson16.task1;

import java.util.ArrayList;
import java.util.List;

public class Transportation {
    public static void main(String[] args) {

        List<Vehicle> vehicle = new ArrayList<>();

        vehicle.add(new Car("Машина", 4, "Пежо"));
        vehicle.add(new Bicycle("Велосипед", 2, "Горник"));

        for (Vehicle i : vehicle) {
            i.displayInfo();
        }

    }
}
