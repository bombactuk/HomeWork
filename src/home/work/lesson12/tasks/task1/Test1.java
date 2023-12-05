package home.work.lesson12.tasks.task1;


public class Test1 {
    private int oneValue;
    private int twoValue;

    public Test1() {
    }

    public Test1(int oneValue, int twoValue) {
        this.oneValue = oneValue;
        this.twoValue = twoValue;
    }

    public void changingValues(int oneValue, int twoValue) {
        this.oneValue = oneValue;
        this.twoValue = twoValue;
    }

    public int findingTheLargestValue() {
        return Math.max(oneValue, twoValue);
    }

    public int findingTheSumOfValue() {
        return oneValue + twoValue;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "oneValue=" + oneValue +
                ", twoValue=" + twoValue +
                ", Sum=" + findingTheSumOfValue() +
                ", Max=" + findingTheLargestValue() +
                '}';
    }

    public int getOneValue() {
        return oneValue;
    }

    public void setOneValue(int oneValue) {
        this.oneValue = oneValue;
    }

    public int getTwoValue() {
        return twoValue;
    }

    public void setTwoValue(int twoValue) {
        this.twoValue = twoValue;
    }
}
