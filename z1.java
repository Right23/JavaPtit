class P {
    String name;
    int age;

    public P(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }
}

public class z1 {
    public static void main(String[] args) {
        P p = new P("a", 12);
        System.out.println(p);
    }

}
