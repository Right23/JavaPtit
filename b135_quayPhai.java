import java.util.Arrays;
import java.util.Scanner;

public class b135_quayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            int cnt = 0;
            long b[] = a.clone();
            Arrays.sort(b);
            int i = 0, j = 0;
            while (i < n) {
                if (a[i] == b[j]) {
                    cnt++;
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
            System.out.println(n - cnt);
        }
    }
}
