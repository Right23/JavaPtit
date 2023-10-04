
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class b89loaiBoSoNguyen {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        // long sum = 0;
        ArrayList<String> arr = new ArrayList<>(1001);
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                // sum += Integer.parseInt(s);
                int n = Integer.valueOf(s);
            } catch (Exception e) {
                arr.add(s);
            }
        }
        Collections.sort(arr);
        for (String i : arr) {
            System.out.print(i + " ");
        }
        // System.out.println(sum);
    }
}