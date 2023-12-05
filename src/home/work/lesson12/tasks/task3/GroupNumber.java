package home.work.lesson12.tasks.task3;

public enum GroupNumber {
    GROUP1(1),
    GROUP2(2),
    GROUP3(3),
    GROUP4(4),
    GROUP5(5),
    GROUP6(6),
    GROUP7(7),
    GROUP8(8),
    GROUP9(9);
    private final int number;

    GroupNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}