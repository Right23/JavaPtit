import java.util.Scanner;
// import java.lang.Math;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair of(K key, V value) {
        return new Pair<>(key, value);
    }

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

    public boolean isPrime() {
        if (checkPrime(Integer.parseInt(key.toString())) && checkPrime(Integer.parseInt(value.toString()))) {
            return true;
        }
        return false;
    }

    public String toString() {
        return key + " " + value;
    }
}

public class b158_lopPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean ok = false;
            for (int i = 2; i <= n / 2; i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                System.out.println(-1);
            }
        }
    }
}
