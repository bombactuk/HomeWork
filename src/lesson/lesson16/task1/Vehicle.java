package lesson.lesson16.task1;

import java.util.Objects;

public class Vehicle {

    private String vehicleType;
    private int numberOfWhells;

    public Vehicle() {
        super();
    }

    public Vehicle(String vehicleType, int numberOfWhells) {
        this.vehicleType = vehicleType;
        this.numberOfWhells = numberOfWhells;
    }

    public void displayInfo() {
        System.out.println("Тип : " + vehicleType + " Количество колес: " + numberOfWhells);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return numberOfWhells == vehicle.numberOfWhells && Objects.equals(vehicleType, vehicle.vehicleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleType, numberOfWhells);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType + '\'' +
                ", numberOfWhells=" + numberOfWhells +
                '}';
    }

}
