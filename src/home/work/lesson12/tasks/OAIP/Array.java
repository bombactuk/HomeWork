package home.work.lesson12.tasks.OAIP;

public class Array {

    private int[] array;

    public Array() {
        array = new int[10];
    }

    public Array(int size) {
        array = new int[size];
    }

    public void addValue(int index, int value) {
        int[] tempory;
        if (value > 0) {
            if (index >= array.length) {
                tempory = array;
                array = new int[index];
                System.arraycopy(tempory, 0, array, 0, tempory.length);
                array[index - 1] = value;
            } else {
                if (array[index - 1] == 0) {
                    array[index - 1] = value;
                } else {
                    tempory = array;
                    array = new int[array.length + 1];
                    System.arraycopy(tempory, 0, array, 0, index - 1);
                    array[index - 1] = value;
                    System.arraycopy(tempory, index - 1, array, index, array.length - index);
                }
            }
        }
    }

    public void print() {
        for (int i : array) {
            System.out.println(i);
        }
    }

}
