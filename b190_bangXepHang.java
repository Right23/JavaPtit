import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class sv96 {
    private String name;
    private int ac, sub;

    public sv96(String name, int ac, int sub) {
        this.name = name;
        this.ac = ac;
        this.sub = sub;
    }

    public String getName() {
        return name;
    }

    public int getAc() {
        return ac;
    }

    public int getSub() {
        return sub;
    }

    @Override
    public String toString() {
        return name + " " + ac + " " + sub;
    }
}

public class b190_bangXepHang {
    public static void main(String[] args) {
        ArrayList<sv96> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s = sc.nextLine();
            String line[] = sc.nextLine().split(" ");
            int ac = Integer.parseInt(line[0]);
            int sub = Integer.parseInt(line[1]);
            arr.add(new sv96(s, ac, sub));
        }
        Collections.sort(arr, new Comparator<sv96>() {
            public int compare(sv96 o1, sv96 o2) {
                if (o1.getAc() == o2.getAc()) {
                    if (o1.getSub() == o2.getSub()) {
                        return o1.getName().compareTo(o2.getName());
                    } else
                        return o1.getSub() < o2.getSub() ? -1 : 1;
                }
                return o1.getAc() > o2.getAc() ? -1 : 1;
            }
        });
        for (sv96 i : arr) {
            System.out.println(i);
        }
    }
}
