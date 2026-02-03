@FunctionalInterface
interface A{
    void show(int i);
}

public class lambda {
    public static void main(String[] args) {
        A obj =  i ->
        
            
                System.out.println("in show0" );
            
        
        obj.show(5);
    }
}
