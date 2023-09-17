
import java.util.Scanner;
import java.lang.Math.*;

public class taoXauLonNhatBangCachXoa {
    public static String taoXauLonNhat(String s) {
        StringBuilder sb = new StringBuilder(s);
        int len = sb.length() - 1;
        int id = len;
        int cnt = 0;
        while (true) {
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) < sb.charAt(i + 1)) {
                    sb.deleteCharAt(i);
                }
            }
            cnt += 1;
            if (cnt == id) {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // System.out.println(taoXauLonNhat(s).length());
        System.out.println(taoXauLonNhat(s));
    }
}