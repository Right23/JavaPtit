import java.util.Scanner;
import java.lang.Math;

public class b21_tinhLuyThua {
    public static final int mod = (int) 1e9 + 7;

    public static long binPow(long a, long b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a % mod;
        }
        long x = binPow(a, b / 2);
        if (b % 2 == 0) {
            return (x * x) % mod;
        }
        return ((x * x % mod) * a) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println((binPow(a, b)));
        }
    }
}
