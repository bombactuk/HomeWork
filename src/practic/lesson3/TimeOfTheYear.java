package practic.lesson3;

import java.util.Scanner;

public class TimeOfTheYear {

    public void poreoutletpore(){
        System.out.print("Введите число месяца: ");
        Scanner timenumber = new Scanner(System.in);
        int number=timenumber.nextInt();
        System.out.println("Пора года: ");
        scanyear(number);
    }

    private static void scanyear(int number){

        switch (number){
            case 1,2,12:{
                System.out.println("Зима");
                break;
            }
            case 3,4,5:{
                System.out.println("Весна");
                break;
            }
            case 6,7,8:{
                System.out.println("Лето");
                break;
            }
            case 9,10,11:{
                System.out.println("Осень");
                break;
            }
        }

    }

}