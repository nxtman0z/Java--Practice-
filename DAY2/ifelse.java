public class ifelse{
    public static void main (String []args){
        int x = 10;
        int y =20;
        int z = 30;

        if(x >y && x > z){
            System.out.println("X is larger");
        }else if(y >x && y > z){
            System.out.println("y is larger");
        }else{
            System.out.println("z is greater ");
        }
    }
}