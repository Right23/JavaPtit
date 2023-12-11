import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class nv95 {
    private String id_hp, name_hp, nhom_hp, name;

    public nv95(String id_hp, String name_hp, String nhom_hp, String name) {
        this.id_hp = id_hp;
        this.name_hp = name_hp;
        this.nhom_hp = nhom_hp;
        this.name = name;
    }

    public String get_IdHp() {
        return this.id_hp;
    }

    public String get_NhomHp() {
        return this.nhom_hp;
    }

    public String get_name() {
        return this.name;
    }

    public String toString() {
        return id_hp + " " + name_hp + " " + nhom_hp;
    }
}

public class b220_lopHocPhan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<nv95> arr = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id_hp = sc.nextLine();
            String name_hp = sc.nextLine();
            String nhom_hp = sc.nextLine();
            String name = sc.nextLine();
            map.put(id_hp, name_hp);
            arr.add(new nv95(id_hp, name_hp, nhom_hp, name));
        }
        Collections.sort(arr, new Comparator<nv95>() {
            public int compare(nv95 o1, nv95 o2) {
                if (o1.get_IdHp().equals(o2.get_IdHp())) {
                    return o1.get_NhomHp().compareTo(o2.get_NhomHp());
                }
                return o1.get_IdHp().compareTo(o2.get_IdHp());
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println("Danh sach cho giang vien " + s + ":");
            for (nv95 i : arr) {
                if (i.get_name().equals(s)) {
                    System.out.println(i);
                }
            }
        }
    }
}
