import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student2 implements Comparable<Student2> {
    private String id, name, status;
    private float lt, ol, test;
    public static int num = 1;

    public Student2(String name, float lt, float ol, float test) {
        this.name = normalize(name);
        this.lt = lt;
        this.ol = ol;
        this.test = test;
        this.id = String.format("SV%02d", num++);
        this.status = getStatus();
    }

    private String normalize(String name) {
        String words[] = name.trim().split("\\s+");
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

    public Float avg() {
        // return (2.5f*lt+3.5f*ol+4.0f*test);
        return (25 * lt + 35 * ol + 40 * test) / 100;
    }

    public String getStatus() {
        if (avg() >= 8) {
            return "GIOI";
        } else if (avg() >= 6.5) {
            return "KHA";
        } else if (avg() >= 5) {
            return "TRUNG BINH";
        } else {
            return "KEM";
        }
    }

    public String toString() {
        return id + " " + name + " " + String.format("%.2f", avg()) + " " + status;
    }

    public int compareTo(Student2 o) {
        if (this.avg() > o.avg()) {
            return -1;
        }
        return 1;
    }
}

public class b106XepLoai {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        // Scanner sc = new Scanner(System.in);
        ArrayList<Student2> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine().trim();
            float lt = Float.parseFloat(sc.nextLine().trim());
            float ol = Float.parseFloat(sc.nextLine().trim());
            float test = Float.parseFloat(sc.nextLine().trim());
            Student2 a = new Student2(name, lt, ol, test);
            arr.add(a);
        }
        Collections.sort(arr);
        for (Student2 i : arr) {
            System.out.println(i);
        }
    }
}
