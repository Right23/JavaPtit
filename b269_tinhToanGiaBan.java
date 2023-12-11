import java.util.ArrayList;
import java.util.Scanner;

class mh97 {
    private String id;
    private int price, sl;

    public mh97(String id, int price, int sl) {
        this.id = id;
        this.price = price;
        this.sl = sl;
    }

    public double get_thue_ship() {
        double bonus = 0.0;
        if (this.id.substring(3).equals("C")) {
            String tmp = this.id.substring(0, 1);
            if (tmp.equals("T")) {
                bonus += 0.29 * 0.95 + 0.04;
            } else if (tmp.equals("C")) {
                bonus += 0.1 * 0.95 + 0.03;
            } else if (tmp.equals("D")) {
                bonus += 0.08 * 0.95 + 0.025;
            } else if (tmp.equals("M")) {
                bonus += 0.02 * 0.95 + 0.005;
            }
        } else {
            String tmp = this.id.substring(0, 1);
            if (tmp.equals("T")) {
                bonus += 0.33;
            } else if (tmp.equals("C")) {
                bonus += 0.13;
            } else if (tmp.equals("D")) {
                bonus += 0.105;
            } else if (tmp.equals("M")) {
                bonus += 0.025;
            }
        }
        return 1 + bonus;
    }

    public double get_giaBan() {
        // double tmp = this.get_thue_ship()*price*sl*1.2/sl;
        return this.get_thue_ship() * price * 1.2;
    }

    public String toString() {
        return id + " " + String.format("%.2f", this.get_giaBan());
    }
}

public class b269_tinhToanGiaBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<mh97> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id = sc.next();
            int price = sc.nextInt();
            int sl = sc.nextInt();
            arr.add(new mh97(id, price, sl));
        }
        for (mh97 i : arr) {
            System.out.println(i);
        }
    }
}