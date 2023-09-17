import java.math.BigInteger;
import java.util.Scanner;

public class b54_hieuSoNguyenLon {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.subtract(b).abs();

            // StringBuilder sb = new StringBuilder(c.toString());
            String sb = c.toString();
            int maxLen = Math.max(a.toString().length(), b.toString().length());
            while (sb.length() < maxLen) {
                // sb.insert(0, '0');
                sb = "0" + sb;
            }
            System.out.println(sb);
            t--;
        }
    }

    public static void main(String[] args) {
        solve();
    }

}