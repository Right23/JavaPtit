import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class nv3 implements Comparable<nv3> {
    private String id, name, ns_tmp, ad, mst, hd, gender;
    private Date ns;
    public static int num = 1;

    public nv3(String id, String name, String gender, String ns_tmp, String ad, String mst, String hd) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.id = String.format("%05d", num++);
        this.name = name;
        this.gender = gender;
        this.ns_tmp = ns_tmp;
        try {
            this.ns = sdf.parse(this.ns_tmp);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
        }
        this.mst = mst;
        this.ad = ad;
        this.hd = hd;
    }

    public int get_num_day() {
        long tmp = this.ns.getTime();
        return (int) (tmp / (24 * 3600));
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return id + " " + name + " " + gender + " " + ns_tmp + " " + ad + " " + mst + " " + hd;
    }

    public int compareTo(nv3 o) {
        return (this.get_num_day()) - (o.get_num_day());
    }
}

public class b165_sapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<nv3> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String ns_tmp = sc.nextLine();
            String ad = sc.nextLine();
            String mst = sc.nextLine();
            String hd = sc.nextLine();
            nv3 x = new nv3(hd, name, gender, ns_tmp, ad, mst, hd);
            arr.add(x);
        }
        Collections.sort(arr);
        for (nv3 i : arr) {
            System.out.println(i);
        }
    }
}
