import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

class hm {
    private String name;
    private int rlt; // real life time

    public hm(String name, Date dob) {
        this.name = name;
        this.rlt = calculate_time(dob);
    }

    private int calculate_time(Date x) {
        long day_num = x.getTime();
        return (int) (day_num / (1000 * 3600 * 24));
    }

    public int get_rlt() {
        return this.rlt;
    }

    public String toString() {
        return this.name;
    }

}

public class b182_TreNhatGiaNhat {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<hm> arr = new ArrayList<>();
        while (n-- > 0) {
            String name = sc.next();
            Date dob = sdf.parse(sc.next());
            arr.add(new hm(name, dob));
        }

        Collections.sort(arr, new Comparator<hm>() {
            public int compare(hm o1, hm o2) {
                return -(int) (o1.get_rlt() - (o2.get_rlt()));
            }
        });
        // for (hm i : arr) {
        // System.out.println(i);
        // }
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size() - 1));
    }
}
