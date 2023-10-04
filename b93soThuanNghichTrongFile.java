import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class b93soThuanNghichTrongFile {
    public static boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        if (!sb.toString().equals(s)) {
            return false;
        }
        if (s.length() % 2 == 0 || s.length() == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int dd[] = new int[1000001];
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> a1 = (ArrayList<Integer>) ois1.readObject();

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> a2 = (ArrayList<Integer>) ois2.readObject();
        for (Integer i : a1) {
            if (isValid(i.toString()) && a2.contains(i)) {
                dd[i] += 1;
            }
        }
        for (Integer i : a2) {
            if (isValid(i.toString()) && dd[i] != 0) {
                dd[i]++;
            }
        }
        int cnt = 0;
        for (int i = 0; i <= 1000000; i++) {
            if (dd[i] > 0) {
                cnt++;
                System.out.println(i + " " + dd[i]);
            }
            if (cnt == 10) {
                break;
            }
        }
    }
}
