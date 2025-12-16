//first Task
public class Rectangle {
    private double width;
    private double height;
    private int id;
    static int idGen;
    public Rectangle() {
        width = 3.0;
        height = 7.0;
        id = ++idGen;
    }
    public Rectangle( double width, double height) {
this();
setWidth(width);
setHeight(height);
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0)
            throw new IllegalArgumentException("please put a number bigger than 0");
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0)
            throw new IllegalArgumentException("give this one also bigger than 0");
        this.height = height;
    }
    public double area(){
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
    @Override
    public String toString() {
        return "Rectangle [id=" + id + ", width=" + width + ", height=" + height + "]";
    }

}
