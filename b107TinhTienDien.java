import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Customer1 implements Comparable<Customer1> {
    private String id, name, type;
    private int cnt;// cnt la so dien tieu thu
    public static int num = 1;

    public Customer1(String name, String type, int dau, int cuoi) {
        this.id = String.format("KH%02d", num++);
        this.name = normalize(name);
        this.type = type;
        this.cnt = cuoi - dau;
    }

    public String normalize(String s) {
        String words[] = s.trim().split("\\s+");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase() +
                    words[i].substring(1).toLowerCase();
            if (i < words.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    public int TinhTien() {
        int cost = 0;
        if (type.equals("A")) {
            if (cnt <= 100) {
                cost = cnt * 450;
            } else {
                cost = (cnt - 100) * 1000 + 100 * 450 + (cnt - 100) * 1000 * 5 / 100;
            }
        }
        if (type.equals("B")) {
            if (cnt <= 500) {
                cost = cnt * 450;
            } else {
                cost = (cnt - 500) * 1000 + 500 * 450 + (cnt - 500) * 1000 * 5 / 100;
            }
        }
        if (type.equals("C")) {
            if (cnt <= 200) {
                cost = cnt * 450;
            } else {
                cost = (cnt - 200) * 1000 + 200 * 450 + (cnt - 200) * 1000 * 5 / 100;
            }
        }
        return cost;
    }

    public String in_over() {
        String res = "";
        if (type.equals("A")) {
            if (cnt <= 100) {
                res = String.format("%d %d %d", cnt * 450, 0, 0);
            } else {
                res = String.format("%d %d %d", 100 * 450, (cnt - 100) * 1000, (cnt - 100) * 1000 * 5 / 100);
            }
        }
        if (type.equals("B")) {
            if (cnt <= 500) {
                res = String.format("%d %d %d", cnt * 450, 0, 0);
            } else {
                res = String.format("%d %d %d", 500 * 450, (cnt - 500) * 1000, (cnt - 500) * 1000 * 5 / 100);
            }
        }
        if (type.equals("C")) {
            if (cnt <= 200) {
                res = String.format("%d %d %d", cnt * 450, 0, 0);
            } else {
                res = String.format("%d %d %d", 200 * 450, (cnt - 200) * 1000, (cnt - 200) * 1000 * 5 / 100);
            }
        }
        return res;
    }

    public String toString() {
        return id + " " + name + " " + in_over() + " " + TinhTien();
    }

    public int compareTo(Customer1 o) {
        return -(this.TinhTien() - o.TinhTien());
    }

}

public class b107TinhTienDien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        Customer1[] arr = new Customer1[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine().trim();
            String line[] = sc.nextLine().trim().split(" ");
            String type = line[0];
            int dau = Integer.parseInt(line[1]);
            int cuoi = Integer.parseInt(line[2]);
            // int ma = Math.max(cuoi, dau);
            // int mi = Math.min(cuoi, dau);
            arr[i] = new Customer1(name, type, dau, cuoi);
        }
        Arrays.sort(arr);
        for (Customer1 i : arr) {
            System.out.println(i);
        }
    }
}
