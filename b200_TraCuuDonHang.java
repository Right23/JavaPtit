import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class mh92 {
    private String name, id, stt;
    private int price, sl;

    public mh92(String name, String id, int price, int sl) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.sl = sl;
    }

    public int get_dis_cost() {
        String tmp = id.substring(4);
        if (tmp.equals("1")) {
            return sl * price * 5 / 10;
        }
        return sl * price * 3 / 10;
    }

    public int get_cost() {
        return sl * price - get_dis_cost();
    }

    public String toString() {
        return name + " " + id + " " + id.substring(1, 4)
                + " " + get_dis_cost() + " " + get_cost();
    }
}

public class b200_TraCuuDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<mh92> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            String id = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int sl = Integer.parseInt(sc.nextLine());
            arr.add(new mh92(name, id, price, sl));
        }
        // arr.sort(Comparator.comparing(mh92::get_cost, Comparator.reverseOrder()));
        for (mh92 i : arr) {
            System.out.println(i);
        }
    }

}