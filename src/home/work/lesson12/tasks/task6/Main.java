package home.work.lesson12.tasks.task6;

public class Main {
    public static void main(String[] args) {

        MyDataTime dataTime = new MyDateAndTime();

        dataTime.changesHour(5);
        dataTime.changesMinute(45);
        dataTime.changesSecond(20);
        dataTime.changesHour(100);
        dataTime.outputDataTime();

        MyDataTime dataTIme1 = new MyDateAndTime(10, 25, 100);

        dataTIme1.outputDataTime();

    }
}
