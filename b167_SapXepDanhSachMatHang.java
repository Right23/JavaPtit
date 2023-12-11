import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Product1 implements Comparable<Product1> {
    private String code, name, type;
    private Float buy, sell, profit;
    public static int num = 1;

    public Product1(String name, String type, Float buy, Float sell) {
        this.code = String.format("%d", num++);
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

    public int compareTo(Product1 a) {
        return -(int) (profit - a.getProfit());
    }
}

public class b167_SapXepDanhSachMatHang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Product1[] product1s = new Product1[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String type = sc.nextLine();
            Float buy = Float.parseFloat(sc.nextLine());
            Float sell = Float.parseFloat(sc.nextLine());
            product1s[i] = new Product1(name, type, buy, sell);
        }
        Arrays.sort(product1s);
        for (Product1 i : product1s) {
            System.out.println(i);
        }
    }
}
