import java.util.Scanner;

public class b11_phanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            long n = sc.nextLong();
            System.out.print("Test " + (j + 1) + ": ");
            for (int i = 2; i <= n; i++) {
                int mu = 0;
                while (n % i == 0) {
                    mu++;
                    n /= i;
                }
                if (mu != 0) {
                    System.out.print(i + "(" + mu + ") ");
                }

            }
            System.out.println();
        }
    }
}
