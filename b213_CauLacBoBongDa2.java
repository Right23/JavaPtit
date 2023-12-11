import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class clbo {
    protected String ma, name;
    protected int price;

    public clbo() {

    }

    public clbo(String ma, String name, int price) {
        this.ma = ma;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return ma + " " + name;
    }
}

class game extends clbo {
    private String code_game;
    private int viewer;

    public game(String code_game, int viewer, String ma, String name, int price) {
        super(ma, name, price);
        this.code_game = code_game;
        this.viewer = viewer;
    }

    public int revenue() {
        return this.viewer * this.price;
    }

    public String toString() {
        return code_game + " " + name + " " + revenue();
    }
}

/**
 * b212_CauLacBoBongDa2
 */
public class b213_CauLacBoBongDa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<clbo> arr_clb = new ArrayList<>();
        int n = sc.nextInt();
        while (n-- > 0) {
            String ma = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            arr_clb.add(new clbo(ma, name, price));
        }
        int q = sc.nextInt();
        ArrayList<game> arr_game = new ArrayList<>();
        while (q-- > 0) {
            String code_game = sc.next();
            int viewer = sc.nextInt();
            clbo a = new clbo();
            for (clbo i : arr_clb) {
                if (i.ma.equals(code_game.substring(1, 3))) {
                    a = i;
                    break;
                }
            }
            arr_game.add(new game(code_game, viewer, a.ma, a.name, a.price));
        }
        Collections.sort(arr_game, new Comparator<game>() {
            public int compare(game o1, game o2) {
                if (o1.revenue() == o2.revenue()) {
                    return o1.ma.compareTo(o2.ma);
                }
                return o2.revenue() - o1.revenue();
            }
        });
        for (game i : arr_game) {
            System.out.println(i);
        }
    }
}