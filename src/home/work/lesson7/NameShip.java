package home.work.lesson7;

public enum NameShip {

    QUIZ("Quiz"),
    FLYING("Flying Dutchman"),
    AQUAMARINA("AquaMarina"),
    PINT("Pint"),
    BISMARCK("Bismarck"),
    NAUTILUS("Nautilus"),
    GOLDEN("Golden Hind"),
    ENTERPRISE("Enterprise"),
    LUSITANIA("Lusitania"),
    TITANIC("Titanic");

    private final String title;

    NameShip(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
