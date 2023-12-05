package home.work.lesson12.tasks.task1;

public class Main {

    public static void main(String[] args) {

        Test1 test = new Test1();

        test.setOneValue(10);
        test.setTwoValue(15);
        System.out.println(test);

        Test1 test1 = new Test1(20, 35);

        test1.changingValues(10, 35);
        System.out.println(test1);

    }
}