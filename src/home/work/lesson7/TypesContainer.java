package home.work.lesson7;

public enum TypesContainer {

    SQUARE("Квадратные"),
    CYLINDRICAL("Цилиндрические"),
    CONE("Конусные");

    private final String title;

    TypesContainer(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
