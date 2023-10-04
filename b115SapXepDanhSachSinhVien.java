import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sv implements Comparable<Sv> {
    private String id, name, sdt, email, f, m, l;

    public Sv(String id, String name, String sdt, String email) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.email = email;
        String word[] = this.name.split(" ");
        this.f = word[0];
        this.l = word[word.length - 1];
        if (word.length == 2) {
            this.m = "";
        } else {
            String tmp = "";
            for (int i = 1; i < word.length - 1; i++) {
                tmp += word[i];
                if (i < word.length - 2) {
                    tmp += " ";
                }
            }
            this.m = tmp;
        }
    }

    public String getId() {
        return id;
    }

    public String fn() {
        return this.f;
    }

    public String ln() {
        return this.l;
    }

    public String mn() {
        return this.m;
    }

    public int compareTo(Sv o) {
        if ((this.l).equals(o.ln())) {
            if ((this.f).equals(o.fn())) {
                if ((this.m).equals(o.mn())) {
                    return this.id.compareTo(o.getId());
                }
                return (this.m).compareTo(o.mn());
            }
            return (this.f).compareTo(o.fn());
        }
        return (this.l).compareTo(o.ln());
    }

    public String toString() {
        return id + " " + name + " " + sdt + " " + email;
    }
}

public class b115SapXepDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Sv> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String sdt = sc.nextLine();
            String email = sc.nextLine();
            Sv x = new Sv(id, name, sdt, email);
            arr.add(x);
        }
        Collections.sort(arr);
        for (Sv i : arr) {
            System.out.println(i);
        }
    }
}
