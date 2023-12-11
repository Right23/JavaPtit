import java.util.Arrays;
import java.util.Scanner;

class sv999 implements Comparable<sv999> {
    private String id, name, lop;
    private float m1, m2, m3;

    public sv999(String id, String name, String lop, float m1, float m2, float m3) {
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

    public int compareTo(sv999 o) {
        return this.id.compareTo(o.id);
    }
}

public class b180_bangDiemThanhPhan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sv999[] arr = new sv999[n];
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            float m1 = Float.parseFloat(sc.nextLine());
            float m2 = Float.parseFloat(sc.nextLine());
            float m3 = Float.parseFloat(sc.nextLine());
            arr[i] = new sv999(id, name, lop, m1, m2, m3);
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " " + arr[i]);
        }
    }
}
