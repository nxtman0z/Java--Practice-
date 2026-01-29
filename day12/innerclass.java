class Outer {

    private String message = "Hello from Outer class";


    class Inner {
        void show() {
            System.out.println(message);
        }
    }
}

public class innerclass {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}
