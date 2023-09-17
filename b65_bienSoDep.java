import java.util.Scanner;

public class b65_bienSoDep {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int ck = 0;

            if (s.charAt(5) < s.charAt(6) && s.charAt(6) < s.charAt(7)
                    && s.charAt(9) < s.charAt(10) && s.charAt(7) < s.charAt(9))
                ck = 1;
            if ((s.charAt(7) == '6' || s.charAt(7) == '8') && (s.charAt(5) == '6' || s.charAt(5) == '8')
                    && (s.charAt(6) == '6' || s.charAt(6) == '8') && (s.charAt(9) == '6' || s.charAt(9) == '8')
                    && (s.charAt(10) == '6' || s.charAt(10) == '8'))
                ck = 1;
            if (s.charAt(6) == s.charAt(5) && s.charAt(6) == s.charAt(7) && s.charAt(9) == s.charAt(10))
                ck = 1;
            if (ck == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
