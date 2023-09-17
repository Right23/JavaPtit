import java.util.Scanner;

public class b39_soXaCach {
    public static int n, k, x[] = new int[11];
    public static boolean used[] = new boolean[11];

    public static void inkq() {
        for (int i = 1; i <= n; i++) {
            System.out.print(x[i]);
        }
        System.out.println();
    }

    public static boolean check() {
        for (int i = 1; i < n; i++) {
            if (Math.abs(x[i] - x[i + 1]) == 1) {
                return false;
            }
        }
        return true;
    }

    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (!used[j]) {
                x[i] = j;
                used[j] = true;
                if (i == n && check()) {
                    inkq();
                } else {
                    Try(i + 1);
                }
                used[j] = false;
            }
        }
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            n = sc.nextInt();
            Try(1);
            t--;
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
