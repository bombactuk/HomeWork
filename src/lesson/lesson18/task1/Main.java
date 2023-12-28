package lesson.lesson18.task1;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Lion lion = new Lion("Leo", 5);
        Elephant elephant = new Elephant("Dumbo", 10);
        Monkey monkey = new Monkey("George", 3);

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);
        zoo.simulateDay();

    }
}
