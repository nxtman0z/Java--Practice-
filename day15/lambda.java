@FunctionalInterface
interface A{
    int add(int i , int j);
}

public class lambda {
    public static void main(String[] args) {
        A obj = new A(){
            public int add(int i ,int j){
                return i+j;
            }
        };
        int result=obj.add(5,6);
        System.out.println(result);
    }
}
