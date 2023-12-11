import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class stu implements Comparable<stu> {
    private String name, ns, id;
    private float m1, m2, m3;
    public static int num = 1;

    public stu(String name, String ns, float m1, float m2, float m3) {
        this.name = name;
        this.ns = ns;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.id = String.format("%d", num++);
    }

    public float get_mark() {
        return (m1 + m2 + m3);
    }

    public String get_id() {
        return this.id;
    }

    public String toString() {
        return id + " " + name + " " + ns + " " + get_mark();
    }

    public int compareTo(stu o) {
        if (this.get_mark() == o.get_mark()) {
            return this.get_id().compareTo(o.get_id());
        }
        return (int) (this.get_mark() - o.get_mark());
    }
}

public class b166_TimThuKhoaCuaKyThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<stu> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            String ns = sc.nextLine();
            float m1 = Float.parseFloat(sc.nextLine());
            float m2 = Float.parseFloat(sc.nextLine());
            float m3 = Float.parseFloat(sc.nextLine());
            stu x = new stu(name, ns, m1, m2, m3);
            arr.add(x);
        }
        float res = 0;
        for (stu i : arr) {
            if (i.get_mark() > res) {
                res = i.get_mark();
            }
        }
        Collections.sort(arr);
        for (stu i : arr) {
            if (i.get_mark() == res) {
                System.out.println(i);
            }
        }
    }
}
