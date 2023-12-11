import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MH2 {
    private String id, name;
    private int soluong;

    public MH2(String id, int soluong) {
        this.id = id;
        this.soluong = soluong;
    }

    public long get_tax() {
        String tmp = id.substring(0, 1);
        double res = 0;
        if (tmp.equals("N")) {
            res = 0.02;
        } else if (tmp.equals("D")) {
            res = 0.035;
        } else if (tmp.equals("X")) {
            res = 0.03;
        }
        if (id.substring(id.length() - 2, id.length()).equals("TN")) {
            res = 0;
        }
        return (long) (1l * get_price() * soluong * res);
    }

    public int get_price() {
        String tmp = id.substring(0, 1);
        if (tmp.equals("N")) {
            return 9700;
        } else if (tmp.equals("D")) {
            return 11200;
        }
        return 128000;
    }

    public String get_name() {
        String tmp = id.substring(3, 5);
        String res = "";
        if (tmp.equals("BP")) {
            res = "British Petro";
        } else if (tmp.equals("ES")) {
            res = "Esso";
        } else if (tmp.equals("SH")) {
            res = "Shell";
        } else if (tmp.equals("CA")) {
            res = "Castrol";
        } else if (tmp.equals("MO")) {
            res = "Mobil";
        } else if (tmp.equals("TN")) {
            res = "Trong Nuoc";
        }
        return res;
    }

    public long get_total() {
        return 1l * get_price() * soluong + get_tax();
    }

    public String toString() {
        return id + " " + get_name() + " " + get_price() + " " + get_tax() + " " + get_total();
    }

    // public int compareTo(MH2 o) {
    // if (this.get_total() < o.get_total()) {
    // return 1;
    // }
    // return -1;
    // }
}

public class b211_SapXepGiaBanXangDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MH2> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id = sc.next();
            int soluong = sc.nextInt();
            arr.add(new MH2(id, soluong));
        }
        Collections.sort(arr, new Comparator<MH2>() {
            public int compare(MH2 o1, MH2 o2) {
                if (o1.get_total() < o2.get_total()) {
                    return 1;
                }
                return -1;
            }
        });
        for (MH2 i : arr) {
            System.out.println(i);
        }
    }
}
