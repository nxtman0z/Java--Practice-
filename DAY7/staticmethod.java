class Mobile{
    static int price;
    String name;

    public static void all(){
        System.out.println(price);
    }
}

public class staticmethod {
    public static void main(String[] args) {
        Mobile.price =1000;
        Mobile.all();
    }
    
}
