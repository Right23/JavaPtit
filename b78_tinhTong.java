
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class b78_tinhTong {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in.txt"));
        long sum = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                sum += Integer.parseInt(s);
            } catch (Exception e) {

            }
        }
        System.out.println(sum);
    }
}