import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class nv90 {
    private String id, name, role, stt, base;

    public nv90(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String get_base() {
        return this.id.substring(2, 4);
    }

    public String get_stt() {
        return this.id.substring(4);
    }

    public String get_role() {
        return this.id.substring(0, 2);
    }

    public void set_id(String s) {
        this.id = s;
    }

    public String toString() {
        return name + " " + get_role() + " " + get_stt() + " " + get_base();
    }
}

public class b265_LietKeNhanVienTheoNhom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<nv90> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int gd = 1, tp = 3, pp = 3;
        while (n-- > 0) {
            String id = sc.next();
            String name = sc.nextLine().trim();
            nv90 x = new nv90(id, name);
            if (x.get_role().equals("GD")) {
                gd--;
                if (gd < 0) {
                    x.set_id("NV" + id.substring(2));
                }
            } else if (x.get_role().equals("TP")) {
                tp--;
                if (tp < 0) {
                    x.set_id("NV" + id.substring(2));
                }
            } else if (x.get_role().equals("PP")) {
                pp--;
                if (pp < 0) {
                    x.set_id("NV" + id.substring(2));
                }
            }
            arr.add(x);

        }
        Collections.sort(arr, new Comparator<nv90>() {
            public int compare(nv90 o1, nv90 o2) {
                if (o1.get_base().equals(o2.get_base())) {
                    return (o1.get_stt().compareTo(o2.get_stt()));
                }
                return -(o1.get_base().compareTo(o2.get_base()));
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            for (nv90 i : arr) {
                if (i.get_role().equals(s)) {
                    System.out.println(i);
                }
            }
            System.out.println();
        }
    }
}
