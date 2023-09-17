import java.util.Scanner;

public class b47_chuanHoaXauHoTen2 {
    public static String xoaSpace(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        return s;
    }

    public static String chuanHoa(String s) {
        s = xoaSpace(s);
        String a[] = s.split(" ");// mang a luu cac tu cua xau
        String res = "";// luu kq
        for (int i = 1; i < a.length; i++) {
            String tmp = a[i].substring(1, a[i].length()).toLowerCase();
            res += String.valueOf(a[i].charAt(0)).toUpperCase() + tmp;
            if (i < a.length - 1) {
                res += " ";
            } else if (i < a.length) {
                res += ", ";
            }
        }
        res += a[0].toUpperCase();
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
            b47_chuanHoaXauHoTen2 chx2 = new b47_chuanHoaXauHoTen2();
            s = chx2.chuanHoa(s);
            System.out.println(s);
            t--;
        }
    }
}
