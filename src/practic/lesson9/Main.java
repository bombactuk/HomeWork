package practic.lesson9;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int well;
        Student student = new Student("Вася", "ФизМат", 2, Arrays.asList(2, 3, 4, 5, 6, 7, 1, 8, 10));
        Student student1 = new Student("Иван", "Экономист", 1, Arrays.asList(7, 5, 3, 2, 1, 1, 6, 5, 10));
        Student student2 = new Student("Николай", "Программист", 3, Arrays.asList(5, 4, 2, 1, 5, 3, 7, 8, 1));
        Student student3 = new Student("Рома", "Экономист", 2, Arrays.asList(1, 2, 4, 1, 1, 3, 3, 3, 1));
        Student student4 = new Student("Иван", "Программист", 1, Arrays.asList(2, 3, 1, 1, 1, 1, 7, 4, 1));
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(student);
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);

        expulsionOfStudentForPoorAcademicPerformance(studentsList);
        moveToTheNextCourse(studentsList);
        studentsList.forEach(System.out::println);
        System.out.println("Введите номер курса");
        well = input.nextInt();
        printStudents(studentsList, well);
    }

    public static void printStudents(List<Student> studentsList, int well) {
        for (Student student : studentsList) {
            if (student.getWell() == well) {
                System.out.println("\n" + student);
            }

        }
    }

    public static void moveToTheNextCourse(List<Student> studentsList) {
        for (int i = 0; i < studentsList.size(); i++) {
            studentsList.get(i).setWell(studentsList.get(i).getWell() + 1);
        }
    }

    public static void expulsionOfStudentForPoorAcademicPerformance(List<Student> studentsList) {
        ListIterator<Student> iteratorStudent = studentsList.listIterator();
        while (iteratorStudent.hasNext()) {
            int totalPoints = 0;
            int numberOfItems = 0;
            ListIterator<Integer> iteratorPoint = iteratorStudent.next().getPoints().listIterator();
            while (iteratorPoint.hasNext()) {
                totalPoints += iteratorPoint.next();
                numberOfItems++;
            }
            double averageRating = totalPoints / numberOfItems;
            if (averageRating < 3) {
                iteratorStudent.remove();
            }
        }
    }

}

