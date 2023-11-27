package home.work.lesson7;

public enum ContainerTypeDoubleDeck {

    LARGE_CONTAINER("4 Больших контейнера"),
    SMALL_CONTAINER("8 Маленьких контейнера"),
    BIG_AND_SMALL_CONTAINER("2 Больших и 4 Маленьких контейнера");

    private final String title;

    ContainerTypeDoubleDeck(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}

