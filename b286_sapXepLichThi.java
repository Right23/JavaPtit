import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

class MonThi {
    private String maMon, tenMon, hinhThuc;

    public MonThi(String maMon, String tenMon, String hinhThuc) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThuc = hinhThuc;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }
}

class CaThi {
    private String maCa, ngayThi, gioThi, phongThi;

    public CaThi(int i, String ngayThi, String gioThi, String phongThi) {
        this.maCa = String.format("C%03d", i);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }

    public String getMaCa() {
        return maCa;
    }

    public String getNgayThi() {
        return ngayThi;
    }

    public String getGioThi() {
        return gioThi;
    }

    public String getPhongThi() {
        return phongThi;
    }
}

class LichThi {
    private MonThi monThi;
    private CaThi caThi;
    private String maNhom;
    private int soSv;

    public LichThi(CaThi caThi, MonThi monThi, String maNhom, int soSv) {
        this.caThi = caThi;
        this.monThi = monThi;
        this.maNhom = maNhom;
        this.soSv = soSv;
    }

    public MonThi getMonThi() {
        return monThi;
    }

    public CaThi getCaThi() {
        return caThi;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public int getSoSv() {
        return soSv;
    }

    @Override
    public String toString() {
        return caThi.getNgayThi() + " " + caThi.getGioThi() + " " +
                caThi.getPhongThi() + " " + monThi.getTenMon() + " " +
                maNhom + " " + soSv;
    }

}

public class b286_sapXepLichThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        HashMap<String, MonThi> mapMonThi = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            String hinhThuc = sc.nextLine();
            mapMonThi.put(maMon, new MonThi(maMon, tenMon, hinhThuc));
        }
        sc.close();

        sc = new Scanner(new File("CATHI.in"));
        int m = Integer.parseInt(sc.nextLine());
        HashMap<String, CaThi> mapCaThi = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String maCa = String.format("C%03d", i + 1);
            String ngayThi = sc.nextLine();
            String gioThi = sc.nextLine();
            String phongThi = sc.nextLine();
            mapCaThi.put(maCa, new CaThi(i, ngayThi, gioThi, phongThi));
        }
        sc.close();

        sc = new Scanner(new File("LICHTHI.in"));
        ArrayList<LichThi> arr = new ArrayList<>();
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String maCa = sc.next(), maMon = sc.next(), maNhom = sc.next();
            int soSv = sc.nextInt();
            arr.add(new LichThi(mapCaThi.get(maCa), mapMonThi.get(maMon), maNhom, soSv));
        }

        Collections.sort(arr, new Comparator<LichThi>() {
            public int compare(LichThi o1, LichThi o2) {
                try {
                    Date d1 = new SimpleDateFormat("dd/MM/yyyy HH:mm")
                            .parse(o1.getCaThi().getNgayThi() + " " + o1.getCaThi().getGioThi());
                    Date d2 = new SimpleDateFormat("dd/MM/yyyy HH:mm")
                            .parse(o2.getCaThi().getNgayThi() + " " + o2.getCaThi().getGioThi());
                    if (d1.equals(d2)) {
                        return o1.getCaThi().getMaCa().compareTo(o2.getCaThi().getMaCa());
                    }
                    return d1.compareTo(d2);
                } catch (ParseException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                return 0;
            }
        });
        for (LichThi x : arr) {
            System.out.println(x);
        }
    }
}
