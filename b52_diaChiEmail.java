import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class b52_diaChiEmail {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> dd = new ArrayList<>();
        while (t-- > 0) {
            String[] arr = sc.nextLine().trim().toLowerCase().split("\\s+");
            String s = arr[arr.length - 1];// ten o dau
            for (int i = 0; i < arr.length - 1; i++) {
                s += arr[i].charAt(0);
            }
            dd.add(s);
            int cnt = Collections.frequency(dd, s);
            s += (cnt == 1 ? "" : cnt) + "@ptit.edu.vn";
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
