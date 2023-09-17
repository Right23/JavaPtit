import java.util.Scanner;

public class b49_soDep2 {
    static Scanner sc = new Scanner(System.in);

    public static String check(String s) {
        int ok = 1;
        int sum = 0;
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += (s.charAt(i));
            sum += (int) (s.charAt(i) - '0');
        }
        if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') {
            ok = 0;
        }
        if (sum % 10 != 0) {
            ok = 0;
        }
        // System.out.println(s);
        // System.out.println(rev);
        // System.out.println(ok);
        // System.out.println(sum);
        // System.out.println(ok);
        // neu toan chan moi xuong duoc day
        if (s.compareTo(rev) == 0 && ok == 1) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(check(s));
            t--;
        }
    }
}
