import java.util.Scanner;

public class b58_xauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int len = s.length();
            int cnt = 0;
            for (int i = 0; i < len / 2; i++) {
                if (s.charAt(i) != s.charAt(len - i - 1)) {
                    cnt++;
                }
            }
            if ((len % 2 == 0 && cnt == 1) || (len % 2 == 1 && cnt <= 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
