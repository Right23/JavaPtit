import java.util.Scanner;

class nv {
    public static int code = 1;
    private String id, name, role;
    private int baseSal, nc, allowance, reward;

    public nv(String name, int baseSal, int nc, String role) {
        this.id = "NV" + String.format("%02d", code++);
        this.name = name;
        this.baseSal = baseSal;
        this.nc = nc;
        this.role = role;

        if (nc >= 25) {
            reward = (int) (baseSal * nc * 0.2f);
        } else if (nc >= 23) {
            reward = (int) (baseSal * nc * 0.1f);
        } else {
            reward = 0;
        }

        if (role.equals("GD")) {
            allowance = 250000;
        } else if (role.equals("PGD")) {
            allowance = 200000;
        } else if (role.equals("TP")) {
            allowance = 180000;
        } else if (role.equals("NV")) {
            allowance = 150000;
        }
    }

    public int getSalary() {
        return baseSal * nc + reward + allowance;
    }

    public String toString() {
        return id + " " + name + " " + baseSal * nc + " " + reward + " " + allowance + " " + getSalary();
    }
}

public class b153_baiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int baseSal = Integer.parseInt(sc.nextLine());
        int nc = Integer.parseInt(sc.nextLine());
        String role = sc.nextLine();
        nv a = new nv(name, baseSal, nc, role);
        System.out.println(a);
    }
}
