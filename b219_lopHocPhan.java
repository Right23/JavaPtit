import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class nv97 {
    private String id_hp, name_hp, nhom_hp, name;

    public nv97(String id_hp, String name_hp, String nhom_hp, String name) {
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

    public String toString() {
        return nhom_hp + " " + name;
    }
}

public class b219_lopHocPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<nv97> arr = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id_hp = sc.nextLine();
            String name_hp = sc.nextLine();
            String nhom_hp = sc.nextLine();
            String name = sc.nextLine();
            map.put(id_hp, name_hp);
            arr.add(new nv97(id_hp, name_hp, nhom_hp, name));
        }
        Collections.sort(arr, new Comparator<nv97>() {
            public int compare(nv97 o1, nv97 o2) {
                return o1.get_NhomHp().compareTo(o2.get_NhomHp());
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println("Danh sach nhom lop mon " + map.get(s) + ":");
            for (nv97 i : arr) {
                if (i.get_IdHp().equals(s)) {
                    System.out.println(i);
                }
            }
        }
    }
}
