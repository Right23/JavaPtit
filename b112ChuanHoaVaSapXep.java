import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Ps implements Comparable<Ps> {
    private String name, f, l, m;

    public Ps(String name) {
        this.name = normalize(name);
        String word[] = this.name.split(" ");
        this.f = word[0];
        this.l = word[word.length - 1];
        if (word.length == 2) {
            this.m = "";
        } else {
            String tmp = "";
            for (int i = 1; i < word.length - 1; i++) {
                tmp += word[i];
                if (i < word.length - 2) {
                    tmp += " ";
                }
            }
            this.m = tmp;
        }
    }

    public String normalize(String name) {
        String words[] = name.trim().split("\\s+");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase() +
                    words[i].toLowerCase().substring(1);
            if (i < words.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    public String fn() {
        return this.f;
    }

    public String ln() {
        return this.l;
    }

    public String mn() {
        return this.m;
    }

    public int compareTo(Ps o) {
        if ((this.l).equals(o.ln())) {
            if ((this.f).equals(o.fn())) {
                return (this.m).compareTo(o.mn());
            }
            return (this.f).compareTo(o.fn());
        }
        return (this.l).compareTo(o.ln());
    }

    public String toString() {
        return this.name;
    }
}

/**
 * b112ChuanHoaVaSapXep
 */
public class b112ChuanHoaVaSapXep {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Ps> arr = new ArrayList<>();
        while (sc.hasNextLine()) {
            String name = sc.nextLine();
            arr.add(new Ps(name));
        }
        Collections.sort(arr);
        for (Ps i : arr) {
            System.out.println(i);
        }
    }
}