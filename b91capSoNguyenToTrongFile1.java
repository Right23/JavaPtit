import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class b91capSoNguyenToTrongFile1 {
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> arl1 = (ArrayList<Integer>) ois1.readObject();
        Set<Integer> ts1 = new TreeSet<>();
        for (Integer i : arl1) {
            if (isPrime(i)) {
                ts1.add(i);
            }
        }
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> arl2 = (ArrayList<Integer>) ois2.readObject();
        Set<Integer> ts2 = new TreeSet<>();
        for (int i : arl2) {
            if (isPrime(i)) {
                ts2.add(i);
            }
        }
        final int SUM = 1000000;
        for (Integer i : ts1) {
            if (i * 2 >= SUM) {
                break;
            }
            if (ts2.contains(SUM - i)) {
                System.out.println(i + " " + (SUM - i));
            }
        }
    }

}
