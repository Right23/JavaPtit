import java.util.Scanner;
import java.lang.Math;

public class b17_uocSoNguyenToLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long res = 1;
            for (long i = 2; i * i <= n; i++) {
                while (n % i == 0) {
                    n /= i;
                    res = Math.max(res, i);
                }
            }
            if (n != 1)
                res = Math.max(res, n);
            System.out.println(res);
            t--;
        }
    }
}
