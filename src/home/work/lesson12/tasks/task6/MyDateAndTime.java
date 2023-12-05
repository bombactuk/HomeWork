package home.work.lesson12.tasks.task6;

public class MyDateAndTime implements MyDataTime {

    private int[] dataTime;

    public MyDateAndTime() {
        dataTime = new int[]{0, 0, 0};
    }

    public MyDateAndTime(int hour, int minute, int second) {
        if(hour>24||hour<0)
            hour=0;
        if(minute>60||minute<0)
            minute=0;
        if(second>60||second<0)
            second=0;
        dataTime = new int[]{hour, minute, second};
    }

    @Override
    public void changesHour(int hour) {
        dataTime[0] += hour;
        if (dataTime[0] > 24 || dataTime[0] < 0) {
            dataTime[0] = 0;
        }
    }

    @Override
    public void changesMinute(int minute) {
        dataTime[1] += minute;
        if (dataTime[1] > 60 || dataTime[1] < 0) {
            dataTime[0] = 0;
        }
    }

    @Override
    public void changesSecond(int second) {
        dataTime[2] += second;
        if (dataTime[1] > 60 || dataTime[1] < 0) {
            dataTime[0] = 0;
        }
    }

    @Override
    public void outputDataTime() {
        System.out.println("Время " + dataTime[0] + ":" + dataTime[1] + ":" + dataTime[2]);
    }
}
