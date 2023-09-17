import java.util.Scanner;

public class b23_soTamPhan {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String s = sc.nextLine();
            int ok = 1;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0' && s.charAt(i) != '1'
                        && s.charAt(i) != '2') {
                    ok = 0;
                    break;
                }
            }

            if (ok == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
