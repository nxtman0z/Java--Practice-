class A{
    public void show() throws ClassNotFoundException{
        
            Class.forName("new");
    
    }
}
public class ducking {
    static{
        System.out.println("class loader in java");
    }
    public static void main(String[] args)  {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException ex) {
            System.getLogger(ducking.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
