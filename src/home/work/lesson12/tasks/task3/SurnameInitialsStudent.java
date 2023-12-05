package home.work.lesson12.tasks.task3;

public enum SurnameInitialsStudent {
    STUDENT("Петров И.Ю."),
    STUDENT1("Левшунов Е.Ю."),
    STUDENT2("Симонова А.А."),
    STUDENT3("Сидоренко К.Д."),
    STUDENT4("Коротченко Р.А."),
    STUDENT5("Роджер Н.Р."),
    STUDENT6("Прохоренко К.А."),
    STUDENT7("Пархоменко Е.Е."),
    STUDENT8("Готыв О.А."),
    STUDENT9("Кортич Ш.О.");
    private final String title;

    SurnameInitialsStudent(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}