package home.work.lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<String> strings1 = new MyArrayList<>();
        strings1.add("Егор", 0);
        strings1.add("Женя", 1);
        strings1.add("Влад", 2);
        strings1.add("Юля", 3);
        strings1.add("Катя", 4);
        strings1.add("Андрей", 5);
        strings1.add("Владос", 6);
        strings1.add("Захар", 7);
        strings1.add("Шурик", 8);
        strings1.add("Олег", 9);
        strings1.add("Кирилл", 10);
        strings1.add("Рамиль", 11);
        strings1.add("Радион", 15);
        strings1.addAll(Arrays.asList("Светлана", "Таня"));
        strings1.remove("Радион");
        strings1.remove(0);
        System.out.println(strings1.isEmpty());
        System.out.println(strings1.contains("Захар"));
        System.out.println(strings1.indexOf("Рамиль"));
        strings1.set(15, "hello");
        strings1.vivod();
        System.out.println(strings1.get(0));
        System.out.println(strings1.size());


    }
}
