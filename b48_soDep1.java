import java.util.Scanner;

public class b48_soDep1 {
    static Scanner sc = new Scanner(System.in);

    public static String check(String s) {
        int ok = 1;
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += (s.charAt(i));
            if ((int) (s.charAt(i)) % 2 == 1) {
                ok = 0;
                break;
            }
        }
        // System.out.println(s);
        // System.out.println(rev);
        // System.out.println(ok);
        if (s.compareTo(rev) == 0) {
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
