package lesson.lesson16.task2;

public class LibrartBook extends Book {

    protected int shelfNumber;

    public LibrartBook() {
        super();
    }

    public LibrartBook(String title, String author, int shelfNumber) {
        super(title, author);
        this.shelfNumber = shelfNumber;
    }

    public LibrartBook(String title, String author) {
        this(title, author, -1);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Номер полки" + shelfNumber);
    }

}
