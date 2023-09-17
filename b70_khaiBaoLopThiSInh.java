import java.util.Scanner;

class ThiSinh {
    private String ten, ngaySinh;
    private float m1, m2, m3, tong;

    public ThiSinh() {
        ten = "";
        ngaySinh = "";
        m1 = 0;
        m2 = 0;
        m3 = 0;
    }

    public ThiSinh(String ten, String ngaySinh, float m1, float m2, float m3) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public String outPut() {
        return ten + " " + ngaySinh + " " + (m1 + m2 + m3);
    }
}

public class b70_khaiBaoLopThiSInh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String ngaySinh = sc.nextLine();
        float m1 = sc.nextFloat();
        float m2 = sc.nextFloat();
        float m3 = sc.nextFloat();
        ThiSinh a = new ThiSinh(ten, ngaySinh, m1, m2, m3);
        System.out.println(a.outPut());
    }
}
