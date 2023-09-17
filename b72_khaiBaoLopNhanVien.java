import java.util.Scanner;

class NV {
    private String mnv, name, sex, dob, addr, mst, doc;// doc: ngay ky hd

    public NV() {
        this("00001", "", "", "", "", "", "");
    }

    public NV(String mnv, String name, String sex, String dob, String addr, String mst, String doc) {
        this.mnv = mnv;
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.addr = addr;
        this.mst = mst;
        this.doc = doc;
    }

    public String toString() {
        return mnv + " " + name + " " + sex + " " + dob + " " + addr + " " + mst + " " + doc;
    }

}

public class b72_khaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String dob = sc.nextLine();
        String address = sc.nextLine();
        String mst = sc.nextLine();
        String doc = sc.nextLine();
        NV nv = new NV("00001", name, sex, dob, address, mst, doc);
        System.out.println(nv);
    }
}
