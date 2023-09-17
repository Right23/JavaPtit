import java.util.Scanner;

public class b15_uocSoChiaHetCho2 {
    public static int u2(long x) {
        int cnt = 0;
        if (x % 2 == 1)
            return 0;
        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                if (i % 2 == 0)
                    cnt++;
                if (x / i % 2 == 0)
                    cnt++;
                if (i * i == x && x % 2 == 0)
                    cnt--;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            System.out.println(u2(n));
            t--;
        }
    }
}
