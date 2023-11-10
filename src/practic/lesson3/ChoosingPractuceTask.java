package practic.lesson3;

import java.util.Scanner;

public class ChoosingPractuceTask {

    public void task_selection(){
        System.out.println("Выберите программу которую хотите испробывать:"+
                "\n1-Вывод поры года по числу месяца"+
                "\n2-Вводимое число заканчиваеться на 3 или нет"+
                "\n3-Склонения суммы деняг в рублях"+
                "\n4-Узнать год високосный или нет");
        Scanner input=new Scanner(System.in);
        int number = input.nextInt();
        practica(number);

    }


    private static void practica(int number){

        switch (number){
            case 1:{
                TimeOfTheYear task = new TimeOfTheYear();
                task.poreoutletpore();
                break;
            }
            case 2:{
                LastDigit task = new LastDigit();
                task.examination();
                break;
            }
            case 3:{
                CaseOfMoney task = new CaseOfMoney();
                task.withdrawal_of_rubles();
                break;
            }
            case 4:{
                LeapYear task = new LeapYear();
                task.leap();
                break;
            }
        }

    }

}

