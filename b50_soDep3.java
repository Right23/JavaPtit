import java.util.Scanner;

public class b50_soDep3 {
    public static boolean snt(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static Scanner sc = new Scanner(System.in);

    public static String check(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += (s.charAt(i));
            if (!snt((int) (s.charAt(i) - '0'))) {
                break;
            }
        }

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
