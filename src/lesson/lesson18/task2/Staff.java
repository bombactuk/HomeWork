package lesson.lesson18.task2;

public class Staff extends UniversityMember {

    private String department;
    private String jobTitle;

    public Staff() {
        super();
    }

    public Staff(String name, String surname, String patronymic, String email, String department, String jobTitle) {
        super(name, surname, patronymic, email);
        this.department = department;
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void memberDetails() {
        super.memberDetails();
        System.out.println(" Отдел:" + department + ", Должность:" + jobTitle);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
