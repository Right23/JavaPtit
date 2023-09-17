import java.math.BigInteger;
import java.util.Scanner;

public class b62_boiSoChungNhoNhat {
    public static BigInteger lcm(BigInteger a, BigInteger b) {
        BigInteger mul = a.multiply(b);
        BigInteger gcd = a.gcd(b);
        BigInteger lcm = mul.divide(gcd);
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(lcm(a, b));
        }
    }

}
