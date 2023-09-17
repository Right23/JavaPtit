import java.util.Scanner;

/**
 * b156_soPhuc
 */
class SP {
    private int re, im;

    public SP(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public static SP sum2SP(SP a, SP b) {
        return new SP(a.re + b.re, a.im + b.im);
    }

    public static SP mul2SP(SP a, SP b) {
        return new SP(a.re * b.re - a.im * b.im, a.re * b.im + a.im * b.re);
    }

    public String toString() {
        String res = "";
        res += re + " ";
        if (im >= 0) {
            res += "+ " + im + "i";
        } else {
            res += "- " + (-im) + "i";
        }
        return res;
    }

}

public class b156_soPhuc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            SP a = new SP(sc.nextInt(), sc.nextInt());
            SP b = new SP(sc.nextInt(), sc.nextInt());
            SP c = SP.mul2SP(SP.sum2SP(a, b), a);
            SP d = SP.mul2SP(SP.sum2SP(a, b), SP.sum2SP(a, b));
            System.out.println(c + ", " + d);
        }
    }

}