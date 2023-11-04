package HomeWorkLessonNew5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print(Constants.ENTERING_SIZE);
        Scanner input = new Scanner(System.in);
        Matrix matrix = new Matrix(input.nextInt());
        matrix.outputOfAllTasks();
    }

}