import java.util.Scanner;

public class b25_soChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            if ((long) (Math.sqrt(n)) * (long) (Math.sqrt(n)) != n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            t--;
        }
    }
}
