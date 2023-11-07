package PracticLesson6;


import java.util.Random;

public class Phone {
    private final Random random = new Random();
    private long number;
    private String model;
    private int weight;


    public void outputPhone() {
        String[] names = new String[]{"Катя", "Паша", "Андрей", "Дима", "Олег", "Наташа", "Арина", "Евгений", "Таня"};
        Long[] numbers = new Long[]{375255874567L, 375294758657L, 375445769285L, 375292475847L};
        String name = names[random.nextInt(names.length)];
        receiveCall(name);
        getNumber(number);
        receiveCall(number, name);
        sendMessage(numbers[random.nextInt(numbers.length)], numbers[random.nextInt(numbers.length)], numbers[random.nextInt(numbers.length)]);
    }

    private void sendMessage(long... numbers) {
        System.out.println(Constants.NUMBERS_PHONE_MESSAGE);
        for (long n : numbers) {
            System.out.println("+" + n);
        }

    }

    private void getNumber(long number) {
        System.out.println(Constants.NUMBER_PHONE + number);

    }

    private void receiveCall(String name) {
        System.out.println("\n" + Constants.PHONE_RINGS + name);

    }

    private void receiveCall(long number, String name) {
        System.out.println(Constants.PHONE_RINGS + name +
                Constants.NUMBER_PHONE + number);
    }

    @Override
    public String toString() {
        return "\n" + Constants.NUMBER_PHONE + number +
                Constants.MODEL_PHONE + model +
                Constants.WEIGHT_PHONE + weight;
    }

    public Phone() {

    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(long number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

}
