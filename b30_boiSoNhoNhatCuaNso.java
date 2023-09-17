import java.util.Scanner;

public class b30_boiSoNhoNhatCuaNso {
    public static double gcd(double a, double b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static double lcm(double a, double b) {
        return (a * b) / gcd(a, b);
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            double res = 1;
            for (int i = 1; i <= n; i++) {
                res = (double) lcm(res, (double) i);
            }
            System.out.println((long) res);
            t--;
        }

    }

    public static void main(String[] args) {
        solve();
    }
}
