import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

class PH {
    private String id, name, dob;
    private float lt, th;
    public static int num = 1;

    public PH(String name, String dob, float lt, float th) {
        this.id = "PH" + String.format("%02d", num++);
        this.name = normalize(name);
        this.dob = dob;
        this.lt = lt;
        this.th = th;
    }

    public String normalize(String s) {
        String words[] = s.split("\\s+");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            if (i < words.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    public int get_age() {
        int age = 2021 - Integer.parseInt(dob.substring(dob.length() - 4));
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

}

public class b104_XetTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        ArrayList<PH> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine().trim();
            String dob = sc.nextLine().trim();
            float lt = Float.parseFloat(sc.nextLine().trim());
            float th = Float.parseFloat(sc.nextLine().trim());
            PH x = new PH(name, dob, lt, th);
            arr.add(x);
        }
        for (PH i : arr) {
            System.out.println(i);
        }
    }
}
