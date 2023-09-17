import java.util.Scanner;
import java.lang.Math;

public class b19_soLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String str = sc.nextLine();
            boolean ok = true;
            for (int i = 0; i < str.length() - 1; i++) {
                if (Math.abs(str.charAt(i) - str.charAt(i + 1)) != 1) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
