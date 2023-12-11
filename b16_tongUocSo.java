import java.util.Scanner;

public class b16_tongUocSo {
    public static int solve(int n) {
        int sum = 0;
        while (n % 2 == 0) {
            n >>= 1;
            sum += 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                sum += i;
                n /= i;
            }
        }
        if (n != 1)
            sum += n;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        while (n-- > 0) {
            sum += 1l * solve(sc.nextInt());
        }
        System.out.println(sum);
    }
}
