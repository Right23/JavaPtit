import java.util.ArrayList;
import java.util.Scanner;

public class b44_danhSachKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] dsKe = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            dsKe[i] = new ArrayList<>();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                byte x = sc.nextByte();
                if (x == 1) {
                    dsKe[i].add(j);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.printf("List(%d) = ", i);
            for (int j : dsKe[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
