package lesson.lesson18.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<UniversityMember> members = new ArrayList<>();

        members.add(new Student("Егор", "Левшунов", "Юрьевич", "benjoo@mail.ru",
                Arrays.asList("Физика", "Математика", "Защита информации")));
        members.add(new Staff("Екатерина", "Добрышева", "Александровна", "delgt@mail.ru",
                "ФизМат", "Зам"));
        members.add(new Faculty("Игорь", "Евтушенко", "Владимерович", "lopit@mail.ru",
                "ФизМат", Arrays.asList("Физика", "ВышМат")));
        members.add(new Student("Егор", "Левшунов", "Юрьевич", "benjoo@mail.ru",
                Arrays.asList("Физика", "Математика", "Защита информации"),
                Arrays.asList("Микро биологии", "В индукции")));

        for (UniversityMember member : members) {
            member.memberDetails();
        }

        conclusionResearch(members.get(3));

    }

    public static void conclusionResearch(UniversityMember members) {

        if (members instanceof Student) {
            ((Student) members).conductResearch();
        }
        if (members instanceof Faculty) {
            ((Faculty) members).conductResearch();
        }

    }

}
