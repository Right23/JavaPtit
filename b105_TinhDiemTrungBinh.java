import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

class sv implements Comparable<sv> {
    private String id, name;
    private float t, l, h;
    private int rank;
    public static int num = 1;

    public sv(String name, float t, float l, float h) {
        this.id = String.format("SV%02d", num++);
        this.name = normalize(name);
        this.t = t;
        this.l = l;
        this.h = h;
    }

    private String normalize(String s) {
        String words[] = s.split("\\s+");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            if (i < words.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    public String get_id() {
        return this.id;
    }

    public float get_avg() {
        return (float) ((t * 3 + l * 3 + h * 2) / 8);
    }

    public void set_rank(int n) {
        this.rank = n;
    }

    public String toString() {
        return id + " " + name + " " + String.format("%.2f", get_avg()) + " " + rank;
    }

    public int compareTo(sv o) {
        if (this.get_avg() == o.get_avg()) {
            return this.get_id().compareTo(o.get_id());
        }
        if (this.get_avg() > o.get_avg()) {
            return -1;
        }
        return 1;
    }
}

public class b105_TinhDiemTrungBinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        sv[] arr = new sv[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine().trim();
            float t = Float.parseFloat(sc.nextLine().trim());
            float l = Float.parseFloat(sc.nextLine().trim());
            float h = Float.parseFloat(sc.nextLine().trim());
            arr[i] = new sv(name, t, l, h);
        }
        Arrays.sort(arr);
        int rank = 1;
        float pre_mark = -1;
        int add_rank = 0;
        for (int i = 0; i < arr.length; i++) {
            sv o = arr[i];
            if (o.get_avg() != pre_mark) {
                rank += add_rank;
                add_rank = 1;
            } else {
                add_rank++;
            }
            o.set_rank(rank);
            pre_mark = o.get_avg();
        }
        // Arrays.sort(arr);
        for (sv i : arr) {
            System.out.println(i);
        }
    }
}
