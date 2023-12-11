import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

class bk {
    private String id, name, add;
    private Date en_time;
    private int vantoc;

    public bk(String name, String add, String endTime) throws ParseException {
        this.name = name;
        this.add = add;
        String tmp = "";
        for (String x : add.split("\\s+")) {
            tmp += Character.toUpperCase(x.charAt(0));
        }
        for (String x : name.split("\\s+")) {
            tmp += Character.toUpperCase(x.charAt(0));
        }
        this.id = tmp;

        SimpleDateFormat sdf = new SimpleDateFormat("H:mm");
        this.en_time = sdf.parse(endTime);
    }

    public Date get_enTime() {
        return en_time;
    }

    public int get_vanToc() throws ParseException {
        long t = en_time.getTime() - (new SimpleDateFormat("H:mm")).parse("6:00").getTime();
        double tg = 1.0 * t / (3600 * 1000);
        return (int) Math.round(120 / tg);
    }

    public String toString() {
        try {
            return id + " " + name + " " + add + " " + get_vanToc() + " Km/h";
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";
    }
}

public class b258_duaXeDap {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<bk> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            String add = sc.nextLine();
            String en_time = sc.nextLine();
            arr.add(new bk(name, add, en_time));
        }
        Collections.sort(arr, new Comparator<bk>() {
            public int compare(bk o1, bk o2) {
                return o1.get_enTime().compareTo(o2.get_enTime());
            }
        });
        for (bk i : arr) {
            System.out.println(i);
        }
    }
}
