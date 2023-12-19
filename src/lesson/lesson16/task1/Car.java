package lesson.lesson16.task1;

public class Car extends Vehicle {

    private String carBrand;

    public Car() {
    }

    public Car(String vehicleType, int numberOfWhells, String carBrand) {
        super(vehicleType, numberOfWhells);
        this.carBrand = carBrand;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Бренд машины" + carBrand);
    }
}
