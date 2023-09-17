import java.util.Scanner;

public class b26_mangDoiXung {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            long[] a = new long[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            int ck = 1;
            for (int i = 0; i < n / 2; i++) {
                if (a[i] != a[n - i - 1]) {
                    ck = 0;
                    break;
                }
            }
            if (ck == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
