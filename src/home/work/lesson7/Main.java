package home.work.lesson7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Port port = new Port();
        port.withdrawalOfShipsFromPort();
        int choice = 0;
        int berth;
        String nameShip;
        while (choice != 5) {
            System.out.println(Constants.OUTPUT_MENU);
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println(Constants.ENTERING_THE_SHIP);
                    berth = input.nextInt();
                    if (berth <= 10) {
                        port.addShip(berth - 1);
                    } else {
                        System.out.println(Constants.BERTH_ENTRY_ERROR);
                    }
                    break;
                }
                case 2: {
                    System.out.println(Constants.DELETION_BY_BERTH_NUMBER);
                    berth = input.nextInt();
                    port.deleteShip(berth - 1);
                    break;
                }
                case 3: {
                    System.out.println(Constants.DELETE_BY_SHIP_NAME);
                    nameShip = input.next();
                    port.deleteShip(nameShip);
                    break;
                }
                case 4: {
                    port.withdrawalOfShipsFromPort();
                    break;
                }
                case 5: {
                    System.out.println(Constants.BYE);
                    break;
                }
                default:
            }

        }
    }
}

