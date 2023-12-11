import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Subject1 implements Comparable<Subject1> {
    private String id, name, methodTest, th;
    private int stc;

    public Subject1(String id, String name, int stc, String method, String th) {
        this.id = id;
        this.name = name;
        this.stc = stc;
        this.methodTest = method;
        this.th = th;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return id + " " + name + " " + stc + " " + methodTest + " " + th;
    }

    public int compareTo(Subject1 a) {
        return this.getId().compareTo(a.getId());
    }

    public String get_TH() {
        return this.th;
    }

}

public class b113DangKyHinhThucGiangDay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject1> subject1s = new ArrayList<>();
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int stc = Integer.parseInt(sc.nextLine());
            String methodTest = sc.nextLine();
            String th = sc.nextLine();
            Subject1 x = new Subject1(id, name, stc, methodTest, th);
            subject1s.add(x);
        }
        ArrayList<Subject1> tmp = new ArrayList<>();
        for (int i = 0; i < subject1s.size(); i++) {
            Subject1 x = subject1s.get(i);
            if (x.get_TH().equals("Truc tuyen") || x.get_TH().contains(".ptit.edu.vn")) {
                tmp.add(x);
            }
        }
        Collections.sort(tmp);
        for (Subject1 i : tmp) {
            System.out.println(i);
        }
    }
}
