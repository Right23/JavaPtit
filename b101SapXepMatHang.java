import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Product implements Comparable<Product> {
    private String code, name, type;
    private Float buy, sell, profit;
    public static int num = 1;

    public Product(String name, String type, Float buy, Float sell) {
        this.code = "MH" + String.format("%02d", num++);
        this.name = name;
        this.type = type;
        this.buy = buy;
        this.sell = sell;
        this.profit = sell - buy;
    }

    public Float getProfit() {
        return profit;
    }

    public String toString() {
        return code + " " + name + " " + type + " " + String.format("%.2f", profit);
    }

    public int compareTo(Product a) {
        return -(int) (profit - a.getProfit());
    }
}

public class b101SapXepMatHang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String type = sc.nextLine();
            Float buy = Float.parseFloat(sc.nextLine());
            Float sell = Float.parseFloat(sc.nextLine());
            products[i] = new Product(name, type, buy, sell);
        }
        Arrays.sort(products);
        for (Product i : products) {
            System.out.println(i);
        }
    }
}
