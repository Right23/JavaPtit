import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class sv5 implements Comparable<sv5> {
    private String id, name, lop, email;

    public sv5(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String toString() {
        return id + " " + name + " " + lop + " " + email;
    }

    public int compareTo(sv5 o) {
        if (this.lop.compareTo(o.lop) == 0) {
            return this.id.compareTo(o.id);
        }
        return this.lop.compareTo(o.lop);
    }
}

public class b170_SapXepSinhVienTheoLop {
    public static void main(String[] args) {
        ArrayList<sv5> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            arr.add(new sv5(id, name, lop, email));
        }
        Collections.sort(arr);
        for (sv5 i : arr) {
            System.out.println(i);
        }
    }
}
