import java.util.Arrays;
import java.util.Scanner;

public class b119_capSoCoTongBangK {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            long[] c = new long[(int) 1e18];// the nay la dc roi
            // Arrays.fill(c, 0);// co the thay 0 bang gia tri khac
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                c[(int) a[i]]++;
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans += c[(int) (k - a[i])];
                if (2 * a[i] == k) {
                    ans--;
                }
            }
            System.out.println(ans / 2);
        }

    }

    public static void main(String[] args) {
        solve();
    }
}
