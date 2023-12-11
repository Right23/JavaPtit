import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class mh93 {
    private String id;
    private int im_qty;

    public mh93(String id, int im_qty) {
        this.id = id;
        this.im_qty = im_qty;
    }

    public String get_id() {
        return this.id;
    }

    public int get_ex_qty() {
        if (id.substring(0, 1).equals("A")) {
            return (int) Math.round(im_qty * 0.6);
        }
        return (int) Math.round(im_qty * 0.7);
    }

    public int get_price() {
        if (id.substring(4).equals("Y")) {
            return 110000;
        }
        return 135000;
    }

    public int get_cost() {
        return this.get_ex_qty() * this.get_price();
    }

    public int get_tax_cost() {
        String d = id.substring(0, 1), c = id.substring(4);
        int res = 0;
        if (d.equals("A") && c.equals("Y")) {
            res = (int) (get_cost() * 0.08);
        }
        if (d.equals("A") && c.equals("N")) {
            res = (int) (get_cost() * 0.11);
        }
        if (d.equals("B") && c.equals("Y")) {
            res = (int) (get_cost() * 0.17);
        }
        if (d.equals("B") && c.equals("N")) {
            res = (int) (get_cost() * 0.22);
        }
        return res;
    }

    public String toString() {
        return id + " " + im_qty + " " + get_ex_qty() + " " + get_price() + " "
                + get_cost() + " " + get_tax_cost();
    }
}

public class b196_bangTheoDoiXuatNhapHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<mh93> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id = sc.nextLine();
            int qty = Integer.parseInt(sc.nextLine());
            arr.add(new mh93(id, qty));
        }
        String s = sc.nextLine();
        Collections.sort(arr, new Comparator<mh93>() {
            public int compare(mh93 o1, mh93 o2) {
                return o1.get_tax_cost() > o2.get_tax_cost() ? -1 : 1;
            }
        });
        for (mh93 i : arr) {
            if (i.get_id().substring(0, 1).equals(s)) {
                System.out.println(i);
            }
        }
    }
}
