import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class b88chuanHoaXauHoTenTrongFiile {
    public static String normalize(String s) {
        return s.substring(0, 1).toUpperCase()
                + s.substring(1).toLowerCase();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String line = sc.nextLine();
            if (line.equals("END"))
                break;
            String[] list = line.trim().split("\\s+");
            for (String i : list) {
                System.out.print(normalize(i) + " ");
            }
            System.out.println();
        }
    }
}
