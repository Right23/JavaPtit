import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class gv1 implements Comparable<gv1> {
    private String id, name, bm;
    public static int num = 1;

    public gv1(String name, String bm) {
        this.id = String.format("GV%02d", num++);
        this.name = name;
        this.bm = bm;
    }

    public String get_firstname() {
        String words[] = this.name.split(" ");
        return words[words.length - 1];
    }

    public String get_mon() {
        String words[] = this.bm.split(" ");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase();
        }
        return res;
    }

    public String toString() {
        return id + " " + name + " " + get_mon();
    }

    public int compareTo(gv1 o) {
        if (this.get_firstname().equals(o.get_firstname())) {
            return this.id.compareTo(o.id);
        }
        return this.get_firstname().compareTo(o.get_firstname());
    }
}

public class b175_sapXepDanhSachGiangVien {
    public static void main(String[] args) {
        ArrayList<gv1> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            String bomon = sc.nextLine();
            arr.add(new gv1(name, bomon));
        }
        Collections.sort(arr);
        for (gv1 i : arr) {
            System.out.println(i);
        }
    }
}
