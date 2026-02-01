enum Laptop{
    Mackbook(2000),Xps(2200),Surface(1500),Thinkpad(2400);
    private int price;
    private Laptop(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public int setPrice(){
        this.price = price;
        return 0;
    }
}

public class enumclass {
    public static void main(String[] args) {
        Laptop lap = Laptop.Mackbook;
        System.out.println(lap + ":" + lap.getPrice());
    }
}
