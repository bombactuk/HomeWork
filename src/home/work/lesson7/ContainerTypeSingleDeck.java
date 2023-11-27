package home.work.lesson7;

public enum ContainerTypeSingleDeck {

    LARGE_CONTAINER("2 Больших контейнера"),
    SMALL_CONTAINER("4 Маленьких контейнера");

    private final String title;

    ContainerTypeSingleDeck(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
