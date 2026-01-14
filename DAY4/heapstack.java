class Calculator{
    public int add(int a ,int b){
        return a+b;
    }
}

public class heapstack {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        int result = cal.add(4,5);
        System.out.println(result);
    }
}
