package home.work.lesson12.tasks.task5;

public class Main {
    public static void main(String[] args) {

        MyCounter counter = new MyStateCounter();

        counter.add();
        counter.reduce();
        counter.reduce(5);
        counter.add(3);
        counter.outputValue();

        MyCounter counter1 = new MyStateCounter(100);

        counter1.add(10);
        counter1.reduce(10);
        counter1.add();
        counter1.reduce();
        counter1.outputValue();

    }
}
