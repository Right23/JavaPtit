import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Subject implements Comparable<Subject> {
    private String id, name;
    private int stc;

    public Subject(String id, String name, int stc) {
        this.id = id;
        this.name = name;
        this.stc = stc;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + stc;
    }

    public int compareTo(Subject a) {
        return name.compareTo(a.getName());
    }
}

/**
 * b95danhSachMonHoc
 */
public class b95danhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        // Subject[] subjects = new Subject[n];
        // for (int i = 0; i < n; i++) {
        // String id = sc.nextLine();
        // String name = sc.nextLine();
        // int stc = Integer.parseInt(sc.nextLine());
        // subjects[i] = new Subject(id, name, stc);
        // }
        // Arrays.sort(subjects);
        // for (Subject i : subjects) {
        // System.out.println(i);
        // }
        ArrayList<Subject> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int stc = Integer.parseInt(sc.nextLine());
            Subject x = new Subject(id, name, stc);
            arr.add(x);
        }
        Collections.sort(arr);
        for (Subject i : arr) {
            System.out.println(i);
        }
    }

}