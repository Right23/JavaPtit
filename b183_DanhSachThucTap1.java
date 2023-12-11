import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class tts {
    private String code, name, lop, email, doanhngiep;
    private String stt;
    public static int num = 1;

    public tts(String code, String name, String lop, String email, String doanhngiep) {
        this.stt = String.format("%d", num++);
        this.code = code;
        this.name = (name);
        this.lop = lop;
        this.email = email;
        this.doanhngiep = doanhngiep;
    }

    public String get_code() {
        return this.code;
    }

    public String get_doanhnghiep() {
        return this.doanhngiep;
    }

    public String toString() {
        return stt + " " + code + " " + name + " " + lop + " " + email + " " + doanhngiep;
    }
}

public class b183_DanhSachThucTap1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<tts> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String doanhnghiep = sc.nextLine();
            tts x = new tts(code, name, lop, email, doanhnghiep);
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<tts>() {
            public int compare(tts o1, tts o2) {
                return o1.get_code().compareTo(o2.get_code());
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String dn = sc.nextLine();
            for (tts i : arr) {
                if (i.get_doanhnghiep().equals(dn)) {
                    System.out.println(i);
                }
            }
        }
    }
}
