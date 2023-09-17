import java.util.Scanner;

/**
 * b29_demSoLanXuatHien
 */
public class b29_demSoLanXuatHien {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            int res = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                res = Math.max(res, a[i]);
            }
            int[] cnt = new int[res + 1];
            for (int i = 0; i < n; i++) {
                cnt[a[i]]++;
            }
            System.out.println("Test " + k + ":");
            for (int i = 0; i < n; i++) {
                if (cnt[a[i]] != 0) {
                    System.out.println(a[i] + " xuat hien " + cnt[a[i]] + " lan");
                    cnt[a[i]] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        solve();
    }
}