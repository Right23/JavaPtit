import java.util.Scanner;

class gv {
    private String maNgach;
    private String name;
    private int heSoLuong, allowance, baseSalary;

    public gv() {

    }

    public gv(String maNgach, String name, int baseSalary) {
        this.maNgach = maNgach;
        this.name = name;
        this.baseSalary = baseSalary;

        heSoLuong = Integer.parseInt(maNgach.substring(2));

        if (maNgach.substring(0, 2).equals("HT")) {
            allowance = 2000000;
        } else if (maNgach.substring(0, 2).equals("HP")) {
            allowance = 900000;
        } else if (maNgach.substring(0, 2).equals("GV")) {
            allowance = 500000;
        }
    }

    public int getSalary() {
        return baseSalary * heSoLuong + allowance;
    }

    public String toString() {
        return maNgach + " " + name + " " + heSoLuong + " " + allowance + " " + getSalary();
    }
}

public class b74_tinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maNgach = sc.nextLine();
        String name = sc.nextLine();
        int baseSalary = sc.nextInt();
        gv a = new gv(maNgach, name, baseSalary);
        System.out.println(a);
    }
}
