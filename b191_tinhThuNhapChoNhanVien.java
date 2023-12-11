import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class nv87 {
    private String id, name, role;
    private int ln, snc;
    public static int num = 1;

    public nv87(String name, int snc, int ln, String role) {
        this.id = String.format("NV%02d", num++);
        this.name = name;
        this.role = role;
        this.ln = ln;
        this.snc = snc;
    }

    public String get_id() {
        return id;
    }

    public String get_role() {
        return role;
    }

    public int get_salary() {
        return ln * snc;
    }

    public int get_income() {
        return get_salary() + get_pc_role();
    }

    public int get_pc_role() {
        if (role.equals("GD")) {
            return 500;
        } else if (role.equals("PGD")) {
            return 400;
        } else if (role.equals("TP")) {
            return 300;
        } else if (role.equals("KT")) {
            return 250;
        }
        return 100;
    }

    public int get_tmp() {
        int tmp = get_salary() + get_pc_role();
        if (tmp * 2.0 / 3 < 25000) {
            return (int) (Math.round(tmp * 2.0 / 3 / 1000) * 1000);
        }
        return 25000;
    }

    // public int get_award() {
    // if (snc >= 25) {
    // return ln * snc * 20 / 100;
    // } else if (snc >= 22) {
    // return ln * snc * 10 / 100;
    // }
    // return 0;
    // }

    public int get_remain() {
        return get_salary() + get_pc_role() - get_tmp();
    }

    public String toString() {
        return id + " " + name + " " + get_pc_role() + " " + get_salary() + " "
                + get_tmp() + " " + get_remain();
    }
}

public class b191_tinhThuNhapChoNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<nv87> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            String role = sc.nextLine();
            int ln = Integer.parseInt(sc.nextLine());
            int snc = Integer.parseInt(sc.nextLine());
            arr.add(new nv87(name, ln, snc, role));
        }
        // arr.sort(Comparator.comparing(nv87::get_award, Comparator.reverseOrder()));
        // cach tren sai
        Collections.sort(arr, new Comparator<nv87>() {
            public int compare(nv87 o1, nv87 o2) {
                if (o1.get_income() == o2.get_income()) {
                    return o1.get_id().compareTo(o2.get_id());
                }
                return o1.get_income() > o2.get_income() ? -1 : 1;
            }
        });
        // int sum = 0;
        // String s = sc.nextLine();
        for (nv87 i : arr) {
            // if (i.get_role().equals(s)) {
            System.out.println(i);
            // }
            // sum += i.get_total();
        }
        // System.out.println("Tong chi phi tien luong: " + sum);
    }
}
