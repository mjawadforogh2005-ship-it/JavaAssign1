public class Book {
    private int id;
    private static int idGen;
    private String title;
    private String author;
    private int year;
    private boolean available;
    public Book() {
        id = idGen;
        idGen++;
        available = true;
    }
    public Book(String title, String author, int year) {
        id = idGen;
        idGen++;
        available = true;
        if (title != null && !title.isEmpty()) {
            this.title = title;
        }
        if (author != null && !author.isEmpty()) {
            this.author = author;
        }
        if (year >= 1500 && year <= 2100) {
            this.year = year;
        }
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        }
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        }
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year >= 1500 && year <= 2100) {
            this.year = year;
        }
    }
    public boolean isAvailable() {
        return available;
    }
    public void markAsBorrowed() {
        available = false;
    }
    public void markAsReturned() {
        available = true;
    }
    @Override
    public String toString() {
        return "ID: " + id +
                ", Title: " + title +
                ", Author: " + author +
                ", Year: " + year +
                ", Available: " + available;
    }
}
