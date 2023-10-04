import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Enterprise implements Comparable<Enterprise> {
    private String code, name;
    private int intern_num;

    public Enterprise(String code, String name, int intern_num) {
        this.code = code;
        this.name = name;
        this.intern_num = intern_num;
    }

    public String getCode() {
        return code;
    }

    public String toString() {
        return code + " " + name + " " + intern_num;
    }

    public int compareTo(Enterprise a) {
        return code.compareTo(a.getCode());
    }
}

public class b96danhSachDoanhNghiep {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        // Enterprise[] enterprises = new Enterprise[n];
        // for (int i = 0; i < n; i++) {
        // String code = sc.nextLine();
        // String name = sc.nextLine();
        // int intern_num = Integer.parseInt(sc.nextLine());
        // enterprises[i] = new Enterprise(code, name, intern_num);
        // }
        // Arrays.sort(enterprises);
        // for (Enterprise i : enterprises) {
        // System.out.println(i);
        // }
        ArrayList<Enterprise> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            int intern_num = Integer.parseInt(sc.nextLine());
            Enterprise x = new Enterprise(code, name, intern_num);
            arr.add(x);
        }
        Collections.sort(arr);
        for (Enterprise i : arr) {
            System.out.println(i);
        }
    }
}
