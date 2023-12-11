import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class nv91 {
    private String id, name, stt;
    private double lt, th, avg;
    public static int num = 1;

    public nv91(String name, double lt, double th) {
        this.id = String.format("TS%02d", num++);
        this.name = name;
        this.lt = lt;
        this.th = th;
        this.avg = get_avg();
        this.stt = get_stt();
    }

    public double get_avg() {
        double tmp = 0;
        tmp += lt > 10 ? lt / 10 : lt;
        tmp += th > 10 ? th / 10 : th;
        return tmp / 2;
    }

    public String get_stt() {
        if (avg < 5) {
            return "TRUOT";
        } else if (avg < 8) {
            return "CAN NHAC";
        } else if (avg < 9.5) {
            return "DAT";
        }
        return "XUAT SAC";
    }

    public String toString() {
        return id + " " + name + " " + String.format("%.2f", avg) + " " + stt;
    }
}

public class b256_tuyenDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<nv91> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            double lt = Double.parseDouble(sc.nextLine());
            double th = Double.parseDouble(sc.nextLine());
            arr.add(new nv91(name, lt, th));
        }
        Collections.sort(arr, new Comparator<nv91>() {
            public int compare(nv91 o1, nv91 o2) {
                if (o1.get_avg() > o2.get_avg()) {
                    return -1;
                }
                return 1;
            }
        });
        for (nv91 i : arr) {
            System.out.println(i);
        }
    }
}
