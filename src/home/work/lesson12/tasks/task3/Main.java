package home.work.lesson12.tasks.task3;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[10];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println(students[i]);
        }
        students[0] = new Student(GroupNumber.GROUP1, SurnameInitialsStudent.STUDENT1, new int[]{9, 10, 10, 9, 10});
        outputStudentHighestScore(students);
    }

    public static void outputStudentHighestScore(Student[] students) {
        for (Student student : students) {
            double sum = (double) Arrays.stream(student.getAssessments()).sum() / student.getAssessments().length;
            if (sum >= 9) {
                System.out.println(Constants.HIGHEST_SCORE + student);
            }
        }
    }
}

