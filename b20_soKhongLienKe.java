import java.util.Scanner;
import java.lang.Math;

public class b20_soKhongLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            int ok = 1;
            int sum = 0;
            String s = sc.nextLine();
            for (int i = 0; i < s.length() - 1; i++) {
                if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 2) {
                    ok = 0;
                    break;
                }
                sum += (int) (s.charAt(i) - '0');
            }
            sum += (int) (s.charAt(s.length() - 1) - '0');
            // System.out.println(sum);
            if (ok == 1 && sum % 10 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }

    }
}
