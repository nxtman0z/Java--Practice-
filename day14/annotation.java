


class A{
    public void show(){
        System.out.println("in a show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in b show");
    }
}
public class annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
