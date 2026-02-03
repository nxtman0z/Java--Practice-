@FunctionalInterface
interface A{
    void show(int i);
}

public class lambda {
    public static void main(String[] args) {
        A obj =  new A() {
            public void show(int i){
                System.out.println("in show0" + i);
            }
        };
        obj.show(6);
    }
}
