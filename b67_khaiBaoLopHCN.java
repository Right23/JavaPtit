import java.util.Scanner;

class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double h, double w, String col) {
        this.height = h;
        this.width = w;
        this.color = col;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public String getColor() {
        return this.color.substring(0, 1).toUpperCase() + this.color.substring(1).toLowerCase();
    }

    public void setColor(String col) {
        this.color = col;
    }

    double findArea(Rectangle a) {
        return a.getWidth() * a.getHeight();
    }

    double findPerimeter() {
        return 2 * (this.height + this.width);
    }

}

public class b67_khaiBaoLopHCN {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();
        Rectangle a = new Rectangle(height, width, color);
        if (a.getHeight() > 0 && a.getWidth() > 0) {
            System.out.println((int) a.findPerimeter() + " " + (int) a.findArea(a) + " " + a.getColor());
        } else {
            System.out.println("INVALID");
        }
    }
}
