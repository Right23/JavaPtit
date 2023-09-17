import java.util.Scanner;

public class b32_sapXepChon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int k = i; // vi tri co gia tri nho nhat
            for (int j = i + 1; j < n; j++) {
                if (a[k] > a[j]) {
                    k = j;
                }
            }
            int tmp = a[i];
            a[i] = a[k];
            a[k] = tmp;
            System.out.printf("Buoc %d: ", i + 1);
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
