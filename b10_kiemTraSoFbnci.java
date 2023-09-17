import java.util.Scanner;

public class b10_kiemTraSoFbnci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] a;
        a = new long[93];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= 92; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        while (t > 0) {
            long n = sc.nextLong();
            int ck = 0;
            for (int i = 0; i <= 92; i++) {
                if (n == a[i]) {
                    ck = 1;
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
}
