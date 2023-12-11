import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MH implements Comparable<MH> {
    private String name, code;
    private int price, sl;

    public MH(String name, String code, int price, int sl) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.sl = sl;
    }

    public float discount() {
        String tmp = (this.code).substring(4);
        if (tmp.equals("1")) {
            return 0.5f;
        }
        return 0.3f;
    }

    public String toString() {
        return name + " " + code + " " + (this.code).substring(1, 4) + " " + (int) (sl * price * discount()) + " "
                + (int) (sl * price - sl * price * discount());
    }

    public int compareTo(MH o) {
        return ((this.code).substring(1, 4)).compareTo((o.code).substring(1, 4));
    }
}

public class b201_SapXepDonHang {
    public static void main(String[] args) {
        ArrayList<MH> arrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            String code = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int sl = Integer.parseInt(sc.nextLine());
            arrList.add(new MH(name, code, price, sl));
        }
        Collections.sort(arrList);
        for (MH i : arrList) {
            System.out.println(i);
        }
    }
}
