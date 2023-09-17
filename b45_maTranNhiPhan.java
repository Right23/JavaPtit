import java.util.Scanner;

public class b45_maTranNhiPhan {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {

        int n = sc.nextInt();
        int a[][] = new int[n][3];
        int res = 0;
        for (int i = 0; i < n; i++) {
            int cnt0 = 0;
            int cnt1 = 0;
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 0)
                    cnt0++;
                if (a[i][j] == 1)
                    cnt1++;
            }
            if (cnt1 > cnt0)
                res++;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        solve();
    }
}
