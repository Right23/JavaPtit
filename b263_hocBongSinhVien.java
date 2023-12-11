import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class sv97 {
    private String name, stt;
    private double gpa, drl;

    public sv97(String name, double gpa, double drl) {
        this.name = name;
        this.gpa = gpa;
        this.drl = drl;
        this.stt = get_stt();
    }

    public String get_stt() {
        String tmp = "";
        if (gpa >= 3.6 && drl >= 90)
            tmp = "XUATSAC";
        else if (gpa >= 3.2 && drl >= 80)
            tmp = "GIOI";
        else if (gpa >= 2.5 && drl >= 70)
            tmp = "KHA";
        else
            tmp = "KHONG";
        return tmp;
    }

    public void set_stt(String s) {
        this.stt = s;
    }

    public double get_gpa() {
        return this.gpa;
    }

    public String toString() {
        return name + ": " + stt;
    }
}

public class b263_hocBongSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sv97> arr = new ArrayList<>();
        String line[] = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        while (n-- > 0) {
            String name = sc.nextLine();
            String ln[] = sc.nextLine().split(" ");
            double gpa = Double.parseDouble(ln[0]);
            double drl = Double.parseDouble(ln[1]);
            arr.add(new sv97(name, gpa, drl));
        }
        ArrayList<sv97> arr_tmp = (ArrayList<sv97>) arr.clone();
        Collections.sort(arr, new Comparator<sv97>() {
            public int compare(sv97 o1, sv97 o2) {
                return o1.get_gpa() > o2.get_gpa() ? -1 : 1;
            }
        });
        double bench_mark = arr.get(m - 1).get_gpa();
        for (sv97 i : arr_tmp) {
            if (i.get_gpa() < bench_mark) {
                i.set_stt("KHONG");
            }
        }
        for (sv97 i : arr_tmp) {
            System.out.println(i);
        }
    }
}
