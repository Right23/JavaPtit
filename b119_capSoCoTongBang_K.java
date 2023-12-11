import java.util.HashMap;
import java.util.Scanner;

public class b119_capSoCoTongBang_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] line = sc.nextLine().split(" ");
            int n = Integer.parseInt(line[0]);
            long k = Long.parseLong(line[1]);
            HashMap<Long, Long> hmp = new HashMap<>();
            String[] a = sc.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(a[i]);
                if (hmp.containsKey(x)) {
                    hmp.put(x, hmp.get(x) + 1);
                } else {
                    hmp.put(x, (long) 1);
                }
            }
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                // long x = Long.parseLong(a[i]);
                long x = Long.valueOf(a[i]);
                cnt += hmp.getOrDefault(k - x, (long) 0);
                if (k == 2 * x)
                    cnt--;
            }
            System.out.println(cnt / 2);
        }
    }
}
