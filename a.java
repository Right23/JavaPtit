import java.util.ArrayList;
import java.util.Scanner;

class sp {
    private String name, id, ma;
    private int price, sl, bonus;

    public sp(String name, String id, int price, int sl) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.sl = sl;
        this.bonus = bonus();
        this.ma = getMa();
    }

    public String getId() {
        return this.id;
    }

    public String getMa() {
        String res = id.substring(4);
        return (res);
    }

    public int SL() {
        return this.sl;
    }

    public int gia() {
        return this.price;
    }

    public int bonus() {
        if (this.ma == "1") {
            return price * sl * 3 / 10;
        }
        return price * sl * 5 / 10;

    }

    public String stt() {
        return this.id.substring(1, 4);
    }

    public int total() {
        return gia() * SL();
    }

    public String toString() {
        return name + " " + id + " " + stt() + " " + bonus + " " + total();
    }
}

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sp> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            String id = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int sl = Integer.parseInt(sc.nextLine());
            sp x = new sp(name, id, price, sl);
            arr.add(x);
        }
        for (sp i : arr) {
            System.out.println(i);
        }
    }

}
