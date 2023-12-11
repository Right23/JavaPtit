import java.util.ArrayList;
import java.util.Scanner;

class pr1 {
    private String id, name, mj;
    public static int num = 1;

    public pr1(String name, String mj) {
        this.id = String.format("GV%02d", num++);
        this.name = name;
        this.mj = mj;
    }

    // String[] arr = boMon.split("\\s+");
    // for(String x : arr){
    // this.boMon += Character.toUpperCase(x.charAt(0));
    // }
    public String get_name() {
        return this.name;
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

public class b177_timKiemGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<pr1> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            String mj = sc.nextLine();
            arr.add(new pr1(name, mj));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {

            String tmp = sc.nextLine();
            String key = "";
            key = tmp.toLowerCase();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + tmp + ":");
            for (pr1 i : arr) {
                if (i.get_name().toLowerCase().contains(key)) {
                    System.out.println(i);
                }
            }

        }
    }

}
