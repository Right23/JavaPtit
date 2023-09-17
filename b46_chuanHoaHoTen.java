import java.util.Scanner;

public class b46_chuanHoaHoTen {
    public static String xoaSpace(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        return s;
    }

    public static String chuanHoa(String s) {
        s = xoaSpace(s);
        String a[] = s.split(" ");// mang a luu cac tu cua xau
        String res = "";// luu kq
        for (int i = 0; i < a.length; i++) {
            String tmp = a[i].substring(1, a[i].length()).toLowerCase();
            res += String.valueOf(a[i].charAt(0)).toUpperCase() + tmp;
            if (i < a.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String s = sc.nextLine();
            // c1
            // System.out.println(chuanHoa(s));

            // c2
            b46_chuanHoaHoTen chx = new b46_chuanHoaHoTen();
            s = chx.chuanHoa(s);
            System.out.println(s);
            t--;
        }
    }
}
