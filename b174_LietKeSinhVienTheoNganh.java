import java.util.ArrayList;
import java.util.Scanner;

class svi {
    private String id, name, lop, email;

    public svi(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String get_nganh() {
        return this.id.substring(5, 7);
    }

    public String get_lop() {
        return this.lop;
    }

    public String toString() {
        return id + " " + name + " " + lop + " " + email;
    }
}

public class b174_LietKeSinhVienTheoNganh {
    public static String viet_tat(String s) {
        String res = "";
        String words[] = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase();
        }
        return res.substring(0, 2);
    }

    public static void main(String[] args) {
        ArrayList<svi> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            arr.add(new svi(id, name, lop, email));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();

            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            for (svi i : arr) {
                if (i.get_nganh().equals(viet_tat(s))) {
                    if (i.get_nganh().equals("CN") || i.get_nganh().equals("AT")) {
                        if (!i.get_lop().substring(0, 1).equals("E")) {
                            System.out.println(i.toString());
                        }
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
