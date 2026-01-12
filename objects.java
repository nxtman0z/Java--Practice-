class Calculator{
    public int add(int n1,int n2){
        int result = n1+n2;
        return result;
    }
}

public class objects {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        int ans =cal.add(7,8);
        System.out.println(ans);

    }
}
