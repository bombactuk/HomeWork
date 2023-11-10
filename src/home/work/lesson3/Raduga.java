package home.work.lesson3;

import java.util.Scanner;

public class Raduga {

    private static final String RED="Красный";                      //Цвет радуги красный
    private static final String RED_ORANGE="Красно-оранжевый";      //Цвет радуги красно-оранжевый
    private static final String ORANGE="Оранжевый";                 //Цвет радуги оранжевый
    private static final String ORANGE_YELLOW="Оранжево-желтый";    //Цвет радуги оранжево-желтый
    private static final String YELLOW="Желтый";                    //Цвет радуги желтый
    private static final String YELLOW_GREEN="Желто-зелёный";       //Цвет радуги желто-зеленый
    private static final String GREEN="Зелёный";                    //Цвет радуги зелёный
    private static final String GREEN_BLUE="Зелёно-голубой";        //Цвет радуги зелено-голубой
    private static final String BLUE="Голубой";                     //Цвет радуги голубой
    private static final String BLUE_DBLUE="Голубо-синий";          //Цвет радуги голубо-синий
    private static final String DARK_BLUE="Синий";                  //Цвет радуги синий
    private static final String DBLUE_VIOLET="Сине-фиолетовый";     //Цвет радуги сине-фиолетовый
    private static final String VIOLET="Фиолетовый";                //Цвет радуги фиолетовый

    public void color_output(){

//Вывод списка цветов памятка
        System.out.println("Список цветов радуги:"+
                "\n1)"+RED+
                "\n2)"+RED_ORANGE+
                "\n3)"+ORANGE+
                "\n4)"+ORANGE_YELLOW+
                "\n5)"+YELLOW+
                "\n6)"+YELLOW_GREEN+
                "\n7)"+GREEN+
                "\n8)"+GREEN_BLUE+
                "\n9)"+BLUE+
                "\n10)"+BLUE_DBLUE+
                "\n11)"+DARK_BLUE+
                "\n12)"+DBLUE_VIOLET+
                "\n13)"+VIOLET);

//Вывод цвета который выбрал пользователь
        System.out.println("\nВведите цифру цвета которого хотите вывести на экран."+
                "\nВвод цифры:-");

        //Ввод номера цвета  пользователемм
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt();
        printColor(number);

//Вывод благодарности за отзыв
        System.out.println("\nОставте отзыв. Вам понравилось (Да/Нет)"+
                "\nВвод отзыва:-");

        //Ввод отзыва пользователя
        Scanner scanner1 = new Scanner(System.in);
        String review = scanner1.nextLine();
        inputReview(review);

    }

    //Проверка номера с цветом
    private static void printColor(int number) {
        switch (number) {
            case 1: {
                System.out.println("Вы выбрали цвет радуги:-"+RED);
                break;
            }
            case 2: {
                System.out.println("Вы выбрали цвет радуги:-"+RED_ORANGE);
                break;
            }
            case 3: {
                System.out.println("Вы выбрали цвет радуги:-"+ORANGE);
                break;
            }
            case 4: {
                System.out.println("Вы выбрали цвет радуги:-"+ORANGE_YELLOW);
                break;
            }
            case 5: {
                System.out.println("Вы выбрали цвет радуги:-"+YELLOW);
                break;
            }
            case 6: {
                System.out.println("Вы выбрали цвет радуги:-"+YELLOW_GREEN);
                break;
            }
            case 7: {
                System.out.println("Вы выбрали цвет радуги:-"+GREEN);
                break;
            }
            case 8: {
                System.out.println("Вы выбрали цвет радуги:-"+GREEN_BLUE);
                break;
            }
            case 9: {
                System.out.println("Вы выбрали цвет радуги:-"+BLUE);
                break;
            }
            case 10: {
                System.out.println("Вы выбрали цвет радуги:-"+BLUE_DBLUE);
                break;
            }
            case 11: {
                System.out.println("Вы выбрали цвет радуги:-"+DARK_BLUE);
                break;
            }
            case 12: {
                System.out.println("Вы выбрали цвет радуги:-"+DBLUE_VIOLET);
                break;
            }
            case 13: {
                System.out.println("Вы выбрали цвет радуги:-"+VIOLET);
                break;
            }
            default: {
                System.out.println("Цифра не подошла ни к одному цвету!");
            }
        }
    }

    private static void inputReview(String review){
        String yes ="Да";

        if(review.equals(yes)){
            System.out.println("Спасибо за ваш отзыв");
        }else{
            System.out.println("Спасибо, будем стараться улучшать программу");
        }
    }



}
