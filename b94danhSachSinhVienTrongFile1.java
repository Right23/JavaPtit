import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sv implements Comparable<Sv> {
    private String id, name, lop, email;

    public Sv(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        normalize();
    }

    private void normalize() {
        String res = "";
        String[] list = name.trim().split("\\s+");
        for (int i = 0; i < list.length; i++) {
            res += list[i].substring(0, 1).toUpperCase()
                    + list[i].substring(1).toLowerCase();
            if (i < list.length - 1) {
                res += " ";
            }
        }
        name = res;
    }

    public String getId() {
        return id;
    }

    public int compareTo(Sv a) {
        return id.compareTo(a.getId());
    }

    public String toString() {
        return id + " " + name + " " + lop + " " + email;
    }
}

public class b94danhSachSinhVienTrongFile1 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Sv> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            Sv x = new Sv(id, name, lop, email);
            arr.add(x);
        }
        Collections.sort(arr);
        for (Sv i : arr) {
            System.out.println(i);
        }
    }
}
