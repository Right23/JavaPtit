import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class thiSinh implements Comparable<thiSinh> {
    private String code, name;
    private float t, l, h;

    public thiSinh(String code, String name, float t, float l, float h) {
        this.name = name;
        this.code = code;
        this.t = t;
        this.l = l;
        this.h = h;
    }

    public String get_code() {
        return this.code;
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
        return code + " " + name + " " + removeZero(get_bonus()) + " " + removeZero(get_tong() + get_bonus()) + " "
                + get_status();
    }

    public Float get_sum() {
        return this.get_bonus() + this.get_tong();
    }

    public int compareTo(thiSinh o) {
        if ((this.get_tong() + this.get_bonus()) == (o.get_tong() + o.get_bonus())) {
            return ((this.get_code()).compareTo(o.get_code()));
        }
        return -(this.get_sum().compareTo(o.get_sum()));
    }

}

public class b206_SapXepKetQuaTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<thiSinh> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            float t = Float.parseFloat(sc.nextLine());
            float l = Float.parseFloat(sc.nextLine());
            float h = Float.parseFloat(sc.nextLine());
            arr.add(new thiSinh(code, name, t, l, h));
        }
        Collections.sort(arr);
        for (thiSinh i : arr) {
            System.out.println(i);
        }
    }
}
