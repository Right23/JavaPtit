import java.util.Scanner;
import java.util.Stack;

/**
 * b121_dayNgoacDungDaiNhat
 */
public class b121_dayNgoacDungDaiNhat {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int res = 0;//
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    st.push(i);
                } else {
                    if (!st.empty()) {
                        st.pop();
                    }
                    if (!st.empty()) {
                        res = Math.max(res, i - st.peek());
                    } else {
                        st.push(i);
                    }
                }
            }
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        solve();
    }
}