public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4, 6);

        System.out.println(r1);
        System.out.println("Area: " + r1.area());

        System.out.println("-------------------------------");

        Book b1 = new Book();
        Book b2 = new Book("Java", "Mohammad", 2025);
        Book b3 = new Book("OOP", "Ali", 2024);
        Book b4 = new Book("C++", "Abai", 2023);

        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

//        Task 3 excution!
        System.out.println("---------------------------------------------------------");

        LibraryApp app = new LibraryApp();
        app.run();



    }
}