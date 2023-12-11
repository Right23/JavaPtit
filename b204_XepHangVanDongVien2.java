import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

class vdv implements Comparable<vdv> {
    private String id, name, dob;
    private Date start, end;
    private int bonus, age;
    private long run_time, real_time;
    public static int cnt = 1;
    private SimpleDateFormat sdf_hms = new SimpleDateFormat("HH:mm:ss");
    private DateTimeFormatter dtf_dob = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public vdv(String name, String dob, String start, String end) throws ParseException {
        this.id = String.format("VDV%02d", cnt++);
        this.name = name;
        this.dob = dob;
        this.start = sdf_hms.parse(start);
        this.end = sdf_hms.parse(end);
        LocalDate date_of_birth = LocalDate.parse(dob, dtf_dob);
        this.age = 2021 - date_of_birth.getYear();
        // this.age = Period.between(date_of_birth, LocalDate.now()).getYears();
        this.bonus = 3;
        if (age < 18) {
            bonus = 0;
        } else if (age < 25) {
            bonus = 1;
        } else if (age < 32) {
            bonus = 2;
        }
        run_time = (this.end.getTime() - this.start.getTime()) / 1000;
        real_time = run_time - bonus;
    }

    private String stringFormat(long s) {
        long h = s / 3600;
        long m = (s - 3600 * h) / 60;
        return String.format("%02d:%02d:%02d", h, m, s % 60);
    }

    public long get_realTime() {
        return this.real_time;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + stringFormat(run_time) + " " + stringFormat(bonus) + " "
                + stringFormat(real_time);
    }

    public int compareTo(vdv o) {
        return (int) (this.real_time - o.real_time);
    }

}

public class b204_XepHangVanDongVien2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<vdv> arr = new ArrayList<>();
        ArrayList<Long> arr_realTime = new ArrayList<>();
        TreeSet<Long> mySet = new TreeSet<>();
        while (n-- > 0) {
            vdv x = new vdv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
            arr_realTime.add(x.get_realTime());
            mySet.add(x.get_realTime());
        }
        int rank = 1;
        HashMap<Long, Integer> myMap = new HashMap<>();
        for (long i : mySet) {
            myMap.put(i, rank);
            rank += Collections.frequency(arr_realTime, i);
        }
        Collections.sort(arr);
        for (vdv i : arr) {
            System.out.println(i + " " + myMap.get(i.get_realTime()));
        }
    }
}
