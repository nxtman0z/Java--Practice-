
class Mobile{
    String brand;
    int price;
    String name;

    public void all(){
        System.out.println(brand + price + name);
    }
}
public class staticclass {
    public static void main(String[] args) {
        Mobile mob1 = new Mobile();

        mob1.brand="iphone";
        mob1.price = 40000;
        mob1.name ="smartphone";

        Mobile mob2 = new Mobile();

        mob1.brand="smasung";
        mob1.price = 50000;
        mob1.name ="smartphone";

        mob1.all();
        mob2.all();

    }
}
