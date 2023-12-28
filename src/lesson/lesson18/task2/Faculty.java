package lesson.lesson18.task2;

import java.util.List;

public class Faculty extends UniversityMember implements Research {

    private String department;
    private List<String> coursesTeaching;
    private List<String> reserch;


    public Faculty() {
        super();
    }

    public Faculty(String name, String surname, String patronymic, String email,
                   String department, List<String> coursesTeaching) {
        super(name, surname, patronymic, email);
        this.department = department;
        this.coursesTeaching = coursesTeaching;
    }

    public Faculty(String name, String surname, String patronymic, String email,
                   String department, List<String> coursesTeaching, List<String> reserch) {
        this(name, surname, patronymic, email, department, coursesTeaching);
        this.reserch = reserch;
    }

    public void assignCourse(String course) {
        coursesTeaching.add(course);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getCoursesTeaching() {
        return coursesTeaching;
    }

    public void setCoursesTeaching(List<String> coursesTeaching) {
        this.coursesTeaching = coursesTeaching;
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
        System.out.println(" Отделение:" + department + ", Курсы преподования:" + coursesTeaching);
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
