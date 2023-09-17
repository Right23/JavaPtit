import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

class SinhVien {
    String ten, MSV = "B20DCCN001", ns, lop;
    float gpa;

    // public SinhVien() {
    // ten = ns = lop = "";
    // gpa = 0;
    // }
    public SinhVien() {
        this("", "", "", 0f);
    }

    public SinhVien(String ten, String lop, String ns, float gpa) {
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }

    public String formathNs() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(ns);
            return formatter.format(date);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }

    public String toString() {
        return MSV + " " + ten + " " + lop + " " + formathNs() + " " + String.format("%.2f", gpa);
    }
}

public class b71_khaiBaoLopSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String lop = sc.nextLine();
        String ns = sc.nextLine();
        float gpa = sc.nextFloat();
        SinhVien sv = new SinhVien(ten, lop, ns, gpa);
        System.out.println(sv);
    }
}
