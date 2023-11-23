package home.work.lesson8;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        MyList<String> name = new MyArrayList<>();
        name.add("Егор", 0);
        name.add("Женя", 1);
        name.add("Влад", 2);
        name.add("Юля", 3);
        name.add("Катя", 4);
        name.add("Андрей", 5);
        name.add("Владос", 6);
        name.add("Захар", 7);
        name.add("Шурик", 8);
        name.add("Олег", 9);
        name.add("Кирилл", 10);
        name.add("Рамиль", 11);
        name.add("Радион", 15);
        name.addAll(Arrays.asList("Светлана", "Таня"));
        name.remove("Радион");
        name.remove(0);
        System.out.println(name.isEmpty());
        System.out.println(name.contains("Захар"));
        System.out.println(name.indexOf("Рамиль"));
        name.set(15, "hello");
        name.vivod();
        System.out.println(name.get(0));
        System.out.println(name.size());
        MyList<String> name1 = new MyArrayList<>(Arrays.asList("Никита", "Вася", "Игорь"));
        name1.vivod();


    }
}
