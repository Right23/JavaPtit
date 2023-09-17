import java.util.Scanner;

public class b9_tinhSoFibonacci {
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
            int n = sc.nextInt();
            System.out.println(a[n]);
            t--;
        }
    }
}
