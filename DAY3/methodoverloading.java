//method overoading 

public class methodoverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.add(3,4,5);
        System.out.println(result);
    }
}

class Calculator{
        public int add(int a,int b,int c){
            return a+b;
        }

        public double add(double a, int b){
            return a+b;
        }
}
