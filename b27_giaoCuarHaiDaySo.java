import java.util.Arrays;
import java.util.Scanner;

public class b27_giaoCuarHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] ck = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            ck[a[i]] = 1;// xuat hien
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        for (int i = 0; i < m; i++) {
            if (ck[b[i]] == 1) {
                System.out.print(b[i] + " ");
                ck[b[i]] = 2;// xuat hien va da duoc in ra, se k in lai nua
            }
        }
    }
}
