package library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public static void getbooksgenre() {
        System.out.println("horror, comedy, motivational, action, romantic");
    }

    public void setBooksByGenre(String genre) {
        switch (genre.toLowerCase()) {
            case "comedy":
                this.books = comedy();
                break;
            case "horror":
                this.books = horror();
                break;
            case "action":
                this.books = action();
                break;
            case "motivational":
                this.books = motivation();
                break;
            case "romantic":
                this.books = romance();
                break;
            default:
                System.out.println("Enter a valid genre or choose from available genres.");
        }
    }

    public static List<Book> comedy() {
        return Arrays.asList(
                new Book("comedy", "Champak", "Author A", "C1", "1"),
                new Book("comedy", "Junior Times", "Author B", "C1", "2"),
                new Book("comedy", "Kidsplay", "Author C", "C1", "3"),
                new Book("comedy", "Fun Time", "Author D", "C1", "4")
        );
    }

    public static List<Book> horror() {
        return Arrays.asList(
                new Book("horror", "The Shining", "Stephen King", "H1", "1"),
                new Book("horror", "It", "Stephen King", "H1", "2"),
                new Book("horror", "Dracula", "Bram Stoker", "H1", "3"),
                new Book("horror", "The Exorcist", "William Peter Blatty", "H1", "4")
        );
    }

    public static List<Book> action() {
        return Arrays.asList(
                new Book("action", "Dune", "Frank Herbert", "A1", "1"),
                new Book("action", "Neuromancer", "William Gibson", "A1", "2"),
                new Book("action", "Hyperion", "Dan Simmons", "A1", "3"),
                new Book("action", "Snow Crash", "Neal Stephenson", "A1", "4"),
                new Book("action", "Avengers", "Stan Lee", "A1", "5")
        );
    }

    public static List<Book> motivation() {
        return Arrays.asList(
                new Book("motivational", "One Chance", "Author X", "M1", "1"),
                new Book("motivational", "Don't Quit", "Author Y", "M1", "2"),
                new Book("motivational", "You Can", "Author Z", "M1", "3"),
                new Book("motivational", "Believe", "Author W", "M1", "4")
        );
    }


    public static List<Book> romance() {
        return Arrays.asList(
                new Book("romantic", "Half Girlfriend", "Chetan Bhagat", "R1", "1"),
                new Book("romantic", "AIEWIY", "Author J", "R1", "2"),
                new Book("romantic", "Me Before You", "Jojo Moyes", "R1", "3"),
                new Book("romantic", "Pride and Prejudice", "Jane Austen", "R1", "4")
        );
    }

    public Book get(int index) {
        return books.get(index);
    }

    public int size() {
        return books.size();
    }
}
