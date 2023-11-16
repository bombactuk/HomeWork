package home.work.lesson7;

import java.util.Random;

public class Ship {
    protected final Random random = new Random();
    private String nameShip;
    private long waterInContainers;
    private final String[] shipNames = new String[]{"Quiz", "Flying Dutchman", "AquaMarina",
            "Pint", "Bismarck", "Nautilus", "Golden Hind", "Enterprise", "Lusitania", "Titanic"};

    public void creationOfName() {
        nameShip = shipNames[random.nextInt(shipNames.length)];
    }


    public Ship() {
    }

    @Override
    public String toString() {
        return nameShip + " ";
    }

    public long getWaterInContainers() {
        return waterInContainers;
    }

    public void setWaterInContainers(long waterInContainers) {
        this.waterInContainers = waterInContainers;
    }

    public String getName() {
        return nameShip;
    }

    public void setName(String name) {
        this.nameShip = name;
    }
}