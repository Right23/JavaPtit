import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class cpt implements Comparable<cpt> {
    private String id, name, status;
    private float mark;
    private int rank;
    public static int num = 1;

    public cpt(String n, float m) {
        this.id = String.format("HS%02d", num++);
        this.name = n;
        this.mark = m;
        this.status = get_status();
    }

    public float get_mark() {
        return this.mark;
    }

    public String get_name() {
        return this.name;
    }

    public String get_id() {
        return this.id;
    }

    public void set_rank(int x) {
        this.rank = x;
    }

    public String get_status() {
        String res = "";
        if (this.mark >= 9) {
            res = "Gioi";
        } else if (this.mark >= 7) {
            res = "Kha";
        } else if (this.mark >= 5) {
            res = "Trung Binh";
        } else {
            res = "Yeu";
        }
        return res;
    }

    public String toString() {
        return id + " " + name + " " + String.format("%.1f", mark) + " " + status + " " + rank;
    }

    public int compareTo(cpt o) {
        if (this.mark > o.get_mark()) {
            return -1;
        }
        return 1;
    }
}

public class b202XepHangHocSinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        cpt[] arr = new cpt[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            float mark = Float.parseFloat(sc.nextLine());
            cpt stu = new cpt(name, mark);
            arr[i] = stu;
        }
        cpt[] tmp = new cpt[n];
        System.arraycopy(arr, 0, tmp, 0, arr.length);

        Arrays.sort(arr);
        int rank = 1;
        float pre_mark = -1;
        int addition_rank = 0;
        for (int i = 0; i < arr.length; i++) {
            cpt o = arr[i];
            if (o.get_mark() != pre_mark) {
                rank += addition_rank;
                addition_rank = 1;
            } else {
                addition_rank++;
            }
            o.set_rank(rank);
            pre_mark = o.get_mark();
        }
        for (int i = 0; i < tmp.length; i++) {
            cpt o = tmp[i];
            for (int j = 0; j < arr.length; j++) {
                cpt x = arr[j];
                if (o.get_id().equals(x.get_id())) {
                    System.out.println(o);
                    break;
                }
            }
        }

        // for (cpt i : tmp) {
        // System.out.println(i);
        // }
    }
}
// 3
// Tran Minh Hieu
// 5.9
// Nguyen Bao Trung
// 8.6
// Le Hong Ha
// 9.2