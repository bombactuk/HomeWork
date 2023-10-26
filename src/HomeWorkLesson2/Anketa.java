package HomeWorkLesson2;


public class Anketa {
    public double salary;           // средняя зарплата
    public byte age;                // возраст
    private String fio;             // Фамилия,имя,отчество
    private String gender;          // Пол
    private String citizenship;     // Гражданство
    private String address;         // Адрес место жительства
    private String education;       // Образование
    private String name_oe;         // Наименование очебного заведения
    private String profession;      // Профессия
    private String last_job;        //  Последнее место работы
    private int number;             //  Номер телефона
    private static final String CONDUCTING = "Анкета:";     //Заголовок анкеты

    //Вывод информации анкеты
    public void workers() {
        System.out.println("\nАнкета:" +
                "\nФИО: " + this.fio +
                "\nВозраст: " + this.age +
                "\nПол: " + this.gender +
                "\nГражданство: " + this.citizenship +
                "\nАдрес места жительства(пребывания): " + this.address +
                "\nНомер телефона: " + this.number +
                "\nОбразование: " + this.education +
                "\nНаименование учебного заведения: " + this.name_oe +
                "\nПрофессия(специальность): " + this.profession +
                "\nПоследнее место работы: " + this.last_job +
                "\nСредняя зарплата: " + this.salary + "р.");
    }


    //Геттеры Сеттеры
    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return this.fio;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getCitizenship() {
        return this.citizenship;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEducation() {
        return this.education;
    }

    public void setName_oe(String name_oe) {
        this.name_oe = name_oe;
    }

    public String getName_oe() {
        return this.name_oe;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setLast_job(String last_job) {
        this.last_job = last_job;
    }

    public String getLast_job() {
        return this.last_job;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return this.age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }
}

