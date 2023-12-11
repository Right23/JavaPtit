import static java.lang.Math.abs;

import java.util.Scanner;

public class b142_chiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            int s_even = 0, s_odd = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    s_even += s.charAt(i) - '0';
                } else {
                    s_odd += s.charAt(i) - '0';
                }
            }
            if (abs((s_odd - s_even)) % 11 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
