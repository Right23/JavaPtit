import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Customer implements Comparable<Customer> {
    private String idCus, name, idRoom;
    private Long duration;
    public static int roomNum = 1;

    public Customer(String name, String idRoom, Long duration) {
        this.idCus = "KH" + String.format("%02d", roomNum++);
        this.name = name;
        this.idRoom = idRoom;
        this.duration = duration;
    }

    public Long getDuration() {
        return duration;
    }

    public String toString() {
        return idCus + " " + name + " " + idRoom + " " + duration;
    }

    public int compareTo(Customer a) {
        return -this.duration.compareTo(a.getDuration());
    }

}

public class b99DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        List<Customer> ds = new ArrayList<>(n);
        while (n-- > 0) {
            String name = sc.nextLine();
            String idRoom = sc.nextLine();
            Date startDay = sdf.parse(sc.nextLine());
            Date lastDay = sdf.parse(sc.nextLine());
            // convert milisecond to day
            Long duration = (lastDay.getTime() - startDay.getTime()) / (1000L * 60 * 60 * 24);
            ds.add(new Customer(name, idRoom, duration));
        }
        Collections.sort(ds);
        for (Customer i : ds) {
            System.out.println(i);
        }
    }
}
