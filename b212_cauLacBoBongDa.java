import java.util.ArrayList;
import java.util.Scanner;

class clb2000 {
    protected String ma, name;
    protected int price;

    public clb2000() {

    }

    public clb2000(String ma, String name, int price) {
        this.ma = ma;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return ma + " " + name;
    }
}

class match extends clb2000 {
    private String code;
    private int viewer;

    public match(String ma, String name, int price, String code, int viewer) {
        super(ma, name, price);
        this.code = code;
        this.viewer = viewer;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + price * viewer;
    }
}

/**
 * b212_cauLacBoBongDa
 */
public class b212_cauLacBoBongDa {
    public static void main(String[] args) {
        ArrayList<clb2000> arr1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String ma = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            arr1.add(new clb2000(ma, name, price));
        }
        int q = sc.nextInt();
        ArrayList<match> arr2 = new ArrayList<>();
        while (q-- > 0) {
            String code = sc.next();
            int viewer = sc.nextInt();
            clb2000 a = new clb2000();
            for (clb2000 i : arr1) {
                if (i.ma.equals(code.substring(1, 3))) {
                    a = i;
                    break;
                }
            }
            arr2.add(new match(a.ma, a.name, a.price, code, viewer));
        }
        for (match i : arr2) {
            System.out.println(i);
        }
    }

}