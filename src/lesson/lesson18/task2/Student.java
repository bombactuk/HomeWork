package lesson.lesson18.task2;

import java.util.List;

public class Student extends UniversityMember implements Research {

    private List<String> courseList;
    private List<String> reserch;

    public Student() {
        super();
    }

    public Student(String name, String surname, String patronymic, String email, List<String> courseList) {
        super(name, surname, patronymic, email);
        this.courseList = courseList;
    }

    public Student(String name, String surname, String patronymic, String email, List<String> courseList,
                   List<String> reserch) {
        this(name, surname, patronymic, email, courseList);
        this.reserch = reserch;
    }

    public void addCourse(String course) {
        courseList.add(course);
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    public List<String> getReserch() {
        return reserch;
    }

    public void setReserch(List<String> reserch) {
        this.reserch = reserch;
    }

    @Override
    public void memberDetails() {
        super.memberDetails();
        System.out.println(" Курсы:" + courseList);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean conductResearch() {

        if (reserch != null) {
            System.out.println("Исследование: " + reserch);
            return true;
        } else {
            return false;
        }

    }
}
