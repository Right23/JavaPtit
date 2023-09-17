import java.util.Scanner;

class PhanSo {
    long tu, mau;

    PhanSo() {
        tu = 0;
        mau = 0;
    }

    PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public String rutGon() {
        long g = gcd(tu, mau);
        tu /= g;
        mau /= g;
        return (tu + "/" + mau);
    }
}

public class b69_tongPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        PhanSo f = new PhanSo(a * d + b * c, b * d);
        System.out.println(f.rutGon());
    }
}
