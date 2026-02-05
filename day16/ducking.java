class A{
    public void show(){
        try {
            Class.forName("new");
        } catch (ClassNotFoundException e) {
            System.out.println("not able to find class" + e);
        }
    }
}
public class ducking {
    static{
        System.out.println("class loader in java");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
