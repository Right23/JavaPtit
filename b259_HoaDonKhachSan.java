import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Customer implements Comparable<Customer> {
    private String id, name, id_Room;
    private int price_Room, service_fee, timeByDay, total_Cost;
    public static int num = 1;

    public Customer(String name, String id_Room, Date checkInDate, Date checkOutDate, int service_fee) {
        this.id = String.format("KH%02d", num++);
        this.name = normalize(name);
        this.service_fee = service_fee;
        this.id_Room = id_Room;
        switch (id_Room.substring(0, 1)) {
            case "1":
                price_Room = 25;
                break;
            case "2":
                price_Room = 34;
                break;
            case "3":
                price_Room = 50;
                break;
            case "4":
                price_Room = 80;
                break;
        }
        this.timeByDay = calculateTime(checkInDate, checkOutDate);
        this.total_Cost = timeByDay * price_Room + service_fee;
    }

    private int calculateTime(Date checkIn, Date checkOut) {
        long in = checkIn.getTime();
        long out = checkOut.getTime();
        return (int) ((out - in) / (1000 * 60 * 60 * 24)) + 1;
    }

    private String normalize(String s) {
        String words[] = s.split("\\s+");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            if (i < words.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    public Integer getTotalCost() {
        return total_Cost;
    }

    public int compareTo(Customer a) {
        return -(this.getTotalCost().compareTo(a.getTotalCost()));
    }

    public String toString() {
        return id + " " + name + " " + id_Room + " " + timeByDay + " " + total_Cost;
    }
}

public class b259_HoaDonKhachSan {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        List<Customer> customers = new ArrayList<>();
        while (n-- > 0) {
            String name = sc.nextLine().trim();
            String roomId = sc.nextLine().trim();
            Date checkInDate = sdf.parse(sc.nextLine());
            Date checkOutDate = sdf.parse(sc.nextLine());
            int serviceFee = Integer.parseInt(sc.nextLine());
            Customer customer = new Customer(name, roomId, checkInDate, checkOutDate, serviceFee);
            customers.add(customer);
        }

        Collections.sort(customers);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
