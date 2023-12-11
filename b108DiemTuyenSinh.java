import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student1 implements Comparable<Student1> {
    private String id, name, status, kv, dantoc;
    private float mark;
    public static int num = 1;

    public Student1(String name, float mark, String dantoc, String kv) {
        this.id = String.format("TS%02d", num++);
        this.name = normalize(name);
        this.mark = mark;
        this.dantoc = dantoc;
        this.kv = kv;
        this.status = getStatus();
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
        if (kv.equals("1")) {
            thuong += 1.5f;
        } else if (kv.equals("2")) {
            thuong += 1f;
        }
        if (!dantoc.equals("Kinh")) {
            thuong += 1.5f;
        }
        return thuong;
    }

    public Float getTong() {
        return mark + getBonus();
    }

    public String getStatus() {
        float benchmark = 20.5f;
        return getTong() >= benchmark ? "Do" : "Truot";
    }

    public String toString() {
        return id + " " + name + " " + String.format("%.1f", getTong()) + " " + status;
    }

    public int compareTo(Student1 o) {
        if (this.getTong() == o.getTong()) {
            return this.id.compareTo(o.id);
        }
        if (this.getTong() > o.getTong()) {
            return -1;
        }
        return 1;
    }
}

public class b108DiemTuyenSinh {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<Student1> student1s = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        while (n-- > 0) {
            String name = sc.nextLine().trim();
            float mark = Float.parseFloat(sc.nextLine().trim());
            String dantoc = sc.nextLine().trim();
            String kv = sc.nextLine().trim();
            Student1 x = new Student1(name, mark, dantoc, kv);
            student1s.add(x);
        }
        Collections.sort(student1s);
        for (Student1 i : student1s) {
            System.out.println(i);
        }
    }
}
