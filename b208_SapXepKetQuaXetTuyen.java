import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class PH2 implements Comparable<PH2> {
    private String id, name, dob;
    private float lt, th;
    public static int num = 1;

    public PH2(String name, String dob, float lt, float th) {
        this.id = "PH" + String.format("%02d", num++);
        this.name = name;
        this.dob = dob;
        this.lt = lt;
        this.th = th;
    }

    public String get_id() {
        return this.id;
    }

    public int get_age() {
        int age = 2021 - Integer.parseInt(dob.substring(6, 10));
        return age;
    }

    public int get_avg() {
        float bonus = 0;
        if (this.lt >= 8 && this.th >= 8) {
            bonus = 1;
        } else if (this.lt >= 8 && this.th >= 7.5) {
            bonus = 0.5f;
        }
        float avg = (this.lt + this.th) / 2 + bonus;
        if (avg > 10)
            avg = 10;
        return Math.round(avg);
    }

    public String get_status() {
        if (get_avg() >= 9) {
            return "Xuat sac";
        } else if (get_avg() >= 8) {
            return "Gioi";
        } else if (get_avg() >= 7) {
            return "Kha";
        } else if (get_avg() >= 5) {
            return "Trung binh";
        }
        return "Truot";
    }

    public String toString() {
        return id + " " + name + " " + get_age() + " " + get_avg() + " " + get_status();
    }

    public int compareTo(PH2 o) {
        if (this.get_avg() == o.get_avg()) {
            return this.id.compareTo(o.get_id());
        }
        return -(this.get_avg() - o.get_avg());
    }

}

public class b208_SapXepKetQuaXetTuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PH2> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String dob = sc.nextLine();
            float lt = Float.parseFloat(sc.nextLine());
            float th = Float.parseFloat(sc.nextLine());
            PH2 x = new PH2(name, dob, lt, th);
            arr.add(x);
        }
        Collections.sort(arr);
        for (PH2 i : arr) {
            System.out.println(i);
        }
    }
}
