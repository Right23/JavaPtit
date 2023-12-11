import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Enterprise2 implements Comparable<Enterprise2> {
    private String code, name;
    private int intern_num;

    public Enterprise2(String code, String name, int intern_num) {
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

    public int compareTo(Enterprise2 a) {
        if (this.get_intern_num() == a.get_intern_num()) {
            return (this.code).compareTo(a.getCode());
        }
        return -(this.get_intern_num() - a.get_intern_num());
    }
}

public class b178_DanhSachDoanhNghiepNhanSinhVienThucTap1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Enterprise2> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            int intern_num = Integer.parseInt(sc.nextLine());
            Enterprise2 x = new Enterprise2(code, name, intern_num);
            arr.add(x);
        }
        Collections.sort(arr);
        for (Enterprise2 i : arr) {
            System.out.println(i);
        }
    }
}
