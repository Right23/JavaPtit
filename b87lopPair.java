import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
// import java.lang.Math;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // public static <K, V> Pair of(K key, V value) {
    // return new Pair<>(key, value);
    // }

    public boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // public boolean isPrime() {
    // if (checkPrime(Integer.parseInt(key.toString())) &&
    // checkPrime(Integer.parseInt(value.toString()))) {
    // return true;
    // }
    // return false;
    // }

    public boolean isPrime() {
        return (checkPrime((Integer) key) && checkPrime((Integer) value));
    }

    public String toString() {
        return key + " " + value;
    }
}

public class b87lopPair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(-1);
            }
        }
    }
}
