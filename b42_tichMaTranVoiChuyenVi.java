import java.util.Scanner;

public class b42_tichMaTranVoiChuyenVi {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int t = sc.nextInt();
        for (int z = 1; z <= t; z++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long a[][] = new long[n][m];
            long b[][] = new long[m][n];
            long c[][] = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.printf("Test %d:\n", z);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        solve();
    }

}
