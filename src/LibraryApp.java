import java.util.ArrayList;
import java.util.Scanner;
public class LibraryApp {

    private ArrayList<Book> books;
    private Scanner scanner;

    public LibraryApp() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        int choice;

        do {
            System.out.println("\nWelcome to Library App!");
            System.out.println("1. Print all books");
            System.out.println("2. Add new book");
            System.out.println("3. Search books by title");
            System.out.println("4. Borrow a book");
            System.out.println("5. Return a book");
            System.out.println("6. Delete a book by id");
            System.out.println("7. Quit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printAllBooks();
                    break;
                case 2:
                    addNewBook();
                    break;
                case 3:
                    searchByTitle();
                    break;
                case 4:
                    borrowBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    deleteBook();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);
    }

    private void printAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }


    private void addNewBook() {
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        Book book = new Book(title, author, year);
        books.add(book);

        System.out.println("Book added.");
    }

    private void searchByTitle() {
        System.out.print("Enter part of the title: ");
        String search = scanner.nextLine().toLowerCase();

        boolean found = false;


        for (Book b : books) {
            if (b.getTitle() != null &&
                    b.getTitle().toLowerCase().contains(search)) {
                System.out.println(b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching books found.");
        }
    }

    private void borrowBook() {
        System.out.print("Enter book id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Book b : books) {
            if (b.getId() == id) {
                if (b.isAvailable()) {
                    b.markAsBorrowed();
                    System.out.println("Book borrowed.");
                } else {
                    System.out.println("Book is already borrowed.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    private void returnBook() {
        System.out.print("Enter book id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Book b : books) {
            if (b.getId() == id) {
                if (!b.isAvailable()) {
                    b.markAsReturned();
                    System.out.println("Book returned.");
                } else {
                    System.out.println("Book was not borrowed.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    private void deleteBook() {
        System.out.print("Enter book id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                System.out.println("Book deleted.");
                return;
            }
        }

        System.out.println("Book not found.");
    }
}
