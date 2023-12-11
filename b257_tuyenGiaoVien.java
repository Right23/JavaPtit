import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class gv99 {
    private String id, name, code, sub, stt;
    private double mj, IT, sum;
    public static int num = 1;

    public gv99(String name, String code, double IT, double mj) {
        this.id = String.format("GV%02d", num++);
        this.name = name;
        this.code = code;
        this.mj = mj;
        this.IT = IT;
        this.sub = get_sub();
        this.sum = get_sum();
        this.stt = get_stt();
    }

    public double get_sum() {
        return mj + 2 * IT + get_bonus();
    }

    public String get_id() {
        return this.id;
    }

    public double get_bonus() {
        String tmp = code.substring(1);
        if (tmp.equals("1")) {
            return 2.0;
        } else if (tmp.equals("2")) {
            return 1.5;
        } else if (tmp.equals("3")) {
            return 1.0;
        }
        return 0;
    }

    public String get_sub() {
        String tmp = code.substring(0, 1);
        if (tmp.equals("A")) {
            return "TOAN";
        } else if (tmp.equals("B")) {
            return "LY";
        }
        return "HOA";
    }

    public String get_stt() {
        return sum >= 18 ? "TRUNG TUYEN" : "LOAI";
    }

    public String toString() {
        return id + " " + name + " " + sub + " " + String.format("%.1f", sum) + " " + stt;
    }
}

public class b257_tuyenGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<gv99> arr = new ArrayList<>();
        while (n-- > 0) {
            String name = sc.nextLine();
            String code = sc.nextLine();
            double IT = Double.parseDouble(sc.nextLine());
            double mj = Double.parseDouble(sc.nextLine());
            arr.add(new gv99(name, code, IT, mj));
        }
        Collections.sort(arr, new Comparator<gv99>() {
            public int compare(gv99 o1, gv99 o2) {
                if (o1.get_sum() == o2.get_sum()) {
                    return o1.get_id().compareTo(o2.get_id());
                }
                if (o1.get_sum() > o2.get_sum()) {
                    return -1;
                }
                return 1;
            }
        });
        for (gv99 i : arr) {
            System.out.println(i);
        }
    }
}
