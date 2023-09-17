import java.util.Scanner;

class PhanSo {
    long tu, mau;

    PhanSo() {
        tu = 0;
        mau = 0;
    }

    PhanSo(long a, long b) {
        this.tu = a;
        this.mau = b;
    }

    private long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public String rutGon() {
        long g = gcd(tu, mau);
        return tu / g + "/" + mau / g;
    }
}

public class b68_phanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        PhanSo f = new PhanSo(tu, mau);
        System.out.println(f.rutGon());
    }
}
