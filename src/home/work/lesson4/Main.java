package home.work.lesson4;

import java.util.Random;

public class Main {

    static Random random = new Random();
    static String[] name = new String[]{
            "Симба",
            "Боня",
            "Максик",
            "Марсик",
            "Барсик",
            "Пушок",
            "Рыжик",
            "Тима",
            "Буся"};

    public static void main(String[] args) {
        toWhile();
        toFor();
        toDoWhile();
    }

    public static void toFor() {
        String[] cats = new String[10];
        for (int i = 0; i < cats.length; i++) {
            Cat cat = new Cat(0, "");
            cat.setAge(random.nextInt(28));
            cat.setName(name[random.nextInt(name.length)]);
            cats[i] = Constants.CAT + Constants.AGE + cat.getAge() + Constants.NAME + cat.getName();
        }
        for (String i : cats) {
            System.out.println(i);
        }
    }

    public static void toWhile() {
        Cat[] cats = new Cat[10];
        int i = 0;
        while (i < cats.length) {
            cats[i] = new Cat(12, "Симба");
            System.out.println(cats[i]);
            i++;
        }
    }

    public static void toDoWhile() {
        Cat[] cats = new Cat[10];
        int i = 0;
        do {
            cats[i] = new Cat(random.nextInt(28), name[random.nextInt(name.length)]);
            System.out.println(cats[i]);
            i++;
        } while (i < cats.length);
    }
}
