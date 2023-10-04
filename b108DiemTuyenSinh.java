import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private String id, name, status, kv, dantoc;
    private float bonus, mark;
    public static int num = 1;

    public Student(String name, float mark, String dantoc, String kv) {
        this.id = String.format("TS%02d", num++);
        this.name = normalize(name);
        this.mark = mark;
        this.dantoc = dantoc;
        this.kv = kv;
        this.status = getStatus();
        this.bonus = getBonus();
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

    public float getBonus() {
        float thuong = 0f;
        if (kv == "1") {
            thuong += 1.5f;
        } else if (kv == "2") {
            thuong += 1;
        }
        if (dantoc != "Kinh") {
            thuong += 1.5;
        }
        return thuong;
    }

    public Float getTong() {
        return mark + bonus;
    }

    public String getStatus() {
        float benchmark = 20.5f;
        return mark + bonus >= benchmark ? "Do" : "Truot";
    }

    public String toString() {
        return id + " " + name + " " + String.format("%.1f", getTong()) + " " + status;
    }

    public int compareTo(Student o) {
        if (this.getTong() == o.getTong()) {
            return this.id.compareTo(o.id);
        }
        return -this.getTong().compareTo(o.getTong());
    }
}

public class b108DiemTuyenSinh {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<Student> students = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            float mark = Float.parseFloat(sc.nextLine());
            String dantoc = sc.nextLine();
            String kv = sc.nextLine();
            Student x = new Student(name, mark, dantoc, kv);
            students.add(x);
        }
        Collections.sort(students);
        for (Student i : students) {
            System.out.println(i);
        }
    }
}
