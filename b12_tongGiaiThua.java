import java.util.Scanner;

public class b12_tongGiaiThua {
    public static long fact(int n) {
        long gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        return gt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 0;
        for (int i = 1; i <= n; i++) {
            s += fact(i);
        }
        System.out.println(s);
    }
}
