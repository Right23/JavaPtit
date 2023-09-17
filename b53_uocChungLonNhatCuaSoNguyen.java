import java.math.BigInteger;
import java.util.Scanner;

public class b53_uocChungLonNhatCuaSoNguyen {
    public static BigInteger gcd(BigInteger a, BigInteger b) {
        if (b.toString() == "0")
            return a;
        return gcd(b, a.mod(b));
    }

    public static BigInteger lcm(BigInteger a, BigInteger b) {
        return (a.multiply(b)).divide(gcd(a, b));
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(gcd(a, b));
            t--;
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
