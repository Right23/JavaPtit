
import java.util.Scanner;
import java.lang.Math.*;

public class chiaHetCho11 {
    public static void chia11(String s) {
        long sumc = 0, suml = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sumc += (int) s.charAt(i) - '0';
            } else {
                suml += (int) s.charAt(i) - '0';
            }
        }
        if (Math.abs(sumc - suml) % 11 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String s = sc.nextLine();
            chia11(s);
            t--;
        }
    }
}