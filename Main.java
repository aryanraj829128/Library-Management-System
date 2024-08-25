package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your favourite genre ");
        String genre = scanner.nextLine();

        library.setBooksByGenre(genre);

        if (library.size() == 0) {
            System.out.println("No books found for the genre " + genre);
            return;
        }

        System.out.println("Here are some books in the " + genre + " genre:");
        for (int i = 0; i < library.size(); i++) {
            System.out.println((i + 1) + ". " + library.get(i).getTitle());
        }

        System.out.println("Enter the number corresponding to the book you want to choose:");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > library.size()) {
            System.out.println("Invalid choice.");
            return;
        }

        Book selectedBook = library.get(choice - 1);

        System.out.println("You chose: " + selectedBook.getTitle());
        System.out.println("Location ID: " + selectedBook.getLocationid());
        System.out.println("Position: " + selectedBook.getPosition());
    }
}
