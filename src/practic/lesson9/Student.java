package practic.lesson9;


import java.util.List;

public class Student {
    private String name;
    private String group;
    private int well;
    private List<Integer> points;

    Student() {

    }

    Student(String name, String group, int well, List<Integer> points) {
        this.name = name;
        this.group = group;
        this.well = well;
        this.points = points;

    }

    public List<Integer> getPoints() {
        return points;
    }

    public void setPoints(List<Integer> balls) {
        this.points = points;
    }

    public int getWell() {
        return well;
    }

    public void setWell(int kyrs) {
        this.well = well;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grup='" + group + '\'' +
                ", kyrs=" + well +
                ", balls=" + points +
                '}';
    }
}
