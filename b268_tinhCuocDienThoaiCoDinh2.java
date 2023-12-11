import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Tinh {
    private String maVung, ten;
    private int giaCuoc;

    public Tinh(String maVung, String ten, int giaCuoc) {
        this.maVung = maVung;
        this.ten = ten;
        this.giaCuoc = giaCuoc;
    }

    public String get_maVung() {
        return this.maVung;
    }

    public String get_ten() {
        return this.ten;
    }

    public int get_giaCuoc() {
        return this.giaCuoc;
    }
}

class CuocGoi {
    private String sdt;
    private Date bd, kt;
    private Tinh tinh;

    public CuocGoi(String sdt, String bd, String kt, Tinh tinh) throws ParseException {
        this.sdt = sdt;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        this.bd = sdf.parse(bd);
        this.kt = sdf.parse(kt);
        this.tinh = tinh;
    }

    public int soPhutGoi() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        int m = (int) (this.kt.getTime() - this.bd.getTime()) / (1000 * 60);
        if (this.sdt.charAt(0) != '0') {
            return (int) Math.ceil(m / 3.0);
        }
        return m;
    }

    public String noiGoi() {
        if (this.sdt.charAt(0) != '0') {
            return "Noi mang";
        }
        return this.tinh.get_ten();
    }

    public int tongTien() {
        if (this.sdt.charAt(0) != '0') {
            return this.soPhutGoi() * 800;
        }
        return this.soPhutGoi() * this.tinh.get_giaCuoc();
    }

    public String toString() {
        return this.sdt + " " + this.noiGoi() + " " + this.soPhutGoi() + " " + this.tongTien();
    }
}

public class b268_tinhCuocDienThoaiCoDinh2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tinh> arr_Tinh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String maVung = sc.nextLine();
            String ten = sc.nextLine();
            int giaCuoc = Integer.parseInt(sc.nextLine());
            arr_Tinh.add(new Tinh(maVung, ten, giaCuoc));
        }

        int m = Integer.parseInt(sc.nextLine());
        ArrayList<CuocGoi> arr_CuocGoi = new ArrayList<>();
        while (m-- > 0) {
            String sdt = sc.next();
            String bd = sc.next();
            String kt = sc.next();

            Tinh t = null;
            if (sdt.startsWith("0")) {
                String maVung = sdt.substring(1, 3);
                for (Tinh i : arr_Tinh) {
                    if (i.get_maVung().equals(maVung)) {
                        t = i;
                        break;
                    }
                }
            }
            arr_CuocGoi.add(new CuocGoi(sdt, bd, kt, t));
        }
        arr_CuocGoi.sort(Comparator.comparing(CuocGoi::tongTien, Comparator.reverseOrder()));
        for (CuocGoi i : arr_CuocGoi) {
            System.out.println(i);
        }
    }
}
