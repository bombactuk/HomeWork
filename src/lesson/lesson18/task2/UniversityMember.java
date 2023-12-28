package lesson.lesson18.task2;

import java.util.Objects;

public class UniversityMember {

    private String name;
    private String surname;
    private String patronymic;
    private int id;
    private String email;

    public UniversityMember() {
    }

    public UniversityMember(String name, String surname, String patronymic, String email) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.email = email;
        this.id = GenerateId.nextId();
    }

    public void memberDetails() {
        System.out.println("Имя:" + name + ", Фамилия:" + surname + ", Отчество:" + patronymic + ", Email:" + email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniversityMember that = (UniversityMember) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(patronymic, that.patronymic) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, id, email);
    }

    @Override
    public String toString() {
        return "UniversityMember{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }

}
