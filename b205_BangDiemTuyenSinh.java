import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

class hs {
    private String code, name;
    private float t, l, h;

    public hs(String code, String name, float t, float l, float h) {
        this.name = name;
        this.code = code;
        this.t = t;
        this.l = l;
        this.h = h;
    }

    public float get_tong() {
        return (2 * t + l + h);
    }

    public float get_bonus() {
        if ((this.code).substring(0, 3).equals("KV1")) {
            return 0.5f;
        } else if ((this.code).substring(0, 3).equals("KV2")) {
            return 1.0f;
        }
        return 2.5f;
    }

    public String get_status() {
        float bench_mark = 24;
        float tong = get_bonus() + get_tong();
        if (tong >= bench_mark) {
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }

    public static String removeZero(double number) {
        DecimalFormat format = new DecimalFormat("#.#");
        return format.format(number);
    }

    public String toString() {
        return code + " " + name + " " + removeZero(get_bonus()) + " " + removeZero(get_tong()) + " "
                + get_status();
    }
    // public int compareTo(){

    // }

}

public class b205_BangDiemTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<hs> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            float t = Float.parseFloat(sc.nextLine());
            float l = Float.parseFloat(sc.nextLine());
            float h = Float.parseFloat(sc.nextLine());
            arr.add(new hs(code, name, t, l, h));
        }
        for (hs i : arr) {
            System.out.println(i);
        }
    }
}
