/* Author: NgTienHungg */

import java.util.Arrays;
import java.util.Scanner;

class Student2 implements Comparable<Student2> {

    public static int NUM = 1;
    public String id, name;
    public float avg;

    public Student2(String name, int[] p) {
        this.id = String.format("HS%02d", NUM++);
        this.name = name;

        avg = 0f;
        for (int i = 0; i < 10; i++) {
            avg += p[i] * ((i == 0 || i == 1) ? 2f : 1f);
        }
        avg /= 12f;
        avg = Math.round(avg * 10f) / 10f;
    }

    private String xepLoai() {
        if (avg >= 9f) {
            return "XUAT SAC";
        }
        if (avg >= 8f) {
            return "GIOI";
        }
        if (avg >= 7f) {
            return "KHA";
        }
        if (avg >= 5f) {
            return "TB";
        }
        return "YEU";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", avg) + " " + xepLoai();
    }

    @Override
    public int compareTo(Student2 o) {
        if (this.avg == o.avg) {
            return this.id.compareTo(o.id);
        }
        return (int) (this.avg - o.avg);
    }
}

public class z {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student2[] list = new Student2[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            int[] p = new int[10];
            for (int j = 0; j < 10; j++) {
                p[j] = sc.nextInt();
            }
            list[i] = new Student2(name, p);
        }

        Arrays.sort(list);
        for (Student2 e : list) {
            System.out.println(e);
        }
    }
}