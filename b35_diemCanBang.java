import java.util.Scanner;

public class b35_diemCanBang {
    public static int equilibrium(int[] a, int n) {
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            rightSum += a[i];
        }
        for (int i = 0; i < n; i++) {
            rightSum -= a[i];
            if (rightSum == leftSum) {
                return i + 1;
            }
            leftSum += a[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(equilibrium(a, n));
            t--;
        }
    }
}
