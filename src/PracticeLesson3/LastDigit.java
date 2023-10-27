package PracticeLesson3;

import java.util.Scanner;

public class LastDigit {

    public void examination(){
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        number%=10;
        if(number==3){
            System.out.println("Последняя цифра этого числа равна 3");
        }else {
            System.out.println("Последняя цифра этого числа не равна 3");
        }

    }

}
