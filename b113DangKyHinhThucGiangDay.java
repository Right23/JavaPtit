import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Subject implements Comparable<Subject> {
    private String id, name, methodTest, th;
    private int stc;

    public Subject(String id, String name, int stc, String method, String th) {
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

    public int compareTo(Subject a) {
        return this.getId().compareTo(a.getId());
    }

}

public class b113DangKyHinhThucGiangDay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> subjects = new ArrayList<>();
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int stc = Integer.parseInt(sc.nextLine());
            String methodTest = sc.nextLine();
            String th = sc.nextLine();
            Subject x = new Subject(id, name, stc, methodTest, th);
            subjects.add(x);
        }
        Collections.sort(subjects);
        for (Subject i : subjects) {
            System.out.println(i);
        }
    }
}
