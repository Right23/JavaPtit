import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;

class Ps1 implements Comparable<Ps1> {
    private String name;
    private int minutes;

    public Ps1(String name, LocalDateTime start, LocalDateTime end) {
        this.name = name;
        this.minutes = calculate(start, end);
    }

    private int calculate(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        long minutes = duration.toMinutes();
        return (int) minutes;
    }

    public String getName() {
        return name;
    }

    public int getMinutes() {
        return minutes;
    }

    public String toString() {
        return name + " " + minutes;
    }

    public int compareTo(Ps1 o) {
        if (this.minutes == o.getMinutes()) {
            return this.name.compareTo(o.getName());
        }
        return -(this.minutes - o.getMinutes());
    }
}

public class b116ThoiGianOnlineLienTuc {
    private static LocalDateTime parseDateTime(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return LocalDateTime.parse(input, formatter);
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        ArrayList<Ps1> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            LocalDateTime start = parseDateTime(sc.nextLine());
            LocalDateTime end = parseDateTime(sc.nextLine());
            Ps1 x = new Ps1(name, start, end);
            arr.add(x);
        }
        Collections.sort(arr);
        for (Ps1 i : arr) {
            System.out.println(i);
        }
    }
}
