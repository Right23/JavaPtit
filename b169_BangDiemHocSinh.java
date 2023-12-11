import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class hs2 implements Comparable<hs2> {
    private String id, name;
    private float avg;
    public static int num = 1;

    public hs2(String name, Float[] mark) {
        this.id = String.format("HS%02d", num++);
        this.name = name;
        avg = 0;
        for (int i = 0; i < 10; i++) {
            avg += mark[i] * ((i == 0 || i == 1) ? 2f : 1f);
        }
        avg /= 12;
        avg = Math.round(avg * 10) / 10;
    }

    public String get_status() {
        String res = "";
        if (avg >= 9) {
            res = "XUAT SAC";
        } else if (avg >= 8) {
            res = "GIOI";
        } else if (avg >= 7) {
            res = "KHA";
        } else if (avg >= 5) {
            res = "TB";
        } else {
            res = "YEU";
        }
        return res;
    }

    public float get_avg() {
        return this.avg;
    }

    public String get_id() {
        return this.id;
    }

    public String toString() {
        return id + " " + name + " " + String.format("%.1f", avg) + " " + get_status();
    }

    public int compareTo(hs2 o) {
        if (this.avg == o.get_avg()) {
            return this.id.compareTo(o.get_id());
        }
        return (int) (this.avg - o.get_avg());
    }
}

public class b169_BangDiemHocSinh {
    public static void main(String[] args) {
        ArrayList<hs2> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            Float mark[] = new Float[10];
            for (int i = 0; i < 10; i++) {
                mark[i] = sc.nextFloat();
            }
            arr.add(new hs2(name, mark));
        }
        Collections.sort(arr);
        for (hs2 i : arr) {
            System.out.println(i);
        }
    }
}
