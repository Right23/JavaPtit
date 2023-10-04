import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Student {
    private String id, name, lop, dob;
    public static int Num_Student = 1;
    private float gpa;

    public Student(String name, String lop, String dob, float gpa) throws IOException, ParseException {
        this.id = "B20DCCN" + String.format("%03d", Num_Student++);
        this.name = name;
        this.lop = lop;
        this.gpa = gpa;

        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        this.dob = formatter.format(formatter.parse(dob));
    }

    public String toString() {
        return id + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
}

public class b85danhSachSinhVienTrongFile2 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String dob = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            Student stu = new Student(name, lop, dob, gpa);
            System.out.println(stu);
        }
    }
}
