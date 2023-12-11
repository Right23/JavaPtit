import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class mh94 {
    private String id, name;
    private int qty, price;
    private static Map<String, Integer> map;

    public static void init_Map() {
        mh94.map = new HashMap<>();
    }

    public mh94(String name, int qty, int price) {
        String words[] = name.trim().split("\\s+");
        String tmp = "" + Character.toUpperCase(words[0].charAt(0))
                + Character.toUpperCase(words[1].charAt(0));
        if (map.containsKey(tmp)) {
            int d = map.get(tmp);
            this.id = tmp + String.format("%02d", ++d);
            map.put(tmp, d);
        } else {
            this.id = tmp + String.format("%02d", 1);
            map.put(tmp, 1);
        }
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public float discount_percent() {
        if (qty > 10)
            return 0.05f;
        if (qty > 7)
            return 0.02f;
        if (qty > 4)
            return 0.01f;
        return 0;
    }

    public int dis_per_cost() {
        return (int) (qty * price * discount_percent());
    }

    public int get_total() {
        return qty * price - dis_per_cost();
    }

    public String toString() {
        return id + " " + name + " " + dis_per_cost() + " " + get_total();
    }
}

public class b194_bangKeNhapKho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<mh94> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        mh94.init_Map();
        while (n-- > 0) {
            String name = sc.nextLine();
            int qty = Integer.parseInt(sc.nextLine());
            int price = Integer.parseInt(sc.nextLine());
            mh94 x = new mh94(name, qty, price);
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<mh94>() {
            public int compare(mh94 o1, mh94 o2) {
                return o1.dis_per_cost() > o2.dis_per_cost() ? -1 : 1;
            }
        });
        for (mh94 i : arr) {
            System.out.println(i);
        }
    }
}
