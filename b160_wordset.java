import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class WordSet {
    private ArrayList<String> arr;

    public WordSet(String s) {
        arr = new ArrayList<>();
        s = s.toLowerCase(null);
        String[] a = s.split("\\s+");
        arr.addAll(Arrays.asList(a));
    }

    public WordSet(ArrayList<String> arr) {
        this.arr = arr;
    }

    public WordSet union(WordSet A) {
        Set<String> mySet = new TreeSet<>();
        for (String i : arr) {
            mySet.add(i);
        }
        for (String i : A.arr) {
            mySet.add(i);
        }
        return new WordSet(new ArrayList<String>(mySet));
    }

    public WordSet intersection(WordSet A) {
        Set<String> mySet = new TreeSet<>();
        for (String i : arr) {
            if (A.arr.contains(i)) {
                mySet.add(i);
            }
        }
        return new WordSet(new ArrayList<String>(mySet));
    }

    public String toString() {
        String res = "";
        for (String i : arr) {
            res += i + " ";
        }
        return res;
    }
}

public class b160_wordset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
