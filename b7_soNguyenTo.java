
import java.util.Scanner;

public class b7_soNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            boolean ok = true;
            if (n == 1 || n == 0) {
                ok = false;
            }
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    ok = false;
                    break;
                }
            }
            if (ok == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}