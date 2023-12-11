import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class mh98 {
    private String id, name;
    private long sl, price, discount;

    public mh98(String id, String name, long sl, long price, long discount) {
        this.id = id;
        this.name = name;
        this.sl = sl;
        this.price = price;
        this.discount = discount;
    }

    public long get_total() {
        return sl * price - discount;
    }

    public String toString() {
        return id + " " + name + " " + sl + " " + price + " " + discount + " " + get_total();
    }
}

public class b255_tinhTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<mh98> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            long sl = Long.parseLong(sc.nextLine());
            long price = Long.parseLong(sc.nextLine());
            long discount = Long.parseLong(sc.nextLine());
            arr.add(new mh98(id, name, sl, price, discount));
        }
        Collections.sort(arr, new Comparator<mh98>() {
            public int compare(mh98 o1, mh98 o2) {
                if (o1.get_total() > o2.get_total()) {
                    return -1;
                }
                return 1;
            }
        });
        for (mh98 i : arr) {
            System.out.println(i);
        }
    }
}
