import java.util.Scanner;

public class b16_tongUocSo {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        while (t > 0) {
            long n = sc.nextLong();
            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        sum += i;
                        n /= i;
                    }
                }
            }
            if (n != 1)
                sum += n;
            t--;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        solve();
    }
}
