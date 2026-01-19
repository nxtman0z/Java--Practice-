class Mobile {
    static int price = 10000;
    String name;

    public void show() {
        System.out.println(name + " " + price);
    }
}

public class staticmethod {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.name = "iPhone";

        m1.show();
    }
}
