
class Mobile{
    String brand;
    int price;
    static String name;

    public void all(){
        System.out.println(brand + price + name);
    }
}
public class staticclass {
    public static void main(String[] args) {
        Mobile mob1 = new Mobile();

        mob1.brand="iphone";
        mob1.price = 40000;
        Mobile.name ="smartphone";

        Mobile mob2 = new Mobile();

        mob2.brand="smasung";
        mob2.price = 50000;
        Mobile.name ="smartphone";

        Mobile.name = "phone";

        mob1.all();
        mob2.all();

    }
}
