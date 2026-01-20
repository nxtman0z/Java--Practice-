class A{
    void show(){
        System.out.println("cass A");
    }
}
class B extends A{

}




public class singleinheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
