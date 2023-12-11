import java.util.ArrayList;
import java.util.Scanner;

class NV2 {
    private String id, name, gender, dob, add, mst, contract;
    public static int num = 1;

    public NV2(String name, String gender, String dob, String add, String mst, String contract) {
        this.id = String.format("%05d", num++);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.add = add;
        this.mst = mst;
        this.contract = contract;
    }

    public String toString() {
        return id + " " + name + " " + gender + " " + dob + " " + add + " " + mst + " " + contract;
    }
}

public class b164_danhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NV2> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String dob = sc.nextLine();
            String add = sc.nextLine();
            String mst = sc.nextLine();
            String contract = sc.nextLine();
            arr.add(new NV2(name, gender, dob, add, mst, contract));
        }
        for (NV2 i : arr) {
            System.out.println(i);
        }
    }
}
