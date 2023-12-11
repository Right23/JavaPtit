import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class SV3 {
    private String id, name, lop, dob;
    private float gpa;
    // private Date dob;

    public static int num = 1;

    public SV3(String name, String lop, String dob, float gpa) {
        this.id = String.format("B20DCCN%03d", num++);
        this.name = normalize_name(name);
        this.lop = lop;
        this.dob = normalize_dob(dob);
        this.gpa = gpa;
    }

    public String normalize_name(String s) {
        String words[] = s.trim().split("\\s+");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            if (i < words.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    public String normalize_dob(String s) {
        if (String.valueOf(s.charAt(1)).equals("/")) {
            s = "0" + s;
        }
        if (String.valueOf(s.charAt(4)).equals("/")) {
            s = s.substring(0, 3) + "0" + s.substring(3);
        }
        return s;
    }

    public String toString() {
        return id + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
}

public class b162_danhSachDoiTuongSinhVien2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        // SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<SV3> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String lop = sc.nextLine();
            // Date dob = sdf.parse(sc.nextLine());
            String dob = sc.nextLine();
            float gpa = Float.valueOf(sc.nextLine());
            arr.add(new SV3(name, lop, dob, gpa));
        }
        for (SV3 i : arr) {
            System.out.println(i);
        }
    }
}
