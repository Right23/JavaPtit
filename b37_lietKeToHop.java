import java.util.Scanner;

public class b37_lietKeToHop {
    public static int n, k, x[] = new int[1000];

    static void inkq() {
        for (int i = 1; i <= k; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static int cnt = 0;

    public static void Try(int i) {
        for (int j = x[i - 1] + 1; j <= n - k + i; j++) {
            x[i] = j;
            if (i == k) {
                inkq();
                cnt++;
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        x[0] = 0;
        // x = new int[100];
        Try(1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
