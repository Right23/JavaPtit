import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class b90soNguyenToLonNhatTrongFile {
    public static int[] prime = new int[1000001];

    public static void sieve() {
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= 1000; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j < 1000001; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sieve();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) ois.readObject();
        int dd[] = new int[(int) 1e6 + 1];
        for (Integer i : list) {
            dd[i] += prime[i];
        }
        int cnt = 0;// dem so luong so nguyen to
        for (int i = 1000000; i >= 2; i--) {
            if (dd[i] > 0) {
                System.out.println(i + " " + dd[i]);
                cnt++;
                if (cnt == 10) {
                    break;
                }
            }
        }
    }
}
