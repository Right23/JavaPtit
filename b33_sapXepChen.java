import java.util.Scanner;

public class b33_sapXepChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int pos = i;
            while (pos > 0 && a[pos] < a[pos - 1]) {
                int tmp = a[pos];
                a[pos] = a[pos - 1];
                a[pos - 1] = tmp;
                pos--;
            }
            System.out.printf("Buoc %d: ", i);
            for (int j = 0; j <= i; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
