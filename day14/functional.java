//sam- single abstract method interface
@FunctionalInterface
interface A{
    void show();
    //void run();
}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
}

public class functional {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
