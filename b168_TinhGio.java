import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Gmer implements Comparable<Gmer> {
    private String name, id, bd, kt;

    public Gmer(String id, String name, String bd, String kt) {
        this.id = id;
        this.name = name;
        this.bd = bd;
        this.kt = kt;
    }

    public int get_time() {
        int st = Integer.parseInt(this.bd.substring(0, 2)) * 60 + Integer.parseInt(this.bd.substring(3));
        int en = Integer.parseInt(this.kt.substring(0, 2)) * 60 + Integer.parseInt(this.kt.substring(3));
        return en - st;
    }

    public String str_time() {
        return String.format("%d gio %d phut", get_time() / 60, get_time() % 60);
    }

    public String toString() {
        return id + " " + name + " " + str_time();
    }

    public int compareTo(Gmer o) {
        return -(this.get_time() - o.get_time());
    }
}

public class b168_TinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gmer> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String bd = sc.nextLine();
            String kt = sc.nextLine();
            arr.add(new Gmer(id, name, bd, kt));
        }
        Collections.sort(arr);
        for (Gmer i : arr) {
            System.out.println(i);
        }
    }
}
