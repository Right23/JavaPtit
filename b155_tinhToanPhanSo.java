import java.math.BigInteger;
import java.util.Scanner;

/**
 * b155_tinhToanPhanSo
 * 
 */
class PhanSo {
    private long tu;
    private long mau;

    public PhanSo(long x, long y) {
        this.tu = x;
        this.mau = y;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }

    public static long getGCD(long a, long b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger GCD = b1.gcd(b2);
        return GCD.longValue();
    }

    public static long getLCM(long a, long b) {
        // BigInteger b1 = BigInteger.valueOf(a);
        // BigInteger b2 = BigInteger.valueOf(b);
        // BigInteger tmp = b1.gcd(b2);
        // return a*b/tmp.longValue();
        return a * b / getGCD(a, b);

    }

    public static PhanSo rutGon(PhanSo a) {
        long GCD = getGCD(a.tu, a.mau);
        PhanSo ans = new PhanSo(a.tu / GCD, a.mau / GCD);
        return ans;
    }

    public PhanSo rutGon() {
        long g = getGCD(getTu(), getMau());
        return new PhanSo(getTu() / g, getMau() / g);
    }

    public static PhanSo tong(PhanSo a, PhanSo b) {
        long mc = getLCM(a.mau, b.mau);
        PhanSo ans = new PhanSo(a.tu * (mc / a.mau) + b.tu * (mc / b.mau), mc);
        return ans;
    }

    public static PhanSo tich(PhanSo a, PhanSo b) {
        PhanSo ans = new PhanSo(a.tu * b.tu, a.mau * b.mau);
        return ans;
    }

    public String toString() {
        return tu + "/" + mau;
    }
}

public class b155_tinhToanPhanSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());

            PhanSo tmp = PhanSo.tong(a, b);
            PhanSo c = PhanSo.tich(tmp, tmp).rutGon();
            // c = PhanSo.rutGon(c);
            // PhanSo d = PhanSo.tich(PhanSo.tich(a, b),
            // c).rutGon(PhanSo.tich(PhanSo.tich(a, b), c));
            PhanSo d = PhanSo.rutGon(PhanSo.tich(PhanSo.tich(a, b), c));
            System.out.println(c + " " + d);
        }
    }
}