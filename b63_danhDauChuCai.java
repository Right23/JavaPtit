import java.util.HashSet;
import java.util.Scanner;

public class b63_danhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hse = new HashSet<>();
        String[] arr = sc.nextLine().split("");
        for (String i : arr) {
            hse.add(i);
        }
        System.out.println(hse.size());
        //

    }
}
