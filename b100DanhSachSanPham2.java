import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Product implements Comparable<Product> {
    private String code, name;
    private int sellPrice, wanranty;

    public Product(String code, String name, int sellPrice, int wanranty) {
        this.code = code;
        this.name = name;
        this.sellPrice = sellPrice;
        this.wanranty = wanranty;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public String getCode() {
        return code;
    }

    public String toString() {
        return code + " " + name + " " + sellPrice + " " + wanranty;
    }

    public int compareTo(Product a) {
        if (this.sellPrice == a.getSellPrice()) {
            return (this.code).compareTo(a.getCode());
        }
        return -(this.sellPrice - a.getSellPrice());
    }
}

public class b100DanhSachSanPham2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        // List<Product> list = new ArrayList<>(n);
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            int sellPrice = Integer.parseInt(sc.nextLine());
            int wanranty = Integer.parseInt(sc.nextLine());
            // list.add(new Product(code, name, sellPrice, wanranty));
            products[i] = new Product(code, name, sellPrice, wanranty);
        }
        Arrays.sort(products);
        for (Product i : products) {
            System.out.println(i);
        }
    }
}
