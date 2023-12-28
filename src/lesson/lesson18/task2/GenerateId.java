package lesson.lesson18.task2;

public class GenerateId {

    private GenerateId() {
    }

    private static int nextId = 1;

    public static int nextId() {
        return nextId++;
    }

}
