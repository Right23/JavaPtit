import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 * b77_docFileVanBan
 */
public class b77_docFileVanBan {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}