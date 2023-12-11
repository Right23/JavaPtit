import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class nv94 {
    private String id, name, sdt, nhom, baitap;

    public nv94(String id, String name, String sdt, String nhom) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public String get_nhom() {
        return this.nhom;
    }

    public String get_id() {
        return this.id;
    }

    public String toString() {
        return id + " " + name + " " + sdt + " " + nhom;
    }
}

public class b222_QuanLyBaiTapNhom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<nv94> arr = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        String line[] = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String sdt = sc.nextLine();
            String nhom = sc.nextLine();
            nv94 x = new nv94(id, name, sdt, nhom);
            arr.add(x);
        }
        for (int i = 1; i <= m; i++) {
            // map.put(String.valueOf(i), sc.nextLine());
            map.put(Integer.toString(i), sc.nextLine());
        }
        Collections.sort(arr, new Comparator<nv94>() {
            public int compare(nv94 o1, nv94 o2) {
                return o1.get_id().compareTo(o2.get_id());
            }
        });
        for (nv94 i : arr) {
            System.out.println(i + " " + map.get(i.get_nhom()));
        }
    }
}
