import java.util.Scanner;
import static java.lang.Math.*;

class Point {
    private double x, y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point a) {
        return sqrt(pow(this.x - a.x, 2) + pow(this.y - a.y, 2));
    }

    public double distance(Point a, Point b) {
        return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
    }

    public String toString() {
        return x + " " + y;
    }

}

public class b150_dienTichTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point arr[] = new Point[3];
            for (int i = 0; i < 3; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                arr[i] = new Point(x, y);
            }
            double a = arr[0].distance(arr[1]);
            double b = arr[0].distance(arr[2]);
            double c = arr[1].distance(arr[2]);
            if (a + b > c && a + c > b && b + c > a) {
                // cac phep tinh phai theo thu tu abc
                double S = (1 / 4f) * sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c));
                System.out.printf("%.2f\n", S);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
