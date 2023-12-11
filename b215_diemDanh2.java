import java.util.ArrayList;
import java.util.Scanner;

class sv996 {
    private String name, code, lop;
    private int diemcc;

    public sv996(String code, String name, String lop) {
        this.code = code;
        this.name = name;
        this.lop = lop;
    }

    public sv996() {
    }

    public String get_code() {
        return this.code;
    }

    public String get_name() {
        return this.name;
    }

    public String get_lop() {
        return this.lop;
    }

    public void set_diemcc(String s) {
        int tmp = 10;
        for (int i = 0; i < 10; i++) {
            if (s.charAt(i) == 'v') {
                tmp -= 2;
            } else if (s.charAt(i) == 'm') {
                tmp -= 1;
            }
        }
        this.diemcc = tmp > 0 ? tmp : 0;
    }

    public String get_stt() {
        if (diemcc == 0) {
            return "KDDK";
        }
        return "";
    }

    public String toString() {
        return code + " " + name + " " + lop + " " + diemcc + " " + get_stt();
    }
}

/**
 * b214_DiemDanh1
 */
public class b215_diemDanh2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int q = n;
        ArrayList<sv996> arr = new ArrayList<>();
        while (n-- != 0) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            sv996 x = new sv996(code, name, lop);
            arr.add(x);
        }
        while (q-- > 0) {
            String line[] = sc.nextLine().split(" ");
            String ma = line[0];
            String atd = line[1];
            for (sv996 i : arr) {
                if (i.get_code().equals(ma)) {
                    i.set_diemcc(atd);
                }
            }
        }
        String lop_can_in = sc.nextLine();
        for (sv996 i : arr) {
            if (i.get_lop().equals(lop_can_in)) {
                System.out.println(i.toString());
            }
        }
    }
}

// dung ke thua chua nghi ra cach in theo thu tu ban dau

// class stdd extends sv996 {
// private int diemcc;
// private String stt;

// public stdd(String code, String name, String lop, String atd) {// attendance
// super(code, name, lop);
// this.diemcc = calculate_diemcc(atd);
// }

// private int calculate_diemcc(String s) {
// int tmp = 10;
// for (int i = 0; i < 10; i++) {
// if (s.charAt(i) == 'v') {
// tmp -= 2;
// } else if (s.charAt(i) == 'm') {
// tmp -= 1;
// }
// }
// int mark = tmp > 0 ? tmp : 0;
// return mark;
// }

// public String get_stt() {
// if (this.diemcc == 0) {
// return "KDDK";
// }
// return "";
// }

// public String toString() {
// return super.toString() + " " + diemcc + " " + get_stt();
// }
// }

// public class b214_DiemDanh1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// ArrayList<sv996> arr1 = new ArrayList<>();
// int n = Integer.parseInt(sc.nextLine());
// int q = n;
// while (n-- > 0) {
// String code = sc.nextLine();
// String name = sc.nextLine();
// String lop = sc.nextLine();
// arr1.add(new sv996(code, name, lop));
// }

// ArrayList<stdd> arr2 = new ArrayList<>();
// while (q-- > 0) {
// sv996 a = new sv996();
// String line[] = sc.nextLine().split(" ");
// String ma = line[0];
// String atd = line[1];
// for (sv996 i : arr1) {
// if (i.get_code().equals(ma)) {
// a = i;
// break;
// }
// }
// arr2.add(new stdd(a.get_code(), a.get_name(), a.get_lop(), atd));
// }
// for (stdd i : arr2) {
// System.out.println(i);
// }
// }
// }
