import java.util.ArrayList;
import java.util.Scanner;

class sv7 {
    private String id, name, lop, email;

    public sv7(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String get_lop() {
        return this.lop.substring(1, 3);
    }

    public String toString() {
        return id + " " + name + " " + lop + " " + email;
    }
}

public class b173_lietKeSinhVienTheoKhoa {
    public static void main(String[] args) {
        ArrayList<sv7> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            arr.add(new sv7(id, name, lop, email));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
            for (sv7 i : arr) {
                if (i.get_lop().equals(s.substring(2))) {
                    System.out.println(i);
                }
            }
        }
    }
}
