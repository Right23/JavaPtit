import java.util.Scanner;

public class b4_hinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int r = sc.nextInt();
        if (d <= 0 || r <= 0) {
            System.out.println(0);
        } else {
            System.out.println(2 * (d + r) + " " + d * r);
        }
    }
}
