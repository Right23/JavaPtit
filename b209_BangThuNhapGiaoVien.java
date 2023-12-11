import java.util.ArrayList;
import java.util.Scanner;

class GV {
    private String id, name;
    private int base;

    public GV(String id, String name, int base) {
        this.id = id;
        this.name = name;
        this.base = base;
    }

    public String get_role() {
        return this.id.substring(0, 2);
    }

    public int get_heso() {
        return Integer.parseInt(this.id.substring(2, 4));
    }

    public int get_bonus() {
        int bonus;
        if (this.get_role().equals("GV")) {
            bonus = 500000;
        } else if (this.get_role().equals("HT")) {
            bonus = 2000000;
        } else {
            bonus = 900000;
        }
        return bonus;
    }

    public int get_total() {
        return get_bonus() + (get_heso() * base);
    }

    public String toString() {
        return id + " " + name + " " + get_heso() + " " + get_bonus() + " " + get_total();
    }
}

public class b209_BangThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GV> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int cnt_ht = 0, cnt_hp = 0;

        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int base = Integer.parseInt(sc.nextLine());
            GV x = new GV(id, name, base);
            if (x.get_role().equals("HT")) {
                cnt_ht += 1;
                if (cnt_ht <= 1) {
                    arr.add(x);
                }
            } else if (x.get_role().equals("HP")) {
                cnt_hp += 1;
                if (cnt_hp <= 2) {
                    arr.add(x);
                }
            } else if (x.get_role().equals("GV")) {
                arr.add(x);
            }
        }
        for (GV i : arr) {
            System.out.println(i);
        }
    }
}
