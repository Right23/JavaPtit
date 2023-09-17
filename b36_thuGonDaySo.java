import java.util.Scanner;

/**
 * b36_thuGonDaySo
 */
public class b36_thuGonDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int tmp = n;
        while (true) {
            int pos = -1;
            int ok = 0;

            for (int i = 0; i < n - 1; i++) {
                if ((a[i] + a[i + 1]) % 2 == 0) {
                    pos = i;
                    ok = 1;
                    break;
                }
            }
            if (ok == 1) {
                for (int i = pos; i < n - 2; i++) {
                    a[i] = a[i + 2];
                }
                n -= 2;
            } else {
                break;
            }
        }
        System.out.println(n);

    }
}