package practic.lesson3;

import java.util.Scanner;

public class LeapYear {

    public void leap(){
        System.out.println("Введите год:");
        Scanner input=new Scanner(System.in);
        int number = input.nextInt();
        calculation(number);

    }


    private static void calculation(int number){
        String leapyear="ве високосным";
        if(number%4==0){
            leapyear="високосным";
        }
        if (number%100==0){
            leapyear="не високосным";
        }
        if (number%400==0){
            leapyear="високосным";
        }
        System.out.println(number + " Год являеться "+ leapyear);

    }

}
