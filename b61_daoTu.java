import java.util.Scanner;

public class b61_daoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String arr[] = sc.nextLine().trim().split("\\s+");
            for (String i : arr) {
                System.out.print(new StringBuilder(i).reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
