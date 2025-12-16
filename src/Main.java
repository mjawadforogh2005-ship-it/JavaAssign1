public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4, 6);

        System.out.println(r1);
        System.out.println("Area: " + r1.area());

        System.out.println(r2);
        System.out.println("Perimeter: " + r2.perimeter());
    }
}