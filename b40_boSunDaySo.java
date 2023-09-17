import java.util.Scanner;

public class b40_boSunDaySo {
    static Scanner sc = new Scanner(System.in);
    public static int n, a[] = new int[201], m = -1;

    public static void solve() {
        int cnt = 0;
        for (int j = 0; j < 201; j++) {
            a[j] = 0;
        }
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[x] = 1;
            m = Math.max(m, x);
        }
        for (int i = 1; i < m; i++) {
            if (a[i] == 0) {
                cnt++;
                System.out.println(i);
            }
        }
        if (cnt == 0) {
            System.out.println("Excellent!");
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
