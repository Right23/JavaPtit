import java.util.Arrays;
import java.util.Scanner;

class sv998 implements Comparable<sv998> {
    private String id, name, lop;
    private float m1, m2, m3;

    public sv998(String id, String name, String lop, float m1, float m2, float m3) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public String fm(float n) {
        return String.format("%.1f", n);
    }

    public String toString() {
        return id + " " + name + " " + lop + " " + fm(m1) + " " + fm(m2) + " " + fm(m3);
    }

    public int compareTo(sv998 o) {
        return this.name.compareTo(o.name);
    }
}

public class b181_BangDiemThanhPhan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sv998[] arr = new sv998[n];
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            float m1 = Float.parseFloat(sc.nextLine());
            float m2 = Float.parseFloat(sc.nextLine());
            float m3 = Float.parseFloat(sc.nextLine());
            arr[i] = new sv998(id, name, lop, m1, m2, m3);
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " " + arr[i]);
        }
    }
}
