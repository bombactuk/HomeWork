package lesson.lesson16.task1;

public class Bicycle extends Vehicle {

    private String bicycleType;

    public Bicycle() {
        super();
    }

    public Bicycle(String vehicleType, int numberOfWhells,String bicycleType) {
        super(vehicleType, numberOfWhells);
        this.bicycleType=bicycleType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Велосипед: " + bicycleType);
    }
}
