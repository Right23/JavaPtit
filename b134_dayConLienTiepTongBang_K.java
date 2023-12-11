import java.util.HashMap;
import java.util.Scanner;

public class b134_dayConLienTiepTongBang_K {
    static Scanner sc = new Scanner(System.in);

    public static void solve(long a[], int n, long k) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        HashMap<Long, Integer> hmp = new HashMap<>();
        boolean ck = false;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum == k || hmp.getOrDefault(sum - k, 0) == 1) {
                System.out.println("YES");
                ck = true;
                break;
            }
            hmp.put(sum, 1);
        }
        if (!ck)
            System.out.println("NO");
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long a[] = new long[n];
            solve(a, n, k);
        }
    }
}
