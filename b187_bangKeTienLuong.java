import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class nv88 {
    private String id, name, role;
    private long ln, snc;
    public static int num = 1;

    public nv88(String name, long ln, long snc, String role) {
        this.id = String.format("NV%02d", num++);
        this.name = name;
        this.ln = ln;
        this.snc = snc;
        this.role = role;
    }

    public long get_pc_role() {
        if (role.equals("GD")) {
            return 250000;
        } else if (role.equals("PGD")) {
            return 200000;
        } else if (role.equals("TP")) {
            return 180000;
        }
        return 150000;
    }

    public long get_award() {
        if (snc >= 25) {
            return ln * snc * 20 / 100;
        } else if (snc >= 22) {
            return ln * snc * 10 / 100;
        }
        return 0;
    }

    public long get_total() {
        return ln * snc + get_pc_role() + get_award();
    }

    public String toString() {
        return id + " " + name + " " + (ln * snc) + " " + get_award() + " " + get_pc_role() + " "
                + (ln * snc + get_award() + get_pc_role());
    }
}

public class b187_bangKeTienLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<nv88> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            long ln = Long.parseLong(sc.nextLine());
            long snc = Long.parseLong(sc.nextLine());
            String role = sc.nextLine();
            arr.add(new nv88(name, ln, snc, role));
        }
        // arr.sort(Comparator.comparing(nv88::get_award, Comparator.reverseOrder()));
        // cach tren sai
        Collections.sort(arr, new Comparator<nv88>() {
            public int compare(nv88 o1, nv88 o2) {
                return o1.get_total() > o2.get_total() ? -1 : 1;
            }
        });
        // long sum = 0;
        for (nv88 i : arr) {
            System.out.println(i);
            // sum += i.get_total();
        }
        // System.out.println("Tong chi phi tien luong: " + sum);
    }
}
