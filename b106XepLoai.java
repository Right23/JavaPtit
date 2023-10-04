import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private String id, name, status;
    private int lt, ol, test;
    public static int num = 1;

    public Student(String name, String lt, String ol, String test) {
        this.name = normalize(name);
        this.lt = Integer.parseInt(lt);
        this.ol = Integer.parseInt(ol);
        this.test = Integer.parseInt(test);
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

    public Float avg(int lt, int ol, int test) {
        // return (2.5f*lt+3.5f*ol+4.0f*test);
        return (float) ((25 * lt + 35 * ol + 40 * test) / 100);
    }

    public String getStatus() {
        if (avg(lt, ol, test) >= 8) {
            return "GIOI";
        } else if (avg(lt, ol, test) >= 6.5) {
            return "KHA";
        } else if (avg(lt, ol, test) >= 5) {
            return "TRUNGBINH";
        } else {
            return "KEM";
        }
    }

    public String toString() {
        return id + " " + name + " " + String.format("%.2f", avg(lt, ol, test)) + " " + status;
    }

    public int compareTo(Student o) {
        return -(int) (this.avg(lt, ol, test) - o.avg(lt, ol, test));
    }
}

public class b106XepLoai {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        // Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine().trim();
            String lt = sc.nextLine().trim();
            String ol = sc.nextLine().trim();
            String test = sc.nextLine().trim();
            Student a = new Student(name, lt, ol, test);
            arr.add(a);
        }
        Collections.sort(arr);
        for (Student i : arr) {
            System.out.println(i);
        }
    }
}
