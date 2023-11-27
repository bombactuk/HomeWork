package home.work.lesson7;

public class Port {

    private final Ship[] ships = new Ship[10];
    private final long[] waterOnThePiers = new long[10];
    private final String[] nameShip = new String[10];

    public Ship creationOfShips() {
        Ship container = new Container();
        container.creationOfName();
        return container;
    }

    public void addShip(int berth) {
        if (ships[berth] == null) {
            ships[berth] = creationOfShips();
            waterOnThePiers[berth] = ships[berth].getWaterInContainers();
            nameShip[berth] = ships[berth].getName();
        } else {
            System.out.println(Constants.POSITION_AT_THE_MERCH);
        }
    }

    public void deleteShip(int berth) {
        ships[berth] = null;
        waterOnThePiers[berth] = 0;
    }

    public void deleteShip(String nameDeleteShip) {
        for (int i = 0; i < ships.length; i++) {
            if (nameDeleteShip.equals(nameShip[i])) {
                ships[i] = null;
                waterOnThePiers[i] = 0;
            }
        }
    }

    public void withdrawalOfShipsFromPort() {
        long totalAmountOfWater = 0;
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] == null) {
                System.out.println(Constants.BERTH_NUMBER + (i + 1) + ": Пустой ");
            } else {
                System.out.println(Constants.BERTH_NUMBER + (i + 1) + ": Корабль " + ships[i]);
            }
            totalAmountOfWater += waterOnThePiers[i];
        }
        System.out.println(Constants.TOTAL_MASS_OF_WATER + totalAmountOfWater + " литров");
    }

    public Port() {

    }

}