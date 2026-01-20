class Calc{
    public int add(int a ,int b){
        return a +b;
    }
}

class Advcalc extends Calc{
    public int add(int a ,int b){
        return a +b+1;
    }
}


public class methodoverriding {
    public static void main(String[] args) {
        Advcalc obj = new Advcalc();
        int n =obj.add(4, 6);
        System.out.println(n);

    }
}
