import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class station {
    private String id, name;
    private double luongMua, thoiGian;

    public station(int num, String name, double luongMua, double thoiGian) {
        this.id = String.format("T%02d", num);
        this.name = name;
        this.luongMua = luongMua;
        this.thoiGian = thoiGian;
    }

    // public String get_id(){
    // return this.id;
    // }

    public String get_name() {
        return this.name;
    }

    public void add_luongMua(double x) {
        this.luongMua += x;
    }

    public void add_thoiGian(double x) {
        this.thoiGian += x;
    }

    public String toString() {
        return id + " " + name + " " + String.format("%.2f", luongMua / thoiGian);
    }
}

/**
 * b261_luongMuaTrungBinh
 */
public class b261_luongMuaTrungBinh {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<station> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            String name = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date bd = sdf.parse(sc.nextLine());
            Date kt = sdf.parse(sc.nextLine());
            double thoiGian = 1.0 * (kt.getTime() - bd.getTime()) / (3600 * 1000);
            double luongMua = Double.parseDouble(sc.nextLine());
            boolean isExist = false;
            for (station j : arr) {
                if (j.get_name().equals(name)) {
                    j.add_thoiGian(thoiGian);
                    j.add_luongMua(luongMua);
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                arr.add(new station(i, name, luongMua, thoiGian));
            }
        }
        for (station i : arr) {
            System.out.println(i);
        }
    }
}