@FunctionalInterface
interface A{
    void show();
}

public class lambda {
    public static void main(String[] args) {
        A obj =  () ->
        
            
                System.out.println("in show0" );
            
        
        obj.show();
    }
}
