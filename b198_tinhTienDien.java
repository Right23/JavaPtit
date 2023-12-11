import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class kh99 {
    private String id, type;
    private int base, cu, moi;
    public static int num = 1;

    public kh99(String type, int cu, int moi) {
        this.id = String.format("KH%02d", num++);
        this.type = type;
        this.cu = cu;
        this.moi = moi;
        if (type.equals("KD"))
            this.base = 3;
        if (type.equals("NN"))
            this.base = 5;
        if (type.equals("TT"))
            this.base = 4;
        if (type.equals("CN"))
            this.base = 2;
    }

    public int get_use_cost() {
        return (moi - cu) * base * 550;
    }

    public int get_over_cost() {
        int use = moi - cu;
        if (use < 50)
            return 0;
        if (use <= 100)
            return Math.round(get_use_cost() * 35.0f / 100);
        return get_use_cost();
    }

    public int get_cost() {
        return get_use_cost() + get_over_cost();
    }

    public String toString() {
        return id + " " + base + " " + get_use_cost() + " " + get_over_cost()
                + " " + get_cost();
    }
}

public class b198_tinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<kh99> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String type = sc.next().toUpperCase();
            int cu = sc.nextInt(), moi = sc.nextInt();
            arr.add(new kh99(type, cu, moi));
        }
        // Collections.sort(arr, new Comparator<kh99>() {
        // public int compare(kh99 o1, kh99 o2){
        // return o1.get_cost() > o2.get_cost() ? -1: 1;
        // }
        // });
        arr.sort(Comparator.comparing(kh99::get_cost, Comparator.reverseOrder()));
        for (kh99 i : arr) {
            System.out.println(i);
        }
    }
}
