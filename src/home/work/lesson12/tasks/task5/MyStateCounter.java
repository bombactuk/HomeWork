package home.work.lesson12.tasks.task5;

public class MyStateCounter implements MyCounter {
    private int counter;
    private int size = 10;

    public MyStateCounter() {
        this.counter = size;
    }

    public MyStateCounter(int size) {
        this.size = size;
        this.counter = size;
    }

    @Override
    public boolean add() {
        if (counter + 1 > size) {
            System.out.println(Constants.ERROR);
            return false;
        } else {
            counter++;
            return true;
        }
    }

    @Override
    public boolean add(int i) {
        if (counter + i > size) {
            System.out.println(Constants.ERROR);
            return false;
        } else {
            counter += i;
            return true;
        }
    }

    @Override
    public boolean reduce() {
        if (counter - 1 < 0) {
            System.out.println(Constants.ERROR);
            return false;
        } else {
            counter--;
            return true;
        }

    }

    @Override
    public boolean reduce(int i) {
        if (counter - i < 0) {
            System.out.println(Constants.ERROR);
            return false;
        } else {
            counter -= i;
            return true;
        }
    }

    @Override
    public void outputValue() {
        System.out.println(Constants.COUNTER + counter);
    }
}
