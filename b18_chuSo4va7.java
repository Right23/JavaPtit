import java.util.Scanner;

public class b18_chuSo4va7 {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '4' || s.charAt(i) == '7') {
                cnt++;
            }
        }
        if (cnt == 4 || cnt == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
