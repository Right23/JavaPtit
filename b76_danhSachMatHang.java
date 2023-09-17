import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product> {
    public static int Num_Product = 1;
    private String id, name, unit;
    private int buyingPrice, sellingPrice, profit;

    public Product(String name, String unit, int buyingPrice, int sellingPrice) {
        this.id = "MH" + String.format("%03d", Num_Product++);
        this.name = name;
        this.unit = unit;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        profit = sellingPrice - buyingPrice;
    }

    public int getProfit() {
        return profit;
    }

    public String toString() {
        return id + " " + name + " " + unit + " " + buyingPrice + " " + sellingPrice + " " + profit;
    }

    public int compareTo(Product a) {
        return a.getProfit() - this.profit;
    }
}

public class b76_danhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String unit = sc.nextLine();
            int buyingPrice = Integer.parseInt(sc.nextLine());
            int sellingPrice = Integer.parseInt(sc.nextLine());
            Product p = new Product(name, unit, buyingPrice, sellingPrice);
            arr.add(p);
        }
        Collections.sort(arr);
        for (Product i : arr) {
            System.out.println(i);
        }
    }
}
