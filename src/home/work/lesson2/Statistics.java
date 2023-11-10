package home.work.lesson2;

public class Statistics {
    private double average_salary;      // Средняя зарплата анкет
    private double average_salary1;     // Зарплата первой анкеты
    private double average_salary2;     // Зарплата второй анкеты
    private double average_salary3;     // Зарплата третьей анкеты
    private double average_age;         // Средний возраст анкет
    private double average_age1;        // Средний возраст первой анкеты
    private double average_age2;        // Средний возраст второй анкеты
    private double average_age3;        // Средний возраст третьей анкеты


    //Подсчет средней зарплаты и среднего возраста анкет и вывод
    public void average() {
        this.average_salary = (this.average_salary1 + this.average_salary2 + this.average_salary3) / 3.0;
        this.average_age = (this.average_age1 + this.average_age2 + this.average_age3) / 3.0;
        System.out.println("\nСтастистика Анкет\nСредняя зарплата анкет: " + this.average_salary +
                "\nCредний возраст анкет: " + this.average_age);
    }

    //Геттеры Сеттеры
    public void setAverage_salary(double average_salary) {
        this.average_salary = average_salary;
    }

    public double getAverage_salary() {
        return this.average_salary;
    }

    public void setAverage_salary1(double average_salary1) {
        this.average_salary1 = average_salary1;
    }

    public double getAverage_salary1() {
        return this.average_salary1;
    }

    public void setAverage_salary2(double average_salary2) {
        this.average_salary2 = average_salary2;
    }

    public double getAverage_salary2() {
        return this.average_salary2;
    }

    public void setAverage_salary3(double average_salary3) {
        this.average_salary3 = average_salary3;
    }

    public double getAverage_salary3() {
        return this.average_salary3;
    }

    public void setAverage_age(double average_age) {
        this.average_age = average_age;
    }

    public double getAverage_age() {
        return this.average_age;
    }

    public void setAverage_age1(double average_age1) {
        this.average_age1 = average_age1;
    }

    public double getAverage_age1() {
        return this.average_age1;
    }

    public void setAverage_age2(double average_age2) {
        this.average_age2 = average_age2;
    }

    public double getAverage_age2() {
        return this.average_age2;
    }

    public void setAverage_age3(double average_age3) {
        this.average_age3 = average_age3;
    }

    public double getAverage_age3() {
        return this.average_age3;
    }
}

