import java.math.BigInteger;
import java.util.Scanner;

public class b55_hieuSoNguyen2 {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.subtract(b));

    }

    public static void main(String[] args) {
        solve();
    }
}
