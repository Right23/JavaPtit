import java.util.Scanner;
import java.util.Stack;

public class b122_phanTuBenPhaiDauTienLonHon {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                if (st.empty()) {
                    st.push(i);
                } else {
                    while (!st.empty() && a[st.peek()] < a[i]) {
                        b[st.peek()] = a[i];
                        st.pop();
                    }
                    st.push(i);
                }
            }
            while (!st.empty()) {
                b[st.peek()] = -1;
                st.pop();
            }
            for (int x : b) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
