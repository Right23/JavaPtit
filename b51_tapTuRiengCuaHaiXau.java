import java.util.HashSet;
import java.util.Scanner;

public class b51_tapTuRiengCuaHaiXau {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] a = sc.nextLine().split("\\s+");
            String b = sc.nextLine();
            HashSet<String> c = new HashSet<>();
            for (String i : a) {
                if (!b.contains(i)) {
                    c.add(i);
                }
            }
            for (String i : c) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
