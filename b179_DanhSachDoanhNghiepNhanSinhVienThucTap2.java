import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Enterprise1 implements Comparable<Enterprise1> {
    private String code, name;
    private int intern_num;

    public Enterprise1(String code, String name, int intern_num) {
        this.code = code;
        this.name = name;
        this.intern_num = intern_num;
    }

    public String getCode() {
        return code;
    }

    public int get_intern_num() {
        return this.intern_num;
    }

    public String toString() {
        return code + " " + name + " " + intern_num;
    }

    public int compareTo(Enterprise1 a) {
        if (this.get_intern_num() == a.get_intern_num()) {
            return (this.code).compareTo(a.getCode());
        }
        return -(this.get_intern_num() - a.get_intern_num());
    }
}

public class b179_DanhSachDoanhNghiepNhanSinhVienThucTap2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Enterprise1> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            int intern_num = Integer.parseInt(sc.nextLine());
            Enterprise1 x = new Enterprise1(code, name, intern_num);
            arr.add(x);
        }
        Collections.sort(arr);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for (Enterprise1 j : arr) {
                if (j.get_intern_num() >= a && j.get_intern_num() <= b) {
                    System.out.println(j);
                }
            }
        }
    }
}
