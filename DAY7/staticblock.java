
class Mobile{
    String brand;
    int price;
    static String name;


    static
{
    name = "phone";
    System.out.println("static block");
}

public Mobile(){
    brand = "";
    price = 200;

    System.out.println("constructor");
    }

    public void show(){
        System.out.println(brand + price + name );
    }
}



public class staticblock {
    public static void main(String[] args) {
        // Mobile m1 = new Mobile();
        // m1.brand = "apple";
        // m1.price = 1000;
        // Mobile.name = "smartphone";
        // Mobile m2 = new Mobile();
    }
}
