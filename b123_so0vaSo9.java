import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class b123_so0vaSo9 {
    static Scanner sc = new Scanner(System.in);
    static long[] ans = new long[101];

    public static void init() {
        Vector<Long> vt = new Vector<>();
        Queue<String> q = new ArrayDeque<>();
        // Queue<String> q = new LinkedList<>();
        q.add("9");
        vt.add(9L);
        while (true) {
            String top = q.peek();
            q.remove();
            if (top.length() == 10)
                break;
            vt.add(Long.parseLong(top + "0"));
            vt.add(Long.parseLong(top + "9"));
            q.add(top + "0");
            q.add(top + "9");
        }
        for (int i = 1; i <= 100; i++) {
            for (long x : vt) {
                if (x % i == 0) {
                    ans[i] = x;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        init();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(ans[n]);
        }
    }
}
