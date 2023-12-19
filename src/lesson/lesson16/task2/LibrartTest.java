package lesson.lesson16.task2;

import java.util.ArrayList;
import java.util.List;

public class LibrartTest {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Roty", "Петров"));
        books.add(new LibrartBook("Oiut", "Симонов", -1));
        books.add(new LibrartBook("Jort", "Кречин"));

        for (Book book : books) {
            book.displayInfo();
        }

    }

}
