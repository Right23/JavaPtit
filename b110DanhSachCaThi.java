import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class CaThi implements Comparable<CaThi> {
    private String code, date, time, roomId;
    public static int num = 1;

    public CaThi(String date, String time, String roomId) {
        this.code = String.format("C%03d", num++);
        this.date = date;
        this.time = time;
        this.roomId = roomId;
    }

    public String getCode() {
        return code;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String toString() {
        return code + " " + date + " " + time + " " + roomId;
    }

    public int compareTo(CaThi o) {
        if (this.date.equals(o.date)) {
            if (this.time.equals(o.time)) {
                return this.code.compareTo(o.code);
            } else {
                return this.time.compareTo(o.time);
            }
        }
        return this.date.compareTo(o.date);
    }
}

public class b110DanhSachCaThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        ArrayList<CaThi> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String date = sc.nextLine();
            String time = sc.nextLine();
            String roomId = sc.nextLine();
            arr.add(new CaThi(date, time, roomId));
        }
        Collections.sort(arr);
        for (CaThi i : arr) {
            System.out.println(i);
        }
    }
}
