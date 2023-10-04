import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Subject implements Comparable<Subject> {
    private String id, name, methodTest;

    public Subject(String id, String name, String method) {
        this.id = id;
        this.name = name;
        this.methodTest = method;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return id + " " + name + " " + methodTest;
    }

    public int compareTo(Subject a) {
        return this.getId().compareTo(a.getId());
    }

}

public class b109DanhSachMonThi {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> subjects = new ArrayList<>();
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String methodTest = sc.nextLine();
            Subject x = new Subject(id, name, methodTest);
            subjects.add(x);
        }
        Collections.sort(subjects);
        for (Subject i : subjects) {
            System.out.println(i);
        }
    }
}
