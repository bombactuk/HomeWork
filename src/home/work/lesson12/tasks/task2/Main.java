package home.work.lesson12.tasks.task2;

public class Main {
    public static void main(String[] args) {

        Test2 test = new Test2();

        test.setAge(35);
        test.setName("Алекс");
        System.out.println(test);

        Test2 test1 = new Test2("Егор", 23);
        System.out.println(test1);

    }
}