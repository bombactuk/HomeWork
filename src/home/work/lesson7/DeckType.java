package home.work.lesson7;

public enum DeckType {

    ONE_DECK("Однопалубный"),
    TWO_DECK("Двухпалубный");

    private final String title;

    DeckType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
