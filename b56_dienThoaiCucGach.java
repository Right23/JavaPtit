import java.util.Scanner;

public class b56_dienThoaiCucGach {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String s = sc.nextLine();
            s = s.toLowerCase();
            String str = "";
            for (int i = 0; i < s.length(); i++) {
                char x = s.charAt(i);
                if (x == 'a' || x == 'b' || x == 'c')
                    str += '2';
                if (x == 'd' || x == 'e' || x == 'f')
                    str += "3";
                if (x == 'g' || x == 'h' || x == 'i')
                    str += "4";
                if (x == 'j' || x == 'k' || x == 'l')
                    str += "5";
                if (x == 'm' || x == 'n' || x == 'o')
                    str += "6";
                if (x == 'p' || x == 'q' || x == 'r' || x == 's')
                    str += "7";
                if (x == 't' || x == 'u' || x == 'v')
                    str += "8";
                if (x == 'w' || x == 'x' || x == 'y' || x == 'z')
                    str += "9";
            }
            String rev = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }
            // System.out.println(rev);
            // System.out.println(str);
            if (str.compareTo(rev) == 0) {
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
