import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class nv93 {
    private String id, name, sdt, nhom, baitap;

    public nv93(String id, String name, String sdt, String nhom) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public String get_nhom() {
        return this.nhom;
    }

    public String toString() {
        return id + " " + name + " " + sdt;
    }
}

public class b221_quanLyBaiTapNhom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<nv93> arr = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        String line[] = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String sdt = sc.nextLine();
            String nhom = sc.nextLine();
            nv93 x = new nv93(id, name, sdt, nhom);
            arr.add(x);
        }
        for (int i = 1; i <= m; i++) {
            // map.put(String.valueOf(i), sc.nextLine());
            map.put(Integer.toString(i), "Bai tap dang ky: " + sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println("DANH SACH NHOM " + s + ":");
            for (nv93 i : arr) {
                if (i.get_nhom().equals(s)) {
                    System.out.println(i);
                }
                // System.out.println(i.get_nhom() + " " + s);
            }
            System.out.println(map.get(s));
        }
    }
}
