package practic.lesson6;

public class Main {


    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone1 = new Phone(375253485483L, "Apple");
        Phone phone2 = new Phone(375293432444L, "Huawei", 2);
        phone.outputPhone();
        phone1.outputPhone();
        phone2.outputPhone();
        outputPhone(phone, phone1, phone2);

    }

    public static void outputPhone(Object... kitPhone) {
        for (Object n : kitPhone) {
            System.out.println(n);
        }

    }


}