package home.work.lesson2;

public class Main {
    static long ynp = 4859285942345242134L;             //унп компании
    static short year_company = 2012;                   //год основания компании

    public Main() {
    }

    public static void main(String[] args) {

        String name_company = "ОАО АнкетЖОБ";
        char symbol_number = 8470;

        //Вывод описания компании
        System.out.println(name_company +
                            "\nПочтовый индекс: " + ynp +
                            "\nГод основания компании: " + year_company +
                            "\n" + symbol_number +
                            "1 в Гомеле");

        //Вывод и занесение данных в анкетуномер 1
        Anketa person1 = new Anketa();
        person1.setFio("Левшунов Егор Юрьевич");
        person1.setAge((byte)23);
        person1.setGender("Муж");
        person1.setCitizenship("РФ");
        person1.setAddress("г.Гомелью, ул. Кожара 41");
        person1.setNumber(899311854);
        person1.setEducation("Высшее профессиональное");
        person1.setName_oe("РОАТ МИИТ, г.Москва");
        person1.setProfession("Техник-программист");
        person1.setLast_job("ОАО Гомельский ДСК");
        person1.setSalary(2500.65);
        person1.workers();

        //Вывод и занесение данных в анкету номер 2
        Anketa person2 = new Anketa();
        person2.setFio("Петров Иван Адреевич");
        person2.setAge((byte)29);
        person2.setGender("Муж");
        person2.setCitizenship("РБ");
        person2.setAddress("г.Гомелью, ул. Мазурова 41");
        person2.setNumber(896342854);
        person2.setEducation("Среднее профессиональное");
        person2.setName_oe("Машиностроительный Колледж, г.Гомель");
        person2.setProfession("Техник-инженер");
        person2.setLast_job("ОАО ЗЛИН");
        person2.setSalary(1940.32);
        person2.workers();

        //Вывод и занесение данных в анкету номер 3
        Anketa person3 = new Anketa();
        person3.setFio("Алексеенко Даша Адреевна");
        person3.setAge((byte)21);
        person3.setGender("Жен");
        person3.setCitizenship("РБ");
        person3.setAddress("г.Гомелью, ул. Давыдовская 41");
        person3.setNumber(896366854);
        person3.setEducation("Среднее профессиональное");
        person3.setName_oe("Железнодорожный Колледж, г.Гомель");
        person3.setProfession("Бухгалтер");
        person3.setLast_job("ОАО Мясокомбинат");
        person3.setSalary(1056.06);
        person3.workers();

        //Вывод статистики анкет
        Statistics number1 = new Statistics();
        number1.setAverage_age1((double)person1.age);
        number1.setAverage_age2((double)person2.age);
        number1.setAverage_age3((double)person3.age);
        number1.setAverage_salary1(person1.salary);
        number1.setAverage_salary2(person2.salary);
        number1.setAverage_salary3(person3.salary);
        number1.average();
    }
}