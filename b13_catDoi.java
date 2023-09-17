import java.util.Scanner;

public class b13_catDoi {
    public static String convert(String str) {
        int ok = 1;
        String res = "";
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '0' || str.charAt(j) == '8' || str.charAt(j) == '9') {
                if (res.length() != 0) {
                    res += "0";
                }
            } else if (str.charAt(j) == '1') {
                res += "1";
            } else {
                ok = 0;
                break;
            }
        }
        if (res.length() == 0) {
            ok = 0;
        }

        if (ok == 1) {
            return res;
        } else
            return "INVALID";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            long k = sc.nextLong();
            String s = Long.toString(k);
            System.out.println(convert(s));
        }
    }
}
