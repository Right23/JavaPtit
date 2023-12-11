import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Cus2 implements Comparable<Cus2> {
    private String id, name, gender, ns, address;
    private int age;
    public static int num = 1;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Cus2(String name, String gender, String ns, String address) throws ParseException {
        this.id = String.format("KH%03d", num++);
        this.name = normalize(name);
        this.gender = gender;
        this.ns = normalize_dob(ns);
        this.address = address;
        LocalDate date_of_birth = LocalDate.parse(this.ns, dtf);
        this.age = 2021 - date_of_birth.getYear();
    }

    public String normalize_dob(String s) {
        if (String.valueOf(s.charAt(1)).equals("/")) {
            s = "0" + s;
        }
        if (String.valueOf(s.charAt(4)).equals("/")) {
            s = s.substring(0, 3) + "0" + s.substring(3);
        }
        return s;
    }

    public String normalize(String s) {
        String res = "";
        String words[] = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            if (i < words.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    public String toString() {
        return id + " " + (name) + " " + gender + " " + address + " " + ns;
    }

    public int compareTo(Cus2 o) {
        String[] arr1 = this.ns.split("/");
        String[] arr2 = o.ns.split("/");
        String cm1 = arr1[2] + arr1[1] + arr1[0];
        String cm2 = arr2[2] + arr2[1] + arr2[0];
        return cm1.compareTo(cm2);
        // return -(int) (this.age - o.age);
    }

}

public class b221_DanhSachKhachHang {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<Cus2> arr = new ArrayList<>();
        while (n-- > 0) {
            arr.add(new Cus2(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim()));
        }
        Collections.sort(arr);
        for (Cus2 i : arr) {
            System.out.println(i);
        }
    }
}
