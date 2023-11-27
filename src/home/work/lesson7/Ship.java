package home.work.lesson7;

import java.util.Random;

public class Ship {

    protected final Random random = new Random();
    private NameShip nameShip;
    private final NameShip[] nameShips = NameShip.values();
    private long waterInContainers;

    public void creationOfName() {
        nameShip = nameShips[random.nextInt(nameShips.length)];
    }

    @Override
    public String toString() {
        return nameShip.getTitle() + " ";
    }

    public long getWaterInContainers() {
        return waterInContainers;
    }

    public void setWaterInContainers(long waterInContainers) {
        this.waterInContainers = waterInContainers;
    }

    public NameShip getNameShip() {
        return nameShip;
    }

}