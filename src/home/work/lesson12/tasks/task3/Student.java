package home.work.lesson12.tasks.task3;

import java.util.Arrays;
import java.util.Random;

public class Student {

    private final SurnameInitialsStudent surnameInitial;
    private final GroupNumber groupNumber;
    private int[] assessments = new int[5];

    public Student() {
        SurnameInitialsStudent[] surnameInitialsStudents = SurnameInitialsStudent.values();
        GroupNumber[] groupNumbers = GroupNumber.values();
        Random random = new Random();
        this.surnameInitial = surnameInitialsStudents[random.nextInt(surnameInitialsStudents.length)];
        this.groupNumber = groupNumbers[random.nextInt(groupNumbers.length)];
        for (int i = 0; i < assessments.length; i++) {
            this.assessments[i] = random.nextInt(10);
        }
    }

    public Student(GroupNumber groupNumber, SurnameInitialsStudent surnameInitial, int[] assessments) {
        this.groupNumber = groupNumber;
        this.surnameInitial = surnameInitial;
        this.assessments = assessments;
    }


    @Override
    public String toString() {
        return Constants.STUDENT +
                Constants.SURNAME_INITIALS + surnameInitial.getTitle() +
                Constants.NUMBER_GROUP + groupNumber.getNumber() +
                Constants.ASSESSMENTS + Arrays.toString(assessments)
                ;
    }

    public int[] getAssessments() {
        return assessments;
    }
}

