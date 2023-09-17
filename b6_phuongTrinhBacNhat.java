import java.util.Scanner;

public class b6_phuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a != 0) {
            System.out.printf("%.2f", -b / a);
        } else if (a == 0 && b != 0) {
            System.out.println("VN");
        } else if (a == 0 && b == 0) {
            System.out.println("VSN");
        }
    }
}
