package home.work.lesson7;


public class Deck extends Ship {

    private String deck;
    private final String[] deckView = new String[]{"Однопалубный", "Двухпалубный"};
    private final String[] typesOfContainerSingleDeck = new String[]{"2 Больших контейнера", "4 Маленьких контейнера"};
    private final String[] typesOfContainerDoubleDecker = new String[]{"4 Больших контейнера", "8 Маленьких контейнера",
            "2 Больших и 4 Маленьких контейнера"};
    private int overallDiameter;
    private String container;

    @Override
    public void creationOfName() {
        super.creationOfName();
        deck = deckView[random.nextInt(deckView.length)];
        container = determiningContainerSize(deck);
    }

    private String determiningContainerSize(String deck) {
        String container = "";
        switch (deck) {
            case "Однопалубный": {
                container = typesOfContainerSingleDeck[random.nextInt(typesOfContainerSingleDeck.length)];
                overallDiameter = 40;
                break;
            }
            case "Двухпалубный": {
                container = typesOfContainerDoubleDecker[random.nextInt(typesOfContainerDoubleDecker.length)];
                overallDiameter = 80;
                break;
            }
            default:
        }
        return container;
    }

    public int getOverallDiameter() {
        return overallDiameter;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + deck + ") (" + container + ")";
    }
}

