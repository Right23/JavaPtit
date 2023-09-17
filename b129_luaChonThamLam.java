import java.util.Scanner;
import java.util.Vector;

public class b129_luaChonThamLam {

    public static void solon(int m, int s) {
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            if (s > 9) {
                a[i] = 9;
                s -= 9;
            } else {
                a[i] = s;
                s = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(a[i]);
        }
    }

    public static void sobe(int m, int s) {
        s--;
        int a[] = new int[m];
        for (int i = m - 1; i > 0; i--) {
            if (s > 9) {
                a[i] = 9;
                s -= 9;
            } else {
                a[i] = s;
                s = 0;
            }
        }
        a[0] = s + 1;
        for (int i = 0; i < m; i++) {
            System.out.print(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();
        if (m * 9 < s || (s == 0 && m > 1)) {
            System.out.println("-1 -1");
        } else {
            sobe(m, s);
            System.out.print(" ");
            solon(m, s);
        }
    }
}
