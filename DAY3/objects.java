

class Calculator{
    //add two number
    public int add(int n1 ,int n2){
        int sum = n1 +n2;
        return sum;
    }
}
public class objects {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        int result =cal.add(5,6);
        System.out.println(result);

    }
}
