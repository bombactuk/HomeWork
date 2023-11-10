package practic.lesson3;

import java.util.Scanner;

public class CaseOfMoney {

    public void withdrawal_of_rubles() {
        System.out.println("Введите сумму деняг: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        case_selection(number);


    }

    private static void case_selection(int number) {
        int remainder = number % 10;
        switch (remainder) {
            case 1: {
                System.out.println(number + " Рубль");
                break;
            }
            case 2, 3, 4: {
                System.out.println(number + " Рубля");
                break;
            }
            case 0, 5, 6, 7, 8, 9: {
                System.out.println(number + " Рублей");
                break;
            }
        }


    }
}
