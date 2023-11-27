package home.work.lesson7;

public class Deck extends Ship {

    private DeckType deck;
    private final DeckType[] deckView = DeckType.values();
    private final ContainerTypeSingleDeck[] typesOfContainerSingleDeck = ContainerTypeSingleDeck.values();
    private final ContainerTypeDoubleDeck[] typesOfContainerDoubleDecker = ContainerTypeDoubleDeck.values();
    private int overallDiameter;
    private String container;

    @Override
    public void creationOfName() {
        super.creationOfName();
        deck = deckView[random.nextInt(deckView.length)];
        container = determiningContainerSize(deck);
    }

    private String determiningContainerSize(DeckType deck) {
        String container = "";
        switch (deck) {
            case ONE_DECK: {
                container = typesOfContainerSingleDeck[random.nextInt(typesOfContainerSingleDeck.length)].getTitle();
                overallDiameter = 40;
                break;
            }
            case TWO_DECK: {
                container = typesOfContainerDoubleDecker[random.nextInt(typesOfContainerDoubleDecker.length)].getTitle();
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
        return super.toString() + "(" + deck.getTitle() + ") (" + container + ")";
    }

}