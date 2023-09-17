
import java.util.Scanner;

public class b22_xauNhiPhan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[93];
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i < 93; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            while (n > 2) {
                if (k > a[n - 2]) {
                    k -= a[n - 2];
                    n--;
                } else {
                    n -= 2;
                }
            }
            if (n - 1 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
            t--;
        }
    }
}
