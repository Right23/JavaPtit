import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class sv98 {
    private String id, name, stt;
    private double t, l, h;

    public sv98(String id, String name, double t, double l, double h) {
        this.id = id;
        this.name = name;
        this.t = t;
        this.l = l;
        this.h = h;
    }

    public String get_id() {
        return this.id;
    }

    public void set_stt(String s) {
        this.stt = s;
    }

    public double get_bonus() {
        String tmp = id.substring(0, 3);
        double bo = 0;
        if (tmp.equals("KV1")) {
            bo = 0.5;
        } else if (tmp.equals("KV2")) {
            bo = 1.0;
        } else if (tmp.equals("KV3")) {
            bo = 2.5;
        }
        return bo;
    }

    public double get_sum() {
        return t * 2 + l + h + get_bonus();
    }

    public static String removeZero(double x) {
        DecimalFormat df = new DecimalFormat("#.#");
        return df.format(x);
    }

    public String toString() {
        return id + " " + name + " " + removeZero(get_bonus()) + " " + removeZero(get_sum()) + " " + stt;
    }
}

public class b262_xacDinhDanhSachTrungTuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sv98> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            double t = Double.parseDouble(sc.nextLine());
            double l = Double.parseDouble(sc.nextLine());
            double h = Double.parseDouble(sc.nextLine());
            arr.add(new sv98(id, name, t, l, h));
        }
        Collections.sort(arr, new Comparator<sv98>() {
            public int compare(sv98 o1, sv98 o2) {
                if (o1.get_sum() == o2.get_sum()) {
                    return o1.get_id().compareTo(o2.get_id());
                }
                return o1.get_sum() > o2.get_sum() ? -1 : 1;
            }
        });
        int chiTieu = Integer.parseInt(sc.nextLine());
        double bench_mark = arr.get(chiTieu - 1).get_sum();
        for (sv98 i : arr) {
            if (i.get_sum() >= bench_mark) {
                i.set_stt("TRUNG TUYEN");
            } else {
                i.set_stt("TRUOT");
            }
        }
        System.out.println(String.format("%.1f", bench_mark));
        for (sv98 i : arr) {
            System.out.println(i);
        }
    }
}
