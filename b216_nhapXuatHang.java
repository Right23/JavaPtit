import java.util.ArrayList;
import java.util.Scanner;

class mh99 {
    private String code, name, type;
    private long total_im, total_ex;

    public mh99(String code, String name, String type) {
        this.code = code;
        this.name = name;
        this.type = type;
    }

    public String get_code() {
        return this.code;
    }

    public void set_total_im(long sl_im, long price_im) {
        this.total_im = price_im * sl_im;
    }

    public void set_total_ex(long price_im, long sl_ex) {
        double interest_rate = 0;
        if (this.type.equals("A")) {
            interest_rate = 0.08;
        } else if (this.type.equals("B")) {
            interest_rate = 0.05;
        } else if (this.type.equals("C")) {
            interest_rate = 0.02;
        }

        this.total_ex = (long) (price_im * (interest_rate + 1) * sl_ex);
    }

    public String toString() {
        return code + " " + name + " " + total_im + " " + total_ex;
    }
}

public class b216_nhapXuatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<mh99> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            mh99 obj = new mh99(code, name, type);
            arr.add(obj);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String line[] = sc.nextLine().split(" ");
            String ma = line[0];
            int sl_nhap = Integer.parseInt(line[1]);
            int gia_nhap = Integer.parseInt(line[2]);
            int sl_xuat = Integer.parseInt(line[3]);
            for (mh99 i : arr) {
                if (i.get_code().equals(ma)) {
                    i.set_total_im(sl_nhap, gia_nhap);
                    i.set_total_ex(gia_nhap, sl_xuat);
                    System.out.println(i);
                }
            }
        }
        // for (mh99 i : arr) {
        // }
    }
}
