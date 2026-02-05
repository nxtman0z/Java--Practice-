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
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
