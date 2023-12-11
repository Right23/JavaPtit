import java.util.ArrayList;
import java.util.Scanner;

class pr {
    private String id, name, mj;
    public static int num = 1;

    public pr(String name, String mj) {
        this.id = String.format("GV%02d", num++);
        this.name = name;
        this.mj = mj;
    }

    public String get_mj() {
        return this.mj;
    }

    public static String viet_tat(String s) {
        String res = "";
        String words[] = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase();
        }
        return res;
    }

    public String toString() {
        return id + " " + name + " " + viet_tat(mj);
    }
}

public class b176_danhSachGiangVienTheoBoMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<pr> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            String mj = sc.nextLine();
            arr.add(new pr(name, mj));
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String nganh = sc.nextLine();
            String words[] = nganh.split(" ");
            String tmp = "";
            for (int i = 0; i < words.length; i++) {
                tmp += words[i].substring(0, 1).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + pr.viet_tat(nganh) + ":");
            // System.out.println("DANH SACH GIANG VIEN BO MON " + tmp + ":");
            for (pr i : arr) {
                if ((i.get_mj()).equals(nganh)) {
                    System.out.println(i);
                }
            }
        }
    }
}
