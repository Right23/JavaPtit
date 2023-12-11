import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class mh96 {
    private String id, name, unit;
    private long im_price, qty;
    public static int num = 1;

    public mh96(String name, String unit, long im_price, long qty) {
        this.id = String.format("MH%02d", num++);
        this.name = name;
        this.unit = unit;
        this.im_price = im_price;
        this.qty = qty;
    }

    public String get_name() {
        return this.name;
    }

    public String toString() {
        return id + " " + name + " " + unit + " " + Math.round(im_price * qty * 0.05)
                + " " + Math.round(im_price * qty * 1.05) + " " + Math.round(im_price * qty * 1.05 * 1.02);
    }
}

public class b185_tinhGiaBan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<mh96> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            String unit = sc.nextLine();
            long price = Long.parseLong(sc.nextLine());
            long qty = Long.parseLong(sc.nextLine());
            arr.add(new mh96(name, unit, price, qty));
        }
        // arr.sort(Comparator.comparing(mh96::get_name, Comparator.reverseOrder()));
        for (mh96 i : arr) {
            System.out.println(i);
        }
    }
}
