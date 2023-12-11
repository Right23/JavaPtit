import java.util.ArrayList;
import java.util.Scanner;

class nv98 {
    private String ma_pb, ten_pb;
    private String code, name;
    private long base, dow, pow, salary; // day of working

    public nv98(String ma_pb, String ten_pb) {
        this.ma_pb = ma_pb;
        this.ten_pb = ten_pb;
    }

    public String get_MaPb() {
        return this.ma_pb;
    }

    public void set_all(String code, String name, long base, long dow) {
        this.code = code;
        this.name = name;
        this.base = base;
        this.dow = dow;
        long kn = Long.parseLong(this.code.substring(1, 3));
        String type = this.code.substring(0, 1);
        long tmp = 0;
        if (type.equals("A")) {
            if (kn <= 3)
                tmp = 10;
            else if (kn <= 8)
                tmp = 12;
            else if (kn <= 15)
                tmp = 14;
            else
                tmp = 20;
        } else if (type.equals("B")) {
            if (kn <= 3)
                tmp = 10;
            else if (kn <= 8)
                tmp = 11;
            else if (kn <= 15)
                tmp = 13;
            else
                tmp = 16;
        } else if (type.equals("C")) {
            if (kn <= 3)
                tmp = 9;
            else if (kn <= 8)
                tmp = 10;
            else if (kn <= 15)
                tmp = 12;
            else
                tmp = 14;
        } else {
            if (kn <= 3)
                tmp = 8;
            else if (kn <= 8)
                tmp = 9;
            else if (kn <= 15)
                tmp = 11;
            else
                tmp = 13;
        }
        this.pow = tmp;
        this.salary = pow * base * dow * 1000;
    }

    public String toString() {
        return code + " " + name + " " + ten_pb + " " + salary;
    }
}

public class b217_tinhLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<nv98> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String line = sc.nextLine();
            String ma_pb = line.substring(0, 2);
            String ten_pb = line.substring(3, line.length());
            arr.add(new nv98(ma_pb, ten_pb));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            long base = Long.parseLong(sc.nextLine());
            long dow = Long.parseLong(sc.nextLine());
            for (nv98 i : arr) {
                if (i.get_MaPb().equals(code.substring(3, 5))) {
                    i.set_all(code, name, base, dow);
                    System.out.println(i);
                }
            }
        }
    }
}
