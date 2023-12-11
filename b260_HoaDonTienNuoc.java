import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//////////////// tinh cong don phu phi tung muc
class KH {
    private String maKH, tenKh;
    private int chiSoCu, chiSoMoi;

    public KH(int id, String tenKh, int chiSoCu, int chiSoMoi) {
        this.maKH = "KH" + String.format("%02d", id);
        this.tenKh = tenKh;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public int thanhTien() {
        int tieuThu = this.chiSoMoi - this.chiSoCu;
        if (tieuThu <= 50) {
            return (int) Math.round(1.02 * tieuThu * 100);
        }
        if (tieuThu <= 100) {
            return (int) Math.round(1.03 * (5000 + (tieuThu - 50) * 150));
        }
        return (int) Math.round(1.05 * (12500 + (tieuThu - 100) * 200));
    }

    @Override
    public String toString() {
        return this.maKH + " " + this.tenKh + " " + this.thanhTien();
    }
}

public class b260_HoaDonTienNuoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KH> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new KH(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<KH>() {
            @Override
            public int compare(KH o1, KH o2) {
                return o2.thanhTien() - o1.thanhTien();
            }
        });
        for (KH x : list) {
            System.out.println(x);
        }
    }
}