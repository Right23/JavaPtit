import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class sv99 implements Comparable<sv99> {
    private String id, name, lop, email;

    public sv99(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + lop + " " + email;
    }

    public int compareTo(sv99 o) {
        return this.id.compareTo(o.id);
    }
}

public class b171_sapXepTheoMaSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sv99> arr = new ArrayList<>();
        while (sc.hasNext()) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            sv99 x = new sv99(id, name, lop, email);
            arr.add(x);
        }
        Collections.sort(arr);
        for (sv99 i : arr) {
            System.out.println(i);
        }
    }
}
