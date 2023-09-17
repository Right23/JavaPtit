import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class b28_hopCuaHaiDaySo {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] ck = new int[1005];
        int res = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            res = Math.max(res, a[i]);
            ck[a[i]] = 1;
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            res = Math.max(res, b[i]);
            ck[b[i]] = 1;
        }
        for (int i = 0; i <= res; i++) {
            if (ck[i] == 1) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        solve();
    }
}
